package typings.mocha.Mocha

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
@js.native
trait Test extends Runnable {
   // added by reporters
  var err: js.UndefOr[Error] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var `type`: test = js.native
}

