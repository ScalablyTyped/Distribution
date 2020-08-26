package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadItem extends js.Object {
  // properties
  var callback: String = js.native
  var crossOrigin: Boolean = js.native
  var data: js.Object = js.native
  var headers: js.Object = js.native
  var id: String = js.native
  var loadTimeout: Double = js.native
  var maintainOrder: Boolean = js.native
  var method: String = js.native
  var mimeType: String = js.native
  var src: String = js.native
  var `type`: String = js.native
  var values: js.Object = js.native
  var withCredentials: Boolean = js.native
  def set(props: js.Object): LoadItem = js.native
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
  @scala.inline
  implicit class LoadItemOps[Self <: LoadItem] (val x: Self) extends AnyVal {
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
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrossOrigin(value: Boolean): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadTimeout(value: Double): Self = this.set("loadTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaintainOrder(value: Boolean): Self = this.set("maintainOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: js.Object => LoadItem): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: js.Object): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
  
}

