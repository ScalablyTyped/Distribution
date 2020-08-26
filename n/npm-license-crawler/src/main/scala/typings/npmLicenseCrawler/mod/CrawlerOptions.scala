package typings.npmLicenseCrawler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerOptions extends js.Object {
  /** export the data as comma-separated values to the given file. The path will be created if it does not exist. */
  var csv: js.UndefOr[String] = js.native
  /** show only third-party licenses, i.e., only list the dependencies defined in package.json. */
  var dependencies: js.UndefOr[Boolean] = js.native
  /** show only development dependencies */
  var development: js.UndefOr[Boolean] = js.native
  /** path to a directory to be excluded (and its subdirectories) from the search. */
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  /** export data as JSON to the given file. The path will be created if it does not exist. */
  var json: js.UndefOr[String] = js.native
  /** omit version numbers in result (e.g. "npm-license-crawler@0.1.5" becomes "npm-license-crawler") */
  var omitVersion: js.UndefOr[Boolean] = js.native
  /** show only direct dependencies licenses, i.e., don't list dependencies of dependencies. */
  var onlyDirectDependencies: js.UndefOr[Boolean] = js.native
  /** show only production dependencies */
  var production: js.UndefOr[Boolean] = js.native
  /** output the relative file path for license files. */
  var relativeLicensePath: js.UndefOr[Boolean] = js.native
  /** path to the directory the license search should start from. If omitted the current working directory is assumed. */
  var start: String | js.Array[String] = js.native
  /** show only licenses that can't be determined or have been guessed. */
  var unknown: js.UndefOr[Boolean] = js.native
}

object CrawlerOptions {
  @scala.inline
  def apply(start: String | js.Array[String]): CrawlerOptions = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerOptions]
  }
  @scala.inline
  implicit class CrawlerOptionsOps[Self <: CrawlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStartVarargs(value: String*): Self = this.set("start", js.Array(value :_*))
    @scala.inline
    def setStart(value: String | js.Array[String]): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setCsv(value: String): Self = this.set("csv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
    @scala.inline
    def setDependencies(value: Boolean): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDevelopment(value: Boolean): Self = this.set("development", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevelopment: Self = this.set("development", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setOmitVersion(value: Boolean): Self = this.set("omitVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmitVersion: Self = this.set("omitVersion", js.undefined)
    @scala.inline
    def setOnlyDirectDependencies(value: Boolean): Self = this.set("onlyDirectDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyDirectDependencies: Self = this.set("onlyDirectDependencies", js.undefined)
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduction: Self = this.set("production", js.undefined)
    @scala.inline
    def setRelativeLicensePath(value: Boolean): Self = this.set("relativeLicensePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeLicensePath: Self = this.set("relativeLicensePath", js.undefined)
    @scala.inline
    def setUnknown(value: Boolean): Self = this.set("unknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
  
}

