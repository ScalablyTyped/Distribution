package typings.mocha.Mocha_.reporters

import typings.mocha.Mocha_.Suite_
import typings.mocha.Mocha_.Test_
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
@JSGlobal("Mocha.reporters.HTML")
@js.native
class HTML_ () extends Base_ {
  /**
    * Adds code toggle functionality for the provided test's list element.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#addCodeToggle
    */
  def addCodeToggle(el: HTMLLIElement, contents: String): Unit = js.native
  /**
    * Provide suite URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#suiteURL
    */
  def suiteURL(suite: Suite_): String = js.native
  /**
    * Provide test URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
    */
  def testURL(test: Test_): String = js.native
}

