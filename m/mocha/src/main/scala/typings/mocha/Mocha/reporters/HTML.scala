package typings.mocha.Mocha.reporters

import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Suite
import typings.mocha.Mocha.Test
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `HTML` reporter.
  *
  * - _This reporter cannot be used on the console._
  *
  * @see https://mochajs.org/api/Mocha.reporters.HTML.html
  */
trait HTML extends Base {
  /**
    * Adds code toggle functionality for the provided test's list element.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#addCodeToggle
    */
  def addCodeToggle(el: HTMLLIElement, contents: String): Unit
  /**
    * Provide suite URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#suiteURL
    */
  def suiteURL(suite: Suite): String
  /**
    * Provide test URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
    */
  def testURL(test: Test): String
}

object HTML {
  @scala.inline
  def apply(
    addCodeToggle: (HTMLLIElement, String) => Unit,
    epilogue: () => Unit,
    failures: js.Array[Test],
    runner: Runner,
    stats: Stats,
    suiteURL: Suite => String,
    testURL: Test => String,
    done: (/* failures */ Double, /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]]) => Unit = null
  ): HTML = {
    val __obj = js.Dynamic.literal(addCodeToggle = js.Any.fromFunction2(addCodeToggle), epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], suiteURL = js.Any.fromFunction1(suiteURL), testURL = js.Any.fromFunction1(testURL))
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction2(done))
    __obj.asInstanceOf[HTML]
  }
}

