package typings.oauth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessTokenHttpMethod extends StObject {
    
    var accessTokenHttpMethod: String
    
    var followRedirects: Boolean
    
    var requestTokenHttpMethod: String
  }
  object AccessTokenHttpMethod {
    
    inline def apply(accessTokenHttpMethod: String, followRedirects: Boolean, requestTokenHttpMethod: String): AccessTokenHttpMethod = {
      val __obj = js.Dynamic.literal(accessTokenHttpMethod = accessTokenHttpMethod.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], requestTokenHttpMethod = requestTokenHttpMethod.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenHttpMethod]
    }
    
    extension [Self <: AccessTokenHttpMethod](x: Self) {
      
      inline def setAccessTokenHttpMethod(value: String): Self = StObject.set(x, "accessTokenHttpMethod", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setRequestTokenHttpMethod(value: String): Self = StObject.set(x, "requestTokenHttpMethod", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var statusCode: Double
  }
  object Data {
    
    inline def apply(statusCode: Double): Data = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
