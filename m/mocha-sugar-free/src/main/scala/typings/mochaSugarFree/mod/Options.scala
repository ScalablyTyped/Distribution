package typings.mochaSugarFree.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* option */ StringDictionary[js.Any] {
  /**
    * Whether the context should contain a `done` callback.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * Set whether timeouts are enabled.
    */
  var enableTimeouts: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether failing to return a PromiseLike should fail the test.
    */
  var expectPromise: js.UndefOr[Boolean] = js.undefined
  /**
    * The test function.
    */
  var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.undefined
  /**
    * Whether the test should be skipped unconditionally.
    */
  var skip: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the test should be skipped in a browser environment.
    */
  var skipIfBrowser: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the test should be skipped in a WebWorker.
    */
  var skipIfWebWorker: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the test should be skipped outside a browser environment.
    */
  var skipUnlessBrowser: js.UndefOr[Boolean] = js.undefined
  /**
    * Set test slowness threshold.
    */
  var slow: js.UndefOr[String | Double] = js.undefined
  /**
    * Set test timeout.
    */
  var timeout: js.UndefOr[String | Double] = js.undefined
  /**
    * The test title. Replaced by the title parameter if present.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    enableTimeouts: js.UndefOr[Boolean] = js.undefined,
    expectPromise: js.UndefOr[Boolean] = js.undefined,
    fn: TestCase | TestCaseWithDone | SuiteFunc | HookFunc = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    skipIfBrowser: js.UndefOr[Boolean] = js.undefined,
    skipIfWebWorker: js.UndefOr[Boolean] = js.undefined,
    skipUnlessBrowser: js.UndefOr[Boolean] = js.undefined,
    slow: String | Double = null,
    timeout: String | Double = null,
    title: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTimeouts)) __obj.updateDynamic("enableTimeouts")(enableTimeouts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expectPromise)) __obj.updateDynamic("expectPromise")(expectPromise.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfBrowser)) __obj.updateDynamic("skipIfBrowser")(skipIfBrowser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfWebWorker)) __obj.updateDynamic("skipIfWebWorker")(skipIfWebWorker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnlessBrowser)) __obj.updateDynamic("skipUnlessBrowser")(skipUnlessBrowser.get.asInstanceOf[js.Any])
    if (slow != null) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

