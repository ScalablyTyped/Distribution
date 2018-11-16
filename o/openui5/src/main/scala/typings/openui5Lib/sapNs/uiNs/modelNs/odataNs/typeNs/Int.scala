package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.Int")
@js.native
class Int protected () extends ODataType {
  /**
               * Constructor for a new <code>Int</code>.
               * @param oFormatOptions type-specific format options; see subtypes
               * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
               * constraint is  violated
              */
  def this(oFormatOptions: js.Any) = this()
  /**
               * Constructor for a new <code>Int</code>.
               * @param oFormatOptions type-specific format options; see subtypes
               * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
               * constraint is  violated
              */
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
               * Formats the given value to the given target type.When formatting to <code>string</code> the format
               * options are used.
               * @param iValue the value in model representation to be formatted
               * @param sTargetType the target type; may be "any", "int", "float" or "string".  See {@link
               * sap.ui.model.odata.type} for more information.
               * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
               * are formatted to <code>null</code>
              */
  def formatValue(iValue: scala.Double, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
  /**
               * Parses the given value, which is expected to be of the given source type, to an Int innumber
               * representation.
               * @param vValue the value to be parsed. The empty string and <code>null</code> are parsed to 
               * <code>null</code>.
               * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
               * or  "string".  See {@link sap.ui.model.odata.type} for more information.
               * @returns the parsed value
              */
  def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): scala.Double = js.native
  /**
               * Parses the given value, which is expected to be of the given source type, to an Int innumber
               * representation.
               * @param vValue the value to be parsed. The empty string and <code>null</code> are parsed to 
               * <code>null</code>.
               * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
               * or  "string".  See {@link sap.ui.model.odata.type} for more information.
               * @returns the parsed value
              */
  def parseValue(vValue: scala.Double, sSourceType: java.lang.String): scala.Double = js.native
  /**
               * Validates whether the given value in model representation is valid and meets thedefined constraints.
               * @param iValue the value to be validated
              */
  def validateValue(iValue: scala.Double): scala.Unit = js.native
}

