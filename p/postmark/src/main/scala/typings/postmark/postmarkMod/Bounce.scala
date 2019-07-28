package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// bounces
trait Bounce extends js.Object {
  var BouncedAt: String
  var CanActivate: Boolean
  var Content: String
  var Description: String
  var Details: String
  var DumpAvailable: Boolean
  var Email: String
  var From: String
  var ID: Double
  var Inactive: Boolean
  var MessageID: String
  var Name: String
  var ServerID: Double
  var Subject: String
  var Tag: String
  var Type: String
  var TypeCode: Double
}

object Bounce {
  @scala.inline
  def apply(
    BouncedAt: String,
    CanActivate: Boolean,
    Content: String,
    Description: String,
    Details: String,
    DumpAvailable: Boolean,
    Email: String,
    From: String,
    ID: Double,
    Inactive: Boolean,
    MessageID: String,
    Name: String,
    ServerID: Double,
    Subject: String,
    Tag: String,
    Type: String,
    TypeCode: Double
  ): Bounce = {
    val __obj = js.Dynamic.literal(BouncedAt = BouncedAt, CanActivate = CanActivate, Content = Content, Description = Description, Details = Details, DumpAvailable = DumpAvailable, Email = Email, From = From, ID = ID, Inactive = Inactive, MessageID = MessageID, Name = Name, ServerID = ServerID, Subject = Subject, Tag = Tag, Type = Type, TypeCode = TypeCode)
  
    __obj.asInstanceOf[Bounce]
  }
}

