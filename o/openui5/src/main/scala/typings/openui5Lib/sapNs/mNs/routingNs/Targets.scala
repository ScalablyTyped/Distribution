package typings
package openui5Lib.sapNs.mNs.routingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.routing.Targets")
@js.native
class Targets protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.routingNs.Targets {
  /**
    * Provides a convenient way for placing views into the correct containers of your application.The
    * mobile extension of Targets also handles the triggering of page navigation when the target control
    * is a {@link sap.m.SplitContainer}, a {@link sap.m.NavContainer} or a control which extends one of
    * these.Other controls are also allowed, but the extra parameters viewLevel, transition and
    * transitionParameters are ignored and it will behave like {@link sap.ui.core.routing.Targets}.When a
    * target is displayed, dialogs will be closed. To change this use {@link #getTargetHandler} and {@link
    * sap.m.routing.TargetHandler#setCloseDialogs}.
    * @param oOptions undefined
    */
  def this(oOptions: js.Any) = this()
  /**
    * Returns the TargetHandler instance.
    * @returns the TargetHandler instance
    */
  def getTargetHandler(): TargetHandler = js.native
}

