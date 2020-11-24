package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shard extends js.Object {
  
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
  implicit class ShardOps[Self <: Shard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNumShards(value: Double): Self = this.set("numShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumShards: Self = this.set("numShards", js.undefined)
    
    @scala.inline
    def setShardIndex(value: Double): Self = this.set("shardIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardIndex: Self = this.set("shardIndex", js.undefined)
    
    @scala.inline
    def setTestTargetsForShard(value: TestTargetsForShard): Self = this.set("testTargetsForShard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestTargetsForShard: Self = this.set("testTargetsForShard", js.undefined)
  }
}
