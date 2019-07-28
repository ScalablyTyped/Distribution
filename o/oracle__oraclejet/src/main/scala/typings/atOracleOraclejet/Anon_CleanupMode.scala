package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.onDisconnect
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CleanupMode extends js.Object {
  var cleanupMode: js.UndefOr[onDisconnect | none] = js.undefined
  var view: js.Array[Node]
  var viewModel: js.Object | Null
}

object Anon_CleanupMode {
  @scala.inline
  def apply(view: js.Array[Node], cleanupMode: onDisconnect | none = null, viewModel: js.Object = null): Anon_CleanupMode = {
    val __obj = js.Dynamic.literal(view = view)
    if (cleanupMode != null) __obj.updateDynamic("cleanupMode")(cleanupMode.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[Anon_CleanupMode]
  }
}

