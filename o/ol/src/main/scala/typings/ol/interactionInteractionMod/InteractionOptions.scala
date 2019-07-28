package typings.ol.interactionInteractionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionOptions extends js.Object {
  def handleEvent(p0: typings.ol.mapBrowserEventMod.default): Boolean
}

object InteractionOptions {
  @scala.inline
  def apply(handleEvent: typings.ol.mapBrowserEventMod.default => Boolean): InteractionOptions = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[InteractionOptions]
  }
}

