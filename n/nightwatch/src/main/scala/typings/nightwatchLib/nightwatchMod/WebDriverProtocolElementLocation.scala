package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolElementLocation extends js.Object {
  /**
    * Determine an element's location on the page. The point (0, 0) refers to the upper-left corner of the page.
    *
    * The element's coordinates are returned as a JSON object with x and y properties.
    */
  def elementIdLocation(id: java.lang.String): this.type = js.native
  def elementIdLocation(
    id: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[nightwatchLib.Anon_X], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Determine an element's location on the screen once it has been scrolled into view.
    */
  def elementIdLocationInView(id: java.lang.String): this.type = js.native
  def elementIdLocationInView(
    id: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[nightwatchLib.Anon_X], 
      scala.Unit
    ]
  ): this.type = js.native
}

