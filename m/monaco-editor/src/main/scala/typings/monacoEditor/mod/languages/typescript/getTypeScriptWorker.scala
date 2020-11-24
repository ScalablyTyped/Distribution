package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.typescript.getTypeScriptWorker")
@js.native
object getTypeScriptWorker extends js.Object {
  
  def apply(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]] = js.native
}
