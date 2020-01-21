package typings.phantomcss.mod._Global_.PhantomCSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhantomCSSTest extends js.Object {
  var error: js.UndefOr[Boolean] = js.undefined
  var fail: js.UndefOr[Boolean] = js.undefined
  var failFile: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var mismatch: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[Boolean] = js.undefined
}

object PhantomCSSTest {
  @scala.inline
  def apply(
    error: js.UndefOr[Boolean] = js.undefined,
    fail: js.UndefOr[Boolean] = js.undefined,
    failFile: String = null,
    filename: String = null,
    mismatch: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): PhantomCSSTest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fail)) __obj.updateDynamic("fail")(fail.asInstanceOf[js.Any])
    if (failFile != null) __obj.updateDynamic("failFile")(failFile.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (mismatch != null) __obj.updateDynamic("mismatch")(mismatch.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhantomCSSTest]
  }
}

