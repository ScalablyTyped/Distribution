package typings
package npmDashNameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Check whether a package/organization name is available (not registered) on npm.
  	An organization name should start with `@` and should not be a scoped package.
  	@param name - Name to check.
  	@returns Whether the given name is available.
  	@example
  	```
  	import npmName = require('npm-name');
  	(async () => {
  		// Check a package name
  		console.log(await npmName('chalk'));
  		//=> false
  		// Check an organization name
  		console.log(await npmName('@ava'));
  		//=> false
  		console.log(await npmName('@abc123'));
  		//=> true
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
  	Check whether multiple package/organization names are available (not registered) on npm.
  	An organization name should start with `@` and should not be a scoped package.
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

