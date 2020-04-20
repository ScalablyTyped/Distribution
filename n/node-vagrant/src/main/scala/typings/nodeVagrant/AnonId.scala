package typings.nodeVagrant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var name: String
  var provider: String
  var state: String
}

object AnonId {
  @scala.inline
  def apply(id: String, name: String, provider: String, state: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

