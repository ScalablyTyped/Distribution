package typings.normalizeUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("normalize-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function normalizeUrl(url: string, options?: normalizeUrl.Options): string;
  // export = normalizeUrl;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof normalizeUrl */ js.Any = js.native
  /**
  	[Normalize](https://en.wikipedia.org/wiki/URL_normalization) a URL.
  	@param url - URL to normalize, including [data URL](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs).
  	@example
  	```
  	import normalizeUrl = require('normalize-url');
  	normalizeUrl('sindresorhus.com');
  	//=> 'http://sindresorhus.com'
  	normalizeUrl('HTTP://xn--xample-hva.com:80/?b=bar&a=foo');
  	//=> 'http://êxample.com/?a=foo&b=bar'
  	```
  	*/
  def apply(url: String): String = js.native
  def apply(url: String, options: Options): String = js.native
}

