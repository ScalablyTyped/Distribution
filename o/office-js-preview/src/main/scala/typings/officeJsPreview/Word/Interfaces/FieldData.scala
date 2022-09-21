package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `field.toJSON()`. */
trait FieldData extends StObject {
  
  /**
    * Gets the field's code instruction. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the field's result data. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var result: js.UndefOr[String] = js.undefined
}
object FieldData {
  
  inline def apply(): FieldData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldData]
  }
  
  extension [Self <: FieldData](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
