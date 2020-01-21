package typings.orientjs.mod

import typings.std.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "ORID")
@js.native
class ORID () extends String {
  var cluster: js.UndefOr[Double] = js.native
  @JSName("equals")
  var equals_FORID: js.UndefOr[js.Function1[/* rid */ java.lang.String | this.type, Boolean]] = js.native
  var isValid: js.UndefOr[
    js.Function1[/* input */ js.UndefOr[java.lang.String | this.type | js.Any], Boolean]
  ] = js.native
  var parse: js.UndefOr[
    (js.Function1[/* input */ java.lang.String, Boolean]) with (js.Function1[/* input */ java.lang.String, this.type]) with (js.Function1[/* input */ java.lang.String, js.Array[this.type]])
  ] = js.native
  var position: js.UndefOr[Double] = js.native
  var toRid: js.UndefOr[js.Function2[/* cluster */ Double, /* position */ Double, _]] = js.native
}

