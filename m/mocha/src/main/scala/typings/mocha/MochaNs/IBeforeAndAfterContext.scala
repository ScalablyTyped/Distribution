package typings.mocha.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.Context` instead. */
@js.native
trait IBeforeAndAfterContext extends IHookCallbackContext {
  /** @deprecated `.currentTest` has type `Mocha.Test` in `Mocha.Context`. */
  var currentTest: js.UndefOr[ITest] = js.native
}

