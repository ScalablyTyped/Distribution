package typings.nodeForge.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotAfter extends js.Object {
  var notAfter: Date
  var notBefore: Date
}

object NotAfter {
  @scala.inline
  def apply(notAfter: Date, notBefore: Date): NotAfter = {
    val __obj = js.Dynamic.literal(notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotAfter]
  }
}

