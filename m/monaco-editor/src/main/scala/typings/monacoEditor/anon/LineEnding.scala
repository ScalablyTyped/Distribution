package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineEnding extends StObject {
  
  var lineEnding: String
  
  var preserveBOM: Boolean
}
object LineEnding {
  
  inline def apply(lineEnding: String, preserveBOM: Boolean): LineEnding = {
    val __obj = js.Dynamic.literal(lineEnding = lineEnding.asInstanceOf[js.Any], preserveBOM = preserveBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineEnding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineEnding] (val x: Self) extends AnyVal {
    
    inline def setLineEnding(value: String): Self = StObject.set(x, "lineEnding", value.asInstanceOf[js.Any])
    
    inline def setPreserveBOM(value: Boolean): Self = StObject.set(x, "preserveBOM", value.asInstanceOf[js.Any])
  }
}
