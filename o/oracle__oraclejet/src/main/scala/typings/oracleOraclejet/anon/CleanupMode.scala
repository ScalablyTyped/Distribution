package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.onDisconnect
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CleanupMode extends js.Object {
  var cleanupMode: js.UndefOr[onDisconnect | none] = js.native
  var view: js.Array[Node] = js.native
  var viewModel: js.Object | Null = js.native
}

object CleanupMode {
  @scala.inline
  def apply(view: js.Array[Node]): CleanupMode = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanupMode]
  }
  @scala.inline
  implicit class CleanupModeOps[Self <: CleanupMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setViewVarargs(value: Node*): Self = this.set("view", js.Array(value :_*))
    @scala.inline
    def setView(value: js.Array[Node]): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setCleanupMode(value: onDisconnect | none): Self = this.set("cleanupMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanupMode: Self = this.set("cleanupMode", js.undefined)
    @scala.inline
    def setViewModel(value: js.Object): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewModelNull: Self = this.set("viewModel", null)
  }
  
}

