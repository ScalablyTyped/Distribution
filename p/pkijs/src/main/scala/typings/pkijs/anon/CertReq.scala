package typings.pkijs.anon

import typings.pkijs.mod.MessageImprintSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertReq extends StObject {
  
  var certReq: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[String] = js.undefined
  
  var messageImprint: js.UndefOr[MessageImprintSchema] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var reqPolicy: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object CertReq {
  
  inline def apply(): CertReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertReq]
  }
  
  extension [Self <: CertReq](x: Self) {
    
    inline def setCertReq(value: String): Self = StObject.set(x, "certReq", value.asInstanceOf[js.Any])
    
    inline def setCertReqUndefined: Self = StObject.set(x, "certReq", js.undefined)
    
    inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setMessageImprint(value: MessageImprintSchema): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    inline def setMessageImprintUndefined: Self = StObject.set(x, "messageImprint", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReqPolicy(value: String): Self = StObject.set(x, "reqPolicy", value.asInstanceOf[js.Any])
    
    inline def setReqPolicyUndefined: Self = StObject.set(x, "reqPolicy", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
