package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketWriteStreamOptions
  extends StObject
     with WriteConcern {
  
  /**
    * The chunk size to use, in bytes
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Default false; If true, disables adding an md5 field to file data
    */
  var disableMD5: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom file id for the GridFS file.
    */
  var id: js.UndefOr[GridFSBucketWriteStreamId] = js.undefined
}
object GridFSBucketWriteStreamOptions {
  
  inline def apply(): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
  
  extension [Self <: GridFSBucketWriteStreamOptions](x: Self) {
    
    inline def setChunkSizeBytes(value: scala.Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    inline def setDisableMD5(value: Boolean): Self = StObject.set(x, "disableMD5", value.asInstanceOf[js.Any])
    
    inline def setDisableMD5Undefined: Self = StObject.set(x, "disableMD5", js.undefined)
    
    inline def setId(value: GridFSBucketWriteStreamId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
