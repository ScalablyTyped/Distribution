package typings.packageDashJson.packageDashJsonMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.packageDashJson.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("package-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	The error thrown when the given package name cannot be found.
  	*/
  var PackageNotFoundError: Instantiable1[/* packageName */ String, PackageNotFoundErrorClass] = js.native
  /**
  	The error thrown when the given package version cannot be found.
  	*/
  var VersionNotFoundError: Instantiable2[/* packageName */ String, /* version */ String, VersionNotFoundErrorClass] = js.native
  // TODO: remove this in the next major version
  @JSName("default")
  var default_Original: Anon_Default = js.native
  def apply(packageName: String): js.Promise[AbbreviatedMetadata] = js.native
  /**
  	Get metadata of a package from the npm registry.
  	@param packageName - Name of the package.
  	@example
  	```
  	import packageJson = require('package-json');
  	(async () => {
  		console.log(await packageJson('ava'));
  		//=> {name: 'ava', ...}
  		// Also works with scoped packages
  		console.log(await packageJson('@sindresorhus/df'));
  	})();
  	```
  	*/
  def apply(packageName: String, options: FullMetadataOptions): js.Promise[FullMetadata] = js.native
  def apply(packageName: String, options: Options): js.Promise[AbbreviatedMetadata] = js.native
  // TODO: remove this in the next major version
  def default(packageName: String): js.Promise[AbbreviatedMetadata] = js.native
  /**
  	Get metadata of a package from the npm registry.
  	@param packageName - Name of the package.
  	@example
  	```
  	import packageJson = require('package-json');
  	(async () => {
  		console.log(await packageJson('ava'));
  		//=> {name: 'ava', ...}
  		// Also works with scoped packages
  		console.log(await packageJson('@sindresorhus/df'));
  	})();
  	```
  	*/
  // TODO: remove this in the next major version
  def default(packageName: String, options: FullMetadataOptions): js.Promise[FullMetadata] = js.native
  def default(packageName: String, options: Options): js.Promise[AbbreviatedMetadata] = js.native
}

