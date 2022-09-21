package typings.nats.anon

import typings.nats.typesMod.KvCodecs
import typings.nats.typesMod.StorageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.KvOptions> */
trait PartialKvOptions extends StObject {
  
  var bindOnly: js.UndefOr[Boolean] = js.undefined
  
  var codec: js.UndefOr[KvCodecs] = js.undefined
  
  var history: js.UndefOr[Double] = js.undefined
  
  var maxBucketSize: js.UndefOr[Double] = js.undefined
  
  var maxValueSize: js.UndefOr[Double] = js.undefined
  
  var mirrorBucket: js.UndefOr[String] = js.undefined
  
  var placementCluster: js.UndefOr[String] = js.undefined
  
  var replicas: js.UndefOr[Double] = js.undefined
  
  var storage: js.UndefOr[StorageType] = js.undefined
  
  var streamName: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object PartialKvOptions {
  
  inline def apply(): PartialKvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKvOptions]
  }
  
  extension [Self <: PartialKvOptions](x: Self) {
    
    inline def setBindOnly(value: Boolean): Self = StObject.set(x, "bindOnly", value.asInstanceOf[js.Any])
    
    inline def setBindOnlyUndefined: Self = StObject.set(x, "bindOnly", js.undefined)
    
    inline def setCodec(value: KvCodecs): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setHistory(value: Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setMaxBucketSize(value: Double): Self = StObject.set(x, "maxBucketSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBucketSizeUndefined: Self = StObject.set(x, "maxBucketSize", js.undefined)
    
    inline def setMaxValueSize(value: Double): Self = StObject.set(x, "maxValueSize", value.asInstanceOf[js.Any])
    
    inline def setMaxValueSizeUndefined: Self = StObject.set(x, "maxValueSize", js.undefined)
    
    inline def setMirrorBucket(value: String): Self = StObject.set(x, "mirrorBucket", value.asInstanceOf[js.Any])
    
    inline def setMirrorBucketUndefined: Self = StObject.set(x, "mirrorBucket", js.undefined)
    
    inline def setPlacementCluster(value: String): Self = StObject.set(x, "placementCluster", value.asInstanceOf[js.Any])
    
    inline def setPlacementClusterUndefined: Self = StObject.set(x, "placementCluster", js.undefined)
    
    inline def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    inline def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    inline def setStorage(value: StorageType): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
