package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("onsenui", "forceUIWebViewScrollFix")
@js.native
object forceUIWebViewScrollFix extends js.Object {
  /**
    * @param {Boolean} force Enable or disable the fix.
    * @description Applies a fix for iOS UIWebView which prevents scroll events jumping to pages under the top layer. This may visually affect normal scrolling of UIWebView if you open a dialog/menu before the scroll momentum finished. Disabled by default.
    */
  def apply(force: Boolean): Unit = js.native
}

