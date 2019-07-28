package typings.ol.vectorImageTileMod

import typings.ol.featureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplayState extends js.Object {
  var dirty: Boolean = js.native
  @JSName("renderedRenderOrder")
  var renderedRenderOrder_Original: OrderFunction = js.native
  var renderedRevision: Double = js.native
  var renderedTileRevision: Double = js.native
  def renderedRenderOrder(p0: FeatureLike, p1: FeatureLike): Double = js.native
}

