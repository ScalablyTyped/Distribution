package typings.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFingerprint extends js.Object {
  var fingerprint: String
}

object AnonFingerprint {
  @scala.inline
  def apply(fingerprint: String): AnonFingerprint = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFingerprint]
  }
}

