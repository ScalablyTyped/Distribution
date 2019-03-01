package typings
package pkijsLib.srcBasicOCSPResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateStatusResult extends js.Object {
  var isForCertificate: scala.Boolean
  /**
    * 0 = good, 1 = revoked, 2 = unknown
    * 
    * @type {number}
    * @memberOf GetCertificateStatusResult
    */
  var status: scala.Double
}

object GetCertificateStatusResult {
  @scala.inline
  def apply(isForCertificate: scala.Boolean, status: scala.Double): GetCertificateStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isForCertificate")(isForCertificate)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[GetCertificateStatusResult]
  }
}

