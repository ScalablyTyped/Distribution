package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAuthenticatedSafe> */
trait AuthenticatedSafeParameters extends StObject {
  
  var parsedValue: js.UndefOr[Any] = js.undefined
  
  var safeContents: js.UndefOr[js.Array[ContentInfo]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object AuthenticatedSafeParameters {
  
  inline def apply(): AuthenticatedSafeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticatedSafeParameters]
  }
  
  extension [Self <: AuthenticatedSafeParameters](x: Self) {
    
    inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
    
    inline def setSafeContents(value: js.Array[ContentInfo]): Self = StObject.set(x, "safeContents", value.asInstanceOf[js.Any])
    
    inline def setSafeContentsUndefined: Self = StObject.set(x, "safeContents", js.undefined)
    
    inline def setSafeContentsVarargs(value: ContentInfo*): Self = StObject.set(x, "safeContents", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
