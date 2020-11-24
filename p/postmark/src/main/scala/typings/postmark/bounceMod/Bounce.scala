package typings.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounce extends js.Object {
  
  var BouncedAt: String = js.native
  
  var CanActivate: Boolean = js.native
  
  var Content: js.UndefOr[String] = js.native
  
  var Description: String = js.native
  
  var Details: String = js.native
  
  var DumpAvailable: Boolean = js.native
  
  var Email: String = js.native
  
  var From: String = js.native
  
  var ID: Double = js.native
  
  var Inactive: Boolean = js.native
  
  var MessageID: String = js.native
  
  var MessageStream: String = js.native
  
  var Name: String = js.native
  
  var RecordType: String = js.native
  
  var ServerID: String = js.native
  
  var Subject: String = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var Type: String = js.native
  
  var TypeCode: Double = js.native
}
object Bounce {
  
  @scala.inline
  def apply(
    BouncedAt: String,
    CanActivate: Boolean,
    Description: String,
    Details: String,
    DumpAvailable: Boolean,
    Email: String,
    From: String,
    ID: Double,
    Inactive: Boolean,
    MessageID: String,
    MessageStream: String,
    Name: String,
    RecordType: String,
    ServerID: String,
    Subject: String,
    Type: String,
    TypeCode: Double
  ): Bounce = {
    val __obj = js.Dynamic.literal(BouncedAt = BouncedAt.asInstanceOf[js.Any], CanActivate = CanActivate.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], DumpAvailable = DumpAvailable.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Inactive = Inactive.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeCode = TypeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounce]
  }
  
  @scala.inline
  implicit class BounceOps[Self <: Bounce] (val x: Self) extends AnyVal {
    
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
    def setBouncedAt(value: String): Self = this.set("BouncedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanActivate(value: Boolean): Self = this.set("CanActivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: String): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDumpAvailable(value: Boolean): Self = this.set("DumpAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = this.set("From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("Inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: String): Self = this.set("MessageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStream(value: String): Self = this.set("MessageStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordType(value: String): Self = this.set("RecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerID(value: String): Self = this.set("ServerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCode(value: Double): Self = this.set("TypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
