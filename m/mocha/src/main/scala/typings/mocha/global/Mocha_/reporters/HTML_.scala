package typings.mocha.global.Mocha_.reporters

import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Suite
import typings.mocha.Mocha.Test
import typings.mocha.Mocha.reporters.HTML
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
class HTML_ () extends HTML {
  /**
    * Test failures
    */
  /* CompleteClass */
  override var failures: js.Array[Test] = js.native
  /**
    * The configured runner
    */
  /* CompleteClass */
  override var runner: Runner = js.native
  /**
    * Test run statistics
    */
  /* CompleteClass */
  override var stats: Stats = js.native
  /**
    * Adds code toggle functionality for the provided test's list element.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#addCodeToggle
    */
  /* CompleteClass */
  override def addCodeToggle(el: HTMLLIElement, contents: String): Unit = js.native
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  /* CompleteClass */
  override def epilogue(): Unit = js.native
  /**
    * Provide suite URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#suiteURL
    */
  /* CompleteClass */
  override def suiteURL(suite: Suite): String = js.native
  /**
    * Provide test URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
    */
  /* CompleteClass */
  override def testURL(test: Test): String = js.native
}

