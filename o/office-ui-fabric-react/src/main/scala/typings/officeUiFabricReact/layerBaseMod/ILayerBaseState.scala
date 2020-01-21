package typings.officeUiFabricReact.layerBaseMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayerBaseState extends js.Object {
  var hostId: js.UndefOr[String] = js.undefined
  var layerElement: js.UndefOr[HTMLElement] = js.undefined
}

object ILayerBaseState {
  @scala.inline
  def apply(hostId: String = null, layerElement: HTMLElement = null): ILayerBaseState = {
    val __obj = js.Dynamic.literal()
    if (hostId != null) __obj.updateDynamic("hostId")(hostId.asInstanceOf[js.Any])
    if (layerElement != null) __obj.updateDynamic("layerElement")(layerElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerBaseState]
  }
}

