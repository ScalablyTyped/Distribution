package typings.mocha.Mocha.reporters

import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Suite
import typings.mocha.Mocha.Test
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialize a new `HTML` reporter.
  *
  * - _This reporter cannot be used on the console._
  *
  * @see https://mochajs.org/api/Mocha.reporters.HTML.html
  */
@js.native
trait HTML extends Base {
  
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
  def suiteURL(suite: Suite): String = js.native
  
  /**
    * Provide test URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
    */
  def testURL(test: Test): String = js.native
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
    testURL: Test => String
  ): HTML = {
    val __obj = js.Dynamic.literal(addCodeToggle = js.Any.fromFunction2(addCodeToggle), epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], suiteURL = js.Any.fromFunction1(suiteURL), testURL = js.Any.fromFunction1(testURL))
    __obj.asInstanceOf[HTML]
  }
  
  @scala.inline
  implicit class HTMLOps[Self <: HTML] (val x: Self) extends AnyVal {
    
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
    def setAddCodeToggle(value: (HTMLLIElement, String) => Unit): Self = this.set("addCodeToggle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuiteURL(value: Suite => String): Self = this.set("suiteURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTestURL(value: Test => String): Self = this.set("testURL", js.Any.fromFunction1(value))
  }
}
