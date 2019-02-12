package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncOptions extends CommonOptions {
  var argv0: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
   // Not specified in the docs
  var input: js.UndefOr[
    java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView
  ] = js.undefined
  var killSignal: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxBuffer: js.UndefOr[scala.Double] = js.undefined
  var shell: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  var windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
}

