package typings.prependHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("prepend-http", JSImport.Namespace)
  @js.native
  def apply(url: String): String = js.native
  @JSImport("prepend-http", JSImport.Namespace)
  @js.native
  def apply(url: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Prepend `https://` instead of `http://`.
    		@default true
    		*/
    val https: js.UndefOr[Boolean] = js.native
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
      def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
}
