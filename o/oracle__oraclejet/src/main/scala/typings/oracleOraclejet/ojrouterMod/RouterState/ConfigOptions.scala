package typings.oracleOraclejet.ojrouterMod.RouterState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ConfigOptions extends js.Object {
  
  var canEnter: js.UndefOr[js.Function0[Boolean | js.Promise[Boolean]]] = js.native
  
  var canExit: js.UndefOr[js.Function0[Boolean | js.Promise[Boolean]]] = js.native
  
  var enter: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  
  var exit: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  
  var isDefault: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def deleteCanEnter: Self = this.set("canEnter", js.undefined)
    
    @scala.inline
    def setCanExit(value: () => Boolean | js.Promise[Boolean]): Self = this.set("canExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCanExit: Self = this.set("canExit", js.undefined)
    
    @scala.inline
    def setEnter(value: () => js.Promise[Unit] | Unit): Self = this.set("enter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: () => js.Promise[Unit] | Unit): Self = this.set("exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
