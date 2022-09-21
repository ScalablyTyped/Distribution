package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewLine extends StObject {
  
  def newLine(): Any
  
  def write(arg0: String): Any
}
object NewLine {
  
  inline def apply(newLine: () => Any, write: String => Any): NewLine = {
    val __obj = js.Dynamic.literal(newLine = js.Any.fromFunction0(newLine), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[NewLine]
  }
  
  extension [Self <: NewLine](x: Self) {
    
    inline def setNewLine(value: () => Any): Self = StObject.set(x, "newLine", js.Any.fromFunction0(value))
    
    inline def setWrite(value: String => Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
