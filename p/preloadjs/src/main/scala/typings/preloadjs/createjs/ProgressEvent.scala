package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ProgressEvent")
@js.native
class ProgressEvent protected () extends js.Object {
  def this(loaded: Double) = this()
  def this(loaded: Double, total: Double) = this()
  // properties
  var loaded: Double = js.native
  var progress: Double = js.native
  var total: Double = js.native
}

