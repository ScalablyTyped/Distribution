package typings.pkijs.basicOCSPResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateStatusResult extends js.Object {
  var isForCertificate: Boolean
  /**
    * 0 = good, 1 = revoked, 2 = unknown
    *
    * @type {number}
    * @memberOf GetCertificateStatusResult
    */
  var status: Double
}

object GetCertificateStatusResult {
  @scala.inline
  def apply(isForCertificate: Boolean, status: Double): GetCertificateStatusResult = {
    val __obj = js.Dynamic.literal(isForCertificate = isForCertificate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateStatusResult]
  }
}

