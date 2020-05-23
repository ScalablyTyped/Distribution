package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uuid extends js.Object {
  var name: String
  var uuid: String
}

object Uuid {
  @scala.inline
  def apply(name: String, uuid: String): Uuid = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuid]
  }
}

