package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyKey extends js.Object {
  var key: typings.openpgp.mod.key.Key
}

object KeyKey {
  @scala.inline
  def apply(key: typings.openpgp.mod.key.Key): KeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyKey]
  }
}

