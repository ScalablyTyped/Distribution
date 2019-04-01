package typings
package packageDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  def apply(packageName: java.lang.String): js.Promise[packageDashJsonLib.packageDashJsonMod.packageJsonNs.AbbreviatedMetadata] = js.native
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
  def apply(
    packageName: java.lang.String,
    options: packageDashJsonLib.packageDashJsonMod.packageJsonNs.FullMetadataOptions
  ): js.Promise[packageDashJsonLib.packageDashJsonMod.packageJsonNs.FullMetadata] = js.native
  def apply(
    packageName: java.lang.String,
    options: packageDashJsonLib.packageDashJsonMod.packageJsonNs.Options
  ): js.Promise[packageDashJsonLib.packageDashJsonMod.packageJsonNs.AbbreviatedMetadata] = js.native
}

