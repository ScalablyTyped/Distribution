package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITSTInfo extends StObject {
  
  /**
    * Represents the time deviation around the UTC time contained in GeneralizedTime
    */
  var accuracy: js.UndefOr[Accuracy] = js.undefined
  
  /**
    * Additional information in the future.  Extensions is defined in [RFC2459](https://datatracker.ietf.org/doc/html/rfc2459)
    */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * Time at which the time-stamp token has been created by the TSA
    */
  var genTime: js.Date
  
  /**
    * The messageImprint MUST have the same value as the similar field in
    * TimeStampReq, provided that the size of the hash value matches the
    * expected size of the hash algorithm identified in hashAlgorithm.
    */
  var messageImprint: MessageImprint
  
  /**
    * Field MUST be present if it was present in the TimeStampReq.
    * In such a case it MUST equal the value provided in the TimeStampReq structure.
    */
  var nonce: js.UndefOr[Integer] = js.undefined
  
  /**
    * If the ordering field is missing, or if the ordering field is present
    * and set to false, then the genTime field only indicates the time at
    * which the time-stamp token has been created by the TSA.In such a
    * case, the ordering of time-stamp tokens issued by the same TSA or
    * different TSAs is only possible when the difference between the
    * genTime of the first time-stamp token and the genTime of the second
    * time-stamp token is greater than the sum of the accuracies of the
    * genTime for each time-stamp token.
    *
    * If the ordering field is present and set to true, every time-stamp
    * token from the same TSA can always be ordered based on the genTime
    * field, regardless of the genTime accuracy.
    */
  var ordering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * TSA's policy under which the response was produced.
    *
    * If a similar field was present in the TimeStampReq, then it MUST have the same value,
    * otherwise an error (unacceptedPolicy) MUST be returned
    */
  var policy: String
  
  /**
    * Integer assigned by the TSA to each TimeStampToken.
    *
    * It MUST be unique for each TimeStampToken issued by a given TSA.
    */
  var serialNumber: Integer
  
  /**
    * `tsa` field is to give a hint in identifying the name of the TSA.
    * If present, it MUST correspond to one of the subject names included
    * in the certificate that is to be used to verify the token.
    */
  var tsa: js.UndefOr[GeneralName] = js.undefined
  
  /**
    * Version of the time-stamp token.
    *
    * Conforming time-stamping servers MUST be able to provide version 1 time-stamp tokens.
    */
  var version: Double
}
object ITSTInfo {
  
  inline def apply(
    genTime: js.Date,
    messageImprint: MessageImprint,
    policy: String,
    serialNumber: Integer,
    version: Double
  ): ITSTInfo = {
    val __obj = js.Dynamic.literal(genTime = genTime.asInstanceOf[js.Any], messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITSTInfo]
  }
  
  extension [Self <: ITSTInfo](x: Self) {
    
    inline def setAccuracy(value: Accuracy): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setGenTime(value: js.Date): Self = StObject.set(x, "genTime", value.asInstanceOf[js.Any])
    
    inline def setMessageImprint(value: MessageImprint): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: Integer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    
    inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setTsa(value: GeneralName): Self = StObject.set(x, "tsa", value.asInstanceOf[js.Any])
    
    inline def setTsaUndefined: Self = StObject.set(x, "tsa", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
