package typings
package npmDashKeywordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CountDefault extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Anon_Count = js.native
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
  def apply(keyword: java.lang.String): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
  def apply(keyword: java.lang.String, options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
  def apply(keyword: js.Array[java.lang.String]): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
  def apply(
    keyword: js.Array[java.lang.String],
    options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options
  ): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
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
  def count(keyword: java.lang.String): js.Promise[scala.Double] = js.native
  def count(keyword: js.Array[java.lang.String]): js.Promise[scala.Double] = js.native
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
  // TODO: Remove this for the next major release
  def default(keyword: java.lang.String): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
  def default(keyword: java.lang.String, options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
  def default(keyword: js.Array[java.lang.String]): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
  def default(
    keyword: js.Array[java.lang.String],
    options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options
  ): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
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
  def names(keyword: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def names(keyword: java.lang.String, options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options): js.Promise[js.Array[java.lang.String]] = js.native
  def names(keyword: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def names(
    keyword: js.Array[java.lang.String],
    options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options
  ): js.Promise[js.Array[java.lang.String]] = js.native
}

