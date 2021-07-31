package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/commands-registry/
@js.native
trait CommandsRegistry extends StObject {
  
  def invoke(name: String, arguments: js.Any*): js.Promise[js.Any] = js.native
  
  def register(name: String, callable: js.Function1[/* repeated */ js.Any, Unit]): Disposable = js.native
  def register[T](name: String, callable: js.ThisFunction1[/* this */ T, /* repeated */ js.Any, Unit], thisValue: T): Disposable = js.native
}
