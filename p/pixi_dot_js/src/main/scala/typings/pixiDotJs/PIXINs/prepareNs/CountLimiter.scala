package typings.pixiDotJs.PIXINs.prepareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.prepare.CountLimiter")
@js.native
class CountLimiter protected () extends js.Object {
  def this(maxItemsPerFrame: Double) = this()
  var itemsLeft: Double = js.native
  var maxItemsPerFrame: Double = js.native
  def allowedToUpload(): Boolean = js.native
  def beginFrame(): Unit = js.native
}

