package typings.oracleOraclejet.ojrouterMod

import typings.oracleOraclejet.anon.HasChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterState_ extends js.Object {
  
  var canEnter: js.Function0[Boolean | js.Promise[Boolean]] = js.native
  
  var canExit: js.Function0[Boolean | js.Promise[Boolean]] = js.native
  
  var enter: js.Function0[js.Promise[Unit] | Unit] = js.native
  
  var exit: js.Function0[js.Promise[Unit] | Unit] = js.native
  
  // constructor(id: string, options?: RouterState.ConfigOptions, router?: Router);
  def go(): js.Promise[HasChanged] = js.native
  
  val id: String = js.native
  
  def isCurrent(): Boolean = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var parameters: js.Object = js.native
  
  var title: String | js.Function0[js.UndefOr[String]] = js.native
  
  var value: js.Any = js.native
}
object RouterState_ {
  
  @scala.inline
  def apply(
    canEnter: () => Boolean | js.Promise[Boolean],
    canExit: () => Boolean | js.Promise[Boolean],
    enter: () => js.Promise[Unit] | Unit,
    exit: () => js.Promise[Unit] | Unit,
    go: () => js.Promise[HasChanged],
    id: String,
    isCurrent: () => Boolean,
    parameters: js.Object,
    title: String | js.Function0[js.UndefOr[String]],
    value: js.Any
  ): RouterState_ = {
    val __obj = js.Dynamic.literal(canEnter = js.Any.fromFunction0(canEnter), canExit = js.Any.fromFunction0(canExit), enter = js.Any.fromFunction0(enter), exit = js.Any.fromFunction0(exit), go = js.Any.fromFunction0(go), id = id.asInstanceOf[js.Any], isCurrent = js.Any.fromFunction0(isCurrent), parameters = parameters.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterState_]
  }
  
  @scala.inline
  implicit class RouterState_Ops[Self <: RouterState_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanEnter(value: () => Boolean | js.Promise[Boolean]): Self = this.set("canEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanExit(value: () => Boolean | js.Promise[Boolean]): Self = this.set("canExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnter(value: () => js.Promise[Unit] | Unit): Self = this.set("enter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExit(value: () => js.Promise[Unit] | Unit): Self = this.set("exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGo(value: () => js.Promise[HasChanged]): Self = this.set("go", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCurrent(value: () => Boolean): Self = this.set("isCurrent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParameters(value: js.Object): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => js.UndefOr[String]): Self = this.set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String | js.Function0[js.UndefOr[String]]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
