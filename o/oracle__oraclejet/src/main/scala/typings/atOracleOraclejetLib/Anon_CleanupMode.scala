package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CleanupMode extends js.Object {
  var cleanupMode: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.onDisconnect | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.undefined
  var view: js.Array[stdLib.Node]
  var viewModel: js.Object | scala.Null
}

object Anon_CleanupMode {
  @scala.inline
  def apply(
    view: js.Array[stdLib.Node],
    cleanupMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.onDisconnect | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = null,
    viewModel: js.Object = null
  ): Anon_CleanupMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("view")(view)
    if (cleanupMode != null) __obj.updateDynamic("cleanupMode")(cleanupMode.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[Anon_CleanupMode]
  }
}

