package typings
package olLib.interactionInteractionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionOptions extends js.Object {
  def handleEvent(param0: olLib.mapBrowserEventMod.default): scala.Boolean
}

object InteractionOptions {
  @scala.inline
  def apply(handleEvent: olLib.mapBrowserEventMod.default => scala.Boolean): InteractionOptions = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[InteractionOptions]
  }
}

