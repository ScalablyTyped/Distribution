package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IExtKeyUsage> */
trait ExtKeyUsageParameters extends StObject {
  
  var keyPurposes: js.UndefOr[js.Array[String]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object ExtKeyUsageParameters {
  
  inline def apply(): ExtKeyUsageParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtKeyUsageParameters]
  }
  
  extension [Self <: ExtKeyUsageParameters](x: Self) {
    
    inline def setKeyPurposes(value: js.Array[String]): Self = StObject.set(x, "keyPurposes", value.asInstanceOf[js.Any])
    
    inline def setKeyPurposesUndefined: Self = StObject.set(x, "keyPurposes", js.undefined)
    
    inline def setKeyPurposesVarargs(value: String*): Self = StObject.set(x, "keyPurposes", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
