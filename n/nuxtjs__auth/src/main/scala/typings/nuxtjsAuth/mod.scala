package typings.nuxtjsAuth

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Auth[T] extends StObject {
    
    @JSName("$state")
    var $state: Any = js.native
    
    @JSName("$storage")
    var $storage: Storage = js.native
    
    var ctx: Any = js.native
    
    def fetchUser(): js.Promise[scala.Nothing] = js.native
    
    def fetchUserOnce(): js.Promise[scala.Nothing] = js.native
    
    def getRefreshToken(strategyName: String): String = js.native
    
    def getToken(strategyName: String): String = js.native
    
    def hasScope(scopeName: String): Boolean = js.native
    
    var loggedIn: Boolean = js.native
    
    def login(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): js.Promise[scala.Nothing] = js.native
    
    def loginWith(
      strategyName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): js.Promise[scala.Nothing] = js.native
    
    def logout(): js.Promise[scala.Nothing] = js.native
    
    def onError(handler: js.Function3[/* error */ js.Error, /* name */ String, /* endpoint */ Any, Unit]): Any = js.native
    
    def onRedirect(listener: js.Function0[Unit]): Unit = js.native
    
    def redirect(name: String): Any = js.native
    
    def registerStrategy(strategyName: String, strategy: js.Object): Unit = js.native
    
    def reset(): js.Promise[scala.Nothing] = js.native
    
    def setRefreshToken(strategyName: String): String = js.native
    def setRefreshToken(strategyName: String, token: String): String = js.native
    
    def setStrategy(strategyName: String): Unit = js.native
    
    def setToken(strategyName: String): String = js.native
    def setToken(strategyName: String, token: String): String = js.native
    
    def setUser(): Any = js.native
    def setUser(user: Partial[T]): Any = js.native
    
    def setUserToken(token: String): js.Promise[Unit] = js.native
    
    def strategy(): String = js.native
    
    def syncRefreshToken(strategyName: String): String = js.native
    
    def syncToken(strategyName: String): String = js.native
    
    var user: Partial[T] = js.native
  }
  
  @js.native
  trait Storage extends StObject {
    
    def getCookie(key: String): Any = js.native
    def getCookie(key: String, isJson: Boolean): Any = js.native
    
    // Cookies
    def getCookies(): Any = js.native
    
    def getLocalStorage(key: String): Any = js.native
    def getLocalStorage(key: String, isJson: Boolean): Any = js.native
    
    def getState(key: String): String = js.native
    
    def getUniversal(key: String): Any = js.native
    def getUniversal(key: String, isJson: Boolean): Any = js.native
    
    def removeCookie(key: String): Any = js.native
    def removeCookie(key: String, options: js.Object): Any = js.native
    
    def removeLocalStorage(key: String): Any = js.native
    
    def removeState(key: String): Any = js.native
    
    def removeUniversal(key: String): Any = js.native
    
    def setCookie(key: String, `val`: Any): Any = js.native
    def setCookie(key: String, `val`: Any, options: js.Object): Any = js.native
    
    // Local Storage
    def setLocalStorage(key: String, `val`: Any): Any = js.native
    def setLocalStorage(key: String, `val`: Any, isJson: Boolean): Any = js.native
    
    // Local State
    def setState(key: String, `val`: Any): String = js.native
    
    def setUniversal(key: String, value: Any): String = js.native
    def setUniversal(key: String, value: Any, isJson: Boolean): String = js.native
    
    def syncUniversal(key: String, defaultValue: Any): Any = js.native
    def syncUniversal(key: String, defaultValue: Any, isJson: Boolean): Any = js.native
    
    def watchState(key: String, handler: js.Function1[/* newValue */ Any, Unit]): Any = js.native
  }
  
  /* augmented module */
  object nuxtTypesAugmentingMod {
    
    trait Context extends StObject {
      
      @JSName("$auth")
      var $auth: Auth[Any]
    }
    object Context {
      
      inline def apply($auth: Auth[Any]): Context = {
        val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      extension [Self <: Context](x: Self) {
        
        inline def set$auth(value: Auth[Any]): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object nuxtVueAppAugmentingMod {
    
    trait Context extends StObject {
      
      @JSName("$auth")
      var $auth: Auth[Any]
    }
    object Context {
      
      inline def apply($auth: Auth[Any]): Context = {
        val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      extension [Self <: Context](x: Self) {
        
        inline def set$auth(value: Auth[Any]): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object vueTypesOptionsAugmentingMod {
    
    trait ComponentOptions[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */] extends StObject {
      
      var auth: js.UndefOr[Boolean | String] = js.undefined
    }
    object ComponentOptions {
      
      inline def apply[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](): ComponentOptions[V] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ComponentOptions[V]]
      }
      
      extension [Self <: ComponentOptions[?], V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](x: Self & ComponentOptions[V]) {
        
        inline def setAuth(value: Boolean | String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object vueTypesVueAugmentingMod {
    
    trait Vue extends StObject {
      
      @JSName("$auth")
      var $auth: Auth[Any]
    }
    object Vue {
      
      inline def apply($auth: Auth[Any]): Vue = {
        val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[Vue]
      }
      
      extension [Self <: Vue](x: Self) {
        
        inline def set$auth(value: Auth[Any]): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object vuexTypesIndexAugmentingMod {
    
    trait Store[S] extends StObject {
      
      @JSName("$auth")
      var $auth: Auth[Any]
    }
    object Store {
      
      inline def apply[S]($auth: Auth[Any]): Store[S] = {
        val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[Store[S]]
      }
      
      extension [Self <: Store[?], S](x: Self & Store[S]) {
        
        inline def set$auth(value: Auth[Any]): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
      }
    }
  }
}
