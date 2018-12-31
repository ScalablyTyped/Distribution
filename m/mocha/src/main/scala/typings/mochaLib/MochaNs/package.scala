package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MochaNs {
  /**
    * Async callback function used for tests and hooks.
    */
  type AsyncFunc = js.ThisFunction0[/* this */ Context, js.Thenable[js.Any]]
  type Done = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  /**
    * Callback function used for tests and hooks.
    */
  type Func = js.ThisFunction1[/* this */ Context, /* done */ Done, scala.Unit]
  /** @deprecated use `Mocha.Stats` instead. */
  type IStats = Stats
  type Interface = mochaLib.mochaLibStrings.bdd | mochaLib.mochaLibStrings.tdd | mochaLib.mochaLibStrings.qunit | mochaLib.mochaLibStrings.exports
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
    /* fn */ js.ThisFunction0[/* this */ Suite, scala.Unit], 
    Suite | scala.Unit
  ]
  type Reporter = mochaLib.mochaLibStrings.Base | mochaLib.mochaLibStrings.base | mochaLib.mochaLibStrings.Dot | mochaLib.mochaLibStrings.dot | mochaLib.mochaLibStrings.TAP | mochaLib.mochaLibStrings.tap | mochaLib.mochaLibStrings.JSON | mochaLib.mochaLibStrings.json | mochaLib.mochaLibStrings.HTML | mochaLib.mochaLibStrings.html | mochaLib.mochaLibStrings.List | mochaLib.mochaLibStrings.list | mochaLib.mochaLibStrings.Min | mochaLib.mochaLibStrings.min | mochaLib.mochaLibStrings.Spec | mochaLib.mochaLibStrings.spec | mochaLib.mochaLibStrings.Nyan | mochaLib.mochaLibStrings.nyan | mochaLib.mochaLibStrings.XUnit | mochaLib.mochaLibStrings.xunit | mochaLib.mochaLibStrings.Markdown | mochaLib.mochaLibStrings.markdown | mochaLib.mochaLibStrings.Progress | mochaLib.mochaLibStrings.progress | mochaLib.mochaLibStrings.Landing | mochaLib.mochaLibStrings.landing | mochaLib.mochaLibStrings.JSONStream | mochaLib.mochaLibStrings.`json-stream`
  type TestInterface = js.Function1[/* suite */ Suite, scala.Unit]
}
