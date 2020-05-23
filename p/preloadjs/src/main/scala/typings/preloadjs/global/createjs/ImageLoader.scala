package typings.preloadjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ImageLoader")
@js.native
class ImageLoader protected ()
  extends typings.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object, preferXHR: Boolean) = this()
}

/* static members */
@JSGlobal("createjs.ImageLoader")
@js.native
object ImageLoader extends js.Object {
  def canLoadItem(item: js.Object): Boolean = js.native
}

