package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Field object, for use in `field.set({ ... })`. */
trait FieldUpdateData extends StObject {
  
  /**
    * Gets the field's result data.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var result: js.UndefOr[RangeUpdateData] = js.undefined
}
object FieldUpdateData {
  
  inline def apply(): FieldUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldUpdateData] (val x: Self) extends AnyVal {
    
    inline def setResult(value: RangeUpdateData): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
