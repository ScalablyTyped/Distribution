package typings
package normalizeDashUrlLib.normalizeDashUrlMod.normalizeUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * @default 'http:'
    */
  var defaultProtocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Normalizes `https:` URLs to `http:`.
    *
    * @default false
    * @example
    * normalizeUrl('https://sindresorhus.com:80/');
    * //=> 'https://sindresorhus.com'
    *
    * normalizeUrl('https://sindresorhus.com:80/', {forceHttp: true});
    * //=> 'http://sindresorhus.com'
    */
  var forceHttp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Normalizes `http:` URLs to `https:`.
    *
    * This option can't be used with the `forceHttp` option at the same time.
    *
    * @default false
    * @example
    * normalizeUrl('https://sindresorhus.com:80/');
    * //=> 'https://sindresorhus.com'
    *
    * normalizeUrl('http://sindresorhus.com:80/', {forceHttps: true});
    * //=> 'https://sindresorhus.com'
    */
  var forceHttps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prepends `defaultProtocol` to the URL if it's protocol-relative.
    *
    * @default true
    * @example
    * normalizeUrl('//sindresorhus.com:80/');
    * //=> 'http://sindresorhus.com'
    *
    * normalizeUrl('//sindresorhus.com:80/', {normalizeProtocol: false});
    * //=> '//sindresorhus.com'
    */
  var normalizeProtocol: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Removes the default directory index file from path that matches any of the provided strings or regexes.
    * When `true`, the regex `/^index\.[a-z]+$/` is used.
    *
    * @default false
    * @example
    * normalizeUrl('www.sindresorhus.com/foo/default.php', {
    *     removeDirectoryIndex: [/^default\.[a-z]+$/]
    * });
    * //=> 'http://sindresorhus.com/foo'
    */
  var removeDirectoryIndex: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
  /**
    * Removes query parameters that matches any of the provided strings or regexes.
    *
    * @default [/^utm_\w+/i]
    * @example
    * normalizeUrl('www.sindresorhus.com?foo=bar&ref=test_ref', {
    *     removeQueryParameters: ['ref']
    * });
    * //=> 'http://sindresorhus.com/?foo=bar'
    */
  var removeQueryParameters: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
  /**
    * Removes trailing slash.
    *
    * **Note**: Trailing slash is always removed if the URL doesn't have a pathname.
    *
    * @default true
    * @example
    * normalizeUrl('http://sindresorhus.com/redirect/');
    * //=> 'http://sindresorhus.com/redirect'
    *
    * normalizeUrl('http://sindresorhus.com/redirect/', {removeTrailingSlash: false});
    * //=> 'http://sindresorhus.com/redirect/'
    *
    * normalizeUrl('http://sindresorhus.com/', {removeTrailingSlash: false});
    * //=> 'http://sindresorhus.com'
    */
  var removeTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sorts the query parameters alphabetically by key.
    *
    * @default true
    * @example
    * normalizeUrl('www.sindresorhus.com?b=two&a=one&c=three', {
    *     sortQueryParameters: false
    * });
    * //=> 'http://sindresorhus.com/?b=two&a=one&c=three'
    */
  var sortQueryParameters: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Strip the [authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) part of a URL.
    *
    * @default true
    * @example
    * normalizeUrl('user:password@sindresorhus.com');
    * //=> 'https://sindresorhus.com'
    *
    * normalizeUrl('user:password@sindresorhus.com', {stripAuthentication: false});
    * //=> 'https://user:password@sindresorhus.com'
    */
  var stripAuthentication: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Removes hash from the URL.
    *
    * @default false
    * @example
    * normalizeUrl('sindresorhus.com/about.html#contact');
    * //=> 'http://sindresorhus.com/about.html#contact'
    *
    * normalizeUrl('sindresorhus.com/about.html#contact', {stripHash: true});
    * //=> 'http://sindresorhus.com/about.html'
    */
  var stripHash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Removes HTTP(S) protocol from an URL `http://sindresorhus.com` → `sindresorhus.com`.
    *
    * @default false
    * @example
    * normalizeUrl('https://sindresorhus.com');
    * //=> 'https://sindresorhus.com'
    *
    * normalizeUrl('sindresorhus.com', {stripProtocol: true});
    * //=> 'sindresorhus.com'
    */
  var stripProtocol: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Removes `www.` from the URL.
    *
    * @default true
    * @example
    * normalizeUrl('http://www.sindresorhus.com');
    * //=> 'http://sindresorhus.com'
    *
    * normalizeUrl('http://www.sindresorhus.com', {stripWWW: false});
    * //=> 'http://www.sindresorhus.com'
    */
  var stripWWW: js.UndefOr[scala.Boolean] = js.undefined
}

