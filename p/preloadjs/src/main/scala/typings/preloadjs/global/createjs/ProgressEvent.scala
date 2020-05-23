package typings.preloadjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ProgressEvent")
@js.native
class ProgressEvent protected ()
  extends typings.preloadjs.createjs.ProgressEvent {
  def this(loaded: Double) = this()
  def this(loaded: Double, total: Double) = this()
  // properties
  /* CompleteClass */
  override var loaded: Double = js.native
  /* CompleteClass */
  override var progress: Double = js.native
  /* CompleteClass */
  override var total: Double = js.native
}

