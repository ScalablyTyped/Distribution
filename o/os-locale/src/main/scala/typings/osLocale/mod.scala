package typings.osLocale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the system [locale](https://en.wikipedia.org/wiki/Locale_(computer_software)).
  	@returns The locale.
  	@example
  	```
  	import osLocale = require('os-locale');
  	(async () => {
  		console.log(await osLocale());
  		//=> 'en-US'
  	})();
  	```
  	*/
  inline def apply(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String]]
  inline def apply(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("os-locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Synchronously get the system [locale](https://en.wikipedia.org/wiki/Locale_(computer_software)).
  	@returns The locale.
  	*/
  inline def sync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[String]
  inline def sync(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    		Set to `false` to avoid spawning subprocesses and instead only resolve the locale from environment variables.
    		@default true
    		*/
    val spawn: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSpawn(value: Boolean): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
}
