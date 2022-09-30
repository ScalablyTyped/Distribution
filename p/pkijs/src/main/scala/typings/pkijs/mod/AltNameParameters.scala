package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAltName> */
trait AltNameParameters extends StObject {
  
  var altNames: js.UndefOr[js.Array[GeneralName]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object AltNameParameters {
  
  inline def apply(): AltNameParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AltNameParameters]
  }
  
  extension [Self <: AltNameParameters](x: Self) {
    
    inline def setAltNames(value: js.Array[GeneralName]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
    
    inline def setAltNamesUndefined: Self = StObject.set(x, "altNames", js.undefined)
    
    inline def setAltNamesVarargs(value: GeneralName*): Self = StObject.set(x, "altNames", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
