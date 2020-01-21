package typings.preloadjs.createjs

import typings.createjsLib.createjs.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AbstractLoader")
@js.native
class AbstractLoader () extends EventDispatcher {
  var canceled: Boolean = js.native
  var loaded: Boolean = js.native
  var progress: Double = js.native
  var `type`: String = js.native
  // methods
  def cancel(): Unit = js.native
  def destroy(): Unit = js.native
  def getItem(): js.Object = js.native
  def getItem(value: String): js.Object = js.native
  def getLoadedItems(): js.Array[js.Object] = js.native
  def getResult(): js.Object = js.native
  def getResult(value: js.Any): js.Object = js.native
  def getResult(value: js.Any, rawResult: Boolean): js.Object = js.native
  def getTag(): js.Object = js.native
  def load(): Unit = js.native
  def resultFormatter(): js.Any = js.native
  def setTag(tag: js.Object): Unit = js.native
}

/* static members */
@JSGlobal("createjs.AbstractLoader")
@js.native
object AbstractLoader extends js.Object {
  // properties
  var BINARY: String = js.native
  var CSS: String = js.native
  var GET: String = js.native
  var IMAGE: String = js.native
  var JAVASCRIPT: String = js.native
  var JSON: String = js.native
  var JSONP: String = js.native
  var MANIFEST: String = js.native
  var POST: String = js.native
  var SOUND: String = js.native
  var SPRITESHEET: String = js.native
  var SVG: String = js.native
  var TEXT: String = js.native
  var VIDEO: String = js.native
  var XML: String = js.native
}

