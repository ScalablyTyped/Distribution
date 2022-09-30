package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IEncapsulatedContentInfo> */
trait EncapsulatedContentInfoParameters extends StObject {
  
  var eContent: js.UndefOr[OctetString] = js.undefined
  
  var eContentType: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object EncapsulatedContentInfoParameters {
  
  inline def apply(): EncapsulatedContentInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncapsulatedContentInfoParameters]
  }
  
  extension [Self <: EncapsulatedContentInfoParameters](x: Self) {
    
    inline def setEContent(value: OctetString): Self = StObject.set(x, "eContent", value.asInstanceOf[js.Any])
    
    inline def setEContentType(value: String): Self = StObject.set(x, "eContentType", value.asInstanceOf[js.Any])
    
    inline def setEContentTypeUndefined: Self = StObject.set(x, "eContentType", js.undefined)
    
    inline def setEContentUndefined: Self = StObject.set(x, "eContent", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
