package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineChange
  extends StObject
     with IChange {
  
  val charChanges: js.UndefOr[js.Array[ICharChange]] = js.undefined
}
object ILineChange {
  
  inline def apply(
    modifiedEndLineNumber: Double,
    modifiedStartLineNumber: Double,
    originalEndLineNumber: Double,
    originalStartLineNumber: Double
  ): ILineChange = {
    val __obj = js.Dynamic.literal(modifiedEndLineNumber = modifiedEndLineNumber.asInstanceOf[js.Any], modifiedStartLineNumber = modifiedStartLineNumber.asInstanceOf[js.Any], originalEndLineNumber = originalEndLineNumber.asInstanceOf[js.Any], originalStartLineNumber = originalStartLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILineChange] (val x: Self) extends AnyVal {
    
    inline def setCharChanges(value: js.Array[ICharChange]): Self = StObject.set(x, "charChanges", value.asInstanceOf[js.Any])
    
    inline def setCharChangesUndefined: Self = StObject.set(x, "charChanges", js.undefined)
    
    inline def setCharChangesVarargs(value: ICharChange*): Self = StObject.set(x, "charChanges", js.Array(value*))
  }
}
