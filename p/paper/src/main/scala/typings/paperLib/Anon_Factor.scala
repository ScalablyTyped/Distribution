package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factor extends js.Object {
  var factor: js.UndefOr[scala.Double] = js.undefined
  var from: js.UndefOr[scala.Double | paperLib.paperNs.Segment | paperLib.paperNs.Curve] = js.undefined
  var to: js.UndefOr[scala.Double | paperLib.paperNs.Segment | paperLib.paperNs.Curve] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Factor {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    from: scala.Double | paperLib.paperNs.Segment | paperLib.paperNs.Curve = null,
    to: scala.Double | paperLib.paperNs.Segment | paperLib.paperNs.Curve = null,
    `type`: java.lang.String = null
  ): Anon_Factor = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Factor]
  }
}

