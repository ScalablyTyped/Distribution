package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tracking info
trait VendorTrackingInfo extends js.Object {
  var Company: String
  var Family: String
  var Name: String
}

object VendorTrackingInfo {
  @scala.inline
  def apply(Company: String, Family: String, Name: String): VendorTrackingInfo = {
    val __obj = js.Dynamic.literal(Company = Company, Family = Family, Name = Name)
  
    __obj.asInstanceOf[VendorTrackingInfo]
  }
}

