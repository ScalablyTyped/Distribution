package typings.nightwatch.mod

import typings.nightwatch.nightwatchStrings.LANDSCAPE
import typings.nightwatch.nightwatchStrings.PORTRAIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolMobileRelated extends StObject {
  
  /**
    * Get a list of the available contexts.
    *
    * Used by Appium when testing hybrid mobile web apps. More info here: https://github.com/appium/appium/blob/master/docs/en/advanced-concepts/hybrid.md.
    */
  def contexts(): this.type = js.native
  def contexts(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[_], Unit]
  ): this.type = js.native
  
  /**
    * Get current context.
    */
  def currentContext(): this.type = js.native
  def currentContext(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[_], Unit]
  ): this.type = js.native
  
  /**
    * Get the current browser orientation.
    */
  def getOrientation(): this.type = js.native
  def getOrientation(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[LANDSCAPE | PORTRAIT], 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Sets the context.
    */
  def setContext(context: String): this.type = js.native
  def setContext(context: String, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * Sets the browser orientation.
    */
  @JSName("setOrientation")
  def setOrientation_LANDSCAPE(orientation: LANDSCAPE): this.type = js.native
  @JSName("setOrientation")
  def setOrientation_LANDSCAPE(
    orientation: LANDSCAPE,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
  @JSName("setOrientation")
  def setOrientation_PORTRAIT(orientation: PORTRAIT): this.type = js.native
  @JSName("setOrientation")
  def setOrientation_PORTRAIT(
    orientation: PORTRAIT,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Unit], Unit]
  ): this.type = js.native
}
