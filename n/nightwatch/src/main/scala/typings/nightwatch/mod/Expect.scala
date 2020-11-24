package typings.nightwatch.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expect
  extends NightwatchAPI
     with NightwatchLanguageChains {
  
  /**
    * Checks if the type (i.e. tag name) of a specified element is of an expected value.
    */
  def a(value: String): this.type = js.native
  def a(value: String, message: String): this.type = js.native
  
  def after(value: Double): this.type = js.native
  
  def an(value: String): this.type = js.native
  def an(value: String, message: String): this.type = js.native
  
  /**
    * Checks if a given attribute of an element exists and optionally if it has the expected value.
    */
  def attribute(name: String): this.type = js.native
  def attribute(name: String, message: String): this.type = js.native
  
  /**
    * These methods perform the same thing which is essentially retrying the assertion for the given amount of time (in milliseconds).
    * before or after can be chained to any assertion and thus adding retry capability. You can change the polling interval by defining
    * a waitForConditionPollInterval property (in milliseconds) as a global property in your nightwatch.json or in
    * your external globals file. Similarly, a default timeout can be specified as a global waitForConditionTimeout property (in milliseconds).
    */
  def before(value: Double): this.type = js.native
  
  def contain(value: String): this.type = js.native
  
  def contains(value: String): this.type = js.native
  
  /**
    * Checks a given css property of an element exists and optionally if it has the expected value.
    */
  def css(property: String): this.type = js.native
  def css(property: String, message: String): this.type = js.native
  
  /**
    * Returns the DOM Element
    */
  def element(property: String): this.type = js.native
  
  /**
    * Property that checks if an element is currently enabled.
    */
  var enabled: this.type = js.native
  
  def endWith(value: String): this.type = js.native
  
  def endsWith(value: String): this.type = js.native
  
  /**
    * These methods will perform assertions on the specified target on the current element.
    * The targets can be an attribute value, the element's inner text and a css property.
    */
  def equal(value: String): this.type = js.native
  
  def equals(value: String): this.type = js.native
  
  def `match`(value: String): this.type = js.native
  def `match`(value: RegExp): this.type = js.native
  
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
  
  def startWith(value: String): this.type = js.native
  
  def startsWith(value: String): this.type = js.native
  
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
}
