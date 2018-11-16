package typings
package preloadjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ProgressEvent")
@js.native
class ProgressEvent protected () extends js.Object {
  def this(loaded: scala.Double) = this()
  def this(loaded: scala.Double, total: scala.Double) = this()
  // properties
  var loaded: scala.Double = js.native
  var progress: scala.Double = js.native
  var total: scala.Double = js.native
}

