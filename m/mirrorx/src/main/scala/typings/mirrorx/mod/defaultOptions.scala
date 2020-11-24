package typings.mirrorx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait defaultOptions extends js.Object {
  
  def addEffect(name: String, handler: js.Function0[_]): js.Any = js.native
  
  var historyMode: js.UndefOr[String] = js.native
  
  var initialState: js.UndefOr[js.Object] = js.native
  
  var middlewares: js.Array[_] = js.native
}
object defaultOptions {
  
  @scala.inline
  def apply(addEffect: (String, js.Function0[_]) => js.Any, middlewares: js.Array[_]): defaultOptions = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction2(addEffect), middlewares = middlewares.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultOptions]
  }
  
  @scala.inline
  implicit class defaultOptionsOps[Self <: defaultOptions] (val x: Self) extends AnyVal {
    
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
    def setAddEffect(value: (String, js.Function0[_]) => js.Any): Self = this.set("addEffect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMiddlewaresVarargs(value: js.Any*): Self = this.set("middlewares", js.Array(value :_*))
    
    @scala.inline
    def setMiddlewares(value: js.Array[_]): Self = this.set("middlewares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryMode(value: String): Self = this.set("historyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryMode: Self = this.set("historyMode", js.undefined)
    
    @scala.inline
    def setInitialState(value: js.Object): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
  }
}
