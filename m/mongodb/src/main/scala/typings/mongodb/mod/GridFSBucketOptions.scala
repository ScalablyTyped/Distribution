package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketOptions extends StObject {
  
  var bucketName: js.UndefOr[String] = js.undefined
  
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
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
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setWriteConcern(value: WriteConcern): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
    
    inline def setWriteConcernUndefined: Self = StObject.set(x, "writeConcern", js.undefined)
  }
}
