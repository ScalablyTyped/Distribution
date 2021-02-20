package typings.normalizeUrl

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  [Normalize](https://en.wikipedia.org/wiki/URL_normalization) a URL.
  @param url - URL to normalize, including [data URL](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs).
  @example
  ```
  import normalizeUrl = require('normalize-url');
  normalizeUrl('sindresorhus.com');
  //=> 'http://sindresorhus.com'
  normalizeUrl('//www.sindresorhus.com:80/../baz?b=bar&a=foo');
  //=> 'http://sindresorhus.com/baz?a=foo&b=bar'
  ```
  */
  @JSImport("normalize-url", JSImport.Namespace)
  @js.native
  def apply(url: String): String = js.native
  @JSImport("normalize-url", JSImport.Namespace)
  @js.native
  def apply(url: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		@default 'http:'
    		*/
    val defaultProtocol: js.UndefOr[String] = js.native
    
    /**
    		Normalizes `https:` URLs to `http:`.
    		@default false
    		@example
    		```
    		normalizeUrl('https://sindresorhus.com:80/');
    		//=> 'https://sindresorhus.com'
    		normalizeUrl('https://sindresorhus.com:80/', {forceHttp: true});
    		//=> 'http://sindresorhus.com'
    		```
    		*/
    val forceHttp: js.UndefOr[Boolean] = js.native
    
    /**
    		Normalizes `http:` URLs to `https:`.
    		This option can't be used with the `forceHttp` option at the same time.
    		@default false
    		@example
    		```
    		normalizeUrl('https://sindresorhus.com:80/');
    		//=> 'https://sindresorhus.com'
    		normalizeUrl('http://sindresorhus.com:80/', {forceHttps: true});
    		//=> 'https://sindresorhus.com'
    		```
    		*/
    val forceHttps: js.UndefOr[Boolean] = js.native
    
    /**
    		Prepends `defaultProtocol` to the URL if it's protocol-relative.
    		@default true
    		@example
    		```
    		normalizeUrl('//sindresorhus.com:80/');
    		//=> 'http://sindresorhus.com'
    		normalizeUrl('//sindresorhus.com:80/', {normalizeProtocol: false});
    		//=> '//sindresorhus.com'
    		```
    		*/
    val normalizeProtocol: js.UndefOr[Boolean] = js.native
    
    /**
    		Removes the default directory index file from path that matches any of the provided strings or regexes.
    		When `true`, the regex `/^index\.[a-z]+$/` is used.
    		@default false
    		@example
    		```
    		normalizeUrl('www.sindresorhus.com/foo/default.php', {
    			removeDirectoryIndex: [/^default\.[a-z]+$/]
    		});
    		//=> 'http://sindresorhus.com/foo'
    		```
    		*/
    val removeDirectoryIndex: js.UndefOr[js.Array[RegExp | String]] = js.native
    
    /**
    		Removes query parameters that matches any of the provided strings or regexes.
    		@default [/^utm_\w+/i]
    		@example
    		```
    		normalizeUrl('www.sindresorhus.com?foo=bar&ref=test_ref', {
    			removeQueryParameters: ['ref']
    		});
    		//=> 'http://sindresorhus.com/?foo=bar'
    		```
    		*/
    val removeQueryParameters: js.UndefOr[js.Array[RegExp | String]] = js.native
    
    /**
    		Remove a sole `/` pathname in the output. This option is independant of `removeTrailingSlash`.
    		@default true
    		@example
    		```
    		normalizeUrl('https://sindresorhus.com/');
    		//=> 'https://sindresorhus.com'
    		normalizeUrl('https://sindresorhus.com/', {removeSingleSlash: false});
    		//=> 'https://sindresorhus.com/'
    		```
    		*/
    val removeSingleSlash: js.UndefOr[Boolean] = js.native
    
    /**
    		Removes trailing slash.
    		__Note__: Trailing slash is always removed if the URL doesn't have a pathname unless the `removeSingleSlash` option is set to `false`.
    		@default true
    		@example
    		```
    		normalizeUrl('http://sindresorhus.com/redirect/');
    		//=> 'http://sindresorhus.com/redirect'
    		normalizeUrl('http://sindresorhus.com/redirect/', {removeTrailingSlash: false});
    		//=> 'http://sindresorhus.com/redirect/'
    		normalizeUrl('http://sindresorhus.com/', {removeTrailingSlash: false});
    		//=> 'http://sindresorhus.com'
    		```
    		*/
    val removeTrailingSlash: js.UndefOr[Boolean] = js.native
    
    /**
    		Sorts the query parameters alphabetically by key.
    		@default true
    		@example
    		```
    		normalizeUrl('www.sindresorhus.com?b=two&a=one&c=three', {
    			sortQueryParameters: false
    		});
    		//=> 'http://sindresorhus.com/?b=two&a=one&c=three'
    		```
    		*/
    val sortQueryParameters: js.UndefOr[Boolean] = js.native
    
    /**
    		Strip the [authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) part of a URL.
    		@default true
    		@example
    		```
    		normalizeUrl('user:password@sindresorhus.com');
    		//=> 'https://sindresorhus.com'
    		normalizeUrl('user:password@sindresorhus.com', {stripAuthentication: false});
    		//=> 'https://user:password@sindresorhus.com'
    		```
    		*/
    val stripAuthentication: js.UndefOr[Boolean] = js.native
    
    /**
    		Removes hash from the URL.
    		@default false
    		@example
    		```
    		normalizeUrl('sindresorhus.com/about.html#contact');
    		//=> 'http://sindresorhus.com/about.html#contact'
    		normalizeUrl('sindresorhus.com/about.html#contact', {stripHash: true});
    		//=> 'http://sindresorhus.com/about.html'
    		```
    		*/
    val stripHash: js.UndefOr[Boolean] = js.native
    
    /**
    		Removes HTTP(S) protocol from an URL `http://sindresorhus.com` → `sindresorhus.com`.
    		@default false
    		@example
    		```
    		normalizeUrl('https://sindresorhus.com');
    		//=> 'https://sindresorhus.com'
    		normalizeUrl('sindresorhus.com', {stripProtocol: true});
    		//=> 'sindresorhus.com'
    		```
    		*/
    val stripProtocol: js.UndefOr[Boolean] = js.native
    
    /**
    		Removes `www.` from the URL.
    		@default true
    		@example
    		```
    		normalizeUrl('http://www.sindresorhus.com');
    		//=> 'http://sindresorhus.com'
    		normalizeUrl('http://www.sindresorhus.com', {stripWWW: false});
    		//=> 'http://www.sindresorhus.com'
    		```
    		*/
    val stripWWW: js.UndefOr[Boolean] = js.native
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
      def setDefaultProtocol(value: String): Self = StObject.set(x, "defaultProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultProtocolUndefined: Self = StObject.set(x, "defaultProtocol", js.undefined)
      
      @scala.inline
      def setForceHttp(value: Boolean): Self = StObject.set(x, "forceHttp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHttpUndefined: Self = StObject.set(x, "forceHttp", js.undefined)
      
      @scala.inline
      def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
      
      @scala.inline
      def setNormalizeProtocol(value: Boolean): Self = StObject.set(x, "normalizeProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeProtocolUndefined: Self = StObject.set(x, "normalizeProtocol", js.undefined)
      
      @scala.inline
      def setRemoveDirectoryIndex(value: js.Array[RegExp | String]): Self = StObject.set(x, "removeDirectoryIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveDirectoryIndexUndefined: Self = StObject.set(x, "removeDirectoryIndex", js.undefined)
      
      @scala.inline
      def setRemoveDirectoryIndexVarargs(value: (RegExp | String)*): Self = StObject.set(x, "removeDirectoryIndex", js.Array(value :_*))
      
      @scala.inline
      def setRemoveQueryParameters(value: js.Array[RegExp | String]): Self = StObject.set(x, "removeQueryParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveQueryParametersUndefined: Self = StObject.set(x, "removeQueryParameters", js.undefined)
      
      @scala.inline
      def setRemoveQueryParametersVarargs(value: (RegExp | String)*): Self = StObject.set(x, "removeQueryParameters", js.Array(value :_*))
      
      @scala.inline
      def setRemoveSingleSlash(value: Boolean): Self = StObject.set(x, "removeSingleSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveSingleSlashUndefined: Self = StObject.set(x, "removeSingleSlash", js.undefined)
      
      @scala.inline
      def setRemoveTrailingSlash(value: Boolean): Self = StObject.set(x, "removeTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveTrailingSlashUndefined: Self = StObject.set(x, "removeTrailingSlash", js.undefined)
      
      @scala.inline
      def setSortQueryParameters(value: Boolean): Self = StObject.set(x, "sortQueryParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortQueryParametersUndefined: Self = StObject.set(x, "sortQueryParameters", js.undefined)
      
      @scala.inline
      def setStripAuthentication(value: Boolean): Self = StObject.set(x, "stripAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripAuthenticationUndefined: Self = StObject.set(x, "stripAuthentication", js.undefined)
      
      @scala.inline
      def setStripHash(value: Boolean): Self = StObject.set(x, "stripHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripHashUndefined: Self = StObject.set(x, "stripHash", js.undefined)
      
      @scala.inline
      def setStripProtocol(value: Boolean): Self = StObject.set(x, "stripProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripProtocolUndefined: Self = StObject.set(x, "stripProtocol", js.undefined)
      
      @scala.inline
      def setStripWWW(value: Boolean): Self = StObject.set(x, "stripWWW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripWWWUndefined: Self = StObject.set(x, "stripWWW", js.undefined)
    }
  }
}
