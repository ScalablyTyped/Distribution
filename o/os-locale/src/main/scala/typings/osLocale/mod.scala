package typings.osLocale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("os-locale", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[String] = js.native
  @JSImport("os-locale", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[String] = js.native
  
  /**
  	Synchronously get the system [locale](https://en.wikipedia.org/wiki/Locale_(computer_software)).
  	@returns The locale.
  	*/
  @JSImport("os-locale", "sync")
  @js.native
  def sync(): String = js.native
  @JSImport("os-locale", "sync")
  @js.native
  def sync(options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Set to `false` to avoid spawning subprocesses and instead only resolve the locale from environment variables.
    		@default true
    		*/
    val spawn: js.UndefOr[Boolean] = js.native
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
      def setSpawn(value: Boolean): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
}
