package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICRLBag> */
trait CRLBagParameters extends StObject {
  
  var certValue: js.UndefOr[Any] = js.undefined
  
  var crlId: js.UndefOr[String] = js.undefined
  
  var crlValue: js.UndefOr[Any] = js.undefined
  
  var parsedValue: js.UndefOr[Any] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object CRLBagParameters {
  
  inline def apply(): CRLBagParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CRLBagParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CRLBagParameters] (val x: Self) extends AnyVal {
    
    inline def setCertValue(value: Any): Self = StObject.set(x, "certValue", value.asInstanceOf[js.Any])
    
    inline def setCertValueUndefined: Self = StObject.set(x, "certValue", js.undefined)
    
    inline def setCrlId(value: String): Self = StObject.set(x, "crlId", value.asInstanceOf[js.Any])
    
    inline def setCrlIdUndefined: Self = StObject.set(x, "crlId", js.undefined)
    
    inline def setCrlValue(value: Any): Self = StObject.set(x, "crlValue", value.asInstanceOf[js.Any])
    
    inline def setCrlValueUndefined: Self = StObject.set(x, "crlValue", js.undefined)
    
    inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
