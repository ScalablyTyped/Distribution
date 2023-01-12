package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignedCertificateTimestamp extends StObject {
  
  var extensions: js.typedarray.ArrayBuffer
  
  var hashAlgorithm: String
  
  var logID: js.typedarray.ArrayBuffer
  
  var signature: SchemaType
  
  var signatureAlgorithm: String
  
  var timestamp: js.Date
  
  var version: Double
}
object ISignedCertificateTimestamp {
  
  inline def apply(
    extensions: js.typedarray.ArrayBuffer,
    hashAlgorithm: String,
    logID: js.typedarray.ArrayBuffer,
    signature: SchemaType,
    signatureAlgorithm: String,
    timestamp: js.Date,
    version: Double
  ): ISignedCertificateTimestamp = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], logID = logID.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignedCertificateTimestamp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISignedCertificateTimestamp] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setLogID(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "logID", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: SchemaType): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
