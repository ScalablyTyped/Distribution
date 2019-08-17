package typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerHostDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayerHostProps extends HTMLAttributes[HTMLElement] {
  /**
    * Optional callback to access the ILayerHost interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ILayerHost]] = js.undefined
}

object ILayerHostProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    componentRef: IRefObject[ILayerHost] = null,
    id: String = null
  ): ILayerHostProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ILayerHostProps]
  }
}

