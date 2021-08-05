package typings.prependHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Prepend `https://` to humanized URLs like `sindresorhus.com` and `localhost`.
  @param url - URL to prepend `https://` to.
  @example
  ```
  import prependHttp = require('prepend-http');
  prependHttp('sindresorhus.com');
  //=> 'https://sindresorhus.com'
  prependHttp('localhost', {https: false});
  //=> 'http://localhost'
  prependHttp('https://sindresorhus.com');
  //=> 'https://sindresorhus.com'
  ```
  */
  inline def apply(url: String): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(url: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("prepend-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Prepend `https://` instead of `http://`.
    		@default true
    		*/
    val https: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
}
