package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojmessagingMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterError extends StObject {
  
  // constructor(summary: string, detail: string);
  def getMessage(): ^ = js.native
}
object ConverterError {
  
  @scala.inline
  def apply(getMessage: () => ^): ConverterError = {
    val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage))
    __obj.asInstanceOf[ConverterError]
  }
  
  @scala.inline
  implicit class ConverterErrorMutableBuilder[Self <: ConverterError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMessage(value: () => ^): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
  }
}
