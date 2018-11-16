package typings
package pixiDotJsLib.PIXINs.prepareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.prepare.CountLimiter")
@js.native
class CountLimiter protected () extends js.Object {
  def this(maxItemsPerFrame: scala.Double) = this()
  var itemsLeft: scala.Double = js.native
  var maxItemsPerFrame: scala.Double = js.native
  def allowedToUpload(): scala.Boolean = js.native
  def beginFrame(): scala.Unit = js.native
}

