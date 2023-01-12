package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResponseData extends StObject {
  
  var producedAt: js.Date
  
  var responderID: Any
  
  var responseExtensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var responses: js.Array[SingleResponse]
  
  var tbs: js.typedarray.ArrayBuffer
  
  var version: js.UndefOr[Double] = js.undefined
}
object IResponseData {
  
  inline def apply(
    producedAt: js.Date,
    responderID: Any,
    responses: js.Array[SingleResponse],
    tbs: js.typedarray.ArrayBuffer
  ): IResponseData = {
    val __obj = js.Dynamic.literal(producedAt = producedAt.asInstanceOf[js.Any], responderID = responderID.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResponseData] (val x: Self) extends AnyVal {
    
    inline def setProducedAt(value: js.Date): Self = StObject.set(x, "producedAt", value.asInstanceOf[js.Any])
    
    inline def setResponderID(value: Any): Self = StObject.set(x, "responderID", value.asInstanceOf[js.Any])
    
    inline def setResponseExtensions(value: js.Array[Extension]): Self = StObject.set(x, "responseExtensions", value.asInstanceOf[js.Any])
    
    inline def setResponseExtensionsUndefined: Self = StObject.set(x, "responseExtensions", js.undefined)
    
    inline def setResponseExtensionsVarargs(value: Extension*): Self = StObject.set(x, "responseExtensions", js.Array(value*))
    
    inline def setResponses(value: js.Array[SingleResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: SingleResponse*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
