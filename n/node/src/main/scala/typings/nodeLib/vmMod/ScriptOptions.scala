package typings
package nodeLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptOptions extends BaseOptions {
  var cachedData: js.UndefOr[nodeLib.Buffer] = js.undefined
  var displayErrors: js.UndefOr[scala.Boolean] = js.undefined
  var produceCachedData: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

