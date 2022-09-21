package typings.octokitRequest

import org.scalablytyped.runtime.StringDictionary
import typings.octokitRequest.octokitRequestStrings.error
import typings.octokitRequest.octokitRequestStrings.follow
import typings.octokitRequest.octokitRequestStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: Any
    
    var headers: StringDictionary[String]
    
    var status: Double
    
    var url: String
  }
  object Data {
    
    inline def apply(data: Any, headers: StringDictionary[String], status: Double, url: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Redirect extends StObject {
    
    var redirect: js.UndefOr[error | follow | manual] = js.undefined
  }
  object Redirect {
    
    inline def apply(): Redirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Redirect]
    }
    
    extension [Self <: Redirect](x: Self) {
      
      inline def setRedirect(value: error | follow | manual): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
}
