package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleInput extends StObject {
  
  var label: js.UndefOr[js.Array[LabelInput]] = js.undefined
  
  var locationId: js.UndefOr[js.Array[Numeric]] = js.undefined
  
  var value: js.UndefOr[js.Array[Numeric]] = js.undefined
}
object SampleInput {
  
  inline def apply(): SampleInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SampleInput]
  }
  
  extension [Self <: SampleInput](x: Self) {
    
    inline def setLabel(value: js.Array[LabelInput]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: LabelInput*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLocationId(value: js.Array[Numeric]): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setLocationIdVarargs(value: Numeric*): Self = StObject.set(x, "locationId", js.Array(value*))
    
    inline def setValue(value: js.Array[Numeric]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Numeric*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
