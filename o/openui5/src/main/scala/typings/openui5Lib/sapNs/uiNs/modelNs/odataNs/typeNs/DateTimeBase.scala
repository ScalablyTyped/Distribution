package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.DateTimeBase")
@js.native
abstract class DateTimeBase protected () extends ODataType {
  /**
               * Base constructor for the primitive types <code>Edm.DateTime</code>
               * and<code>Edm.DateTimeOffset</code>.
               * @param oFormatOptions Type-specific format options; see subtypes
               * @param oConstraints Constraints; {@link #validateValue validateValue} throws an error if any
               * constraint is  violated
              */
  def this(oFormatOptions: js.Any) = this()
  /**
               * Base constructor for the primitive types <code>Edm.DateTime</code>
               * and<code>Edm.DateTimeOffset</code>.
               * @param oFormatOptions Type-specific format options; see subtypes
               * @param oConstraints Constraints; {@link #validateValue validateValue} throws an error if any
               * constraint is  violated
              */
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
               * Formats the given value to the given target type.
               * @since 1.27.0
               * @param oValue The value to be formatted, which is represented in the model as a <code>Date</code> 
               * instance (OData V2)
               * @param sTargetType The target type, may be "any" or "string"; see {@link sap.ui.model.odata.type}
               * for more  information
               * @returns The formatted output value in the target type; <code>undefined</code> or <code>null</code> 
               * are formatted to <code>null</code>
              */
  def formatValue(oValue: Date, sTargetType: java.lang.String): Date | java.lang.String = js.native
  /**
               * Parses the given value to a <code>Date</code> instance (OData V2).
               * @since 1.27.0
               * @param sValue The value to be parsed; the empty string and <code>null</code> are parsed to 
               * <code>null</code>
               * @param sSourceType The source type (the expected type of <code>sValue</code>), must be "string"; see
               *  {@link sap.ui.model.odata.type} for more information
               * @returns The parsed value
              */
  def parseValue(sValue: java.lang.String, sSourceType: java.lang.String): Date | java.lang.String = js.native
  /**
               * Validates whether the given value in model representation is valid and meets thedefined constraints.
               * @since 1.27.0
               * @param oValue The value to be validated
              */
  def validateValue(oValue: Date): scala.Unit = js.native
}

