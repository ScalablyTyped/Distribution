package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.compact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisposeOnClose extends js.Object {
  
  var disposeOnClose: js.UndefOr[Boolean] = js.native
  
  var onclose: js.UndefOr[js.Function1[/* v */ Boolean, Unit]] = js.native
  
  var options: js.UndefOr[js.Array[Onselect]] = js.native
  
  var style: js.UndefOr[compact] = js.native
}
object DisposeOnClose {
  
  @scala.inline
  def apply(): DisposeOnClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisposeOnClose]
  }
  
  @scala.inline
  implicit class DisposeOnCloseOps[Self <: DisposeOnClose] (val x: Self) extends AnyVal {
    
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
    def setDisposeOnClose(value: Boolean): Self = this.set("disposeOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposeOnClose: Self = this.set("disposeOnClose", js.undefined)
    
    @scala.inline
    def setOnclose(value: /* v */ Boolean => Unit): Self = this.set("onclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Onselect*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Onselect]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setStyle(value: compact): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
