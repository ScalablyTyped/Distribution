package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tracking info
trait VendorTrackingInfo extends js.Object {
  var Company: java.lang.String
  var Family: java.lang.String
  var Name: java.lang.String
}

object VendorTrackingInfo {
  @scala.inline
  def apply(Company: java.lang.String, Family: java.lang.String, Name: java.lang.String): VendorTrackingInfo = {
    val __obj = js.Dynamic.literal(Company = Company, Family = Family, Name = Name)
  
    __obj.asInstanceOf[VendorTrackingInfo]
  }
}

