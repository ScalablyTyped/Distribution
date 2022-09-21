package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandsRegistry extends StObject {
  
  def invoke(name: String, arguments: Transferrable*): js.Promise[Any] = js.native
  def invoke(name: String, textEditor: TextEditor, arguments: Transferrable*): js.Promise[Any] = js.native
  
  def register(name: String, callable: js.Function1[/* repeated */ Any, Unit]): Disposable = js.native
  def register[T](name: String, callable: js.ThisFunction1[/* this */ T, /* repeated */ Any, Unit], thisValue: T): Disposable = js.native
}
