package typings.octokitTypes

import typings.octokitTypes.requestMethodMod.RequestMethod
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointOptionsMod {
  
  trait EndpointOptions
    extends StObject
       with RequestParameters {
    
    var method: RequestMethod
    
    var url: Url
  }
  object EndpointOptions {
    
    @scala.inline
    def apply(method: RequestMethod, url: Url): EndpointOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointOptions]
    }
    
    @scala.inline
    implicit class EndpointOptionsMutableBuilder[Self <: EndpointOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
