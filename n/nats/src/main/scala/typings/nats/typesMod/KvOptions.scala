package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KvOptions extends StObject {
  
  var bindOnly: Boolean
  
  var codec: KvCodecs
  
  var history: Double
  
  var maxBucketSize: Double
  
  var maxValueSize: Double
  
  var mirrorBucket: String
  
  var placementCluster: String
  
  var replicas: Double
  
  var storage: StorageType
  
  var streamName: String
  
  var timeout: Double
  
  var ttl: Double
}
object KvOptions {
  
  inline def apply(
    bindOnly: Boolean,
    codec: KvCodecs,
    history: Double,
    maxBucketSize: Double,
    maxValueSize: Double,
    mirrorBucket: String,
    placementCluster: String,
    replicas: Double,
    storage: StorageType,
    streamName: String,
    timeout: Double,
    ttl: Double
  ): KvOptions = {
    val __obj = js.Dynamic.literal(bindOnly = bindOnly.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], maxBucketSize = maxBucketSize.asInstanceOf[js.Any], maxValueSize = maxValueSize.asInstanceOf[js.Any], mirrorBucket = mirrorBucket.asInstanceOf[js.Any], placementCluster = placementCluster.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[KvOptions]
  }
  
  extension [Self <: KvOptions](x: Self) {
    
    inline def setBindOnly(value: Boolean): Self = StObject.set(x, "bindOnly", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: KvCodecs): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setMaxBucketSize(value: Double): Self = StObject.set(x, "maxBucketSize", value.asInstanceOf[js.Any])
    
    inline def setMaxValueSize(value: Double): Self = StObject.set(x, "maxValueSize", value.asInstanceOf[js.Any])
    
    inline def setMirrorBucket(value: String): Self = StObject.set(x, "mirrorBucket", value.asInstanceOf[js.Any])
    
    inline def setPlacementCluster(value: String): Self = StObject.set(x, "placementCluster", value.asInstanceOf[js.Any])
    
    inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: StorageType): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
