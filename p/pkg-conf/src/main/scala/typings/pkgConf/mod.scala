package typings.pkgConf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	It [walks up](https://github.com/sindresorhus/find-up) parent directories until a `package.json` can be found, reads it, and returns the user specified namespace or an empty object if not found.
  	@param namespace - The `package.json` namespace you want.
  	@returns A `Promise` for the config.
  	@example
  	```
  	// {
  	// 	"name": "some-package",
  	// 	"version": "1.0.0",
  	// 	"unicorn": {
  	// 		"rainbow": true
  	// 	}
  	// }
  	import pkgConf = require('pkg-conf');
  	(async () => {
  		const config = await pkgConf('unicorn');
  		console.log(config.rainbow);
  		//=> true
  	})();
  	```
  	*/
  @scala.inline
  def apply[ConfigType /* <: Config */](namespace: String): js.Promise[ConfigType & Config] = ^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConfigType & Config]]
  @scala.inline
  def apply[ConfigType /* <: Config */](namespace: String, options: Options[ConfigType]): js.Promise[ConfigType & Config] = (^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigType & Config]]
  
  @JSImport("pkg-conf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("pkg-conf", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pkgConf */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pkgConf */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	@param config - The `config` returned from any of the above methods.
  	@returns The filepath to the `package.json` file or `null` when not found.
  	*/
  @scala.inline
  def filepath(config: Config): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("filepath")(config.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /**
  	Same as `pkgConf()`, but runs synchronously.
  	@param namespace - The `package.json` namespace you want.
  	@returns Returns the config.
  	*/
  @scala.inline
  def sync[ConfigType /* <: Config */](namespace: String): ConfigType & Config = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(namespace.asInstanceOf[js.Any]).asInstanceOf[ConfigType & Config]
  @scala.inline
  def sync[ConfigType /* <: Config */](namespace: String, options: Options[ConfigType]): ConfigType & Config = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(namespace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConfigType & Config]
  
  type Config = StringDictionary[js.Any]
  
  trait Options[ConfigType /* <: Config */] extends StObject {
    
    /**
    		Directory to start looking up for a `package.json` file.
    		@default process.cwd()
    		*/
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
    		Default config.
    		@default {}
    		*/
    var defaults: js.UndefOr[ConfigType] = js.undefined
    
    /**
    		Skip `package.json` files that have the namespaced config explicitly set to `false`.
    		Continues searching upwards until the next `package.json` file is reached. This can be useful when you need to support the ability for users to have nested `package.json` files, but only read from the root one, like in the case of [`electron-builder`](https://github.com/electron-userland/electron-builder/wiki/Options#AppMetadata) where you have one `package.json` file for the app and one top-level for development.
    		@default false
    		@example
    		```
    		{
    			"name": "some-package",
    			"version": "1.0.0",
    			"unicorn": false
    		}
    		```
    		*/
    var skipOnFalse: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[ConfigType /* <: Config */](): Options[ConfigType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ConfigType]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], ConfigType /* <: Config */] (val x: Self & Options[ConfigType]) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDefaults(value: ConfigType): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setSkipOnFalse(value: Boolean): Self = StObject.set(x, "skipOnFalse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipOnFalseUndefined: Self = StObject.set(x, "skipOnFalse", js.undefined)
    }
  }
}
