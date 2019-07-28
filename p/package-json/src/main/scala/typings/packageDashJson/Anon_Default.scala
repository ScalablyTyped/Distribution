package typings.packageDashJson

import typings.packageDashJson.packageDashJsonMod.AbbreviatedMetadata
import typings.packageDashJson.packageDashJsonMod.FullMetadata
import typings.packageDashJson.packageDashJsonMod.FullMetadataOptions
import typings.packageDashJson.packageDashJsonMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
}

