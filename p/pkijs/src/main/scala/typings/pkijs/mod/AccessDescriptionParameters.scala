package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAccessDescription> */
trait AccessDescriptionParameters extends StObject {
  
  var accessLocation: js.UndefOr[GeneralName] = js.undefined
  
  var accessMethod: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object AccessDescriptionParameters {
  
  inline def apply(): AccessDescriptionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessDescriptionParameters]
  }
  
  extension [Self <: AccessDescriptionParameters](x: Self) {
    
    inline def setAccessLocation(value: GeneralName): Self = StObject.set(x, "accessLocation", value.asInstanceOf[js.Any])
    
    inline def setAccessLocationUndefined: Self = StObject.set(x, "accessLocation", js.undefined)
    
    inline def setAccessMethod(value: String): Self = StObject.set(x, "accessMethod", value.asInstanceOf[js.Any])
    
    inline def setAccessMethodUndefined: Self = StObject.set(x, "accessMethod", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
