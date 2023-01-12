package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPolicyMappings> */
trait PolicyMappingsParameters extends StObject {
  
  var mappings: js.UndefOr[js.Array[PolicyMapping]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PolicyMappingsParameters {
  
  inline def apply(): PolicyMappingsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyMappingsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyMappingsParameters] (val x: Self) extends AnyVal {
    
    inline def setMappings(value: js.Array[PolicyMapping]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setMappingsVarargs(value: PolicyMapping*): Self = StObject.set(x, "mappings", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
