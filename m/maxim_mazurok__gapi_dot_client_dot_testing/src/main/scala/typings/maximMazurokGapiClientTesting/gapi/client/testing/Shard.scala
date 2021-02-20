package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shard extends StObject {
  
  /** Output only. The total number of shards. */
  var numShards: js.UndefOr[Double] = js.native
  
  /** Output only. The index of the shard among all the shards. */
  var shardIndex: js.UndefOr[Double] = js.native
  
  /** Output only. Test targets for each shard. */
  var testTargetsForShard: js.UndefOr[TestTargetsForShard] = js.native
}
object Shard {
  
  @scala.inline
  def apply(): Shard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shard]
  }
  
  @scala.inline
  implicit class ShardMutableBuilder[Self <: Shard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumShards(value: Double): Self = StObject.set(x, "numShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumShardsUndefined: Self = StObject.set(x, "numShards", js.undefined)
    
    @scala.inline
    def setShardIndex(value: Double): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIndexUndefined: Self = StObject.set(x, "shardIndex", js.undefined)
    
    @scala.inline
    def setTestTargetsForShard(value: TestTargetsForShard): Self = StObject.set(x, "testTargetsForShard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTargetsForShardUndefined: Self = StObject.set(x, "testTargetsForShard", js.undefined)
  }
}
