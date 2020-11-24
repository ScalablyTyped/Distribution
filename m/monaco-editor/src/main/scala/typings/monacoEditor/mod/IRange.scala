package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRange extends js.Object {
  
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
  implicit class IRangeOps[Self <: IRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineNumber(value: Double): Self = this.set("endLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineNumber(value: Double): Self = this.set("startLineNumber", value.asInstanceOf[js.Any])
  }
}
