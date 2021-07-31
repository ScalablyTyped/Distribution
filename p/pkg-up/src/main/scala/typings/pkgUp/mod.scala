package typings.pkgUp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Find the closest `package.json` file.
  	@returns The filepath, or `null` if it couldn't be found.
  	@example
  	```
  	// /
  	// └── Users
  	//     └── sindresorhus
  	//         └── foo
  	//             ├── package.json
  	//             └── bar
  	//                 ├── baz
  	//                 └── example.js
  	// example.js
  	import pkgUp = require('pkg-up');
  	(async () => {
  		console.log(await pkgUp());
  		//=> '/Users/sindresorhus/foo/package.json'
  	})();
  	```
  	*/
  @scala.inline
  def apply(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String | Null]]
  @scala.inline
  def apply(options: Options): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  @JSImport("pkg-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Synchronously find the closest `package.json` file.
  	@returns The filepath, or `null` if it couldn't be found.
  	*/
  @scala.inline
  def sync(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[String | Null]
  @scala.inline
  def sync(options: Options): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  trait Options extends StObject {
    
    /**
    		Directory to start from.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.undefined
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
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
}
