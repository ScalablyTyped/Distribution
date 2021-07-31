package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorAction extends StObject {
  
  val alias: String
  
  val id: String
  
  def isSupported(): Boolean
  
  val label: String
  
  def run(): js.Promise[Unit]
}
object IEditorAction {
  
  @scala.inline
  def apply(alias: String, id: String, isSupported: () => Boolean, label: String, run: () => js.Promise[Unit]): IEditorAction = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSupported = js.Any.fromFunction0(isSupported), label = label.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[IEditorAction]
  }
  
  @scala.inline
  implicit class IEditorActionMutableBuilder[Self <: IEditorAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: () => js.Promise[Unit]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
  }
}
