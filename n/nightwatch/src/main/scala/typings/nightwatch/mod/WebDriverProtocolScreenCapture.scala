package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolScreenCapture extends StObject {
  
  /**
    * Take a screenshot of the current page.
    *
    * @example
    * browser.screenshot(true);
    */
  def screenshot(): Awaitable[this.type, String] = js.native
  def screenshot(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  def screenshot(log_screenshot_data: Boolean): Awaitable[this.type, String] = js.native
  def screenshot(
    log_screenshot_data: Boolean,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
}
