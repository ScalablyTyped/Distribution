package typings.mongodbClientEncryption.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AWSEncryptionKeyOptions extends StObject {
  
  /**
    * An alternate host to send KMS requests to. May include port number.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) to the AWS customer master key (CMK)
    */
  var key: String
  
  /**
    * The AWS region of the KMS
    */
  var region: String
}
object AWSEncryptionKeyOptions {
  
  inline def apply(key: String, region: String): AWSEncryptionKeyOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSEncryptionKeyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AWSEncryptionKeyOptions] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
