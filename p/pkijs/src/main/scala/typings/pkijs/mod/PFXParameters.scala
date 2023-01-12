package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPFX> */
trait PFXParameters extends StObject {
  
  var authSafe: js.UndefOr[ContentInfo] = js.undefined
  
  var macData: js.UndefOr[MacData] = js.undefined
  
  var parsedValue: js.UndefOr[PFXParsedValue] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object PFXParameters {
  
  inline def apply(): PFXParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PFXParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PFXParameters] (val x: Self) extends AnyVal {
    
    inline def setAuthSafe(value: ContentInfo): Self = StObject.set(x, "authSafe", value.asInstanceOf[js.Any])
    
    inline def setAuthSafeUndefined: Self = StObject.set(x, "authSafe", js.undefined)
    
    inline def setMacData(value: MacData): Self = StObject.set(x, "macData", value.asInstanceOf[js.Any])
    
    inline def setMacDataUndefined: Self = StObject.set(x, "macData", js.undefined)
    
    inline def setParsedValue(value: PFXParsedValue): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
