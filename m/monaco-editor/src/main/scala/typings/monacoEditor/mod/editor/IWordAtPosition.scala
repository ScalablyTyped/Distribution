package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWordAtPosition extends StObject {
  
  /**
    * The column where the word ends.
    */
  val endColumn: Double
  
  /**
    * The column where the word starts.
    */
  val startColumn: Double
  
  /**
    * The word.
    */
  val word: String
}
object IWordAtPosition {
  
  inline def apply(endColumn: Double, startColumn: Double, word: String): IWordAtPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWordAtPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWordAtPosition] (val x: Self) extends AnyVal {
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
