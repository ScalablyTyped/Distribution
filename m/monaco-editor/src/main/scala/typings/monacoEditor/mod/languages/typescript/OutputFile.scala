package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFile extends StObject {
  
  var name: String
  
  var text: String
  
  var writeByteOrderMark: Boolean
}
object OutputFile {
  
  inline def apply(name: String, text: String, writeByteOrderMark: Boolean): OutputFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputFile] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWriteByteOrderMark(value: Boolean): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
  }
}
