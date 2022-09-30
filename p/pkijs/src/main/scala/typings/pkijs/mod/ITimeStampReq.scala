package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeStampReq extends StObject {
  
  /**
    * If the certReq field is present and set to true, the TSA's public key
    * certificate that is referenced by the ESSCertID identifier inside a
    * SigningCertificate attribute in the response MUST be provided by the
    * TSA in the certificates field from the SignedData structure in that
    * response. That field may also contain other certificates.
    *
    * If the certReq field is missing or if the certReq field is present
    * and set to false then the certificates field from the SignedData
    * structure MUST not be present in the response.
    */
  var certReq: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The extensions field is a generic way to add additional information
    * to the request in the future.
    */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * Contains the hash of the datum to be time-stamped
    */
  var messageImprint: MessageImprint
  
  /**
    * The nonce, if included, allows the client to verify the timeliness of
    * the response when no local clock is available. The nonce is a large
    * random number with a high probability that the client generates it
    * only once.
    */
  var nonce: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates the TSA policy under which the TimeStampToken SHOULD be provided.
    */
  var reqPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the Time-Stamp request. Should be version 1.
    */
  var version: Double
}
object ITimeStampReq {
  
  inline def apply(messageImprint: MessageImprint, version: Double): ITimeStampReq = {
    val __obj = js.Dynamic.literal(messageImprint = messageImprint.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeStampReq]
  }
  
  extension [Self <: ITimeStampReq](x: Self) {
    
    inline def setCertReq(value: Boolean): Self = StObject.set(x, "certReq", value.asInstanceOf[js.Any])
    
    inline def setCertReqUndefined: Self = StObject.set(x, "certReq", js.undefined)
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setMessageImprint(value: MessageImprint): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: Integer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReqPolicy(value: String): Self = StObject.set(x, "reqPolicy", value.asInstanceOf[js.Any])
    
    inline def setReqPolicyUndefined: Self = StObject.set(x, "reqPolicy", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
