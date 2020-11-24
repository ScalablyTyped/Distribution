package typings.mocha.mod

import org.scalablytyped.runtime.TopLevel
import typings.mocha.Mocha.PendingTestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a pending test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
@JSImport("mocha", "xit")
@js.native
object xit extends TopLevel[PendingTestFunction]
