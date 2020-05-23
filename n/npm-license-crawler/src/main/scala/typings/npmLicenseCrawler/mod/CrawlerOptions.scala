package typings.npmLicenseCrawler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerOptions extends js.Object {
  /** export the data as comma-separated values to the given file. The path will be created if it does not exist. */
  var csv: js.UndefOr[String] = js.undefined
  /** show only third-party licenses, i.e., only list the dependencies defined in package.json. */
  var dependencies: js.UndefOr[Boolean] = js.undefined
  /** show only development dependencies */
  var development: js.UndefOr[Boolean] = js.undefined
  /** path to a directory to be excluded (and its subdirectories) from the search. */
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  /** export data as JSON to the given file. The path will be created if it does not exist. */
  var json: js.UndefOr[String] = js.undefined
  /** omit version numbers in result (e.g. "npm-license-crawler@0.1.5" becomes "npm-license-crawler") */
  var omitVersion: js.UndefOr[Boolean] = js.undefined
  /** show only direct dependencies licenses, i.e., don't list dependencies of dependencies. */
  var onlyDirectDependencies: js.UndefOr[Boolean] = js.undefined
  /** show only production dependencies */
  var production: js.UndefOr[Boolean] = js.undefined
  /** output the relative file path for license files. */
  var relativeLicensePath: js.UndefOr[Boolean] = js.undefined
  /** path to the directory the license search should start from. If omitted the current working directory is assumed. */
  var start: String | js.Array[String]
  /** show only licenses that can't be determined or have been guessed. */
  var unknown: js.UndefOr[Boolean] = js.undefined
}

object CrawlerOptions {
  @scala.inline
  def apply(
    start: String | js.Array[String],
    csv: String = null,
    dependencies: js.UndefOr[Boolean] = js.undefined,
    development: js.UndefOr[Boolean] = js.undefined,
    exclude: String | js.Array[String] = null,
    json: String = null,
    omitVersion: js.UndefOr[Boolean] = js.undefined,
    onlyDirectDependencies: js.UndefOr[Boolean] = js.undefined,
    production: js.UndefOr[Boolean] = js.undefined,
    relativeLicensePath: js.UndefOr[Boolean] = js.undefined,
    unknown: js.UndefOr[Boolean] = js.undefined
  ): CrawlerOptions = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (csv != null) __obj.updateDynamic("csv")(csv.asInstanceOf[js.Any])
    if (!js.isUndefined(dependencies)) __obj.updateDynamic("dependencies")(dependencies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(development)) __obj.updateDynamic("development")(development.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(omitVersion)) __obj.updateDynamic("omitVersion")(omitVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyDirectDependencies)) __obj.updateDynamic("onlyDirectDependencies")(onlyDirectDependencies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeLicensePath)) __obj.updateDynamic("relativeLicensePath")(relativeLicensePath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unknown)) __obj.updateDynamic("unknown")(unknown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerOptions]
  }
}

