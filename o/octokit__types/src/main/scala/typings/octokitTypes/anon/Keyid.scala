package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyid extends js.Object {
  var key: String
  var key_id: String
}

object Keyid {
  @scala.inline
  def apply(key: String, key_id: String): Keyid = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyid]
  }
}

