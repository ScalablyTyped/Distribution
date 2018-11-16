package typings
package openui5Lib.sapNs.uiNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.CompositeType")
@js.native
abstract class CompositeType protected () extends SimpleType {
  /**
           * Constructor for a new CompositeType.
           * @param oFormatOptions options as provided by concrete subclasses
           * @param oConstraints constraints as supported by concrete subclasses
          */
  def this(oFormatOptions: js.Any) = this()
  /**
           * Constructor for a new CompositeType.
           * @param oFormatOptions options as provided by concrete subclasses
           * @param oConstraints constraints as supported by concrete subclasses
          */
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
           * Format the given set of values in model representation to an output value in the giveninternal type.
           * This happens according to the format options, if target type is 'string'.If aValues is not defined
           * or null, null will be returned.
           * @param aValues the values to be formatted
           * @param sInternalType the target type
           * @returns the formatted output value
          */
  def formatValue(aValues: js.Array[_], sInternalType: java.lang.String): js.Any = js.native
  /**
           * Validate whether a given value in model representation is valid and meets thedefined constraints (if
           * any).
           * @param aValues the set of values to be validated
          */
  def validateValue(aValues: js.Array[_]): scala.Unit = js.native
}

