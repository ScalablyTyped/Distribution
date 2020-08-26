package typings.mongoose.anon

import typings.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlattenMaps extends js.Object {
  var flattenMaps: `true` = js.native
}

object FlattenMaps {
  @scala.inline
  def apply(flattenMaps: `true`): FlattenMaps = {
    val __obj = js.Dynamic.literal(flattenMaps = flattenMaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenMaps]
  }
  @scala.inline
  implicit class FlattenMapsOps[Self <: FlattenMaps] (val x: Self) extends AnyVal {
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
    def setFlattenMaps(value: `true`): Self = this.set("flattenMaps", value.asInstanceOf[js.Any])
  }
  
}

