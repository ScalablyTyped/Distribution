package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.LoadItem")
@js.native
class LoadItem () extends js.Object {
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

/* static members */
@JSGlobal("createjs.LoadItem")
@js.native
object LoadItem extends js.Object {
  def create(value: String): js.Object | LoadItem = js.native
  def create(value: js.Object): js.Object | LoadItem = js.native
  // methods
  def create(value: LoadItem): js.Object | LoadItem = js.native
}

