package typings.openpgp

import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyKey extends js.Object {
  var key: Key
}

object AnonKeyKey {
  @scala.inline
  def apply(key: Key): AnonKeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyKey]
  }
}

