package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ObjectMarker")
@js.native
class ObjectMarker protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new ObjectMarker.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new ObjectMarker.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Fires event <code>press</code> to attached listeners.
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def firePress(mArguments: js.Any): ObjectMarker = js.native
  /**
         * Gets current value of property <code>type</code>.Sets one of the predefined types.<br><b>Note</b>:
         * If the <code>visibility</code> property is not specified explicitly, every <code>type</code> comes
         * with predefined one as follows:<ul>                <li>For <code>Flagged</code> and
         * <code>Favorite</code> the icon is visible and the text is not displayed</li>                <li>For
         * <code>Draft</code> the text is visible and the icon is not displayed</li>                <li>For
         * <code>Locked</code> and <code>Unsaved</code> - on screens larger than 600px both icon and text are
         * visible, otherwise only the icon</li></ul>
         * @returns Value of property <code>type</code>
        */
  def getType(): ObjectMarkerType = js.native
  /**
         * Gets current value of property <code>visibility</code>.Sets one of the visibility states.Visibility
         * states are as follows:<ul>                <li><code>IconOnly</code> - displays only icon, regardless
         * of the screen size</li>                <li><code>TextOnly</code> - displays only text, regardless of
         * the screen size</li>                <li><code>IconAndText</code> - displays both icon and text,
         * regardless of the screen size</li></ul>
         * @returns Value of property <code>visibility</code>
        */
  def getVisibility(): ObjectMarkerVisibility = js.native
}

