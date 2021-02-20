package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputFile extends StObject {
  
  var name: String = js.native
  
  var text: String = js.native
  
  var writeByteOrderMark: Boolean = js.native
}
object OutputFile {
  
  @scala.inline
  def apply(name: String, text: String, writeByteOrderMark: Boolean): OutputFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  
  @scala.inline
  implicit class OutputFileMutableBuilder[Self <: OutputFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteByteOrderMark(value: Boolean): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
  }
}
