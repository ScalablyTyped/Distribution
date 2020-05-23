package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StringDictionary
import typings.novaEditorNode.novaEditorNodeBooleans.`true`
import typings.novaEditorNode.novaEditorNodeStrings.ignore
import typings.novaEditorNode.novaEditorNodeStrings.jsonrpc
import typings.novaEditorNode.novaEditorNodeStrings.pipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cwd extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
  var shell: js.UndefOr[`true` | String] = js.undefined
  var stdio: js.UndefOr[
    (js.Tuple3[pipe | ignore, pipe | ignore, pipe | ignore]) | pipe | ignore | jsonrpc
  ] = js.undefined
}

object Cwd {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    cwd: String = null,
    env: StringDictionary[String] = null,
    shell: `true` | String = null,
    stdio: (js.Tuple3[pipe | ignore, pipe | ignore, pipe | ignore]) | pipe | ignore | jsonrpc = null
  ): Cwd = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
}

