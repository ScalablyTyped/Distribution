package typings.nodeForge

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotAfter extends js.Object {
  var notAfter: Date
  var notBefore: Date
}

object AnonNotAfter {
  @scala.inline
  def apply(notAfter: Date, notBefore: Date): AnonNotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotAfter]
  }
}

