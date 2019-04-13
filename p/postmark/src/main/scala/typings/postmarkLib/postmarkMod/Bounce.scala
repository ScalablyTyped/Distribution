package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// bounces
trait Bounce extends js.Object {
  var BouncedAt: java.lang.String
  var CanActivate: scala.Boolean
  var Content: java.lang.String
  var Description: java.lang.String
  var Details: java.lang.String
  var DumpAvailable: scala.Boolean
  var Email: java.lang.String
  var From: java.lang.String
  var ID: scala.Double
  var Inactive: scala.Boolean
  var MessageID: java.lang.String
  var Name: java.lang.String
  var ServerID: scala.Double
  var Subject: java.lang.String
  var Tag: java.lang.String
  var Type: java.lang.String
  var TypeCode: scala.Double
}

object Bounce {
  @scala.inline
  def apply(
    BouncedAt: java.lang.String,
    CanActivate: scala.Boolean,
    Content: java.lang.String,
    Description: java.lang.String,
    Details: java.lang.String,
    DumpAvailable: scala.Boolean,
    Email: java.lang.String,
    From: java.lang.String,
    ID: scala.Double,
    Inactive: scala.Boolean,
    MessageID: java.lang.String,
    Name: java.lang.String,
    ServerID: scala.Double,
    Subject: java.lang.String,
    Tag: java.lang.String,
    Type: java.lang.String,
    TypeCode: scala.Double
  ): Bounce = {
    val __obj = js.Dynamic.literal(BouncedAt = BouncedAt, CanActivate = CanActivate, Content = Content, Description = Description, Details = Details, DumpAvailable = DumpAvailable, Email = Email, From = From, ID = ID, Inactive = Inactive, MessageID = MessageID, Name = Name, ServerID = ServerID, Subject = Subject, Tag = Tag, Type = Type, TypeCode = TypeCode)
  
    __obj.asInstanceOf[Bounce]
  }
}

