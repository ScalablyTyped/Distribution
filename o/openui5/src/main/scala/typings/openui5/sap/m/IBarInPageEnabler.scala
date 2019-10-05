package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.RenderManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.IBarInPageEnabler")
@js.native
class IBarInPageEnabler () extends js.Object {
  /**
    * Adds the sapMBarChildClass to a control.
    * @param oControl undefined
    */
  def addChildClassTo(oControl: Control): Unit = js.native
  /**
    * Renders the tooltip for the given control
    * @param oRM the RenderManager that can be used for writing to the render output buffer.
    * @param oControl an object representation of the control that should be rendered.
    */
  def renderTooltip(oRM: RenderManager, oControl: Control): Unit = js.native
}

