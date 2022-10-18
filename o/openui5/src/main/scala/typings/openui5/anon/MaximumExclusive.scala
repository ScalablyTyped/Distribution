package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumExclusive extends StObject {
  
  /**
    * the maximum value allowed
    */
  var maximum: js.UndefOr[String] = js.undefined
  
  /**
    * if `true`, the maximum value itself is not allowed
    */
  var maximumExclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the minimum value allowed
    */
  var minimum: js.UndefOr[String] = js.undefined
  
  /**
    * if `true`, the minimum value itself is not allowed
    */
  var minimumExclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if `true`, the value `null` is accepted
    */
  var nullable: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * the maximum number of digits allowed
    */
  var precision: js.UndefOr[int | String] = js.undefined
  
  /**
    * the maximum number of digits allowed to the right of the decimal point; the number must be less than
    * or equal to `precision` (if given). As a special case, "variable" is supported.
    *
    * The number of digits to the right of the decimal point may vary from zero to `scale`, and the number
    * of digits to the left of the decimal point may vary from one to `precision` minus `scale`. If `scale`
    * is equal to `precision`, a single zero has to precede the decimal point.
    *
    * The number is always displayed with exactly `scale` digits to the right of the decimal point (unless
    * `scale` is "variable").
    */
  var scale: js.UndefOr[int | String] = js.undefined
}
object MaximumExclusive {
  
  inline def apply(): MaximumExclusive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumExclusive]
  }
  
  extension [Self <: MaximumExclusive](x: Self) {
    
    inline def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumExclusive(value: Boolean): Self = StObject.set(x, "maximumExclusive", value.asInstanceOf[js.Any])
    
    inline def setMaximumExclusiveUndefined: Self = StObject.set(x, "maximumExclusive", js.undefined)
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumExclusive(value: Boolean): Self = StObject.set(x, "minimumExclusive", value.asInstanceOf[js.Any])
    
    inline def setMinimumExclusiveUndefined: Self = StObject.set(x, "minimumExclusive", js.undefined)
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setNullable(value: Boolean | String): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setPrecision(value: int | String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setScale(value: int | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
