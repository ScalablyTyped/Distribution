package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Precision extends StObject {
  
  /**
    * Whether OData V4 semantics apply and the model representation is expected to be a `string` like "1970-12-31T23:59:58Z"
    * (see {@link #parseValue} and {@link #validateValue}); this type automatically adapts itself whenever
    * it is used within an OData V4 model via {@link sap.ui.model.odata.v4.ODataPropertyBinding#setType}.
    */
  var V4: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the value `null` is accepted
    */
  var nullable: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * The number of decimal places allowed in the seconds portion of a valid string value (OData V4 only);
    * only integer values between 0 and 12 are valid (since 1.37.0)
    */
  var precision: js.UndefOr[Boolean] = js.undefined
}
object Precision {
  
  inline def apply(): Precision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precision]
  }
  
  extension [Self <: Precision](x: Self) {
    
    inline def setNullable(value: Boolean | String): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setPrecision(value: Boolean): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setV4(value: Boolean): Self = StObject.set(x, "V4", value.asInstanceOf[js.Any])
    
    inline def setV4Undefined: Self = StObject.set(x, "V4", js.undefined)
  }
}
