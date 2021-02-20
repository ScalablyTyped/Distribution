package typings.pkgVersions

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	Get the version numbers of a package from the npm registry.
    	@returns The version numbers.
    	@example
    	```
    	import pkgVersions = require('pkg-versions');
    	(async () => {
    		console.log(await pkgVersions('ava'));
    		//=> {'0.0.3', '0.0.4', …}
    	})();
    	```
    	*/
    def apply(packageName: String): js.Promise[Set[String]] = js.native
  }
}
