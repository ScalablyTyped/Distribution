package typings.pem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fingerprint extends js.Object {
  var fingerprint: String
}

object Fingerprint {
  @scala.inline
  def apply(fingerprint: String): Fingerprint = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fingerprint]
  }
}

