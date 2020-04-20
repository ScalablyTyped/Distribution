package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapReduceResult[Key, Val] extends js.Object {
  var _id: Key
  var value: Val
}

object MapReduceResult {
  @scala.inline
  def apply[Key, Val](_id: Key, value: Val): MapReduceResult[Key, Val] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapReduceResult[Key, Val]]
  }
}

