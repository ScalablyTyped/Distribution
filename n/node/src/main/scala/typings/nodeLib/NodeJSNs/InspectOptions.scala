package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectOptions extends js.Object {
  var breakLength: js.UndefOr[scala.Double] = js.undefined
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var customInspect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default 2
    */
  var depth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * If set to `true`, getters are going to be
    * inspected as well. If set to `'get'` only getters without setter are going
    * to be inspected. If set to `'set'` only getters having a corresponding
    * setter are going to be inspected. This might cause side effects depending on
    * the getter function.
    * @default `false`
    */
  var getters: js.UndefOr[nodeLib.nodeLibStrings.get | nodeLib.nodeLibStrings.set | scala.Boolean] = js.undefined
  var maxArrayLength: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
  var showProxy: js.UndefOr[scala.Boolean] = js.undefined
  var sorted: js.UndefOr[
    scala.Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Double])
  ] = js.undefined
}

