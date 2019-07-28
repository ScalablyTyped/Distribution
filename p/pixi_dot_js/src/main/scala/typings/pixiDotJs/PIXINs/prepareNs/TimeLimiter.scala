package typings.pixiDotJs.PIXINs.prepareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.prepare.TimeLimiter")
@js.native
class TimeLimiter protected () extends js.Object {
  def this(maxMilliseconds: Double) = this()
  var frameStart: Double = js.native
  var maxMilliseconds: Double = js.native
  def allowedToUpload(): Boolean = js.native
  def beginFrame(): Unit = js.native
}

