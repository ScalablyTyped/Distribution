package typings.openpgp

import typings.openpgp.openpgpStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: utf8
}

object AnonFormat {
  @scala.inline
  def apply(format: utf8): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormat]
  }
}

