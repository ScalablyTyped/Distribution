package typings.pkijs.mod

import typings.asn1js.mod.IntegerJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeStampReqJson extends StObject {
  
  var certReq: js.UndefOr[Boolean] = js.undefined
  
  var extensions: js.UndefOr[js.Array[ExtensionJson]] = js.undefined
  
  var messageImprint: MessageImprintJson
  
  var nonce: js.UndefOr[IntegerJson] = js.undefined
  
  var reqPolicy: js.UndefOr[String] = js.undefined
  
  var version: Double
}
object TimeStampReqJson {
  
  inline def apply(messageImprint: MessageImprintJson, version: Double): TimeStampReqJson = {
    val __obj = js.Dynamic.literal(messageImprint = messageImprint.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStampReqJson]
  }
  
  extension [Self <: TimeStampReqJson](x: Self) {
    
    inline def setCertReq(value: Boolean): Self = StObject.set(x, "certReq", value.asInstanceOf[js.Any])
    
    inline def setCertReqUndefined: Self = StObject.set(x, "certReq", js.undefined)
    
    inline def setExtensions(value: js.Array[ExtensionJson]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: ExtensionJson*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setMessageImprint(value: MessageImprintJson): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: IntegerJson): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReqPolicy(value: String): Self = StObject.set(x, "reqPolicy", value.asInstanceOf[js.Any])
    
    inline def setReqPolicyUndefined: Self = StObject.set(x, "reqPolicy", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
