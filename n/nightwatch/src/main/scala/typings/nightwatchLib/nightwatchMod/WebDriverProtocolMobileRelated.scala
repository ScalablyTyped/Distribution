package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolMobileRelated extends js.Object {
  /**
    * Get a list of the available contexts.
    *
    * Used by Appium when testing hybrid mobile web apps. More info here: https://github.com/appium/appium/blob/master/docs/en/advanced-concepts/hybrid.md.
    */
  def contexts(): this.type = js.native
  def contexts(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[_], scala.Unit]
  ): this.type = js.native
  /**
    * Get current context.
    */
  def currentContext(): this.type = js.native
  def currentContext(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[_], scala.Unit]
  ): this.type = js.native
  /**
    * Get the current browser orientation.
    */
  def getOrientation(): this.type = js.native
  def getOrientation(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[
        nightwatchLib.nightwatchLibStrings.LANDSCAPE | nightwatchLib.nightwatchLibStrings.PORTRAIT
      ], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Sets the context.
    */
  def setContext(context: java.lang.String): this.type = js.native
  def setContext(context: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Sets the browser orientation.
    */
  @JSName("setOrientation")
  def setOrientation_LANDSCAPE(orientation: nightwatchLib.nightwatchLibStrings.LANDSCAPE): this.type = js.native
  @JSName("setOrientation")
  def setOrientation_LANDSCAPE(
    orientation: nightwatchLib.nightwatchLibStrings.LANDSCAPE,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("setOrientation")
  def setOrientation_PORTRAIT(orientation: nightwatchLib.nightwatchLibStrings.PORTRAIT): this.type = js.native
  @JSName("setOrientation")
  def setOrientation_PORTRAIT(
    orientation: nightwatchLib.nightwatchLibStrings.PORTRAIT,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
}

