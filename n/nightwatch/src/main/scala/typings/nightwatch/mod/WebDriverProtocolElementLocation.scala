package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolElementLocation extends StObject {
  
  /**
    * Determine an element's location on the page. The point (0, 0) refers to the upper-left corner of the page.
    *
    * The element's coordinates are returned as a JSON object with x and y properties.
    *
    * @see https://nightwatchjs.org/api/elementIdLocation.html#apimethod-container
    *
    * @deprecated In favour of .getElementRect()
    */
  def elementIdLocation(id: String): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  def elementIdLocation(
    id: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchSizeAndPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchSizeAndPosition] = js.native
  
  /**
    * Determine an element's location on the screen once it has been scrolled into view.
    *
    * @see https://nightwatchjs.org/api/elementIdLocationInView.html#apimethod-container
    *
    * @deprecated
    */
  def elementIdLocationInView(id: String): Awaitable[this.type, NightwatchPosition] = js.native
  def elementIdLocationInView(
    id: String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[NightwatchPosition], 
      Unit
    ]
  ): Awaitable[this.type, NightwatchPosition] = js.native
}
