package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for interactions.
  */
trait InteractionOptions extends js.Object {
  def handleEvent(event: MapBrowserEvent): Boolean
}

object InteractionOptions {
  @scala.inline
  def apply(handleEvent: MapBrowserEvent => Boolean): InteractionOptions = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[InteractionOptions]
  }
}

