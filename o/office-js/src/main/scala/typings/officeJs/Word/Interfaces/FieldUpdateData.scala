package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Field object, for use in `field.set({ ... })`. */
trait FieldUpdateData extends StObject {
  
  /**
    * Specifies the field's code instruction.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies data in an "Addin" field. If the field isn't an "Addin" field, it is null and it will throw a general exception when code attempts to set it.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the field is locked. `true` if the field is locked, `false` otherwise.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  
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
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setResult(value: RangeUpdateData): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
