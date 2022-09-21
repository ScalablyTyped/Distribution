package typings.pkgConf

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pkg-conf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def packageConfig[ConfigType /* <: Config */](namespace: String): js.Promise[ConfigType & Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("packageConfig")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConfigType & Config]]
  inline def packageConfig[ConfigType /* <: Config */](namespace: String, options: Options[ConfigType]): js.Promise[ConfigType & Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageConfig")(namespace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigType & Config]]
  
  inline def packageConfigSync[ConfigType /* <: Config */](namespace: String): ConfigType & Config = ^.asInstanceOf[js.Dynamic].applyDynamic("packageConfigSync")(namespace.asInstanceOf[js.Any]).asInstanceOf[ConfigType & Config]
  inline def packageConfigSync[ConfigType /* <: Config */](namespace: String, options: Options[ConfigType]): ConfigType & Config = (^.asInstanceOf[js.Dynamic].applyDynamic("packageConfigSync")(namespace.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConfigType & Config]
  
  inline def packageJsonPath(config: Config): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("packageJsonPath")(config.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  type Config = Record[String, Any]
  
  trait Options[ConfigType /* <: Config */] extends StObject {
    
    /**
    	The directory to start looking up for a `package.json` file.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[String] = js.undefined
    
    /**
    	The default config.
    	@default {}
    	*/
    val defaults: js.UndefOr[ConfigType] = js.undefined
    
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
    val skipOnFalse: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[ConfigType /* <: Config */](): Options[ConfigType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ConfigType]]
    }
    
    extension [Self <: Options[?], ConfigType /* <: Config */](x: Self & Options[ConfigType]) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDefaults(value: ConfigType): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setSkipOnFalse(value: Boolean): Self = StObject.set(x, "skipOnFalse", value.asInstanceOf[js.Any])
      
      inline def setSkipOnFalseUndefined: Self = StObject.set(x, "skipOnFalse", js.undefined)
    }
  }
}
