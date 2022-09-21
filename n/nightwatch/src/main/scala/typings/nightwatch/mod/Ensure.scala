package typings.nightwatch.mod

import typings.nightwatch.anon.AwaitableNightwatchAPINig
import typings.seleniumWebdriver.mod.By
import typings.seleniumWebdriver.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ensure extends StObject {
  
  /**
    * Ensures that the Nightwatch WebDriver client is able to switch to the designated frame.
    */
  def ableToSwitchToFrame(frame: Double): AwaitableNightwatchAPINig = js.native
  def ableToSwitchToFrame(frame: By): AwaitableNightwatchAPINig = js.native
  def ableToSwitchToFrame(frame: WebElement): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that waits for an alert to be opened.
    */
  def alertIsPresent(): AwaitableNightwatchAPINig = js.native
  
  def elementIsDisabled(element: String): AwaitableNightwatchAPINig = js.native
  def elementIsDisabled(element: Element): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element to be disabled.
    */
  def elementIsDisabled(element: WebElement): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will wait for the given element to be enabled.
    */
  def elementIsEnabled(element: WebElement): AwaitableNightwatchAPINig = js.native
  
  def elementIsNotSelected(element: String): AwaitableNightwatchAPINig = js.native
  def elementIsNotSelected(element: Element): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element to be deselected.
    */
  def elementIsNotSelected(element: WebElement): AwaitableNightwatchAPINig = js.native
  
  def elementIsNotVisible(element: String): AwaitableNightwatchAPINig = js.native
  def elementIsNotVisible(element: Element): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element to be in the DOM, yet not displayed to the user.
    */
  def elementIsNotVisible(element: WebElement): AwaitableNightwatchAPINig = js.native
  
  def elementIsSelected(element: String): AwaitableNightwatchAPINig = js.native
  def elementIsSelected(element: Element): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element to be selected.
    */
  def elementIsSelected(element: WebElement): AwaitableNightwatchAPINig = js.native
  
  def elementIsVisible(element: String): AwaitableNightwatchAPINig = js.native
  def elementIsVisible(element: Element): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element to be displayed.
    */
  def elementIsVisible(element: WebElement): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will loop until an element is found with the given locator.
    */
  def elementLocated(locator: By): AwaitableNightwatchAPINig = js.native
  
  def elementTextContains(element: String, substr: String): AwaitableNightwatchAPINig = js.native
  def elementTextContains(element: Element, substr: String): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element's text to contain the given substring.
    */
  def elementTextContains(element: WebElement, substr: String): AwaitableNightwatchAPINig = js.native
  
  def elementTextIs(element: String, text: String): AwaitableNightwatchAPINig = js.native
  def elementTextIs(element: Element, text: String): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element's text to equal the given text.
    */
  def elementTextIs(element: WebElement, text: String): AwaitableNightwatchAPINig = js.native
  
  def elementTextMatches(element: String, regex: js.RegExp): AwaitableNightwatchAPINig = js.native
  def elementTextMatches(element: Element, regex: js.RegExp): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element's text to match a given regular expression.
    */
  def elementTextMatches(element: WebElement, regex: js.RegExp): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will loop until at least one element is found with the given locator.
    */
  def elementsLocated(locator: By): AwaitableNightwatchAPINig = js.native
  
  def stalenessOf(element: String): AwaitableNightwatchAPINig = js.native
  def stalenessOf(element: Element): AwaitableNightwatchAPINig = js.native
  /**
    * Creates a condition that will wait for the given element to become stale.
    * An element is considered stale once it is removed from the DOM, or a new page has loaded.
    */
  def stalenessOf(element: WebElement): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will wait for the current page's title to contain the given substring.
    */
  def titleContains(substr: String): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will wait for the current page's title to match the given value.
    */
  def titleIs(title: String): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will wait for the current page's title to match the given regular expression.
    */
  def titleMatches(regex: js.RegExp): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will wait for the current page's url to contain the given substring.
    */
  def urlContains(substrUrl: String): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will wait for the current page's url to match the given value.
    */
  def urlIs(url: String): AwaitableNightwatchAPINig = js.native
  
  /**
    * Creates a condition that will wait for the current page's url to match the given regular expression.
    */
  def urlMatches(regex: js.RegExp): AwaitableNightwatchAPINig = js.native
}
