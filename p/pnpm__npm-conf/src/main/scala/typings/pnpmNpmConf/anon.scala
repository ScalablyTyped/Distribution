package typings.pnpmNpmConf

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.ClientRequestArgs
import typings.node.nodeColonbufferMod.Blob
import typings.node.urlMod.URLFormatOptions
import typings.node.urlMod.URL_
import typings.node.urlMod.Url
import typings.node.urlMod.UrlObject
import typings.node.urlMod.UrlWithParsedQuery
import typings.node.urlMod.UrlWithStringQuery
import typings.pnpmNpmConf.pnpmNpmConfBooleans.`false`
import typings.pnpmNpmConf.pnpmNpmConfBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofURL extends StObject {
    
    /**
      * Creates a `'blob:nodedata:...'` URL string that represents the given `Blob` object and can be used to retrieve the `Blob` later.
      *
      * ```js
      * const {
      *   Blob,
      *   resolveObjectURL,
      * } = require('buffer');
      *
      * const blob = new Blob(['hello']);
      * const id = URL.createObjectURL(blob);
      *
      * // later...
      *
      * const otherBlob = resolveObjectURL(id);
      * console.log(otherBlob.size);
      * ```
      *
      * The data stored by the registered `Blob` will be retained in memory until`URL.revokeObjectURL()` is called to remove it.
      *
      * `Blob` objects are registered within the current thread. If using Worker
      * Threads, `Blob` objects registered within one Worker will not be available
      * to other workers or the main thread.
      * @since v16.7.0
      * @experimental
      */
    /* static member */
    def createObjectURL(blob: Blob): String
    
    /**
      * Removes the stored `Blob` identified by the given ID. Attempting to revoke a
      * ID that isn’t registered will silently fail.
      * @since v16.7.0
      * @experimental
      * @param id A `'blob:nodedata:...` URL string returned by a prior call to `URL.createObjectURL()`.
      */
    /* static member */
    def revokeObjectURL(objectUrl: String): Unit
  }
  object TypeofURL {
    
    inline def apply(createObjectURL: Blob => String, revokeObjectURL: String => Unit): TypeofURL = {
      val __obj = js.Dynamic.literal(createObjectURL = js.Any.fromFunction1(createObjectURL), revokeObjectURL = js.Any.fromFunction1(revokeObjectURL))
      __obj.asInstanceOf[TypeofURL]
    }
    
    extension [Self <: TypeofURL](x: Self) {
      
      inline def setCreateObjectURL(value: Blob => String): Self = StObject.set(x, "createObjectURL", js.Any.fromFunction1(value))
      
      inline def setRevokeObjectURL(value: String => Unit): Self = StObject.set(x, "revokeObjectURL", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofimportedUrl extends StObject {
    
    /**
      * Browser-compatible `URL` class, implemented by following the WHATWG URL
      * Standard. [Examples of parsed URLs](https://url.spec.whatwg.org/#example-url-parsing) may be found in the Standard itself.
      * The `URL` class is also available on the global object.
      *
      * In accordance with browser conventions, all properties of `URL` objects
      * are implemented as getters and setters on the class prototype, rather than as
      * data properties on the object itself. Thus, unlike `legacy urlObject` s,
      * using the `delete` keyword on any properties of `URL` objects (e.g. `delete myURL.protocol`, `delete myURL.pathname`, etc) has no effect but will still
      * return `true`.
      * @since v7.0.0, v6.13.0
      */
    var URL: (Instantiable1[/* input */ String, URL_]) & TypeofURL = js.native
    
    /**
      * The `URLSearchParams` API provides read and write access to the query of a`URL`. The `URLSearchParams` class can also be used standalone with one of the
      * four following constructors.
      * The `URLSearchParams` class is also available on the global object.
      *
      * The WHATWG `URLSearchParams` interface and the `querystring` module have
      * similar purpose, but the purpose of the `querystring` module is more
      * general, as it allows the customization of delimiter characters (`&#x26;` and `=`).
      * On the other hand, this API is designed purely for URL query strings.
      *
      * ```js
      * const myURL = new URL('https://example.org/?abc=123');
      * console.log(myURL.searchParams.get('abc'));
      * // Prints 123
      *
      * myURL.searchParams.append('abc', 'xyz');
      * console.log(myURL.href);
      * // Prints https://example.org/?abc=123&#x26;abc=xyz
      *
      * myURL.searchParams.delete('abc');
      * myURL.searchParams.set('a', 'b');
      * console.log(myURL.href);
      * // Prints https://example.org/?a=b
      *
      * const newSearchParams = new URLSearchParams(myURL.searchParams);
      * // The above is equivalent to
      * // const newSearchParams = new URLSearchParams(myURL.search);
      *
      * newSearchParams.append('a', 'c');
      * console.log(myURL.href);
      * // Prints https://example.org/?a=b
      * console.log(newSearchParams.toString());
      * // Prints a=b&#x26;a=c
      *
      * // newSearchParams.toString() is implicitly called
      * myURL.search = newSearchParams;
      * console.log(myURL.href);
      * // Prints https://example.org/?a=b&#x26;a=c
      * newSearchParams.delete('a');
      * console.log(myURL.href);
      * // Prints https://example.org/?a=b&#x26;a=c
      * ```
      * @since v7.5.0, v6.13.0
      */
    var URLSearchParams: Instantiable0[typings.node.urlMod.URLSearchParams] = js.native
    
    /**
      * Returns the [Punycode](https://tools.ietf.org/html/rfc5891#section-4.4) ASCII serialization of the `domain`. If `domain` is an
      * invalid domain, the empty string is returned.
      *
      * It performs the inverse operation to {@link domainToUnicode}.
      *
      * This feature is only available if the `node` executable was compiled with `ICU` enabled. If not, the domain names are passed through unchanged.
      *
      * ```js
      * import url from 'url';
      *
      * console.log(url.domainToASCII('español.com'));
      * // Prints xn--espaol-zwa.com
      * console.log(url.domainToASCII('中文.com'));
      * // Prints xn--fiq228c.com
      * console.log(url.domainToASCII('xn--iñvalid.com'));
      * // Prints an empty string
      * ```
      * @since v7.4.0, v6.13.0
      */
    def domainToASCII(domain: String): String = js.native
    
    /**
      * Returns the Unicode serialization of the `domain`. If `domain` is an invalid
      * domain, the empty string is returned.
      *
      * It performs the inverse operation to {@link domainToASCII}.
      *
      * This feature is only available if the `node` executable was compiled with `ICU` enabled. If not, the domain names are passed through unchanged.
      *
      * ```js
      * import url from 'url';
      *
      * console.log(url.domainToUnicode('xn--espaol-zwa.com'));
      * // Prints español.com
      * console.log(url.domainToUnicode('xn--fiq228c.com'));
      * // Prints 中文.com
      * console.log(url.domainToUnicode('xn--iñvalid.com'));
      * // Prints an empty string
      * ```
      * @since v7.4.0, v6.13.0
      */
    def domainToUnicode(domain: String): String = js.native
    
    /**
      * This function ensures the correct decodings of percent-encoded characters as
      * well as ensuring a cross-platform valid absolute path string.
      *
      * ```js
      * import { fileURLToPath } from 'url';
      *
      * const __filename = fileURLToPath(import.meta.url);
      *
      * new URL('file:///C:/path/').pathname;      // Incorrect: /C:/path/
      * fileURLToPath('file:///C:/path/');         // Correct:   C:\path\ (Windows)
      *
      * new URL('file://nas/foo.txt').pathname;    // Incorrect: /foo.txt
      * fileURLToPath('file://nas/foo.txt');       // Correct:   \\nas\foo.txt (Windows)
      *
      * new URL('file:///你好.txt').pathname;      // Incorrect: /%E4%BD%A0%E5%A5%BD.txt
      * fileURLToPath('file:///你好.txt');         // Correct:   /你好.txt (POSIX)
      *
      * new URL('file:///hello world').pathname;   // Incorrect: /hello%20world
      * fileURLToPath('file:///hello world');      // Correct:   /hello world (POSIX)
      * ```
      * @since v10.12.0
      * @param url The file URL string or URL object to convert to a path.
      * @return The fully-resolved platform-specific Node.js file path.
      */
    def fileURLToPath(url: String): String = js.native
    def fileURLToPath(url: URL_): String = js.native
    
    def format(urlObject: String): String = js.native
    /**
      * The `url.format()` method returns a formatted URL string derived from`urlObject`.
      *
      * ```js
      * const url = require('url');
      * url.format({
      *   protocol: 'https',
      *   hostname: 'example.com',
      *   pathname: '/some/path',
      *   query: {
      *     page: 1,
      *     format: 'json'
      *   }
      * });
      *
      * // => 'https://example.com/some/path?page=1&#x26;format=json'
      * ```
      *
      * If `urlObject` is not an object or a string, `url.format()` will throw a `TypeError`.
      *
      * The formatting process operates as follows:
      *
      * * A new empty string `result` is created.
      * * If `urlObject.protocol` is a string, it is appended as-is to `result`.
      * * Otherwise, if `urlObject.protocol` is not `undefined` and is not a string, an `Error` is thrown.
      * * For all string values of `urlObject.protocol` that _do not end_ with an ASCII
      * colon (`:`) character, the literal string `:` will be appended to `result`.
      * * If either of the following conditions is true, then the literal string `//`will be appended to `result`:
      *    * `urlObject.slashes` property is true;
      *    * `urlObject.protocol` begins with `http`, `https`, `ftp`, `gopher`, or`file`;
      * * If the value of the `urlObject.auth` property is truthy, and either`urlObject.host` or `urlObject.hostname` are not `undefined`, the value of`urlObject.auth` will be coerced into a string
      * and appended to `result`followed by the literal string `@`.
      * * If the `urlObject.host` property is `undefined` then:
      *    * If the `urlObject.hostname` is a string, it is appended to `result`.
      *    * Otherwise, if `urlObject.hostname` is not `undefined` and is not a string,
      *    an `Error` is thrown.
      *    * If the `urlObject.port` property value is truthy, and `urlObject.hostname`is not `undefined`:
      *          * The literal string `:` is appended to `result`, and
      *          * The value of `urlObject.port` is coerced to a string and appended to`result`.
      * * Otherwise, if the `urlObject.host` property value is truthy, the value of`urlObject.host` is coerced to a string and appended to `result`.
      * * If the `urlObject.pathname` property is a string that is not an empty string:
      *    * If the `urlObject.pathname`_does not start_ with an ASCII forward slash
      *    (`/`), then the literal string `'/'` is appended to `result`.
      *    * The value of `urlObject.pathname` is appended to `result`.
      * * Otherwise, if `urlObject.pathname` is not `undefined` and is not a string, an `Error` is thrown.
      * * If the `urlObject.search` property is `undefined` and if the `urlObject.query`property is an `Object`, the literal string `?` is appended to `result`followed by the output of calling the
      * `querystring` module's `stringify()`method passing the value of `urlObject.query`.
      * * Otherwise, if `urlObject.search` is a string:
      *    * If the value of `urlObject.search`_does not start_ with the ASCII question
      *    mark (`?`) character, the literal string `?` is appended to `result`.
      *    * The value of `urlObject.search` is appended to `result`.
      * * Otherwise, if `urlObject.search` is not `undefined` and is not a string, an `Error` is thrown.
      * * If the `urlObject.hash` property is a string:
      *    * If the value of `urlObject.hash`_does not start_ with the ASCII hash (`#`)
      *    character, the literal string `#` is appended to `result`.
      *    * The value of `urlObject.hash` is appended to `result`.
      * * Otherwise, if the `urlObject.hash` property is not `undefined` and is not a
      * string, an `Error` is thrown.
      * * `result` is returned.
      * @since v0.1.25
      * @deprecated Legacy: Use the WHATWG URL API instead.
      * @param urlObject A URL object (as returned by `url.parse()` or constructed otherwise). If a string, it is converted to an object by passing it to `url.parse()`.
      */
    def format(urlObject: URL_): String = js.native
    def format(urlObject: URL_, options: URLFormatOptions): String = js.native
    /**
      * The `url.format()` method returns a formatted URL string derived from`urlObject`.
      *
      * ```js
      * const url = require('url');
      * url.format({
      *   protocol: 'https',
      *   hostname: 'example.com',
      *   pathname: '/some/path',
      *   query: {
      *     page: 1,
      *     format: 'json'
      *   }
      * });
      *
      * // => 'https://example.com/some/path?page=1&#x26;format=json'
      * ```
      *
      * If `urlObject` is not an object or a string, `url.format()` will throw a `TypeError`.
      *
      * The formatting process operates as follows:
      *
      * * A new empty string `result` is created.
      * * If `urlObject.protocol` is a string, it is appended as-is to `result`.
      * * Otherwise, if `urlObject.protocol` is not `undefined` and is not a string, an `Error` is thrown.
      * * For all string values of `urlObject.protocol` that _do not end_ with an ASCII
      * colon (`:`) character, the literal string `:` will be appended to `result`.
      * * If either of the following conditions is true, then the literal string `//`will be appended to `result`:
      *    * `urlObject.slashes` property is true;
      *    * `urlObject.protocol` begins with `http`, `https`, `ftp`, `gopher`, or`file`;
      * * If the value of the `urlObject.auth` property is truthy, and either`urlObject.host` or `urlObject.hostname` are not `undefined`, the value of`urlObject.auth` will be coerced into a string
      * and appended to `result`followed by the literal string `@`.
      * * If the `urlObject.host` property is `undefined` then:
      *    * If the `urlObject.hostname` is a string, it is appended to `result`.
      *    * Otherwise, if `urlObject.hostname` is not `undefined` and is not a string,
      *    an `Error` is thrown.
      *    * If the `urlObject.port` property value is truthy, and `urlObject.hostname`is not `undefined`:
      *          * The literal string `:` is appended to `result`, and
      *          * The value of `urlObject.port` is coerced to a string and appended to`result`.
      * * Otherwise, if the `urlObject.host` property value is truthy, the value of`urlObject.host` is coerced to a string and appended to `result`.
      * * If the `urlObject.pathname` property is a string that is not an empty string:
      *    * If the `urlObject.pathname`_does not start_ with an ASCII forward slash
      *    (`/`), then the literal string `'/'` is appended to `result`.
      *    * The value of `urlObject.pathname` is appended to `result`.
      * * Otherwise, if `urlObject.pathname` is not `undefined` and is not a string, an `Error` is thrown.
      * * If the `urlObject.search` property is `undefined` and if the `urlObject.query`property is an `Object`, the literal string `?` is appended to `result`followed by the output of calling the
      * `querystring` module's `stringify()`method passing the value of `urlObject.query`.
      * * Otherwise, if `urlObject.search` is a string:
      *    * If the value of `urlObject.search`_does not start_ with the ASCII question
      *    mark (`?`) character, the literal string `?` is appended to `result`.
      *    * The value of `urlObject.search` is appended to `result`.
      * * Otherwise, if `urlObject.search` is not `undefined` and is not a string, an `Error` is thrown.
      * * If the `urlObject.hash` property is a string:
      *    * If the value of `urlObject.hash`_does not start_ with the ASCII hash (`#`)
      *    character, the literal string `#` is appended to `result`.
      *    * The value of `urlObject.hash` is appended to `result`.
      * * Otherwise, if the `urlObject.hash` property is not `undefined` and is not a
      * string, an `Error` is thrown.
      * * `result` is returned.
      * @since v0.1.25
      * @deprecated Legacy: Use the WHATWG URL API instead.
      * @param urlObject A URL object (as returned by `url.parse()` or constructed otherwise). If a string, it is converted to an object by passing it to `url.parse()`.
      */
    def format(urlObject: UrlObject): String = js.native
    
    /**
      * The `url.parse()` method takes a URL string, parses it, and returns a URL
      * object.
      *
      * A `TypeError` is thrown if `urlString` is not a string.
      *
      * A `URIError` is thrown if the `auth` property is present but cannot be decoded.
      *
      * Use of the legacy `url.parse()` method is discouraged. Users should
      * use the WHATWG `URL` API. Because the `url.parse()` method uses a
      * lenient, non-standard algorithm for parsing URL strings, security
      * issues can be introduced. Specifically, issues with [host name spoofing](https://hackerone.com/reports/678487) and
      * incorrect handling of usernames and passwords have been identified.
      *
      * Deprecation of this API has been shelved for now primarily due to the the
      * inability of the [WHATWG API to parse relative URLs](https://github.com/nodejs/node/issues/12682#issuecomment-1154492373).
      * [Discussions are ongoing](https://github.com/whatwg/url/issues/531) for the  best way to resolve this.
      *
      * @since v0.1.25
      * @param urlString The URL string to parse.
      * @param [parseQueryString=false] If `true`, the `query` property will always be set to an object returned by the {@link querystring} module's `parse()` method. If `false`, the `query` property
      * on the returned URL object will be an unparsed, undecoded string.
      * @param [slashesDenoteHost=false] If `true`, the first token after the literal string `//` and preceding the next `/` will be interpreted as the `host`. For instance, given `//foo/bar`, the
      * result would be `{host: 'foo', pathname: '/bar'}` rather than `{pathname: '//foo/bar'}`.
      */
    def parse(urlString: String): UrlWithStringQuery = js.native
    def parse(urlString: String, parseQueryString: Boolean): Url = js.native
    def parse(urlString: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
    def parse(urlString: String, parseQueryString: Unit, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
    @JSName("parse")
    def parse_false(urlString: String, parseQueryString: `false`): UrlWithStringQuery = js.native
    @JSName("parse")
    def parse_false(urlString: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
    @JSName("parse")
    def parse_true(urlString: String, parseQueryString: `true`): UrlWithParsedQuery = js.native
    @JSName("parse")
    def parse_true(urlString: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = js.native
    
    /**
      * This function ensures that `path` is resolved absolutely, and that the URL
      * control characters are correctly encoded when converting into a File URL.
      *
      * ```js
      * import { pathToFileURL } from 'url';
      *
      * new URL('/foo#1', 'file:');           // Incorrect: file:///foo#1
      * pathToFileURL('/foo#1');              // Correct:   file:///foo%231 (POSIX)
      *
      * new URL('/some/path%.c', 'file:');    // Incorrect: file:///some/path%.c
      * pathToFileURL('/some/path%.c');       // Correct:   file:///some/path%25.c (POSIX)
      * ```
      * @since v10.12.0
      * @param path The path to convert to a File URL.
      * @return The file URL object.
      */
    def pathToFileURL(path: String): URL_ = js.native
    
    /**
      * The `url.resolve()` method resolves a target URL relative to a base URL in a
      * manner similar to that of a web browser resolving an anchor tag.
      *
      * ```js
      * const url = require('url');
      * url.resolve('/one/two/three', 'four');         // '/one/two/four'
      * url.resolve('http://example.com/', '/one');    // 'http://example.com/one'
      * url.resolve('http://example.com/one', '/two'); // 'http://example.com/two'
      * ```
      *
      * To achieve the same result using the WHATWG URL API:
      *
      * ```js
      * function resolve(from, to) {
      *   const resolvedUrl = new URL(to, new URL(from, 'resolve://'));
      *   if (resolvedUrl.protocol === 'resolve:') {
      *     // `from` is a relative URL.
      *     const { pathname, search, hash } = resolvedUrl;
      *     return pathname + search + hash;
      *   }
      *   return resolvedUrl.toString();
      * }
      *
      * resolve('/one/two/three', 'four');         // '/one/two/four'
      * resolve('http://example.com/', '/one');    // 'http://example.com/one'
      * resolve('http://example.com/one', '/two'); // 'http://example.com/two'
      * ```
      * @since v0.1.25
      * @deprecated Legacy: Use the WHATWG URL API instead.
      * @param from The base URL to use if `to` is a relative URL.
      * @param to The target URL to resolve.
      */
    def resolve(from: String, to: String): String = js.native
    
    /**
      * This utility function converts a URL object into an ordinary options object as
      * expected by the `http.request()` and `https.request()` APIs.
      *
      * ```js
      * import { urlToHttpOptions } from 'url';
      * const myURL = new URL('https://a:b@測試?abc#foo');
      *
      * console.log(urlToHttpOptions(myURL));
      * / *
      * {
      *   protocol: 'https:',
      *   hostname: 'xn--g6w251d',
      *   hash: '#foo',
      *   search: '?abc',
      *   pathname: '/',
      *   path: '/?abc',
      *   href: 'https://a:b@xn--g6w251d/?abc#foo',
      *   auth: 'a:b'
      * }
      *
      * ```
      * @since v15.7.0, v14.18.0
      * @param url The `WHATWG URL` object to convert to an options object.
      * @return Options object
      */
    def urlToHttpOptions(url: URL_): ClientRequestArgs = js.native
  }
}
