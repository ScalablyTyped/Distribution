package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameData
  extends /* key */ StringDictionary[js.Any] {
  var data: js.Object = js.native
  var id: js.Any = js.native
  var itemData: js.Object = js.native
}

object DictpropNameData {
  @scala.inline
  def apply(data: js.Object, id: js.Any, itemData: js.Object): DictpropNameData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameData]
  }
  @scala.inline
  implicit class DictpropNameDataOps[Self <: DictpropNameData] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemData(value: js.Object): Self = this.set("itemData", value.asInstanceOf[js.Any])
  }
  
}

