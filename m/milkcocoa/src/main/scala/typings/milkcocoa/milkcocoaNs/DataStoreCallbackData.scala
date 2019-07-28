package typings.milkcocoa.milkcocoaNs

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
    val __obj = js.Dynamic.literal(err = err, id = id, path = path, value = value)
  
    __obj.asInstanceOf[DataStoreCallbackData]
  }
}

