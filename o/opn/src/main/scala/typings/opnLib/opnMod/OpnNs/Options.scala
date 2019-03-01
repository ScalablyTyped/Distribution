package typings
package opnLib.opnMod.OpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Specify the app to open the `target` with, or an array with the app and app arguments.
    * The app name is platform dependent. Don't hard code it in reusable modules.
    * Eg. Chrome is `google chrome` on OS X, `google-chrome` on Linux and `chrome` on Windows.
    */
  var app: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Wait for the opened app to exit before fulfilling the promise.
    * If `false` it's fulfilled immediately when opening the app.
    * On Windows you have to explicitly specify an app for it to be able to wait.
    * Defaults to `true`.
    */
  @JSName("wait")
  var wait_FOptions: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    app: java.lang.String | js.Array[java.lang.String] = null,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Options]
  }
}

