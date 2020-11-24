package typings.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelection extends js.Object {
  
  /**
    * The column on `positionLineNumber` where the selection has ended.
    */
  val positionColumn: Double = js.native
  
  /**
    * The line number on which the selection has ended.
    */
  val positionLineNumber: Double = js.native
  
  /**
    * The column on `selectionStartLineNumber` where the selection has started.
    */
  val selectionStartColumn: Double = js.native
  
  /**
    * The line number on which the selection has started.
    */
  val selectionStartLineNumber: Double = js.native
}
object ISelection {
  
  @scala.inline
  def apply(
    positionColumn: Double,
    positionLineNumber: Double,
    selectionStartColumn: Double,
    selectionStartLineNumber: Double
  ): ISelection = {
    val __obj = js.Dynamic.literal(positionColumn = positionColumn.asInstanceOf[js.Any], positionLineNumber = positionLineNumber.asInstanceOf[js.Any], selectionStartColumn = selectionStartColumn.asInstanceOf[js.Any], selectionStartLineNumber = selectionStartLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelection]
  }
  
  @scala.inline
  implicit class ISelectionOps[Self <: ISelection] (val x: Self) extends AnyVal {
    
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
    def setPositionColumn(value: Double): Self = this.set("positionColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionLineNumber(value: Double): Self = this.set("positionLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStartColumn(value: Double): Self = this.set("selectionStartColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStartLineNumber(value: Double): Self = this.set("selectionStartLineNumber", value.asInstanceOf[js.Any])
  }
}
