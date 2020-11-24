package typings.prependHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prepend-http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply(url: String): String = js.native
  def apply(url: String, options: Options): String = js.native
}
