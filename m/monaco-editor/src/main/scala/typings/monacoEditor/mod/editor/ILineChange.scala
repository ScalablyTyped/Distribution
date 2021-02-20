package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILineChange extends IChange {
  
  val charChanges: js.UndefOr[js.Array[ICharChange]] = js.native
}
object ILineChange {
  
  @scala.inline
  def apply(
    modifiedEndLineNumber: Double,
    modifiedStartLineNumber: Double,
    originalEndLineNumber: Double,
    originalStartLineNumber: Double
  ): ILineChange = {
    val __obj = js.Dynamic.literal(modifiedEndLineNumber = modifiedEndLineNumber.asInstanceOf[js.Any], modifiedStartLineNumber = modifiedStartLineNumber.asInstanceOf[js.Any], originalEndLineNumber = originalEndLineNumber.asInstanceOf[js.Any], originalStartLineNumber = originalStartLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineChange]
  }
  
  @scala.inline
  implicit class ILineChangeMutableBuilder[Self <: ILineChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharChanges(value: js.Array[ICharChange]): Self = StObject.set(x, "charChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharChangesUndefined: Self = StObject.set(x, "charChanges", js.undefined)
    
    @scala.inline
    def setCharChangesVarargs(value: ICharChange*): Self = StObject.set(x, "charChanges", js.Array(value :_*))
  }
}
