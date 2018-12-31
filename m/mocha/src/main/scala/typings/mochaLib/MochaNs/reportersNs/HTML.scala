package typings
package mochaLib.MochaNs.reportersNs

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
class HTML () extends Base {
  /**
    * Adds code toggle functionality for the provided test's list element.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#addCodeToggle
    */
  def addCodeToggle(el: mochaLib.HTMLLIElement, contents: java.lang.String): scala.Unit = js.native
  /**
    * Provide suite URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#suiteURL
    */
  def suiteURL(suite: mochaLib.MochaNs.Suite): java.lang.String = js.native
  /**
    * Provide test URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
    */
  def testURL(test: mochaLib.MochaNs.Test): java.lang.String = js.native
}

