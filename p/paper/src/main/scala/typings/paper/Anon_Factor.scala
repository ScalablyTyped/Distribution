package typings.paper

import typings.paper.paper.Curve
import typings.paper.paper.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factor extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[Double | Segment | Curve] = js.undefined
  var to: js.UndefOr[Double | Segment | Curve] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Factor {
  @scala.inline
  def apply(
    factor: Int | Double = null,
    from: Double | Segment | Curve = null,
    to: Double | Segment | Curve = null,
    `type`: String = null
  ): Anon_Factor = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Factor]
  }
}

