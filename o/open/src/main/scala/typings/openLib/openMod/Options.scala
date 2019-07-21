package typings
package openLib.openMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Specify the app to open the `target` with, or an array with the app and app arguments.
  		The app name is platform dependent. Don't hard code it in reusable modules. For example, Chrome is `google chrome` on macOS, `google-chrome` on Linux and `chrome` on Windows.
  		You may also pass in the app's full path. For example on WSL, this can be `/mnt/c/Program Files (x86)/Google/Chrome/Application/chrome.exe` for the Windows installation of Chrome.
  		*/
  val app: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
  		__macOS only__
  		Do not bring the app to the foreground.
  		@default false
  		*/
  val background: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Wait for the opened app to exit before fulfilling the promise. If `false` it's fulfilled immediately when opening the app.
  		Note that it waits for the app to exit, not just for the window to close.
  		On Windows, you have to explicitly specify an app for it to be able to wait.
  		@default false
  		*/
  @JSName("wait")
  val wait_FOptions: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    app: java.lang.String | js.Array[java.lang.String] = null,
    background: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Options]
  }
}

