package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item[K, D] extends js.Object {
  var data: D = js.native
  var metadata: ItemMetadata[K] = js.native
}

object Item {
  @scala.inline
  def apply[K, D](data: D, metadata: ItemMetadata[K]): Item[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[K, D]]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item[_, _], K, D] (val x: Self with (Item[K, D])) extends AnyVal {
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
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ItemMetadata[K]): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

