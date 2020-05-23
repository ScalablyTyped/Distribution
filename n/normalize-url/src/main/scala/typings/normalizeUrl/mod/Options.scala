package typings.normalizeUrl.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		@default 'http:'
  		*/
  val defaultProtocol: js.UndefOr[String] = js.undefined
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
  val forceHttp: js.UndefOr[Boolean] = js.undefined
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
  val forceHttps: js.UndefOr[Boolean] = js.undefined
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
  val normalizeProtocol: js.UndefOr[Boolean] = js.undefined
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
  val removeDirectoryIndex: js.UndefOr[js.Array[RegExp | String]] = js.undefined
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
  val removeQueryParameters: js.UndefOr[js.Array[RegExp | String]] = js.undefined
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
  val removeTrailingSlash: js.UndefOr[Boolean] = js.undefined
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
  val sortQueryParameters: js.UndefOr[Boolean] = js.undefined
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
  val stripAuthentication: js.UndefOr[Boolean] = js.undefined
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
  val stripHash: js.UndefOr[Boolean] = js.undefined
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
  val stripProtocol: js.UndefOr[Boolean] = js.undefined
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
  val stripWWW: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultProtocol: String = null,
    forceHttp: js.UndefOr[Boolean] = js.undefined,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    normalizeProtocol: js.UndefOr[Boolean] = js.undefined,
    removeDirectoryIndex: js.Array[RegExp | String] = null,
    removeQueryParameters: js.Array[RegExp | String] = null,
    removeTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    sortQueryParameters: js.UndefOr[Boolean] = js.undefined,
    stripAuthentication: js.UndefOr[Boolean] = js.undefined,
    stripHash: js.UndefOr[Boolean] = js.undefined,
    stripProtocol: js.UndefOr[Boolean] = js.undefined,
    stripWWW: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultProtocol != null) __obj.updateDynamic("defaultProtocol")(defaultProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttp)) __obj.updateDynamic("forceHttp")(forceHttp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeProtocol)) __obj.updateDynamic("normalizeProtocol")(normalizeProtocol.get.asInstanceOf[js.Any])
    if (removeDirectoryIndex != null) __obj.updateDynamic("removeDirectoryIndex")(removeDirectoryIndex.asInstanceOf[js.Any])
    if (removeQueryParameters != null) __obj.updateDynamic("removeQueryParameters")(removeQueryParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(removeTrailingSlash)) __obj.updateDynamic("removeTrailingSlash")(removeTrailingSlash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortQueryParameters)) __obj.updateDynamic("sortQueryParameters")(sortQueryParameters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripAuthentication)) __obj.updateDynamic("stripAuthentication")(stripAuthentication.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripHash)) __obj.updateDynamic("stripHash")(stripHash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripProtocol)) __obj.updateDynamic("stripProtocol")(stripProtocol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripWWW)) __obj.updateDynamic("stripWWW")(stripWWW.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

