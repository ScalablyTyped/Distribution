package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapReduceResult[Key, Val] extends js.Object {
  var _id: Key = js.native
  var value: Val = js.native
}

object MapReduceResult {
  @scala.inline
  def apply[Key, Val](_id: Key, value: Val): MapReduceResult[Key, Val] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapReduceResult[Key, Val]]
  }
  @scala.inline
  implicit class MapReduceResultOps[Self <: MapReduceResult[_, _], Key, Val] (val x: Self with (MapReduceResult[Key, Val])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_id(value: Key): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Val): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

