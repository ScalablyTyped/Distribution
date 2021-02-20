package typings.octokitRequest

import org.scalablytyped.runtime.StringDictionary
import typings.octokitRequest.octokitRequestStrings.error
import typings.octokitRequest.octokitRequestStrings.follow
import typings.octokitRequest.octokitRequestStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Any = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var status: Double = js.native
    
    var url: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any, headers: StringDictionary[String], status: Double, url: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Redirect extends StObject {
    
    var redirect: js.UndefOr[error | follow | manual] = js.native
  }
  object Redirect {
    
    @scala.inline
    def apply(): Redirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirect(value: error | follow | manual): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
}
