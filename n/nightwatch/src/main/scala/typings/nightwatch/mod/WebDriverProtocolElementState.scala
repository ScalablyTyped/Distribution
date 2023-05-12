package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolElementState extends StObject {
  
  /**
    * Get the value of an element's attribute.
    *
    * @see https://nightwatchjs.org/api/elementIdAttribute.html
    */
  def elementIdAttribute(id: String, attributeName: String): Awaitable[this.type, String | Null] = js.native
  def elementIdAttribute(
    id: String,
    attributeName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): Awaitable[this.type, String | Null] = js.native
  
  /**
    * Retrieve the computed value of the given CSS property of the given element.
    *
    * The CSS property to query should be specified using the CSS property name, not the JavaScript property name (e.g. background-color instead of backgroundColor).
    *
    * @see https://nightwatchjs.org/api/elementIdCssProperty.html
    */
  def elementIdCssProperty(id: String, cssPropertyName: String): Awaitable[this.type, String] = js.native
  def elementIdCssProperty(
    id: String,
    cssPropertyName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Determine if an element is currently displayed.
    *
    * @see https://nightwatchjs.org/api/elementIdDisplayed.html#apimethod-container
    */
  def elementIdDisplayed(id: String): Awaitable[this.type, Boolean] = js.native
  def elementIdDisplayed(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    * Determine if an element is currently enabled.
    *
    * @see https://nightwatchjs.org/api/elementIdEnabled.html#apimethod-container
    */
  def elementIdEnabled(id: String): Awaitable[this.type, Boolean] = js.native
  def elementIdEnabled(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    * Retrieve the qualified tag name of the given element.
    *
    * @see https://nightwatchjs.org/api/elementIdName.html#apimethod-container
    */
  def elementIdName(id: String): Awaitable[this.type, String] = js.native
  def elementIdName(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
  
  /**
    * Determine if an OPTION element, or an INPUT element of type checkbox or radio button is currently selected.
    *
    * @see https://nightwatchjs.org/api/elementIdSelected.html#apimethod-container
    */
  def elementIdSelected(id: String): Awaitable[this.type, Boolean] = js.native
  def elementIdSelected(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  
  /**
    * Determine an element's size in pixels. The size will be returned as a JSON object with width and height properties.
    *
    * @see https://nightwatchjs.org/api/elementIdSize.html#apimethod-container
    *
    * @deprecated In favour of .getElementRect()
    */
  def elementIdSize(id: String): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def elementIdSize(
    id: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  
  /**
    * Returns the visible text for the element.
    *
    * @see https://nightwatchjs.org/api/elementIdText.html#apimethod-container
    */
  def elementIdText(id: String): Awaitable[this.type, String] = js.native
  def elementIdText(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): Awaitable[this.type, String] = js.native
}
