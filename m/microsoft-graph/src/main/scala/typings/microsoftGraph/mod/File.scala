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
  
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashes(value: NullableOption[Hashes]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashesNull: Self = StObject.set(x, "hashes", null)
    
    @scala.inline
    def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    @scala.inline
    def setMimeType(value: NullableOption[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setProcessingMetadata(value: NullableOption[Boolean]): Self = StObject.set(x, "processingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingMetadataNull: Self = StObject.set(x, "processingMetadata", null)
    
    @scala.inline
    def setProcessingMetadataUndefined: Self = StObject.set(x, "processingMetadata", js.undefined)
  }
}
