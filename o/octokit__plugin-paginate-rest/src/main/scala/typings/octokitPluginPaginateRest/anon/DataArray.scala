package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Os
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataArray extends js.Object {
  var data: js.Array[Os]
}

object DataArray {
  @scala.inline
  def apply(data: js.Array[Os]): DataArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray]
  }
}

