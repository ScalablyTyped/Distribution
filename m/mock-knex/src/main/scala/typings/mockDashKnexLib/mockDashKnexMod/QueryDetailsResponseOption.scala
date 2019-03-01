package typings
package mockDashKnexLib.mockDashKnexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDetailsResponseOption extends js.Object {
  /**
    * Is this a stream response, defaults to false
    */
  var stream: scala.Boolean
}

object QueryDetailsResponseOption {
  @scala.inline
  def apply(stream: scala.Boolean): QueryDetailsResponseOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[QueryDetailsResponseOption]
  }
}

