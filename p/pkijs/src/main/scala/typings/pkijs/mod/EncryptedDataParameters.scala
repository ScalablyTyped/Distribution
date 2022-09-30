package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IEncryptedData> */
trait EncryptedDataParameters extends StObject {
  
  var encryptedContentInfo: js.UndefOr[EncryptedContentInfo] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var unprotectedAttrs: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object EncryptedDataParameters {
  
  inline def apply(): EncryptedDataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptedDataParameters]
  }
  
  extension [Self <: EncryptedDataParameters](x: Self) {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfo): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentInfoUndefined: Self = StObject.set(x, "encryptedContentInfo", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setUnprotectedAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrsUndefined: Self = StObject.set(x, "unprotectedAttrs", js.undefined)
    
    inline def setUnprotectedAttrsVarargs(value: Attribute*): Self = StObject.set(x, "unprotectedAttrs", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
