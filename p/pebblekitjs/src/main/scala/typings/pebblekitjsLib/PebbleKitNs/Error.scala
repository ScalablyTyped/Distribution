package typings
package pebblekitjsLib.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var message: java.lang.String
}

object Error {
  @scala.inline
  def apply(message: java.lang.String): Error = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[Error]
  }
}

