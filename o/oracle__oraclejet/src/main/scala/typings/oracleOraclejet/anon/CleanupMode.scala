package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.onDisconnect
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CleanupMode extends js.Object {
  var cleanupMode: js.UndefOr[onDisconnect | none] = js.undefined
  var view: js.Array[Node]
  var viewModel: js.Object | Null
}

object CleanupMode {
  @scala.inline
  def apply(view: js.Array[Node], cleanupMode: onDisconnect | none = null, viewModel: js.Object = null): CleanupMode = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    if (cleanupMode != null) __obj.updateDynamic("cleanupMode")(cleanupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanupMode]
  }
}

