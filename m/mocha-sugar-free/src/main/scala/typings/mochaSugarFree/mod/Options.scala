package typings.mochaSugarFree.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* option */ StringDictionary[js.Any] {
  /**
    * Whether the context should contain a `done` callback.
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * Set whether timeouts are enabled.
    */
  var enableTimeouts: js.UndefOr[Boolean] = js.native
  /**
    * Whether failing to return a PromiseLike should fail the test.
    */
  var expectPromise: js.UndefOr[Boolean] = js.native
  /**
    * The test function.
    */
  var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.native
  /**
    * Whether the test should be skipped unconditionally.
    */
  var skip: js.UndefOr[Boolean] = js.native
  /**
    * Whether the test should be skipped in a browser environment.
    */
  var skipIfBrowser: js.UndefOr[Boolean] = js.native
  /**
    * Whether the test should be skipped in a WebWorker.
    */
  var skipIfWebWorker: js.UndefOr[Boolean] = js.native
  /**
    * Whether the test should be skipped outside a browser environment.
    */
  var skipUnlessBrowser: js.UndefOr[Boolean] = js.native
  /**
    * Set test slowness threshold.
    */
  var slow: js.UndefOr[String | Double] = js.native
  /**
    * Set test timeout.
    */
  var timeout: js.UndefOr[String | Double] = js.native
  /**
    * The test title. Replaced by the title parameter if present.
    */
  var title: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setEnableTimeouts(value: Boolean): Self = this.set("enableTimeouts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTimeouts: Self = this.set("enableTimeouts", js.undefined)
    @scala.inline
    def setExpectPromise(value: Boolean): Self = this.set("expectPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectPromise: Self = this.set("expectPromise", js.undefined)
    @scala.inline
    def setFn(value: TestCase | TestCaseWithDone | SuiteFunc | HookFunc): Self = this.set("fn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSkipIfBrowser(value: Boolean): Self = this.set("skipIfBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipIfBrowser: Self = this.set("skipIfBrowser", js.undefined)
    @scala.inline
    def setSkipIfWebWorker(value: Boolean): Self = this.set("skipIfWebWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipIfWebWorker: Self = this.set("skipIfWebWorker", js.undefined)
    @scala.inline
    def setSkipUnlessBrowser(value: Boolean): Self = this.set("skipUnlessBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipUnlessBrowser: Self = this.set("skipUnlessBrowser", js.undefined)
    @scala.inline
    def setSlow(value: String | Double): Self = this.set("slow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlow: Self = this.set("slow", js.undefined)
    @scala.inline
    def setTimeout(value: String | Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

