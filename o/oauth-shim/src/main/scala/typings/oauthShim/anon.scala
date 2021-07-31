package typings.oauthShim

import org.scalablytyped.runtime.StringDictionary
import typings.oauthShim.oauthShimBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var access_token: js.UndefOr[String] = js.undefined
  }
  object Accesstoken {
    
    @scala.inline
    def apply(): Accesstoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accesstoken]
    }
    
    @scala.inline
    implicit class AccesstokenMutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[Accesstoken] = js.undefined
    
    var options: js.UndefOr[Dictkey] = js.undefined
    
    var redirect: js.UndefOr[String] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Accesstoken): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setOptions(value: Dictkey): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Get extends StObject {
    
    @JSName("get")
    def get_false(query: js.Any, cb: js.Function1[/* success */ `false` | js.Object, Unit]): Unit
  }
  object Get {
    
    @scala.inline
    def apply(get: (js.Any, js.Function1[/* success */ `false` | js.Object, Unit]) => Unit): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: (js.Any, js.Function1[/* success */ `false` | js.Object, Unit]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
}
