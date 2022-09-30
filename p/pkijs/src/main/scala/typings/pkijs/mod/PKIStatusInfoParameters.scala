package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Utf8String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPKIStatusInfo> */
trait PKIStatusInfoParameters extends StObject {
  
  var failInfo: js.UndefOr[BitString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var status: js.UndefOr[PKIStatus] = js.undefined
  
  var statusStrings: js.UndefOr[js.Array[Utf8String]] = js.undefined
}
object PKIStatusInfoParameters {
  
  inline def apply(): PKIStatusInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PKIStatusInfoParameters]
  }
  
  extension [Self <: PKIStatusInfoParameters](x: Self) {
    
    inline def setFailInfo(value: BitString): Self = StObject.set(x, "failInfo", value.asInstanceOf[js.Any])
    
    inline def setFailInfoUndefined: Self = StObject.set(x, "failInfo", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setStatus(value: PKIStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusStrings(value: js.Array[Utf8String]): Self = StObject.set(x, "statusStrings", value.asInstanceOf[js.Any])
    
    inline def setStatusStringsUndefined: Self = StObject.set(x, "statusStrings", js.undefined)
    
    inline def setStatusStringsVarargs(value: Utf8String*): Self = StObject.set(x, "statusStrings", js.Array(value*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
