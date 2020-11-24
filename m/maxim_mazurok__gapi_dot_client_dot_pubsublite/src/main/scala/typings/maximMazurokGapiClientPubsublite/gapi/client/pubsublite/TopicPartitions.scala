package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicPartitions extends js.Object {
  
  /** The number of partitions in the topic. */
  var partitionCount: js.UndefOr[String] = js.native
}
object TopicPartitions {
  
  @scala.inline
  def apply(): TopicPartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicPartitions]
  }
  
  @scala.inline
  implicit class TopicPartitionsOps[Self <: TopicPartitions] (val x: Self) extends AnyVal {
    
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
    def setPartitionCount(value: String): Self = this.set("partitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionCount: Self = this.set("partitionCount", js.undefined)
  }
}
