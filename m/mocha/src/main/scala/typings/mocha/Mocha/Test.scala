package typings.mocha.Mocha

import org.scalablytyped.runtime.TopLevel
import typings.mocha.mochaStrings.fast
import typings.mocha.mochaStrings.medium
import typings.mocha.mochaStrings.slow
import typings.mocha.mochaStrings.test
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Test` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Test.html
  */
@JSGlobal("Mocha.Test")
@js.native
class Test () extends Runnable {
   // added by reporters
  var err: js.UndefOr[Error] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var `type`: test = js.native
}

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
@JSGlobal("Mocha.test")
@js.native
object test extends TopLevel[TestFunction]

