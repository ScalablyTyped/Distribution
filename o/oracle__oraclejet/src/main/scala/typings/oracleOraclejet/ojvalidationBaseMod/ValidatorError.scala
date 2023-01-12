package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojmessagingMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorError extends StObject {
  
  // constructor(summary: string, detail: string);
  def getMessage(): ^
}
object ValidatorError {
  
  inline def apply(getMessage: () => ^): ValidatorError = {
    val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage))
    __obj.asInstanceOf[ValidatorError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidatorError] (val x: Self) extends AnyVal {
    
    inline def setGetMessage(value: () => ^): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
  }
}
