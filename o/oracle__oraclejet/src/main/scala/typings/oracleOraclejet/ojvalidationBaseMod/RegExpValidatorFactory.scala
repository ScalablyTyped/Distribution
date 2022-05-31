package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojvalidationBaseMod.RegExpValidator.ValidatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpValidatorFactory extends StObject {
  
  def createValidator(options: ValidatorOptions): RegExpValidator
}
object RegExpValidatorFactory {
  
  inline def apply(createValidator: ValidatorOptions => RegExpValidator): RegExpValidatorFactory = {
    val __obj = js.Dynamic.literal(createValidator = js.Any.fromFunction1(createValidator))
    __obj.asInstanceOf[RegExpValidatorFactory]
  }
  
  extension [Self <: RegExpValidatorFactory](x: Self) {
    
    inline def setCreateValidator(value: ValidatorOptions => RegExpValidator): Self = StObject.set(x, "createValidator", js.Any.fromFunction1(value))
  }
}
