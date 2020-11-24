package typings.postmark.messageStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageStreamUnarchiveResponse extends js.Object {
  
  var ArchivedAt: js.UndefOr[Null] = js.native
  
  var CreatedAt: String = js.native
  
  var Description: String = js.native
  
  var ExpectedPurgeDate: js.UndefOr[String] = js.native
  
  var ID: String = js.native
  
  var MessageStreamType: String = js.native
  
  var Name: String = js.native
  
  var ServerID: Double = js.native
  
  var SubscriptionManagementConfiguration: typings.postmark.messageStreamMod.SubscriptionManagementConfiguration = js.native
  
  var UpdatedAt: js.UndefOr[String] = js.native
}
object MessageStreamUnarchiveResponse {
  
  @scala.inline
  def apply(
    CreatedAt: String,
    Description: String,
    ID: String,
    MessageStreamType: String,
    Name: String,
    ServerID: Double,
    SubscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ): MessageStreamUnarchiveResponse = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], MessageStreamType = MessageStreamType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any], SubscriptionManagementConfiguration = SubscriptionManagementConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStreamUnarchiveResponse]
  }
  
  @scala.inline
  implicit class MessageStreamUnarchiveResponseOps[Self <: MessageStreamUnarchiveResponse] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: String): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStreamType(value: String): Self = this.set("MessageStreamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerID(value: Double): Self = this.set("ServerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionManagementConfiguration(value: SubscriptionManagementConfiguration): Self = this.set("SubscriptionManagementConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedPurgeDate(value: String): Self = this.set("ExpectedPurgeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedPurgeDate: Self = this.set("ExpectedPurgeDate", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
}
