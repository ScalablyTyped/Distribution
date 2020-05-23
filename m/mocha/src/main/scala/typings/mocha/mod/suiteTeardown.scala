package typings.mocha.mod

import org.scalablytyped.runtime.TopLevel
import typings.mocha.Mocha.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute after running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#after
  */
@JSImport("mocha", "suiteTeardown")
@js.native
object suiteTeardown extends TopLevel[HookFunction]

