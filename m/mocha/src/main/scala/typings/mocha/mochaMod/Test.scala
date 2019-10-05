package typings.mocha.mochaMod

import org.scalablytyped.runtime.TopLevel
import typings.mocha.Mocha.TestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Test` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Test.html
  */
@JSImport("mocha", "Test")
@js.native
class Test ()
  extends typings.mocha.Mocha.Test

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
@JSImport("mocha", "test")
@js.native
object test extends TopLevel[TestFunction]

