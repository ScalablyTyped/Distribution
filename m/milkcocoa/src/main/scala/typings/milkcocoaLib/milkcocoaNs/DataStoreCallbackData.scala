package typings
package milkcocoaLib.milkcocoaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStoreCallbackData extends js.Object {
  var err: java.lang.String
  var id: java.lang.String
  var path: java.lang.String
  var value: js.Any
}

object DataStoreCallbackData {
  @scala.inline
  def apply(err: java.lang.String, id: java.lang.String, path: java.lang.String, value: js.Any): DataStoreCallbackData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("err")(err)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataStoreCallbackData]
  }
}

