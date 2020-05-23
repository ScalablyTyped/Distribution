package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdKey extends js.Object {
  var id: Double
  var key: String
}

object IdKey {
  @scala.inline
  def apply(id: Double, key: String): IdKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdKey]
  }
}

