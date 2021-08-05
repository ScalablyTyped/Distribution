package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferOptions extends StObject {
  
  var autoPrint: js.UndefOr[Boolean] = js.undefined
  
  var bufferPages: js.UndefOr[Boolean] = js.undefined
  
  var fontLayoutCache: js.UndefOr[Boolean] = js.undefined
  
  var progressCallback: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
  
  var tableLayouts: js.UndefOr[StringDictionary[CustomTableLayout]] = js.undefined
}
object BufferOptions {
  
  inline def apply(): BufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferOptions]
  }
  
  extension [Self <: BufferOptions](x: Self) {
    
    inline def setAutoPrint(value: Boolean): Self = StObject.set(x, "autoPrint", value.asInstanceOf[js.Any])
    
    inline def setAutoPrintUndefined: Self = StObject.set(x, "autoPrint", js.undefined)
    
    inline def setBufferPages(value: Boolean): Self = StObject.set(x, "bufferPages", value.asInstanceOf[js.Any])
    
    inline def setBufferPagesUndefined: Self = StObject.set(x, "bufferPages", js.undefined)
    
    inline def setFontLayoutCache(value: Boolean): Self = StObject.set(x, "fontLayoutCache", value.asInstanceOf[js.Any])
    
    inline def setFontLayoutCacheUndefined: Self = StObject.set(x, "fontLayoutCache", js.undefined)
    
    inline def setProgressCallback(value: /* progress */ Double => Unit): Self = StObject.set(x, "progressCallback", js.Any.fromFunction1(value))
    
    inline def setProgressCallbackUndefined: Self = StObject.set(x, "progressCallback", js.undefined)
    
    inline def setTableLayouts(value: StringDictionary[CustomTableLayout]): Self = StObject.set(x, "tableLayouts", value.asInstanceOf[js.Any])
    
    inline def setTableLayoutsUndefined: Self = StObject.set(x, "tableLayouts", js.undefined)
  }
}
