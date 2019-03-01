package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for interactions.
  */
trait InteractionOptions extends js.Object {
  def handleEvent(event: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean
}

object InteractionOptions {
  @scala.inline
  def apply(handleEvent: js.Function1[openlayersLib.openlayersMod.MapBrowserEvent, scala.Boolean]): InteractionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(handleEvent)
    __obj.asInstanceOf[InteractionOptions]
  }
}

