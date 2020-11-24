package typings.normalizeUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("normalize-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply(url: String): String = js.native
  def apply(url: String, options: Options): String = js.native
}
