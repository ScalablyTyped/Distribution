package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRange extends StObject {
  
  /**
    * Column on which the range ends in line `endLineNumber`.
    */
  val endColumn: Double = js.native
  
  /**
    * Line number on which the range ends.
    */
  val endLineNumber: Double = js.native
  
  /**
    * Column on which the range starts in line `startLineNumber` (starts at 1).
    */
  val startColumn: Double = js.native
  
  /**
    * Line number on which the range starts (starts at 1).
    */
  val startLineNumber: Double = js.native
}
object IRange {
  
  @scala.inline
  def apply(endColumn: Double, endLineNumber: Double, startColumn: Double, startLineNumber: Double): IRange = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLineNumber = endLineNumber.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLineNumber = startLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRange]
  }
  
  @scala.inline
  implicit class IRangeMutableBuilder[Self <: IRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineNumber(value: Double): Self = StObject.set(x, "endLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineNumber(value: Double): Self = StObject.set(x, "startLineNumber", value.asInstanceOf[js.Any])
  }
}
