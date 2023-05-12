package typings.nightwatch.mod

import typings.nightwatch.nightwatchStrings.LANDSCAPE
import typings.nightwatch.nightwatchStrings.PORTRAIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolMobileRelated extends StObject {
  
  /**
    * Get a list of the available contexts.
    *
    * @example
    * browser.contexts();
    *
    * Used by Appium when testing hybrid mobile web apps. More info here: https://github.com/appium/appium/blob/master/docs/en/advanced-concepts/hybrid.md.
    */
  def contexts(): Awaitable[this.type, js.Array[String]] = js.native
  def contexts(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[String]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[String]] = js.native
  
  /**
    * Get current context.
    *
    * @example
    * browser.currentContext();
    */
  def currentContext(): Awaitable[this.type, String | Null] = js.native
  def currentContext(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): Awaitable[this.type, String | Null] = js.native
  
  /**
    * Get the current browser orientation.
    *
    * @example
    * browser.getOrientation()
    */
  def getOrientation(): Awaitable[this.type, LANDSCAPE | PORTRAIT] = js.native
  def getOrientation(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
      Unit
    ]
  ): Awaitable[this.type, LANDSCAPE | PORTRAIT] = js.native
  
  /**
    * Sets the context.
    *
    * @example
    * browser.setContext(context);
    */
  def setContext(context: String): Awaitable[this.type, Null] = js.native
  def setContext(
    context: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  
  /**
    * Sets the browser orientation.
    *
    * @example
    * browser.setOrientation(orientation)
    */
  def setOrientation(orientation: LANDSCAPE | PORTRAIT): Awaitable[this.type, LANDSCAPE | PORTRAIT] = js.native
  def setOrientation(
    orientation: LANDSCAPE | PORTRAIT,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
      Unit
    ]
  ): Awaitable[this.type, LANDSCAPE | PORTRAIT] = js.native
}
