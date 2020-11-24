package typings.monacoEditor.mod.languages.html

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageServiceDefaults extends js.Object {
  
  val languageId: String = js.native
  
  val modeConfiguration: ModeConfiguration = js.native
  
  def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, _]): IDisposable = js.native
  def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, _], thisArg: js.Any): IDisposable = js.native
  
  val options: Options = js.native
  
  def setOptions(options: Options): Unit = js.native
}
