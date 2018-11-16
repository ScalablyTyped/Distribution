package typings
package openui5Lib.sapNs.uiNs.modelNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.type.Currency")
@js.native
class Currency protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.CompositeType {
  /**
             * Constructor for a Currency type.
             * @param oFormatOptions formatting options. Supports the same options as {@link
             * sap.ui.core.format.NumberFormat.getCurrencyInstance NumberFormat.getCurrencyInstance}
             * @param oConstraints value constraints.
            */
  def this(oFormatOptions: js.Any) = this()
  /**
             * Constructor for a Currency type.
             * @param oFormatOptions formatting options. Supports the same options as {@link
             * sap.ui.core.format.NumberFormat.getCurrencyInstance NumberFormat.getCurrencyInstance}
             * @param oConstraints value constraints.
            */
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
             * Format the given array containing amount and currency code to an output value of type string.Other
             * internal types than 'string' are not supported by the Currency type.If an source format is has been
             * defined for this type, the formatValue does also accepta string value as input, which will be parsed
             * into an array using the source format.If aValues is not defined or null, null will be returned.
             * @param vValue the array of values or string value to be formatted
             * @param sInternalType the target type
             * @returns the formatted output value
            */
  def formatValue(vValue: java.lang.String, sInternalType: java.lang.String): js.Any = js.native
}

