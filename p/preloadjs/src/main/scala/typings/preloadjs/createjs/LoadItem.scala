package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadItem extends js.Object {
  // properties
  var callback: String
  var crossOrigin: Boolean
  var data: js.Object
  var headers: js.Object
  var id: String
  var loadTimeout: Double
  var maintainOrder: Boolean
  var method: String
  var mimeType: String
  var src: String
  var `type`: String
  var values: js.Object
  var withCredentials: Boolean
  def set(props: js.Object): LoadItem
}

object LoadItem {
  @scala.inline
  def apply(
    callback: String,
    crossOrigin: Boolean,
    data: js.Object,
    headers: js.Object,
    id: String,
    loadTimeout: Double,
    maintainOrder: Boolean,
    method: String,
    mimeType: String,
    set: js.Object => LoadItem,
    src: String,
    `type`: String,
    values: js.Object,
    withCredentials: Boolean
  ): LoadItem = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], crossOrigin = crossOrigin.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadTimeout = loadTimeout.asInstanceOf[js.Any], maintainOrder = maintainOrder.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), src = src.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadItem]
  }
}

