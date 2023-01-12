package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOtherRecipientInfo> */
trait OtherRecipientInfoParameters extends StObject {
  
  var oriType: js.UndefOr[String] = js.undefined
  
  var oriValue: js.UndefOr[Any] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object OtherRecipientInfoParameters {
  
  inline def apply(): OtherRecipientInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherRecipientInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherRecipientInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setOriType(value: String): Self = StObject.set(x, "oriType", value.asInstanceOf[js.Any])
    
    inline def setOriTypeUndefined: Self = StObject.set(x, "oriType", js.undefined)
    
    inline def setOriValue(value: Any): Self = StObject.set(x, "oriValue", value.asInstanceOf[js.Any])
    
    inline def setOriValueUndefined: Self = StObject.set(x, "oriValue", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
