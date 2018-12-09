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

