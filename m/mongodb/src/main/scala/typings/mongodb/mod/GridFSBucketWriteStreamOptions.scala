package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridFSBucketWriteStreamOptions extends WriteConcern {
  
  /**
    * The chunk size to use, in bytes
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.native
  
  /**
    * Default false; If true, disables adding an md5 field to file data
    */
  var disableMD5: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom file id for the GridFS file.
    */
  var id: js.UndefOr[GridFSBucketWriteStreamId] = js.native
}
object GridFSBucketWriteStreamOptions {
  
  @scala.inline
  def apply(): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
  
  @scala.inline
  implicit class GridFSBucketWriteStreamOptionsMutableBuilder[Self <: GridFSBucketWriteStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSizeBytes(value: scala.Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    @scala.inline
    def setDisableMD5(value: Boolean): Self = StObject.set(x, "disableMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMD5Undefined: Self = StObject.set(x, "disableMD5", js.undefined)
    
    @scala.inline
    def setId(value: GridFSBucketWriteStreamId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
