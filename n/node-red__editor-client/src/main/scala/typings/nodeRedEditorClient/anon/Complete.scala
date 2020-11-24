package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complete extends js.Object {
  
  def complete(value: String, cursor: Column): Unit = js.native
  
  var cursor: js.UndefOr[Column] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var onclose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var width: String = js.native
}
object Complete {
  
  @scala.inline
  def apply(complete: (String, Column) => Unit, width: String): Complete = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2(complete), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  
  @scala.inline
  implicit class CompleteOps[Self <: Complete] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: (String, Column) => Unit): Self = this.set("complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: Column): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnclose(value: () => Unit): Self = this.set("onclose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
