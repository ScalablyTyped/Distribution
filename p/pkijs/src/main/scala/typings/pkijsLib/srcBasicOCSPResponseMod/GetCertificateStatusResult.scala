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

