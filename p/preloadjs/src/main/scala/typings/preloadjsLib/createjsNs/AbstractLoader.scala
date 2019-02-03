package typings
package preloadjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AbstractLoader")
@js.native
class AbstractLoader ()
  extends createjsDashLibLib.createjsNs.EventDispatcher {
  var canceled: scala.Boolean = js.native
  var loaded: scala.Boolean = js.native
  var progress: scala.Double = js.native
  var `type`: java.lang.String = js.native
  // methods
  def cancel(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getItem(): js.Object = js.native
  def getItem(value: java.lang.String): js.Object = js.native
  def getLoadedItems(): js.Array[js.Object] = js.native
  def getResult(): js.Object = js.native
  def getResult(value: js.Any): js.Object = js.native
  def getResult(value: js.Any, rawResult: scala.Boolean): js.Object = js.native
  def getTag(): js.Object = js.native
  def load(): scala.Unit = js.native
  def resultFormatter(): js.Any = js.native
  def setTag(tag: js.Object): scala.Unit = js.native
}

/* static members */
@JSGlobal("createjs.AbstractLoader")
@js.native
object AbstractLoader extends js.Object {
  // properties
  var BINARY: java.lang.String = js.native
  var CSS: java.lang.String = js.native
  var GET: java.lang.String = js.native
  var IMAGE: java.lang.String = js.native
  var JAVASCRIPT: java.lang.String = js.native
  var JSON: java.lang.String = js.native
  var JSONP: java.lang.String = js.native
  var MANIFEST: java.lang.String = js.native
  var POST: java.lang.String = js.native
  var SOUND: java.lang.String = js.native
  var SPRITESHEET: java.lang.String = js.native
  var SVG: java.lang.String = js.native
  var TEXT: java.lang.String = js.native
  var VIDEO: java.lang.String = js.native
  var XML: java.lang.String = js.native
}

