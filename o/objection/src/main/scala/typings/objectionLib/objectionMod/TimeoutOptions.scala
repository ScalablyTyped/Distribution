package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutOptions extends js.Object {
  var cancel: scala.Boolean
}

object TimeoutOptions {
  @scala.inline
  def apply(cancel: scala.Boolean): TimeoutOptions = {
    val __obj = js.Dynamic.literal(cancel = cancel)
  
    __obj.asInstanceOf[TimeoutOptions]
  }
}

