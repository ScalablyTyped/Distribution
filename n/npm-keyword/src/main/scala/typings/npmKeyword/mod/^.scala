package typings.npmKeyword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("npm-keyword", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Get a list of npm packages with a certain keyword.
  	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`.
  	@returns A list of packages having the specified keyword in their package.json `keyword` property.
  	@example
  	```
  	import npmKeyword = require('npm-keyword');
  	(async () => {
  		console.log(await npmKeyword('gulpplugin'));
  		//=> [{name: 'gulp-autoprefixer', description: '…'}, …]
  	})();
  	```
  	*/
  def apply(keyword: String): js.Promise[js.Array[PackageDescriptor]] = js.native
  def apply(keyword: String, options: Options): js.Promise[js.Array[PackageDescriptor]] = js.native
  def apply(keyword: js.Array[String]): js.Promise[js.Array[PackageDescriptor]] = js.native
  def apply(keyword: js.Array[String], options: Options): js.Promise[js.Array[PackageDescriptor]] = js.native
  
  /**
  	Get the count of npm packages names with a certain keyword.
  	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`.
  	@returns The count of packages.
  	@example
  	```
  	import npmKeyword = require('npm-keyword');
  	(async () => {
  		console.log(await npmKeyword.count('gulpplugin'));
  		//=> 3457
  	})();
  	```
  	*/
  def count(keyword: String): js.Promise[Double] = js.native
  def count(keyword: js.Array[String]): js.Promise[Double] = js.native
  
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof npmKeyword */ js.Any = js.native
  
  /**
  	Get a list of npm package names with a certain keyword.
  	@param keyword - One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`.
  	@returns A list of package names. Use this if you don't need the description as it's faster.
  	@example
  	```
  	import npmKeyword = require('npm-keyword');
  	(async () => {
  		console.log(await npmKeyword.names('gulpplugin'));
  		//=> ['gulp-autoprefixer', …]
  	})();
  	```
  	*/
  def names(keyword: String): js.Promise[js.Array[String]] = js.native
  def names(keyword: String, options: Options): js.Promise[js.Array[String]] = js.native
  def names(keyword: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def names(keyword: js.Array[String], options: Options): js.Promise[js.Array[String]] = js.native
}
