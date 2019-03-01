package typings
package phantomcssLib.phantomcssMod.Global.PhantomCSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhantomCSSTest extends js.Object {
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var fail: js.UndefOr[scala.Boolean] = js.undefined
  var failFile: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var mismatch: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object PhantomCSSTest {
  @scala.inline
  def apply(
    error: js.UndefOr[scala.Boolean] = js.undefined,
    fail: js.UndefOr[scala.Boolean] = js.undefined,
    failFile: java.lang.String = null,
    filename: java.lang.String = null,
    mismatch: js.Any = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
  ): PhantomCSSTest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fail)) __obj.updateDynamic("fail")(fail)
    if (failFile != null) __obj.updateDynamic("failFile")(failFile)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (mismatch != null) __obj.updateDynamic("mismatch")(mismatch)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[PhantomCSSTest]
  }
}

