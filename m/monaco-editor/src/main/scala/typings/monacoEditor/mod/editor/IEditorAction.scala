package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorAction extends StObject {
  
  val alias: String = js.native
  
  val id: String = js.native
  
  def isSupported(): Boolean = js.native
  
  val label: String = js.native
  
  def run(): js.Promise[Unit] = js.native
  def run(args: Any): js.Promise[Unit] = js.native
}
