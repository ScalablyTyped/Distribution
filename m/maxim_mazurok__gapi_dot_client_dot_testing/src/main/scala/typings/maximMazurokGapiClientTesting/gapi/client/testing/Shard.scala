package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shard extends StObject {
  
  /** Output only. The total number of shards. */
  var numShards: js.UndefOr[Double] = js.undefined
  
  /** Output only. The index of the shard among all the shards. */
  var shardIndex: js.UndefOr[Double] = js.undefined
  
  /** Output only. Test targets for each shard. Only set for manual sharding. */
  var testTargetsForShard: js.UndefOr[TestTargetsForShard] = js.undefined
}
object Shard {
  
  inline def apply(): Shard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shard] (val x: Self) extends AnyVal {
    
    inline def setNumShards(value: Double): Self = StObject.set(x, "numShards", value.asInstanceOf[js.Any])
    
    inline def setNumShardsUndefined: Self = StObject.set(x, "numShards", js.undefined)
    
    inline def setShardIndex(value: Double): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
    
    inline def setShardIndexUndefined: Self = StObject.set(x, "shardIndex", js.undefined)
    
    inline def setTestTargetsForShard(value: TestTargetsForShard): Self = StObject.set(x, "testTargetsForShard", value.asInstanceOf[js.Any])
    
    inline def setTestTargetsForShardUndefined: Self = StObject.set(x, "testTargetsForShard", js.undefined)
  }
}
