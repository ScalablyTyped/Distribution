package typings.nuxtjsAuth

import typings.std.Error
import typings.std.Partial
import typings.vue.vueMod.Vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Auth[T] extends StObject {
    
    @JSName("$state")
    var $state: js.Any = js.native
    
    @JSName("$storage")
    var $storage: Storage = js.native
    
    var ctx: js.Any = js.native
    
    def fetchUser(): js.Promise[scala.Nothing] = js.native
    
    def fetchUserOnce(): js.Promise[scala.Nothing] = js.native
    
    def getRefreshToken(strategyName: String): String = js.native
    
    def getToken(strategyName: String): String = js.native
    
    def hasScope(scopeName: String): Boolean = js.native
    
    var loggedIn: Boolean = js.native
    
    def login(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): js.Promise[scala.Nothing] = js.native
    
    def loginWith(
      strategyName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): js.Promise[scala.Nothing] = js.native
    
    def logout(): js.Promise[scala.Nothing] = js.native
    
    def onError(handler: js.Function3[/* error */ Error, /* name */ String, /* endpoint */ js.Any, Unit]): js.Any = js.native
    
    def onRedirect(listener: js.Function0[Unit]): Unit = js.native
    
    def redirect(name: String): js.Any = js.native
    
    def registerStrategy(strategyName: String, strategy: js.Object): Unit = js.native
    
    def reset(): js.Promise[scala.Nothing] = js.native
    
    def setRefreshToken(strategyName: String): String = js.native
    def setRefreshToken(strategyName: String, token: String): String = js.native
    
    def setStrategy(strategyName: String): Unit = js.native
    
    def setToken(strategyName: String): String = js.native
    def setToken(strategyName: String, token: String): String = js.native
    
    def setUser(): js.Any = js.native
    def setUser(user: Partial[T]): js.Any = js.native
    
    def setUserToken(token: String): js.Promise[Unit] = js.native
    
    def strategy(): String = js.native
    
    def syncRefreshToken(strategyName: String): String = js.native
    
    def syncToken(strategyName: String): String = js.native
    
    var user: Partial[T] = js.native
  }
  
  @js.native
  trait Storage extends StObject {
    
    def getCookie(key: String): js.Any = js.native
    def getCookie(key: String, isJson: Boolean): js.Any = js.native
    
    def getLocalStorage(key: String): js.Any = js.native
    def getLocalStorage(key: String, isJson: Boolean): js.Any = js.native
    
    def getState(key: String): String = js.native
    
    def getUniversal(key: String): js.Any = js.native
    def getUniversal(key: String, isJson: Boolean): js.Any = js.native
    
    // Cookies
    def setCookie(key: String, `val`: js.Any): js.Any = js.native
    def setCookie(key: String, `val`: js.Any, options: js.Object): js.Any = js.native
    
    // Local Storage
    def setLocalStorage(key: String, `val`: js.Any): js.Any = js.native
    def setLocalStorage(key: String, `val`: js.Any, isJson: Boolean): js.Any = js.native
    
    // Local State
    def setState(key: String, `val`: js.Any): String = js.native
    
    def setUniversal(key: String, value: js.Any): String = js.native
    def setUniversal(key: String, value: js.Any, isJson: Boolean): String = js.native
    
    def syncUniversal(key: String, defaultValue: js.Any): js.Any = js.native
    def syncUniversal(key: String, defaultValue: js.Any, isJson: Boolean): js.Any = js.native
    
    def watchState(key: String, handler: js.Function1[/* newValue */ js.Any, Unit]): js.Any = js.native
  }
  
  object nuxtTypesAugmentingMod {
    
    @js.native
    trait Context extends StObject {
      
      @JSName("$auth")
      var $auth: Auth[_] = js.native
    }
    object Context {
      
      @scala.inline
      def apply($auth: Auth[_]): Context = {
        val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      @scala.inline
      implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$auth(value: Auth[_]): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object nuxtVueAppAugmentingMod {
    
    @js.native
    trait Context extends StObject {
      
      @JSName("$auth")
      var $auth: Auth[_] = js.native
    }
    object Context {
      
      @scala.inline
      def apply($auth: Auth[_]): Context = {
        val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      @scala.inline
      implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$auth(value: Auth[_]): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object vueTypesOptionsAugmentingMod {
    
    @js.native
    trait ComponentOptions[V /* <: Vue */] extends StObject {
      
      var auth: js.UndefOr[Boolean | String] = js.native
    }
    object ComponentOptions {
      
      @scala.inline
      def apply[V /* <: Vue */](): ComponentOptions[V] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ComponentOptions[V]]
      }
      
      @scala.inline
      implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions[_], V /* <: Vue */] (val x: Self with ComponentOptions[V]) extends AnyVal {
        
        @scala.inline
        def setAuth(value: Boolean | String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      }
    }
  }
  
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
      @JSName("$auth")
      var $auth: Auth[_] = js.native
    }
    object Vue {
      
      @scala.inline
      def apply($auth: Auth[_]): typings.nuxtjsAuth.mod.vueTypesVueAugmentingMod.Vue = {
        val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.nuxtjsAuth.mod.vueTypesVueAugmentingMod.Vue]
      }
      
      @scala.inline
      implicit class VueMutableBuilder[Self <: typings.nuxtjsAuth.mod.vueTypesVueAugmentingMod.Vue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$auth(value: Auth[_]): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
      }
    }
  }
}
