package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOtherRevocationInfoFormat> */
trait OtherRevocationInfoFormatParameters extends StObject {
  
  var otherRevInfo: js.UndefOr[Any] = js.undefined
  
  var otherRevInfoFormat: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object OtherRevocationInfoFormatParameters {
  
  inline def apply(): OtherRevocationInfoFormatParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherRevocationInfoFormatParameters]
  }
  
  extension [Self <: OtherRevocationInfoFormatParameters](x: Self) {
    
    inline def setOtherRevInfo(value: Any): Self = StObject.set(x, "otherRevInfo", value.asInstanceOf[js.Any])
    
    inline def setOtherRevInfoFormat(value: String): Self = StObject.set(x, "otherRevInfoFormat", value.asInstanceOf[js.Any])
    
    inline def setOtherRevInfoFormatUndefined: Self = StObject.set(x, "otherRevInfoFormat", js.undefined)
    
    inline def setOtherRevInfoUndefined: Self = StObject.set(x, "otherRevInfo", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
