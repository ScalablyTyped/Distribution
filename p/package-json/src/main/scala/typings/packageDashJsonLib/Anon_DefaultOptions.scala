package typings
package packageDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultOptions extends js.Object {
  /**
  	The error thrown when the given package name cannot be found.
  	*/
  var PackageNotFoundError: org.scalablytyped.runtime.Instantiable1[
    /* packageName */ java.lang.String, 
    packageDashJsonLib.packageDashJsonMod.PackageNotFoundErrorClass
  ] = js.native
  /**
  	The error thrown when the given package version cannot be found.
  	*/
  var VersionNotFoundError: org.scalablytyped.runtime.Instantiable2[
    /* packageName */ java.lang.String, 
    /* version */ java.lang.String, 
    packageDashJsonLib.packageDashJsonMod.VersionNotFoundErrorClass
  ] = js.native
  // TODO: remove this in the next major version
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  // TODO: remove this in the next major version
  def default(packageName: java.lang.String): js.Promise[packageDashJsonLib.packageDashJsonMod.packageJsonNs.AbbreviatedMetadata] = js.native
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
  def default(
    packageName: java.lang.String,
    options: packageDashJsonLib.packageDashJsonMod.packageJsonNs.FullMetadataOptions
  ): js.Promise[packageDashJsonLib.packageDashJsonMod.packageJsonNs.FullMetadata] = js.native
  def default(
    packageName: java.lang.String,
    options: packageDashJsonLib.packageDashJsonMod.packageJsonNs.Options
  ): js.Promise[packageDashJsonLib.packageDashJsonMod.packageJsonNs.AbbreviatedMetadata] = js.native
}

