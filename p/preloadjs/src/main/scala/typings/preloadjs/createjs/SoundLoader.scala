package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SoundLoader")
@js.native
class SoundLoader protected () extends AbstractLoader {
  def this(loadItem: js.Object, preferXHR: Boolean) = this()
}

/* static members */
@JSGlobal("createjs.SoundLoader")
@js.native
object SoundLoader extends js.Object {
  def canLoadItem(item: js.Object): Boolean = js.native
}

