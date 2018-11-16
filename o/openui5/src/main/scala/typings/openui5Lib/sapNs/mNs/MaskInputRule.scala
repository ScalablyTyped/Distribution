package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.MaskInputRule")
@js.native
class MaskInputRule protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
         * Constructor for a new MaskInputRule.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new MaskInputRule.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Gets current value of property <code>maskFormatSymbol</code>.Defines the symbol used in the mask
         * format which will accept a certain range of characters.Default value is <code>*</code>.
         * @returns Value of property <code>maskFormatSymbol</code>
        */
  def getMaskFormatSymbol(): java.lang.String = js.native
  /**
         * Gets current value of property <code>regex</code>.Defines the allowed characters as a regular
         * expression.Default value is <code>[a-zA-Z0-9]</code>.
         * @returns Value of property <code>regex</code>
        */
  def getRegex(): java.lang.String = js.native
}

