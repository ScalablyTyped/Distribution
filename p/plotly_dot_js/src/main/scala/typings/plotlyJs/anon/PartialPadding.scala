package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.arraydraw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Padding> */
trait PartialPadding extends StObject {
  
  var b: js.UndefOr[Double] = js.undefined
  
  var editType: js.UndefOr[arraydraw] = js.undefined
  
  var l: js.UndefOr[Double] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
  
  var t: js.UndefOr[Double] = js.undefined
}
object PartialPadding {
  
  inline def apply(): PartialPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPadding]
  }
  
  extension [Self <: PartialPadding](x: Self) {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    inline def setEditType(value: arraydraw): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
    
    inline def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
