package typings.mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mocha {
  /**
    * Async callback function used for tests and hooks.
    */
  type AsyncFunc = js.ThisFunction0[/* this */ typings.mocha.Mocha.Context, js.Thenable[js.Any]]
  type Done = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  /**
    * Callback function used for tests and hooks.
    */
  type Func = js.ThisFunction1[
    /* this */ typings.mocha.Mocha.Context, 
    /* done */ typings.mocha.Mocha.Done, 
    scala.Unit
  ]
  /** @deprecated use `Mocha.Stats` instead. */
  type IStats = typings.mocha.Mocha.Stats
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites. Indicates this suite should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @returns [bdd] `Suite`
    * @returns [tdd] `void`
    */
  type PendingSuiteFunction = js.Function2[
    /* title */ java.lang.String, 
    /* fn */ js.ThisFunction0[/* this */ typings.mocha.Mocha.Suite, scala.Unit], 
    typings.mocha.Mocha.Suite | scala.Unit
  ]
  type TestInterface = js.Function1[/* suite */ typings.mocha.Mocha.Suite, scala.Unit]
}
