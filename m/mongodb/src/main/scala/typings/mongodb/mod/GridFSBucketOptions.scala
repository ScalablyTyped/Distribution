package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketOptions
  extends StObject
     with WriteConcernOptions {
  
  /** The 'files' and 'chunks' collections will be prefixed with the bucket name followed by a dot. */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /** Number of bytes stored in each chunk. Defaults to 255KB */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  
  /** Read preference to be passed to read operations */
  var readPreference: js.UndefOr[ReadPreference] = js.undefined
}
object GridFSBucketOptions {
  
  inline def apply(): GridFSBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketOptions]
  }
  
  extension [Self <: GridFSBucketOptions](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setChunkSizeBytes(value: scala.Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    inline def setReadPreference(value: ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
