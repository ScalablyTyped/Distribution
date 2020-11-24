package typings.pkgConf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkg-conf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply[ConfigType /* <: Config */](namespace: String): js.Promise[ConfigType with Config] = js.native
  def apply[ConfigType /* <: Config */](namespace: String, options: Options[ConfigType]): js.Promise[ConfigType with Config] = js.native
  
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pkgConf */ js.Any = js.native
  
  /**
  	@param config - The `config` returned from any of the above methods.
  	@returns The filepath to the `package.json` file or `null` when not found.
  	*/
  def filepath(config: Config): String | Null = js.native
  
  /**
  	Same as `pkgConf()`, but runs synchronously.
  	@param namespace - The `package.json` namespace you want.
  	@returns Returns the config.
  	*/
  def sync[ConfigType /* <: Config */](namespace: String): ConfigType with Config = js.native
  def sync[ConfigType /* <: Config */](namespace: String, options: Options[ConfigType]): ConfigType with Config = js.native
}
