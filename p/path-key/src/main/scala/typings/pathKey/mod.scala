package typings.pathKey

import org.scalablytyped.runtime.StringDictionary
import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the [PATH](https://en.wikipedia.org/wiki/PATH_(variable)) environment variable key cross-platform.
  	@example
  	```
  	import pathKey = require('path-key');
  	const key = pathKey();
  	//=> 'PATH'
  	const PATH = process.env[key];
  	//=> '/usr/local/bin:/usr/bin:/bin'
  	```
  	*/
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("path-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pathKey(options?: pathKey.Options): string;
  // export = pathKey;
  @JSImport("path-key", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pathKey */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pathKey */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /**
    		Use a custom environment variables object. Default: [`process.env`](https://nodejs.org/api/process.html#process_process_env).
    		*/
    val env: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
    
    /**
    		Get the PATH key for a specific platform. Default: [`process.platform`](https://nodejs.org/api/process.html#process_process_platform).
    		*/
    val platform: js.UndefOr[Platform] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEnv(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
}
