package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferOptions extends StObject {
  
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
  implicit class BufferOptionsMutableBuilder[Self <: BufferOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPrint(value: Boolean): Self = StObject.set(x, "autoPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPrintUndefined: Self = StObject.set(x, "autoPrint", js.undefined)
    
    @scala.inline
    def setBufferPages(value: Boolean): Self = StObject.set(x, "bufferPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferPagesUndefined: Self = StObject.set(x, "bufferPages", js.undefined)
    
    @scala.inline
    def setFontLayoutCache(value: Boolean): Self = StObject.set(x, "fontLayoutCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontLayoutCacheUndefined: Self = StObject.set(x, "fontLayoutCache", js.undefined)
    
    @scala.inline
    def setProgressCallback(value: /* progress */ Double => Unit): Self = StObject.set(x, "progressCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgressCallbackUndefined: Self = StObject.set(x, "progressCallback", js.undefined)
    
    @scala.inline
    def setTableLayouts(value: StringDictionary[CustomTableLayout]): Self = StObject.set(x, "tableLayouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableLayoutsUndefined: Self = StObject.set(x, "tableLayouts", js.undefined)
  }
}
