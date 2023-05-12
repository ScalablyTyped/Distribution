package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadString extends StObject {
  
  /** @description A URL-encoded string of the secret_scanning_alert_location.created JSON payload. The decoded payload is a JSON object. */
  var payload: String
}
object PayloadString {
  
  inline def apply(payload: String): PayloadString = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayloadString] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
