package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDataJson extends StObject {
  
  var producedAt: js.Date
  
  var responderID: Any
  
  var responseExtensions: js.UndefOr[js.Array[ExtensionJson]] = js.undefined
  
  var responses: js.Array[SingleResponseJson]
  
  var tbs: String
  
  var version: js.UndefOr[Double] = js.undefined
}
object ResponseDataJson {
  
  inline def apply(producedAt: js.Date, responderID: Any, responses: js.Array[SingleResponseJson], tbs: String): ResponseDataJson = {
    val __obj = js.Dynamic.literal(producedAt = producedAt.asInstanceOf[js.Any], responderID = responderID.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDataJson]
  }
  
  extension [Self <: ResponseDataJson](x: Self) {
    
    inline def setProducedAt(value: js.Date): Self = StObject.set(x, "producedAt", value.asInstanceOf[js.Any])
    
    inline def setResponderID(value: Any): Self = StObject.set(x, "responderID", value.asInstanceOf[js.Any])
    
    inline def setResponseExtensions(value: js.Array[ExtensionJson]): Self = StObject.set(x, "responseExtensions", value.asInstanceOf[js.Any])
    
    inline def setResponseExtensionsUndefined: Self = StObject.set(x, "responseExtensions", js.undefined)
    
    inline def setResponseExtensionsVarargs(value: ExtensionJson*): Self = StObject.set(x, "responseExtensions", js.Array(value*))
    
    inline def setResponses(value: js.Array[SingleResponseJson]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: SingleResponseJson*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setTbs(value: String): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
