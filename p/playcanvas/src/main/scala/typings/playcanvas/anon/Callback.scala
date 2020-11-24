package typings.playcanvas.anon

import typings.playcanvas.pc.callbacks.XrError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
  var callback: js.UndefOr[XrError] = js.native
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.native
}
object Callback {
  
  @scala.inline
  def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: /* err */ Error | Null => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setOptionalFeaturesVarargs(value: String*): Self = this.set("optionalFeatures", js.Array(value :_*))
    
    @scala.inline
    def setOptionalFeatures(value: js.Array[String]): Self = this.set("optionalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalFeatures: Self = this.set("optionalFeatures", js.undefined)
  }
}
