package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICharChange extends IChange {
  
  val modifiedEndColumn: Double = js.native
  
  val modifiedStartColumn: Double = js.native
  
  val originalEndColumn: Double = js.native
  
  val originalStartColumn: Double = js.native
}
object ICharChange {
  
  @scala.inline
  def apply(
    modifiedEndColumn: Double,
    modifiedEndLineNumber: Double,
    modifiedStartColumn: Double,
    modifiedStartLineNumber: Double,
    originalEndColumn: Double,
    originalEndLineNumber: Double,
    originalStartColumn: Double,
    originalStartLineNumber: Double
  ): ICharChange = {
    val __obj = js.Dynamic.literal(modifiedEndColumn = modifiedEndColumn.asInstanceOf[js.Any], modifiedEndLineNumber = modifiedEndLineNumber.asInstanceOf[js.Any], modifiedStartColumn = modifiedStartColumn.asInstanceOf[js.Any], modifiedStartLineNumber = modifiedStartLineNumber.asInstanceOf[js.Any], originalEndColumn = originalEndColumn.asInstanceOf[js.Any], originalEndLineNumber = originalEndLineNumber.asInstanceOf[js.Any], originalStartColumn = originalStartColumn.asInstanceOf[js.Any], originalStartLineNumber = originalStartLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharChange]
  }
  
  @scala.inline
  implicit class ICharChangeOps[Self <: ICharChange] (val x: Self) extends AnyVal {
    
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
    def setModifiedEndColumn(value: Double): Self = this.set("modifiedEndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedStartColumn(value: Double): Self = this.set("modifiedStartColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEndColumn(value: Double): Self = this.set("originalEndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartColumn(value: Double): Self = this.set("originalStartColumn", value.asInstanceOf[js.Any])
  }
}
