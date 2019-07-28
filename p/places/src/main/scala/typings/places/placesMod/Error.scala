package typings.places.placesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var message: String
}

object Error {
  @scala.inline
  def apply(message: String): Error = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[Error]
  }
}

