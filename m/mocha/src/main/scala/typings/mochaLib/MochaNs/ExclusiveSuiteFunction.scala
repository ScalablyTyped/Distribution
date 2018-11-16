package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusiveSuiteFunction extends js.Object {
  /**
           * [qunit] Describe a "suite" with the given `title`. Indicates this suite should be executed
           * exclusively.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(title: java.lang.String): Suite = js.native
  /**
           * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
           * nested suites. Indicates this suite should be executed exclusively.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(title: java.lang.String, fn: js.ThisFunction0[/* this */ Suite, scala.Unit]): Suite = js.native
}

