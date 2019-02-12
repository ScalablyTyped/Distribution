package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecSyncOptions extends CommonOptions {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[java.lang.String | nodeLib.Buffer | stdLib.Uint8Array] = js.undefined
  var killSignal: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var maxBuffer: js.UndefOr[scala.Double] = js.undefined
  var shell: js.UndefOr[java.lang.String] = js.undefined
  var stdio: js.UndefOr[StdioOptions] = js.undefined
}

