package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotDecimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The maximum number of decimal digits
    */
  var precision: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of decimal digits to the right of the decimal point
    */
  var scale: js.UndefOr[String] = js.undefined
  
  /**
    * The type name
    */
  var `type`: EdmDotDecimal
}
object DecimalProperty {
  
  inline def apply(name: String): DecimalProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Decimal")
    __obj.asInstanceOf[DecimalProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalProperty] (val x: Self) extends AnyVal {
    
    inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setType(value: EdmDotDecimal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
