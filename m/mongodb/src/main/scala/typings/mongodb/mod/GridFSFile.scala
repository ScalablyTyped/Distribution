package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSFile extends StObject {
  
  var _id: typings.bson.mod.ObjectId
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var chunkSize: scala.Double
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var filename: String
  
  var length: scala.Double
  
  var metadata: js.UndefOr[Document] = js.undefined
  
  var uploadDate: js.Date
}
object GridFSFile {
  
  inline def apply(
    _id: typings.bson.mod.ObjectId,
    chunkSize: scala.Double,
    filename: String,
    length: scala.Double,
    uploadDate: js.Date
  ): GridFSFile = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridFSFile] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setChunkSize(value: scala.Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLength(value: scala.Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Document): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setUploadDate(value: js.Date): Self = StObject.set(x, "uploadDate", value.asInstanceOf[js.Any])
    
    inline def set_id(value: typings.bson.mod.ObjectId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
