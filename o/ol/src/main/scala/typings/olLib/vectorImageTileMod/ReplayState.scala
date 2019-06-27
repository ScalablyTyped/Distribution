package typings
package olLib.vectorImageTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplayState extends js.Object {
  var dirty: scala.Boolean = js.native
  @JSName("renderedRenderOrder")
  var renderedRenderOrder_Original: olLib.renderMod.OrderFunction = js.native
  var renderedRevision: scala.Double = js.native
  var renderedTileRevision: scala.Double = js.native
  def renderedRenderOrder(p0: olLib.featureMod.FeatureLike, p1: olLib.featureMod.FeatureLike): scala.Double = js.native
}

