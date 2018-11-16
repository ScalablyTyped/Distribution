package typings
package pixiDotJsLib.PIXINs.prepareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.prepare.TimeLimiter")
@js.native
class TimeLimiter protected () extends js.Object {
  def this(maxMilliseconds: scala.Double) = this()
  var frameStart: scala.Double = js.native
  var maxMilliseconds: scala.Double = js.native
  def allowedToUpload(): scala.Boolean = js.native
  def beginFrame(): scala.Unit = js.native
}

