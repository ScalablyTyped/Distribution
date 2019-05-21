package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expect
  extends NightwatchBrowser
     with NightwatchLanguageChains {
  /**
    * Property that checks if an element is currently enabled.
    */
  var enabled: this.type = js.native
  /**
    * Negates any of assertions following in the chain.
    */
  var not: this.type = js.native
  /**
    * Property that checks if an element is present in the DOM.
    */
  var present: this.type = js.native
  /**
    * Property that checks if an OPTION element, or an INPUT element of type checkbox or radio button is currently selected.
    */
  var selected: this.type = js.native
  /**
    * Property that retrieves the text contained by an element. Can be chained to check if contains/equals/matches the specified text or regex.
    */
  var text: this.type = js.native
  /**
    * Property that retrieves the value (i.e. the value attributed) of an element. Can be chained to check if contains/equals/matches the specified text or regex.
    */
  var value: this.type = js.native
  /**
    * Property that asserts the visibility of a specified element.
    */
  var visible: this.type = js.native
  /**
    * Checks if the type (i.e. tag name) of a specified element is of an expected value.
    */
  def a(value: java.lang.String): this.type = js.native
  def a(value: java.lang.String, message: java.lang.String): this.type = js.native
  def after(value: scala.Double): this.type = js.native
  def an(value: java.lang.String): this.type = js.native
  def an(value: java.lang.String, message: java.lang.String): this.type = js.native
  /**
    * Checks if a given attribute of an element exists and optionally if it has the expected value.
    */
  def attribute(name: java.lang.String): this.type = js.native
  def attribute(name: java.lang.String, message: java.lang.String): this.type = js.native
  /**
    * These methods perform the same thing which is essentially retrying the assertion for the given amount of time (in milliseconds).
    * before or after can be chained to any assertion and thus adding retry capability. You can change the polling interval by defining
    * a waitForConditionPollInterval property (in milliseconds) as a global property in your nightwatch.json or in
    * your external globals file. Similarly, a default timeout can be specified as a global waitForConditionTimeout property (in milliseconds).
    */
  def before(value: scala.Double): this.type = js.native
  def contain(value: java.lang.String): this.type = js.native
  def contains(value: java.lang.String): this.type = js.native
  /**
    * Checks a given css property of an element exists and optionally if it has the expected value.
    */
  def css(property: java.lang.String): this.type = js.native
  def css(property: java.lang.String, message: java.lang.String): this.type = js.native
  /**
    * Returns the DOM Element
    */
  def element(property: java.lang.String): this.type = js.native
  /**
    * These methods will perform assertions on the specified target on the current element.
    * The targets can be an attribute value, the element's inner text and a css property.
    */
  def equal(value: java.lang.String): this.type = js.native
  def equals(value: java.lang.String): this.type = js.native
  def `match`(value: java.lang.String): this.type = js.native
  def `match`(value: stdLib.RegExp): this.type = js.native
}

