package typings.normalizeUrl.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
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
  		Removes trailing slash.
  		__Note__: Trailing slash is always removed if the URL doesn't have a pathname.
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultProtocol(value: String): Self = this.set("defaultProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultProtocol: Self = this.set("defaultProtocol", js.undefined)
    @scala.inline
    def setForceHttp(value: Boolean): Self = this.set("forceHttp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHttp: Self = this.set("forceHttp", js.undefined)
    @scala.inline
    def setForceHttps(value: Boolean): Self = this.set("forceHttps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHttps: Self = this.set("forceHttps", js.undefined)
    @scala.inline
    def setNormalizeProtocol(value: Boolean): Self = this.set("normalizeProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizeProtocol: Self = this.set("normalizeProtocol", js.undefined)
    @scala.inline
    def setRemoveDirectoryIndexVarargs(value: (RegExp | String)*): Self = this.set("removeDirectoryIndex", js.Array(value :_*))
    @scala.inline
    def setRemoveDirectoryIndex(value: js.Array[RegExp | String]): Self = this.set("removeDirectoryIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveDirectoryIndex: Self = this.set("removeDirectoryIndex", js.undefined)
    @scala.inline
    def setRemoveQueryParametersVarargs(value: (RegExp | String)*): Self = this.set("removeQueryParameters", js.Array(value :_*))
    @scala.inline
    def setRemoveQueryParameters(value: js.Array[RegExp | String]): Self = this.set("removeQueryParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveQueryParameters: Self = this.set("removeQueryParameters", js.undefined)
    @scala.inline
    def setRemoveTrailingSlash(value: Boolean): Self = this.set("removeTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveTrailingSlash: Self = this.set("removeTrailingSlash", js.undefined)
    @scala.inline
    def setSortQueryParameters(value: Boolean): Self = this.set("sortQueryParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortQueryParameters: Self = this.set("sortQueryParameters", js.undefined)
    @scala.inline
    def setStripAuthentication(value: Boolean): Self = this.set("stripAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripAuthentication: Self = this.set("stripAuthentication", js.undefined)
    @scala.inline
    def setStripHash(value: Boolean): Self = this.set("stripHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripHash: Self = this.set("stripHash", js.undefined)
    @scala.inline
    def setStripProtocol(value: Boolean): Self = this.set("stripProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripProtocol: Self = this.set("stripProtocol", js.undefined)
    @scala.inline
    def setStripWWW(value: Boolean): Self = this.set("stripWWW", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripWWW: Self = this.set("stripWWW", js.undefined)
  }
  
}

