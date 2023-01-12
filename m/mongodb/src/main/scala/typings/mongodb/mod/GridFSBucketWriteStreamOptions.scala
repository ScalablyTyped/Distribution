package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketWriteStreamOptions
  extends StObject
     with WriteConcernOptions {
  
  /** Array of strings to store in the file document's `aliases` field */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Overwrite this bucket's chunkSizeBytes for this file */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  
  /** String to store in the file document's `contentType` field */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** Custom file id for the GridFS file. */
  var id: js.UndefOr[typings.bson.mod.ObjectId] = js.undefined
  
  /** Object to store in the file document's `metadata` field */
  var metadata: js.UndefOr[Document] = js.undefined
}
object GridFSBucketWriteStreamOptions {
  
  inline def apply(): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridFSBucketWriteStreamOptions] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setChunkSizeBytes(value: scala.Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setId(value: typings.bson.mod.ObjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: Document): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
