package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISecretBag> */
trait SecretBagParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var secretTypeId: js.UndefOr[String] = js.undefined
  
  var secretValue: js.UndefOr[SchemaCompatible] = js.undefined
}
object SecretBagParameters {
  
  inline def apply(): SecretBagParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretBagParameters]
  }
  
  extension [Self <: SecretBagParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSecretTypeId(value: String): Self = StObject.set(x, "secretTypeId", value.asInstanceOf[js.Any])
    
    inline def setSecretTypeIdUndefined: Self = StObject.set(x, "secretTypeId", js.undefined)
    
    inline def setSecretValue(value: SchemaCompatible): Self = StObject.set(x, "secretValue", value.asInstanceOf[js.Any])
    
    inline def setSecretValueUndefined: Self = StObject.set(x, "secretValue", js.undefined)
  }
}
