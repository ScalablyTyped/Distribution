package typings.monacoEditor.mod.languages.css

import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageServiceDefaults extends StObject {
  
  /** @deprecated Use options instead */
  val diagnosticsOptions: DiagnosticsOptions = js.native
  
  val languageId: String = js.native
  
  val modeConfiguration: ModeConfiguration = js.native
  
  def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, Any]): IDisposable = js.native
  def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, Any], thisArg: Any): IDisposable = js.native
  
  val options: Options = js.native
  
  /** @deprecated Use setOptions instead */
  def setDiagnosticsOptions(options: DiagnosticsOptions): Unit = js.native
  
  def setModeConfiguration(modeConfiguration: ModeConfiguration): Unit = js.native
  
  def setOptions(options: Options): Unit = js.native
}
