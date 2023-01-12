package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xxe extends StObject {
  
  /** Location within the request where the payload was placed. */
  var payloadLocation: js.UndefOr[String] = js.undefined
  
  /** The XML string that triggered the XXE vulnerability. Non-payload values might be redacted. */
  var payloadValue: js.UndefOr[String] = js.undefined
}
object Xxe {
  
  inline def apply(): Xxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xxe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xxe] (val x: Self) extends AnyVal {
    
    inline def setPayloadLocation(value: String): Self = StObject.set(x, "payloadLocation", value.asInstanceOf[js.Any])
    
    inline def setPayloadLocationUndefined: Self = StObject.set(x, "payloadLocation", js.undefined)
    
    inline def setPayloadValue(value: String): Self = StObject.set(x, "payloadValue", value.asInstanceOf[js.Any])
    
    inline def setPayloadValueUndefined: Self = StObject.set(x, "payloadValue", js.undefined)
  }
}
