package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferOptions extends js.Object {
  
  var autoPrint: js.UndefOr[Boolean] = js.native
  
  var bufferPages: js.UndefOr[Boolean] = js.native
  
  var fontLayoutCache: js.UndefOr[Boolean] = js.native
  
  var progressCallback: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.native
  
  var tableLayouts: js.UndefOr[StringDictionary[CustomTableLayout]] = js.native
}
object BufferOptions {
  
  @scala.inline
  def apply(): BufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferOptions]
  }
  
  @scala.inline
  implicit class BufferOptionsOps[Self <: BufferOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoPrint(value: Boolean): Self = this.set("autoPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPrint: Self = this.set("autoPrint", js.undefined)
    
    @scala.inline
    def setBufferPages(value: Boolean): Self = this.set("bufferPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferPages: Self = this.set("bufferPages", js.undefined)
    
    @scala.inline
    def setFontLayoutCache(value: Boolean): Self = this.set("fontLayoutCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontLayoutCache: Self = this.set("fontLayoutCache", js.undefined)
    
    @scala.inline
    def setProgressCallback(value: /* progress */ Double => Unit): Self = this.set("progressCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProgressCallback: Self = this.set("progressCallback", js.undefined)
    
    @scala.inline
    def setTableLayouts(value: StringDictionary[CustomTableLayout]): Self = this.set("tableLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableLayouts: Self = this.set("tableLayouts", js.undefined)
  }
}
