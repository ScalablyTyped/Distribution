package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelOptionsChangedEvent extends StObject {
  
  val indentSize: Boolean = js.native
  
  val insertSpaces: Boolean = js.native
  
  val tabSize: Boolean = js.native
  
  val trimAutoWhitespace: Boolean = js.native
}
object IModelOptionsChangedEvent {
  
  @scala.inline
  def apply(indentSize: Boolean, insertSpaces: Boolean, tabSize: Boolean, trimAutoWhitespace: Boolean): IModelOptionsChangedEvent = {
    val __obj = js.Dynamic.literal(indentSize = indentSize.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], trimAutoWhitespace = trimAutoWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelOptionsChangedEvent]
  }
  
  @scala.inline
  implicit class IModelOptionsChangedEventMutableBuilder[Self <: IModelOptionsChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndentSize(value: Boolean): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Boolean): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimAutoWhitespace(value: Boolean): Self = StObject.set(x, "trimAutoWhitespace", value.asInstanceOf[js.Any])
  }
}
