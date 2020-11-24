package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetentionConfig extends js.Object {
  
  /**
    * The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the topic's partitions grows beyond this value, older messages will be dropped to make room
    * for newer ones, regardless of the value of `period`.
    */
  var perPartitionBytes: js.UndefOr[String] = js.native
  
  /** How long a published message is retained. If unset, messages will be retained as long as the bytes retained for each partition is below `per_partition_bytes`. */
  var period: js.UndefOr[String] = js.native
}
object RetentionConfig {
  
  @scala.inline
  def apply(): RetentionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionConfig]
  }
  
  @scala.inline
  implicit class RetentionConfigOps[Self <: RetentionConfig] (val x: Self) extends AnyVal {
    
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
    def setPerPartitionBytes(value: String): Self = this.set("perPartitionBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerPartitionBytes: Self = this.set("perPartitionBytes", js.undefined)
    
    @scala.inline
    def setPeriod(value: String): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
}
