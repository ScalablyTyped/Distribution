package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "RID")
@js.native
class RID ()
  extends stdLib.String {
  var cluster: js.UndefOr[scala.Double] = js.native
  @JSName("equals")
  var equals_FRID: js.UndefOr[js.Function1[/* rid */ java.lang.String | this.type, scala.Boolean]] = js.native
  var isValid: js.UndefOr[
    js.Function1[/* input */ js.UndefOr[java.lang.String | this.type | js.Any], scala.Boolean]
  ] = js.native
  var parse: js.UndefOr[
    (js.Function1[/* input */ java.lang.String, scala.Boolean]) with (js.Function1[/* input */ java.lang.String, this.type]) with (js.Function1[/* input */ java.lang.String, js.Array[this.type]])
  ] = js.native
  var position: js.UndefOr[scala.Double] = js.native
  var toRid: js.UndefOr[js.Function2[/* cluster */ scala.Double, /* position */ scala.Double, _]] = js.native
}

