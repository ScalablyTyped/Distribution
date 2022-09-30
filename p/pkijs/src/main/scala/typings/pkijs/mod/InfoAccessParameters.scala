package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IInfoAccess> */
trait InfoAccessParameters extends StObject {
  
  var accessDescriptions: js.UndefOr[js.Array[AccessDescription]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object InfoAccessParameters {
  
  inline def apply(): InfoAccessParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoAccessParameters]
  }
  
  extension [Self <: InfoAccessParameters](x: Self) {
    
    inline def setAccessDescriptions(value: js.Array[AccessDescription]): Self = StObject.set(x, "accessDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAccessDescriptionsUndefined: Self = StObject.set(x, "accessDescriptions", js.undefined)
    
    inline def setAccessDescriptionsVarargs(value: AccessDescription*): Self = StObject.set(x, "accessDescriptions", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
