package typings
package osDashLocaleLib.osDashLocaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os-locale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Get the system [locale](https://en.wikipedia.org/wiki/Locale_(computer_software)).
  	@returns The locale.
  	@example
  	```
  	import osLocale = require('os-locale');
  	(async () => {
  		console.log(await osLocale());
  		//=> 'en-US'
  	})();
  	```
  	*/
  def apply(): js.Promise[java.lang.String] = js.native
  def apply(options: Options): js.Promise[java.lang.String] = js.native
  /**
  	Synchronously get the system [locale](https://en.wikipedia.org/wiki/Locale_(computer_software)).
  	@returns The locale.
  	*/
  def sync(): java.lang.String = js.native
  def sync(options: Options): java.lang.String = js.native
}

