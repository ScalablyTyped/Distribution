package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeEditorOpener extends StObject {
  
  /**
    * Callback that is invoked when a resource other than the current model should be opened (e.g. when "go to definition" is called).
    * The callback should return `true` if the request was handled and `false` otherwise.
    * @param source The code editor instance that initiated the request.
    * @param resource The Uri of the resource that should be opened.
    * @param selectionOrPosition An optional position or selection inside the model corresponding to `resource` that can be used to set the cursor.
    */
  def openCodeEditor(source: ICodeEditor, resource: Uri): Boolean | js.Promise[Boolean] = js.native
  def openCodeEditor(source: ICodeEditor, resource: Uri, selectionOrPosition: IPosition): Boolean | js.Promise[Boolean] = js.native
  def openCodeEditor(source: ICodeEditor, resource: Uri, selectionOrPosition: IRange): Boolean | js.Promise[Boolean] = js.native
}
