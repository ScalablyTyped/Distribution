package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.OverflowToolbar")
@js.native
class OverflowToolbar protected () extends Toolbar {
  /**
    * Constructor for a new Overflow ToolbarAccepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Closes the overflow area.Useful to manually close the overflow after having suppressed automatic
    * closing with "closeOverflowOnInteraction=false".
    * @since 1.40
    */
  def closeOverflow(): Unit = js.native
}

