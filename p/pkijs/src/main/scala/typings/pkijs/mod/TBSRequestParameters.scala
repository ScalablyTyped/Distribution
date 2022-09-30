package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ITBSRequest> */
trait TBSRequestParameters extends StObject {
  
  var requestExtensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var requestList: js.UndefOr[js.Array[Request]] = js.undefined
  
  var requestorName: js.UndefOr[GeneralName] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var tbs: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object TBSRequestParameters {
  
  inline def apply(): TBSRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TBSRequestParameters]
  }
  
  extension [Self <: TBSRequestParameters](x: Self) {
    
    inline def setRequestExtensions(value: js.Array[Extension]): Self = StObject.set(x, "requestExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequestExtensionsUndefined: Self = StObject.set(x, "requestExtensions", js.undefined)
    
    inline def setRequestExtensionsVarargs(value: Extension*): Self = StObject.set(x, "requestExtensions", js.Array(value*))
    
    inline def setRequestList(value: js.Array[Request]): Self = StObject.set(x, "requestList", value.asInstanceOf[js.Any])
    
    inline def setRequestListUndefined: Self = StObject.set(x, "requestList", js.undefined)
    
    inline def setRequestListVarargs(value: Request*): Self = StObject.set(x, "requestList", js.Array(value*))
    
    inline def setRequestorName(value: GeneralName): Self = StObject.set(x, "requestorName", value.asInstanceOf[js.Any])
    
    inline def setRequestorNameUndefined: Self = StObject.set(x, "requestorName", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setTbsUndefined: Self = StObject.set(x, "tbs", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
