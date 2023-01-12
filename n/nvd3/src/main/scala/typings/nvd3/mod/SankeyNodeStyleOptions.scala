package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyNodeStyleOptions extends StObject {
  
  var fillColor: js.UndefOr[Any] = js.undefined
  
  var strokeColor: js.UndefOr[Any] = js.undefined
  
  var title: js.UndefOr[Any] = js.undefined
}
object SankeyNodeStyleOptions {
  
  inline def apply(): SankeyNodeStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyNodeStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SankeyNodeStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setFillColor(value: Any): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setStrokeColor(value: Any): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
