package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bold extends StObject {
  
  var bold: Boolean
  
  /**
    * - The color in RGB format to use for
    * display purposes.
    */
  var color: js.typedarray.Uint8ClampedArray
  
  var count: js.UndefOr[Double] = js.undefined
  
  var dest: String | js.Array[Any] | Null
  
  var italic: Boolean
  
  var items: js.Array[Any]
  
  var newWindow: js.UndefOr[Boolean] = js.undefined
  
  var title: String
  
  var unsafeUrl: js.UndefOr[String] = js.undefined
  
  var url: String | Null
}
object Bold {
  
  inline def apply(
    bold: Boolean,
    color: js.typedarray.Uint8ClampedArray,
    italic: Boolean,
    items: js.Array[Any],
    title: String
  ): Bold = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], dest = null, url = null)
    __obj.asInstanceOf[Bold]
  }
  
  extension [Self <: Bold](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDest(value: String | js.Array[Any]): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setDestNull: Self = StObject.set(x, "dest", null)
    
    inline def setDestVarargs(value: Any*): Self = StObject.set(x, "dest", js.Array(value*))
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
    
    inline def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUnsafeUrl(value: String): Self = StObject.set(x, "unsafeUrl", value.asInstanceOf[js.Any])
    
    inline def setUnsafeUrlUndefined: Self = StObject.set(x, "unsafeUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
