package typings.monacoDashEditor.monacoDashEditorMod.languages.json

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageServiceDefaults extends js.Object {
  val diagnosticsOptions: DiagnosticsOptions = js.native
  val modeConfiguration: ModeConfiguration = js.native
  def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, _]): IDisposable = js.native
  def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, _], thisArg: js.Any): IDisposable = js.native
  def setDiagnosticsOptions(options: DiagnosticsOptions): Unit = js.native
  def setModeConfiguration(modeConfiguration: ModeConfiguration): Unit = js.native
}

