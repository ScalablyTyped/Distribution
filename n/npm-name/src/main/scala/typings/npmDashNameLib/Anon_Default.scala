package typings
package npmDashNameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Check whether a package name is available (not registered) on npm.
  	@param name - Name to check.
  	@returns Whether the given name is available.
  	@example
  	```
  	import npmName = require('npm-name');
  	(async () => {
  		console.log(await npmName('chalk'));
  		//=> false
  		try {
  			await npmName('_ABC');
  		} catch (error) {
  			console.log(error.message);
  			// Invalid package name: _ABC
  			// - name cannot start with an underscore
  			// - name can no longer contain capital letters
  		}
  	})();
  	```
  	*/
  def apply(name: java.lang.String): js.Promise[scala.Boolean] = js.native
  def apply(name: java.lang.String, options: npmDashNameLib.npmDashNameMod.Options): js.Promise[scala.Boolean] = js.native
  /**
  	Check whether multiple package names are available (not registered) on npm.
  	@param names - Multiple names to check.
  	@returns A `Map` of name and status.
  	@example
  	```
  	import npmName = require('npm-name');
  	(async () => {
  		const result = await npmName.many(['chalk', '@sindresorhus/is', 'abc123']);
  		console.log(result.get('chalk'));
  		//=> false
  		console.log(result.get('@sindresorhus/is'));
  		//=> false
  		console.log(result.get('abc123'));
  		//=> true
  	})();
  	```
  	*/
  def many[NameType /* <: java.lang.String */](names: js.Array[NameType]): js.Promise[stdLib.Map[NameType, scala.Boolean]] = js.native
  def many[NameType /* <: java.lang.String */](names: js.Array[NameType], options: npmDashNameLib.npmDashNameMod.Options): js.Promise[stdLib.Map[NameType, scala.Boolean]] = js.native
}

