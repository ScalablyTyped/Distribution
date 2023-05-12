package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDetails extends StObject {
  
  // The name of the file.
  var fileName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The file path (location) of the file instance.
  var filePath: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The publisher of the file.
  var filePublisher: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The size of the file in bytes.
  var fileSize: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The certificate authority (CA) that issued the certificate.
  var issuer: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Sha1 cryptographic hash of the file content.
  var sha1: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Sha256 cryptographic hash of the file content.
  var sha256: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The signer of the signed file.
  var signer: js.UndefOr[NullableOption[String]] = js.undefined
}
object FileDetails {
  
  inline def apply(): FileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileDetails] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFilePath(value: NullableOption[String]): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setFilePublisher(value: NullableOption[String]): Self = StObject.set(x, "filePublisher", value.asInstanceOf[js.Any])
    
    inline def setFilePublisherNull: Self = StObject.set(x, "filePublisher", null)
    
    inline def setFilePublisherUndefined: Self = StObject.set(x, "filePublisher", js.undefined)
    
    inline def setFileSize(value: NullableOption[Double]): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeNull: Self = StObject.set(x, "fileSize", null)
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setIssuer(value: NullableOption[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSha1(value: NullableOption[String]): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Null: Self = StObject.set(x, "sha1", null)
    
    inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    inline def setSha256(value: NullableOption[String]): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setSigner(value: NullableOption[String]): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerNull: Self = StObject.set(x, "signer", null)
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
  }
}
