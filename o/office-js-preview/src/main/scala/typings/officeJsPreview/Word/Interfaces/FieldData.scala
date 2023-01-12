package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `field.toJSON()`. */
trait FieldData extends StObject {
  
  /**
    * Gets the field's code instruction.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the field's result data.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var result: js.UndefOr[RangeData] = js.undefined
}
object FieldData {
  
  inline def apply(): FieldData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldData] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setResult(value: RangeData): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
