package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolElementState extends js.Object {
  /**
    * Get the value of an element's attribute.
    */
  def elementIdAttribute(id: java.lang.String, attributeName: java.lang.String): this.type = js.native
  def elementIdAttribute(
    id: java.lang.String,
    attributeName: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[java.lang.String | scala.Null], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Retrieve the computed value of the given CSS property of the given element.
    *
    * The CSS property to query should be specified using the CSS property name, not the JavaScript property name (e.g. background-color instead of backgroundColor).
    */
  def elementIdCssProperty(id: java.lang.String, cssPropertyName: java.lang.String): this.type = js.native
  def elementIdCssProperty(
    id: java.lang.String,
    cssPropertyName: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Determine if an element is currently displayed.
    */
  def elementIdDisplayed(id: java.lang.String): this.type = js.native
  def elementIdDisplayed(
    id: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Boolean], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Determine if an element is currently enabled.
    */
  def elementIdEnabled(id: java.lang.String): this.type = js.native
  def elementIdEnabled(
    id: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Boolean], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Retrieve the qualified tag name of the given element.
    */
  def elementIdName(id: java.lang.String): this.type = js.native
  def elementIdName(
    id: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Determine if an OPTION element, or an INPUT element of type checkbox or radio button is currently selected.
    */
  def elementIdSelected(id: java.lang.String): this.type = js.native
  def elementIdSelected(
    id: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Boolean], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Determine an element's size in pixels. The size will be returned as a JSON object with width and height properties.
    */
  def elementIdSize(id: java.lang.String): this.type = js.native
  def elementIdSize(
    id: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[nightwatchLib.Anon_Height], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Returns the visible text for the element.
    */
  def elementIdText(id: java.lang.String): this.type = js.native
  def elementIdText(
    id: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
}

