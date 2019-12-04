package typings.ol.renderWebglPolygonReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonVertex extends js.Object {
  var i: Double
  var reflex: js.UndefOr[Boolean] = js.undefined
  var x: Double
  var y: Double
}

object PolygonVertex {
  @scala.inline
  def apply(i: Double, x: Double, y: Double, reflex: js.UndefOr[Boolean] = js.undefined): PolygonVertex = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(reflex)) __obj.updateDynamic("reflex")(reflex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonVertex]
  }
}

