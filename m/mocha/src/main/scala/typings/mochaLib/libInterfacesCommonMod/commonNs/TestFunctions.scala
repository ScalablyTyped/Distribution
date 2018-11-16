package typings
package mochaLib.libInterfacesCommonMod.commonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestFunctions extends js.Object {
  /**
               * Exclusive test-case.
               */
  def only(mocha: mochaLib.Mocha, test: mochaLib.MochaNs.Test): mochaLib.MochaNs.Test
  /**
               * Number of retry attempts
               */
  def retries(n: scala.Double): scala.Unit
  /**
               * Pending test case.
               */
  def skip(title: java.lang.String): scala.Unit
}

