package typings
package npmDashKeywordLib.npmDashKeywordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-keyword", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Get a list of npm packages with a certain keyword.
    *
    * @param keyword One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`
    * @returns A promise for a list of packages having the specified keyword in their package.json `keyword` property.
    */
  def apply(keyword: java.lang.String | js.Array[java.lang.String]): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
  def apply(
    keyword: java.lang.String | js.Array[java.lang.String],
    options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options
  ): js.Promise[js.Array[npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.PackageDescriptor]] = js.native
  /**
    * @param keyword One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`
    * @returns A promise for the count of packages.
    */
  def count(keyword: java.lang.String): js.Promise[scala.Double] = js.native
  def count(keyword: js.Array[java.lang.String]): js.Promise[scala.Double] = js.native
  /**
    * @param keyword One or more keywords. Only matches packages that have *all* the given keywords. Example: `['string', 'camelcase']`
    * @returns A promise for a list of package names. Use this if you don't need the description as it's faster.
    */
  def names(keyword: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def names(keyword: java.lang.String, options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options): js.Promise[js.Array[java.lang.String]] = js.native
  def names(keyword: js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def names(
    keyword: js.Array[java.lang.String],
    options: npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs.Options
  ): js.Promise[js.Array[java.lang.String]] = js.native
}

