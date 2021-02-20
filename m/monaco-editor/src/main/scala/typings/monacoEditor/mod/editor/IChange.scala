package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChange extends StObject {
  
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
  implicit class IChangeMutableBuilder[Self <: IChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiedEndLineNumber(value: Double): Self = StObject.set(x, "modifiedEndLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedStartLineNumber(value: Double): Self = StObject.set(x, "modifiedStartLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEndLineNumber(value: Double): Self = StObject.set(x, "originalEndLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartLineNumber(value: Double): Self = StObject.set(x, "originalStartLineNumber", value.asInstanceOf[js.Any])
  }
}
