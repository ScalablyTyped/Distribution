package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.Time")
@js.native
class Time protected () extends ODataType {
  /**
               * Constructor for an OData primitive type <code>Edm.Time</code>.
               * @param oFormatOptions format options as defined in {@link sap.ui.core.format.DateFormat}
               * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
               * constraint is  violated
              */
  def this(oFormatOptions: js.Any) = this()
  /**
               * Constructor for an OData primitive type <code>Edm.Time</code>.
               * @param oFormatOptions format options as defined in {@link sap.ui.core.format.DateFormat}
               * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
               * constraint is  violated
              */
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
               * Parses the given value, which is expected to be of the given type, to a time object.
               * @param sValue the value to be parsed, maps <code>""</code> to <code>null</code>
               * @param sSourceType the source type (the expected type of <code>sValue</code>); must be "string". 
               * See {@link sap.ui.model.odata.type} for more information.
               * @returns the parsed value as described in {@link #formatValue formatValue}
              */
  def parseValue(sValue: java.lang.String, sSourceType: java.lang.String): js.Any = js.native
}

