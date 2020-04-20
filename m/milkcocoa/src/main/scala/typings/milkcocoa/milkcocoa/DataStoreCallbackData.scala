package typings.milkcocoa.milkcocoa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStoreCallbackData extends js.Object {
  var err: String
  var id: String
  var path: String
  var value: js.Any
}

object DataStoreCallbackData {
  @scala.inline
  def apply(err: String, id: String, path: String, value: js.Any): DataStoreCallbackData = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStoreCallbackData]
  }
}

