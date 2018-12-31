package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.Single")
@js.native
class Single protected () extends ODataType {
  /**
    * Constructor for a primitive type <code>Edm.Single</code>.
    * @param oFormatOptions format options as defined in {@link sap.ui.core.format.NumberFormat}. In
    * contrast to  NumberFormat <code>groupingEnabled</code> defaults to <code>true</code>.
    * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
    * constraint is  violated
    */
  def this(oFormatOptions: js.Any) = this()
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
    * Formats the given value to the given target type.
    * @param vValue the value to be formatted, which is represented as a number in the model
    * @param sTargetType the target type; may be "any", "float", "int", "string".  See {@link
    * sap.ui.model.odata.type} for more information.
    * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
    * are formatted to <code>null</code>
    */
  def formatValue(vValue: java.lang.String, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
  def formatValue(vValue: scala.Double, sTargetType: java.lang.String): scala.Double | java.lang.String = js.native
  /**
    * Parses the given value, which is expected to be of the given type, to an Edm.Single
    * in<code>number</code> representation.
    * @since 1.29.0
    * @param vValue the value to be parsed; the empty string and <code>null</code> are parsed to 
    * <code>null</code>; note that there is no way to enter <code>Infinity</code> or  <code>NaN</code>
    * values
    * @param sSourceType the source type (the expected type of <code>vValue</code>); may be "float", "int"
    *  or "string".  See {@link sap.ui.model.odata.type} for more information.
    * @returns the parsed value
    */
  def parseValue(vValue: java.lang.String, sSourceType: java.lang.String): scala.Double = js.native
  def parseValue(vValue: scala.Double, sSourceType: java.lang.String): scala.Double = js.native
  /**
    * Validates whether the given value in model representation is valid and meets thedefined constraints.
    * @since 1.29.0
    * @param fValue the value to be validated
    */
  def validateValue(fValue: scala.Double): scala.Unit = js.native
}

