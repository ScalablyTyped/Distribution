package typings.pkijs.mod

import typings.bytestreamjs.mod.SeqStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISignedCertificateTimestamp> & {  stream :bytestreamjs.bytestreamjs.SeqStream | undefined} */
trait SignedCertificateTimestampParameters extends StObject {
  
  var extensions: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var hashAlgorithm: js.UndefOr[String] = js.undefined
  
  var logID: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var signature: js.UndefOr[SchemaType] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
  
  var stream: js.UndefOr[SeqStream] = js.undefined
  
  var timestamp: js.UndefOr[js.Date] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object SignedCertificateTimestampParameters {
  
  inline def apply(): SignedCertificateTimestampParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignedCertificateTimestampParameters]
  }
  
  extension [Self <: SignedCertificateTimestampParameters](x: Self) {
    
    inline def setExtensions(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setLogID(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "logID", value.asInstanceOf[js.Any])
    
    inline def setLogIDUndefined: Self = StObject.set(x, "logID", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSignature(value: SchemaType): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setStream(value: SeqStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
