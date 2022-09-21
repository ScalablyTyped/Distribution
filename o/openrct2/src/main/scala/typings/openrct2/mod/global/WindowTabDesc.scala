package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowTabDesc extends StObject {
  
  var image: Double | ImageAnimation
  
  var widgets: js.UndefOr[js.Array[Widget]] = js.undefined
}
object WindowTabDesc {
  
  inline def apply(image: Double | ImageAnimation): WindowTabDesc = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowTabDesc]
  }
  
  extension [Self <: WindowTabDesc](x: Self) {
    
    inline def setImage(value: Double | ImageAnimation): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value*))
  }
}
