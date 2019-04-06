package typings
package pkgDashConfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Config extends js.Object {
  /**
  	It [walks up](https://github.com/sindresorhus/find-up) parent directories until a `package.json` can be found, reads it, and returns the user specified namespace or an empty object if not found.
  	@param namespace - The `package.json` namespace you want.
  	@returns A `Promise` for the config.
  	@example
  	```
  	// {
  	// 	"name": "some-package",
  	// 	"version": "1.0.0",
  	// 	"unicorn": {
  	// 		"rainbow": true
  	// 	}
  	// }
  	import pkgConf = require('pkg-conf');
  	(async () => {
  		const config = await pkgConf('unicorn');
  		console.log(config.rainbow);
  		//=> true
  	})();
  	```
  	*/
  def apply[ConfigType /* <: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config */](namespace: java.lang.String): js.Promise[ConfigType with pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config] = js.native
  def apply[ConfigType /* <: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config */](namespace: java.lang.String, options: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Options[ConfigType]): js.Promise[ConfigType with pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config] = js.native
  /**
  	@param config - The `config` returned from any of the above methods.
  	@returns The filepath to the `package.json` file or `null` when not found.
  	*/
  def filepath(config: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config): java.lang.String | scala.Null = js.native
  /**
  	Same as `pkgConf()`, but runs synchronously.
  	@param namespace - The `package.json` namespace you want.
  	@returns Returns the config.
  	*/
  def sync[ConfigType /* <: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config */](namespace: java.lang.String): ConfigType with pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config = js.native
  def sync[ConfigType /* <: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config */](namespace: java.lang.String, options: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Options[ConfigType]): ConfigType with pkgDashConfLib.pkgDashConfMod.pkgConfNs.Config = js.native
}

