package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOtherKeyAttribute> */
trait OtherKeyAttributeParameters extends StObject {
  
  var keyAttr: js.UndefOr[Any] = js.undefined
  
  var keyAttrId: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object OtherKeyAttributeParameters {
  
  inline def apply(): OtherKeyAttributeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherKeyAttributeParameters]
  }
  
  extension [Self <: OtherKeyAttributeParameters](x: Self) {
    
    inline def setKeyAttr(value: Any): Self = StObject.set(x, "keyAttr", value.asInstanceOf[js.Any])
    
    inline def setKeyAttrId(value: String): Self = StObject.set(x, "keyAttrId", value.asInstanceOf[js.Any])
    
    inline def setKeyAttrIdUndefined: Self = StObject.set(x, "keyAttrId", js.undefined)
    
    inline def setKeyAttrUndefined: Self = StObject.set(x, "keyAttr", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
