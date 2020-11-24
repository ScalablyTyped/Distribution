package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Topic extends js.Object {
  
  /** The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id} */
  var name: js.UndefOr[String] = js.native
  
  /** The settings for this topic's partitions. */
  var partitionConfig: js.UndefOr[PartitionConfig] = js.native
  
  /** The settings for this topic's message retention. */
  var retentionConfig: js.UndefOr[RetentionConfig] = js.native
}
object Topic {
  
  @scala.inline
  def apply(): Topic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Topic]
  }
  
  @scala.inline
  implicit class TopicOps[Self <: Topic] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPartitionConfig(value: PartitionConfig): Self = this.set("partitionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionConfig: Self = this.set("partitionConfig", js.undefined)
    
    @scala.inline
    def setRetentionConfig(value: RetentionConfig): Self = this.set("retentionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionConfig: Self = this.set("retentionConfig", js.undefined)
  }
}
