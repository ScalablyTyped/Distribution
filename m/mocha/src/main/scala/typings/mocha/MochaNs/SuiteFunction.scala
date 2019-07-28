package typings.mocha.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuiteFunction extends js.Object {
  /**
    * [bdd, tdd, qunit] Indicates this suite should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("only")
  var only_Original: ExclusiveSuiteFunction = js.native
  /**
    * [bdd, tdd] Indicates this suite should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("skip")
  var skip_Original: PendingSuiteFunction = js.native
  /**
    * [qunit] Describe a "suite" with the given `title`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(title: String): Suite = js.native
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
  /**
    * [qunit] Describe a "suite" with the given `title`. Indicates this suite should be executed
    * exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * [bdd, tdd, qunit] Indicates this suite should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def only(title: String): Suite = js.native
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites. Indicates this suite should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * [bdd, tdd, qunit] Indicates this suite should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def only(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
  /**
    * [bdd, tdd] Indicates this suite should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def skip(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
}

