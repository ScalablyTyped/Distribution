package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStandaloneCodeEditor
  extends StObject
     with ICodeEditor {
  
  def addAction(descriptor: IActionDescriptor): IDisposable = js.native
  
  def addCommand(keybinding: Double, handler: ICommandHandler): String | Null = js.native
  def addCommand(keybinding: Double, handler: ICommandHandler, context: String): String | Null = js.native
  
  def createContextKey(key: String, defaultValue: String): IContextKey[String] = js.native
  def createContextKey(key: String, defaultValue: js.Array[js.UndefOr[Null | Boolean | Double | String]]): IContextKey[js.Array[js.UndefOr[Null | Boolean | Double | String]]] = js.native
  def createContextKey(key: String, defaultValue: Boolean): IContextKey[Boolean] = js.native
  def createContextKey(key: String, defaultValue: Double): IContextKey[Double] = js.native
  def createContextKey(key: String, defaultValue: Null): IContextKey[Null] = js.native
  def createContextKey(key: String, defaultValue: Unit): IContextKey[Unit] = js.native
  def createContextKey[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: null | undefined | boolean | number | string} */ js.Any */](key: String, defaultValue: T): IContextKey[T] = js.native
}
