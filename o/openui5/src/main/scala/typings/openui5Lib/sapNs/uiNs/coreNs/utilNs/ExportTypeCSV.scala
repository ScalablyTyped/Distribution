package typings
package openui5Lib.sapNs.uiNs.coreNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.ExportTypeCSV")
@js.native
class ExportTypeCSV protected () extends ExportType {
  /**
    * Constructor for a new ExportTypeCSV.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>separatorChar</code>.Separator char.Value needs to be exactly
    * one character or empty for default.Default value is <code>,</code>.
    * @returns Value of property <code>separatorChar</code>
    */
  def getSeparatorChar(): java.lang.String = js.native
  /**
    * Setter for property <code>separatorChar</code>.Value needs to be exactly one character or empty for
    * default. Default value is ','.
    * @param sSeparatorChar new value for property <code>separatorChar</code>
    * @returns <code>this</code> to allow method chaining
    */
  def setSeparatorChar(sSeparatorChar: java.lang.String): ExportTypeCSV = js.native
}

