package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorOption[K /* <: EditorOption */, V] extends StObject {
  
  /**
    * Might modify `value`.
    */
  def applyUpdate(value: V, update: V): ApplyUpdateResult[V] = js.native
  def applyUpdate(value: Unit, update: V): ApplyUpdateResult[V] = js.native
  
  var defaultValue: V = js.native
  
  val id: K = js.native
  
  val name: String = js.native
}
