package typings.mocha.Mocha

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute before running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#before
  */
@JSGlobal("Mocha.suiteSetup")
@js.native
object suiteSetup extends TopLevel[HookFunction]

