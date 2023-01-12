package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelOptionsChangedEvent extends StObject {
  
  val indentSize: Boolean
  
  val insertSpaces: Boolean
  
  val tabSize: Boolean
  
  val trimAutoWhitespace: Boolean
}
object IModelOptionsChangedEvent {
  
  inline def apply(indentSize: Boolean, insertSpaces: Boolean, tabSize: Boolean, trimAutoWhitespace: Boolean): IModelOptionsChangedEvent = {
    val __obj = js.Dynamic.literal(indentSize = indentSize.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], trimAutoWhitespace = trimAutoWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelOptionsChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IModelOptionsChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setIndentSize(value: Boolean): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    inline def setTabSize(value: Boolean): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTrimAutoWhitespace(value: Boolean): Self = StObject.set(x, "trimAutoWhitespace", value.asInstanceOf[js.Any])
  }
}
