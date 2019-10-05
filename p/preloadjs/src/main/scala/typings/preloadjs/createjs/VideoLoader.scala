package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.VideoLoader")
@js.native
class VideoLoader protected () extends AbstractLoader {
  def this(loadItem: js.Object, preferXHR: Boolean) = this()
}

/* static members */
@JSGlobal("createjs.VideoLoader")
@js.native
object VideoLoader extends js.Object {
  def canLoadItem(item: js.Object): Boolean = js.native
}

