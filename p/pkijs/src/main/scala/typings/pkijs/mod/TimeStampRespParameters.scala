package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ITimeStampResp> */
trait TimeStampRespParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var status: js.UndefOr[PKIStatusInfo] = js.undefined
  
  var timeStampToken: js.UndefOr[ContentInfo] = js.undefined
}
object TimeStampRespParameters {
  
  inline def apply(): TimeStampRespParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeStampRespParameters]
  }
  
  extension [Self <: TimeStampRespParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setStatus(value: PKIStatusInfo): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeStampToken(value: ContentInfo): Self = StObject.set(x, "timeStampToken", value.asInstanceOf[js.Any])
    
    inline def setTimeStampTokenUndefined: Self = StObject.set(x, "timeStampToken", js.undefined)
  }
}
