package typings.postmark.outboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDetails extends js.Object {
  var Company: String
  var Family: String
  var Name: String
}

object ClientDetails {
  @scala.inline
  def apply(Company: String, Family: String, Name: String): ClientDetails = {
    val __obj = js.Dynamic.literal(Company = Company.asInstanceOf[js.Any], Family = Family.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDetails]
  }
}

