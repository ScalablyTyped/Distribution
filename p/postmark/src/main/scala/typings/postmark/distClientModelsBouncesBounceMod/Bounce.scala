package typings.postmark.distClientModelsBouncesBounceMod

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
    val __obj = js.Dynamic.literal(BouncedAt = BouncedAt, CanActivate = CanActivate, Description = Description, Details = Details, DumpAvailable = DumpAvailable, Email = Email, From = From, ID = ID, Inactive = Inactive, MessageID = MessageID, MessageStream = MessageStream, Name = Name, RecordType = RecordType, ServerID = ServerID, Subject = Subject, Type = Type, TypeCode = TypeCode)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[Bounce]
  }
}

