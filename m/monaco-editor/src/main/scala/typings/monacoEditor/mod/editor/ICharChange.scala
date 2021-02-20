package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
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
  implicit class ICharChangeMutableBuilder[Self <: ICharChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiedEndColumn(value: Double): Self = StObject.set(x, "modifiedEndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedStartColumn(value: Double): Self = StObject.set(x, "modifiedStartColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEndColumn(value: Double): Self = StObject.set(x, "originalEndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartColumn(value: Double): Self = StObject.set(x, "originalStartColumn", value.asInstanceOf[js.Any])
  }
}
