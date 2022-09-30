package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IResponseData> */
trait ResponseDataParameters extends StObject {
  
  var producedAt: js.UndefOr[js.Date] = js.undefined
  
  var responderID: js.UndefOr[Any] = js.undefined
  
  var responseExtensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var responses: js.UndefOr[js.Array[SingleResponse]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var tbs: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object ResponseDataParameters {
  
  inline def apply(): ResponseDataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseDataParameters]
  }
  
  extension [Self <: ResponseDataParameters](x: Self) {
    
    inline def setProducedAt(value: js.Date): Self = StObject.set(x, "producedAt", value.asInstanceOf[js.Any])
    
    inline def setProducedAtUndefined: Self = StObject.set(x, "producedAt", js.undefined)
    
    inline def setResponderID(value: Any): Self = StObject.set(x, "responderID", value.asInstanceOf[js.Any])
    
    inline def setResponderIDUndefined: Self = StObject.set(x, "responderID", js.undefined)
    
    inline def setResponseExtensions(value: js.Array[Extension]): Self = StObject.set(x, "responseExtensions", value.asInstanceOf[js.Any])
    
    inline def setResponseExtensionsUndefined: Self = StObject.set(x, "responseExtensions", js.undefined)
    
    inline def setResponseExtensionsVarargs(value: Extension*): Self = StObject.set(x, "responseExtensions", js.Array(value*))
    
    inline def setResponses(value: js.Array[SingleResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SingleResponse*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setTbsUndefined: Self = StObject.set(x, "tbs", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
