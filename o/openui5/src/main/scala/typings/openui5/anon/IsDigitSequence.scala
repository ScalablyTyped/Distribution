package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDigitSequence extends StObject {
  
  /**
    * if `true`, the value is handled as a sequence of digits; while formatting leading zeros are removed from
    * the value and while parsing the value is enhanced with leading zeros (if a maxLength constraint is given)
    * or leading zeros are removed from the value (if no maxLength constraint is given); this constraint is
    * supported since 1.35.0.
    *
    * To make this type behave as ABAP type NUMC, use `oConstraints.isDigitSequence=true` together with `oConstraints.maxLength`.
    *
    * A type with `isDigitSequence=true` and `nullable=false` does not parse the empty string to `null` or
    * "", but to "0" instead. This overrides `parseKeepsEmptyString` and means that "input is mandatory" does
    * not hold here.
    */
  var isDigitSequence: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * the maximal allowed length of the string; unlimited if not defined
    */
  var maxLength: js.UndefOr[int | String] = js.undefined
  
  /**
    * if `true`, the value `null` is accepted. The constraint `nullable=false` is interpreted as "input is
    * mandatory"; empty user input is rejected then (see `parseKeepsEmptyString` and `isDigitSequence` for
    * exceptions).
    */
  var nullable: js.UndefOr[Boolean | String] = js.undefined
}
object IsDigitSequence {
  
  inline def apply(): IsDigitSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDigitSequence]
  }
  
  extension [Self <: IsDigitSequence](x: Self) {
    
    inline def setIsDigitSequence(value: Boolean | String): Self = StObject.set(x, "isDigitSequence", value.asInstanceOf[js.Any])
    
    inline def setIsDigitSequenceUndefined: Self = StObject.set(x, "isDigitSequence", js.undefined)
    
    inline def setMaxLength(value: int | String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setNullable(value: Boolean | String): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
  }
}
