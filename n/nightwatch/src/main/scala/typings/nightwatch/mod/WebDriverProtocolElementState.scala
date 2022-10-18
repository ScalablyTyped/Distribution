package typings.nightwatch.mod

import typings.nightwatch.anon.HeightWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolElementState extends StObject {
  
  /**
    * Get the value of an element's attribute.
    */
  def elementIdAttribute(id: String, attributeName: String): this.type = js.native
  def elementIdAttribute(
    id: String,
    attributeName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String | Null], Unit]
  ): this.type = js.native
  
  /**
    * Retrieve the computed value of the given CSS property of the given element.
    *
    * The CSS property to query should be specified using the CSS property name, not the JavaScript property name (e.g. background-color instead of backgroundColor).
    */
  def elementIdCssProperty(id: String, cssPropertyName: String): this.type = js.native
  def elementIdCssProperty(
    id: String,
    cssPropertyName: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  
  /**
    * Determine if an element is currently displayed.
    */
  def elementIdDisplayed(id: String): this.type = js.native
  def elementIdDisplayed(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): this.type = js.native
  
  /**
    * Determine if an element is currently enabled.
    */
  def elementIdEnabled(id: String): this.type = js.native
  def elementIdEnabled(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): this.type = js.native
  
  /**
    * Retrieve the qualified tag name of the given element.
    */
  def elementIdName(id: String): this.type = js.native
  def elementIdName(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
  
  /**
    * Determine if an OPTION element, or an INPUT element of type checkbox or radio button is currently selected.
    */
  def elementIdSelected(id: String): this.type = js.native
  def elementIdSelected(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): this.type = js.native
  
  /**
    * Determine an element's size in pixels. The size will be returned as a JSON object with width and height properties.
    */
  def elementIdSize(id: String): this.type = js.native
  def elementIdSize(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[HeightWidth], Unit]
  ): this.type = js.native
  
  /**
    * Returns the visible text for the element.
    */
  def elementIdText(id: String): this.type = js.native
  def elementIdText(
    id: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
}
