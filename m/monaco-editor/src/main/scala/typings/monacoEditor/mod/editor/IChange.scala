package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChange extends js.Object {
  
  val modifiedEndLineNumber: Double = js.native
  
  val modifiedStartLineNumber: Double = js.native
  
  val originalEndLineNumber: Double = js.native
  
  val originalStartLineNumber: Double = js.native
}
object IChange {
  
  @scala.inline
  def apply(
    modifiedEndLineNumber: Double,
    modifiedStartLineNumber: Double,
    originalEndLineNumber: Double,
    originalStartLineNumber: Double
  ): IChange = {
    val __obj = js.Dynamic.literal(modifiedEndLineNumber = modifiedEndLineNumber.asInstanceOf[js.Any], modifiedStartLineNumber = modifiedStartLineNumber.asInstanceOf[js.Any], originalEndLineNumber = originalEndLineNumber.asInstanceOf[js.Any], originalStartLineNumber = originalStartLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChange]
  }
  
  @scala.inline
  implicit class IChangeOps[Self <: IChange] (val x: Self) extends AnyVal {
    
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
    def setModifiedEndLineNumber(value: Double): Self = this.set("modifiedEndLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedStartLineNumber(value: Double): Self = this.set("modifiedStartLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEndLineNumber(value: Double): Self = this.set("originalEndLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartLineNumber(value: Double): Self = this.set("originalStartLineNumber", value.asInstanceOf[js.Any])
  }
}
