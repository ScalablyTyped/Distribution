package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.DateTimeOffset")
@js.native
class DateTimeOffset protected () extends DateTimeBase {
  /**
               * Constructor for a primitive type <code>Edm.DateTimeOffset</code>.
               * @param oFormatOptions Format options as defined in {@link sap.ui.core.format.DateFormat}
               * @param oConstraints Constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue
               * validateValue}  throws an error if any constraint is violated
              */
  def this(oFormatOptions: js.Any) = this()
  /**
               * Constructor for a primitive type <code>Edm.DateTimeOffset</code>.
               * @param oFormatOptions Format options as defined in {@link sap.ui.core.format.DateFormat}
               * @param oConstraints Constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue
               * validateValue}  throws an error if any constraint is violated
              */
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
               * Formats the given value to the given target type.
               * @since 1.27.0
               * @param vValue The value to be formatted, which is represented in the model as a <code>Date</code> 
               * instance (OData V2) or as a string like "2014-11-27T13:47:26Z" (OData V4); both  representations are
               * accepted independent of the model's OData version
               * @param sTargetType The target type, may be "any" or "string"; see {@link sap.ui.model.odata.type}
               * for more  information
               * @returns The formatted output value in the target type; <code>undefined</code> or <code>null</code> 
               * are formatted to <code>null</code>
              */
  def formatValue(vValue: java.lang.String, sTargetType: java.lang.String): Date | java.lang.String = js.native
}

