package typings.mockKnex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDetailsResponseOption extends js.Object {
  /**
    * Is this a stream response, defaults to false
    */
  var stream: Boolean
}

object QueryDetailsResponseOption {
  @scala.inline
  def apply(stream: Boolean): QueryDetailsResponseOption = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryDetailsResponseOption]
  }
}

