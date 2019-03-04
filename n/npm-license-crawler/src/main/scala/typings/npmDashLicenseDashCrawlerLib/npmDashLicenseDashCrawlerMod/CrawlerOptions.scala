package typings
package npmDashLicenseDashCrawlerLib.npmDashLicenseDashCrawlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerOptions extends js.Object {
  /** export the data as comma-separated values to the given file. The path will be created if it does not exist. */
  var csv: js.UndefOr[java.lang.String] = js.undefined
  /** show only third-party licenses, i.e., only list the dependencies defined in package.json. */
  var dependencies: js.UndefOr[scala.Boolean] = js.undefined
  /** show only development dependencies */
  var development: js.UndefOr[scala.Boolean] = js.undefined
  /** path to a directory to be excluded (and its subdirectories) from the search. */
  var exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** export data as JSON to the given file. The path will be created if it does not exist. */
  var json: js.UndefOr[java.lang.String] = js.undefined
  /** omit version numbers in result (e.g. "npm-license-crawler@0.1.5" becomes "npm-license-crawler") */
  var omitVersion: js.UndefOr[scala.Boolean] = js.undefined
  /** show only direct dependencies licenses, i.e., don't list dependencies of dependencies. */
  var onlyDirectDependencies: js.UndefOr[scala.Boolean] = js.undefined
  /** show only production dependencies */
  var production: js.UndefOr[scala.Boolean] = js.undefined
  /** output the relative file path for license files. */
  var relativeLicensePath: js.UndefOr[scala.Boolean] = js.undefined
  /** path to the directory the license search should start from. If omitted the current working directory is assumed. */
  var start: java.lang.String | js.Array[java.lang.String]
  /** show only licenses that can't be determined or have been guessed. */
  var unknown: js.UndefOr[scala.Boolean] = js.undefined
}

object CrawlerOptions {
  @scala.inline
  def apply(
    start: java.lang.String | js.Array[java.lang.String],
    csv: java.lang.String = null,
    dependencies: js.UndefOr[scala.Boolean] = js.undefined,
    development: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: java.lang.String | js.Array[java.lang.String] = null,
    json: java.lang.String = null,
    omitVersion: js.UndefOr[scala.Boolean] = js.undefined,
    onlyDirectDependencies: js.UndefOr[scala.Boolean] = js.undefined,
    production: js.UndefOr[scala.Boolean] = js.undefined,
    relativeLicensePath: js.UndefOr[scala.Boolean] = js.undefined,
    unknown: js.UndefOr[scala.Boolean] = js.undefined
  ): CrawlerOptions = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (csv != null) __obj.updateDynamic("csv")(csv)
    if (!js.isUndefined(dependencies)) __obj.updateDynamic("dependencies")(dependencies)
    if (!js.isUndefined(development)) __obj.updateDynamic("development")(development)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json)
    if (!js.isUndefined(omitVersion)) __obj.updateDynamic("omitVersion")(omitVersion)
    if (!js.isUndefined(onlyDirectDependencies)) __obj.updateDynamic("onlyDirectDependencies")(onlyDirectDependencies)
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production)
    if (!js.isUndefined(relativeLicensePath)) __obj.updateDynamic("relativeLicensePath")(relativeLicensePath)
    if (!js.isUndefined(unknown)) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[CrawlerOptions]
  }
}

