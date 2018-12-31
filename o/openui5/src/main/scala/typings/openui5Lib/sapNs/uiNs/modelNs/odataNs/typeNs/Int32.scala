package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.Int32")
@js.native
class Int32 protected () extends Int {
  /**
    * Constructor for a primitive type <code>Edm.Int32</code>.
    * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
    * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
    * @param oConstraints constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue}
    * throws an  error if any constraint is violated
    */
  def this(oFormatOptions: js.Any) = this()
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
    * Returns the type's supported range as object with properties <code>minimum</code>
    * and<code>maximum</code>.
    * @returns the range
    */
  def getRange(): js.Any = js.native
}

