package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpawnSyncOptions extends js.Object {
  var argv0: js.UndefOr[java.lang.String] = js.undefined
   // Not specified in the docs
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[nodeLib.NodeJSNs.ProcessEnv] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var input: js.UndefOr[
    java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView
  ] = js.undefined
  var killSignal: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxBuffer: js.UndefOr[scala.Double] = js.undefined
  var shell: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
  var windowsHide: js.UndefOr[scala.Boolean] = js.undefined
  var windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
}

