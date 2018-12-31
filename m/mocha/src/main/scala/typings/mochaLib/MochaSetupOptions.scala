package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to `mocha.setup` in the browser.
  */
trait MochaSetupOptions
  extends mochaLib.MochaNs.MochaOptions {
  var fullTrace: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated This is not used by Mocha. Use `files` instead. */
  var require: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

