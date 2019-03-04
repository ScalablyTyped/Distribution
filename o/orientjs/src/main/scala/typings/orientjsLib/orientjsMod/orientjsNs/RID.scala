package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RID
  extends nodeLib.String {
  var cluster: js.UndefOr[scala.Double] = js.undefined
  @JSName("equals")
  var equals_FRID: js.UndefOr[js.Function1[/* rid */ java.lang.String | this.type, scala.Boolean]] = js.undefined
  var isValid: js.UndefOr[
    js.Function1[/* input */ js.UndefOr[java.lang.String | this.type | js.Any], scala.Boolean]
  ] = js.undefined
  var parse: js.UndefOr[
    (js.Function1[/* input */ java.lang.String, scala.Boolean]) with (js.Function1[/* input */ java.lang.String, this.type]) with (js.Function1[/* input */ java.lang.String, js.Array[this.type]])
  ] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var toRid: js.UndefOr[js.Function2[/* cluster */ scala.Double, /* position */ scala.Double, _]] = js.undefined
}

object RID {
  @scala.inline
  def apply(
    trimLeft: js.Function0[java.lang.String],
    trimRight: js.Function0[java.lang.String],
    valueOf: js.Function0[java.lang.String],
    cluster: scala.Int | scala.Double = null,
    equals: js.Function1[/* rid */ java.lang.String | RID, scala.Boolean] = null,
    isValid: js.Function1[/* input */ js.UndefOr[java.lang.String | RID | js.Any], scala.Boolean] = null,
    parse: (js.Function1[/* input */ java.lang.String, scala.Boolean]) with (js.Function1[/* input */ java.lang.String, RID]) with (js.Function1[/* input */ java.lang.String, js.Array[RID]]) = null,
    position: scala.Int | scala.Double = null,
    toRid: js.Function2[/* cluster */ scala.Double, /* position */ scala.Double, _] = null
  ): RID = {
    val __obj = js.Dynamic.literal(trimLeft = trimLeft, trimRight = trimRight, valueOf = valueOf)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (toRid != null) __obj.updateDynamic("toRid")(toRid)
    __obj.asInstanceOf[RID]
  }
}

