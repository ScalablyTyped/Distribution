package typings.pkgVersions

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkg-versions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pkgVersions(packageName: string): Promise<Set<string>>;
  // export = pkgVersions;
  @JSName("default")
  var default_Original: AnonDefault = js.native
  /**
  	Get the version numbers of a package from the npm registry.
  	@returns The version numbers.
  	@example
  	```
  	import pkgVersions = require('pkg-versions');
  	(async () => {
  		console.log(await pkgVersions('ava'));
  		//=> {'0.0.3', '0.0.4', …}
  	})();
  	```
  	*/
  def apply(packageName: String): js.Promise[Set[String]] = js.native
  /**
  	Get the version numbers of a package from the npm registry.
  	@returns The version numbers.
  	@example
  	```
  	import pkgVersions = require('pkg-versions');
  	(async () => {
  		console.log(await pkgVersions('ava'));
  		//=> {'0.0.3', '0.0.4', …}
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pkgVersions(packageName: string): Promise<Set<string>>;
  // export = pkgVersions;
  def default(packageName: String): js.Promise[Set[String]] = js.native
}

