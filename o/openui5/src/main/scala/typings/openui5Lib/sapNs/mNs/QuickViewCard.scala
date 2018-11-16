package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.QuickViewCard")
@js.native
class QuickViewCard protected () extends QuickViewBase {
  /**
         * Constructor for a new QuickViewCard.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new QuickViewCard.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Gets current value of property <code>showVerticalScrollBar</code>.Determines whether the browser
         * displays the vertical scroll bar or simply cuts the content of the QuickViewCard.Default value is
         * <code>true</code>.
         * @returns Value of property <code>showVerticalScrollBar</code>
        */
  def getShowVerticalScrollBar(): scala.Boolean = js.native
  /**
         * Sets a new value for property <code>showVerticalScrollBar</code>.Determines whether the browser
         * displays the vertical scroll bar or simply cuts the content of the QuickViewCard.When called with a
         * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code>true</code>.
         * @param bShowVerticalScrollBar New value for property <code>showVerticalScrollBar</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setShowVerticalScrollBar(bShowVerticalScrollBar: scala.Boolean): QuickViewCard = js.native
}

