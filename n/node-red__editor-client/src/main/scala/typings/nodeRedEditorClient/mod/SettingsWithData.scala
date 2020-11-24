package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.ApiRootUrl
import typings.nodeRedRuntime.mod.LocalSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsWithData
  extends Settings
     with LocalSettings
object SettingsWithData {
  
  @scala.inline
  def apply(
    get: (String, js.Any) => js.Any,
    init: (ApiRootUrl, js.Function0[Unit]) => Unit,
    load: js.Function0[Unit] => Unit,
    loadUserSettings: js.Function0[Unit] => Unit,
    remove: String => Unit,
    set: (String, js.Any) => Unit,
    theme: (String, js.Any) => js.Any,
    uiHost: String,
    uiPort: Double
  ): SettingsWithData = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), init = js.Any.fromFunction2(init), load = js.Any.fromFunction1(load), loadUserSettings = js.Any.fromFunction1(loadUserSettings), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), theme = js.Any.fromFunction2(theme), uiHost = uiHost.asInstanceOf[js.Any], uiPort = uiPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsWithData]
  }
}
