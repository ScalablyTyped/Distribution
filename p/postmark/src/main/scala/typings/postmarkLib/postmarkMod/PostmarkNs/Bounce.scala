package typings
package postmarkLib.postmarkMod.PostmarkNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BouncedAt")(BouncedAt)
    __obj.updateDynamic("CanActivate")(CanActivate)
    __obj.updateDynamic("Content")(Content)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Details")(Details)
    __obj.updateDynamic("DumpAvailable")(DumpAvailable)
    __obj.updateDynamic("Email")(Email)
    __obj.updateDynamic("From")(From)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Inactive")(Inactive)
    __obj.updateDynamic("MessageID")(MessageID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ServerID")(ServerID)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("Tag")(Tag)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("TypeCode")(TypeCode)
    __obj.asInstanceOf[Bounce]
  }
}

