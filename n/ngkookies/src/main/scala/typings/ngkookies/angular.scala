package typings.ngkookies

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object kookies {
    
    @js.native
    trait Config extends StObject {
      
      var json: js.UndefOr[Boolean] = js.native
      
      var raw: js.UndefOr[Boolean] = js.native
    }
    object Config {
      
      @scala.inline
      def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
        
        @scala.inline
        def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      }
    }
    
    @js.native
    trait IKookiesProvider extends StObject {
      
      var config: Config = js.native
      
      var defaults: Options = js.native
      
      def setConfig(config: Config): Unit = js.native
      
      def setDefaults(options: Options): Unit = js.native
    }
    object IKookiesProvider {
      
      @scala.inline
      def apply(config: Config, defaults: Options, setConfig: Config => Unit, setDefaults: Options => Unit): IKookiesProvider = {
        val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], setConfig = js.Any.fromFunction1(setConfig), setDefaults = js.Any.fromFunction1(setDefaults))
        __obj.asInstanceOf[IKookiesProvider]
      }
      
      @scala.inline
      implicit class IKookiesProviderMutableBuilder[Self <: IKookiesProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaults(value: Options): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetConfig(value: Config => Unit): Self = StObject.set(x, "setConfig", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetDefaults(value: Options => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait IKookiesService extends StObject {
      
      def get(): js.Any = js.native
      def get(name: String): js.Any = js.native
      def get(name: String, converter: js.Any): js.Any = js.native
      @JSName("get")
      def get_T_T[T](name: String, converter: js.Any): T = js.native
      
      def remove(name: String): Boolean = js.native
      def remove(name: String, options: Options): Boolean = js.native
      
      def set(name: String, value: String): Unit = js.native
      def set(name: String, value: String, optopns: Options): Unit = js.native
    }
    
    @js.native
    trait Options extends StObject {
      
      var domain: js.UndefOr[String] = js.native
      
      var expires: js.UndefOr[Double | Date] = js.native
      
      var path: js.UndefOr[String] = js.native
      
      var secure: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setExpires(value: Double | Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      }
    }
  }
}
