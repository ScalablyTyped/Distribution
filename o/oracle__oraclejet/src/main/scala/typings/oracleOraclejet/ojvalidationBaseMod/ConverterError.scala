package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojmessagingMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterError extends StObject {
  
  // constructor(summary: string, detail: string);
  def getMessage(): ^
}
object ConverterError {
  
  inline def apply(getMessage: () => ^): ConverterError = {
    val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage))
    __obj.asInstanceOf[ConverterError]
  }
  
  extension [Self <: ConverterError](x: Self) {
    
    inline def setGetMessage(value: () => ^): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
  }
}
