package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyNodeStyleOptions extends StObject {
  
  var fillColor: js.UndefOr[js.Any] = js.undefined
  
  var strokeColor: js.UndefOr[js.Any] = js.undefined
  
  var title: js.UndefOr[js.Any] = js.undefined
}
object SankeyNodeStyleOptions {
  
  inline def apply(): SankeyNodeStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyNodeStyleOptions]
  }
  
  extension [Self <: SankeyNodeStyleOptions](x: Self) {
    
    inline def setFillColor(value: js.Any): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setStrokeColor(value: js.Any): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
