package typings.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounce extends js.Object {
  var BouncedAt: String
  var CanActivate: Boolean
  var Content: js.UndefOr[String] = js.undefined
  var Description: String
  var Details: String
  var DumpAvailable: Boolean
  var Email: String
  var From: String
  var ID: Double
  var Inactive: Boolean
  var MessageID: String
  var MessageStream: String
  var Name: String
  var RecordType: String
  var ServerID: String
  var Subject: String
  var Tag: js.UndefOr[String] = js.undefined
  var Type: String
  var TypeCode: Double
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
    TypeCode: Double,
    Content: String = null,
    Tag: String = null
  ): Bounce = {
    val __obj = js.Dynamic.literal(BouncedAt = BouncedAt.asInstanceOf[js.Any], CanActivate = CanActivate.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], DumpAvailable = DumpAvailable.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Inactive = Inactive.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeCode = TypeCode.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounce]
  }
}

