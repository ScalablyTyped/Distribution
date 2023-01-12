package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  // Hashes of the file's binary content, if available. Read-only.
  var hashes: js.UndefOr[NullableOption[Hashes]] = js.undefined
  
  /**
    * The MIME type for the file. This is determined by logic on the server and might not be the value provided when the file
    * was uploaded. Read-only.
    */
  var mimeType: js.UndefOr[NullableOption[String]] = js.undefined
  
  var processingMetadata: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object File {
  
  inline def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setHashes(value: NullableOption[Hashes]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesNull: Self = StObject.set(x, "hashes", null)
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setMimeType(value: NullableOption[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setProcessingMetadata(value: NullableOption[Boolean]): Self = StObject.set(x, "processingMetadata", value.asInstanceOf[js.Any])
    
    inline def setProcessingMetadataNull: Self = StObject.set(x, "processingMetadata", null)
    
    inline def setProcessingMetadataUndefined: Self = StObject.set(x, "processingMetadata", js.undefined)
  }
}
