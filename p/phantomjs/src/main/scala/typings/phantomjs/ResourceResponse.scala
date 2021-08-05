package typings.phantomjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceResponse extends StObject {
  
  var bodySize: Double
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var headers: StringDictionary[String]
  
  var id: Double
  
  var redirectURL: js.UndefOr[String] = js.undefined
  
  var stage: String
  
  var status: Double
  
  var statusText: String
  
  var time: Date
  
  var url: String
}
object ResourceResponse {
  
  inline def apply(
    bodySize: Double,
    headers: StringDictionary[String],
    id: Double,
    stage: String,
    status: Double,
    statusText: String,
    time: Date,
    url: String
  ): ResourceResponse = {
    val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceResponse]
  }
  
  extension [Self <: ResourceResponse](x: Self) {
    
    inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLUndefined: Self = StObject.set(x, "redirectURL", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
