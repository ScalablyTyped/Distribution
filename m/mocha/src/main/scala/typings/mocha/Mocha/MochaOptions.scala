package typings.mocha.Mocha

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to Mocha.
  */
@js.native
trait MochaOptions extends js.Object {
  var allowUncaught: js.UndefOr[Boolean] = js.native
  var asyncOnly: js.UndefOr[Boolean] = js.native
  /** bail on the first test failure. */
  var bail: js.UndefOr[Boolean] = js.native
  /** Color TTY output from reporter */
  var color: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Boolean] = js.native
  var forbidOnly: js.UndefOr[Boolean] = js.native
  var forbidPending: js.UndefOr[Boolean] = js.native
  /** display the full stack trace on failure. */
  var fullStackTrace: js.UndefOr[Boolean] = js.native
  var fullTrace: js.UndefOr[Boolean] = js.native
  /** Array of accepted globals. */
  var globals: js.UndefOr[js.Array[String]] = js.native
  /** string or regexp to filter tests with. */
  var grep: js.UndefOr[String | RegExp] = js.native
  /** Enable growl support. */
  var growl: js.UndefOr[Boolean] = js.native
  /** Do not show diffs at all. */
  var hideDiff: js.UndefOr[Boolean] = js.native
  /** ignore global leaks. */
  var ignoreLeaks: js.UndefOr[Boolean] = js.native
  /** Use inline diffs rather than +/-. */
  var inlineDiffs: js.UndefOr[Boolean] = js.native
  /** Max number of worker processes for parallel runs */
  var jobs: js.UndefOr[Double] = js.native
  var noHighlighting: js.UndefOr[Boolean] = js.native
  /** Run job in parallel */
  var parallel: js.UndefOr[Boolean] = js.native
  /**
    * Reporter constructor, built-in reporter name, or reporter module path. Defaults to
    * `"spec"`.
    */
  var reporter: js.UndefOr[String | ReporterConstructor] = js.native
  /** Options to pass to the reporter. */
  var reporterOptions: js.UndefOr[js.Any] = js.native
  /** number of times to retry failed tests. */
  var retries: js.UndefOr[Double] = js.native
  /** Assigns hooks to the root suite */
  var rootHooks: js.UndefOr[js.Any] = js.native
  /** milliseconds to wait before considering a test slow. */
  var slow: js.UndefOr[Double] = js.native
  /** timeout in milliseconds or time string like '1s'. */
  var timeout: js.UndefOr[Double | String] = js.native
  /** Test interfaces ("bdd", "tdd", "exports", etc.). */
  var ui: js.UndefOr[Interface] = js.native
}

object MochaOptions {
  @scala.inline
  def apply(): MochaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaOptions]
  }
  @scala.inline
  implicit class MochaOptionsOps[Self <: MochaOptions] (val x: Self) extends AnyVal {
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
    def setAllowUncaught(value: Boolean): Self = this.set("allowUncaught", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUncaught: Self = this.set("allowUncaught", js.undefined)
    @scala.inline
    def setAsyncOnly(value: Boolean): Self = this.set("asyncOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncOnly: Self = this.set("asyncOnly", js.undefined)
    @scala.inline
    def setBail(value: Boolean): Self = this.set("bail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDelay(value: Boolean): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setForbidOnly(value: Boolean): Self = this.set("forbidOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForbidOnly: Self = this.set("forbidOnly", js.undefined)
    @scala.inline
    def setForbidPending(value: Boolean): Self = this.set("forbidPending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForbidPending: Self = this.set("forbidPending", js.undefined)
    @scala.inline
    def setFullStackTrace(value: Boolean): Self = this.set("fullStackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullStackTrace: Self = this.set("fullStackTrace", js.undefined)
    @scala.inline
    def setFullTrace(value: Boolean): Self = this.set("fullTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTrace: Self = this.set("fullTrace", js.undefined)
    @scala.inline
    def setGlobalsVarargs(value: String*): Self = this.set("globals", js.Array(value :_*))
    @scala.inline
    def setGlobals(value: js.Array[String]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setGrep(value: String | RegExp): Self = this.set("grep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrep: Self = this.set("grep", js.undefined)
    @scala.inline
    def setGrowl(value: Boolean): Self = this.set("growl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowl: Self = this.set("growl", js.undefined)
    @scala.inline
    def setHideDiff(value: Boolean): Self = this.set("hideDiff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDiff: Self = this.set("hideDiff", js.undefined)
    @scala.inline
    def setIgnoreLeaks(value: Boolean): Self = this.set("ignoreLeaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreLeaks: Self = this.set("ignoreLeaks", js.undefined)
    @scala.inline
    def setInlineDiffs(value: Boolean): Self = this.set("inlineDiffs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineDiffs: Self = this.set("inlineDiffs", js.undefined)
    @scala.inline
    def setJobs(value: Double): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    @scala.inline
    def setNoHighlighting(value: Boolean): Self = this.set("noHighlighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoHighlighting: Self = this.set("noHighlighting", js.undefined)
    @scala.inline
    def setParallel(value: Boolean): Self = this.set("parallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    @scala.inline
    def setReporter(value: String | ReporterConstructor): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setReporterOptions(value: js.Any): Self = this.set("reporterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporterOptions: Self = this.set("reporterOptions", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setRootHooks(value: js.Any): Self = this.set("rootHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootHooks: Self = this.set("rootHooks", js.undefined)
    @scala.inline
    def setSlow(value: Double): Self = this.set("slow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlow: Self = this.set("slow", js.undefined)
    @scala.inline
    def setTimeout(value: Double | String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUi(value: Interface): Self = this.set("ui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
  }
  
}

