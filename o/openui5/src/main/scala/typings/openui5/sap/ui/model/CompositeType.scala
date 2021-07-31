package typings.openui5.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeType
  extends StObject
     with SimpleType {
  
  /**
    * Format the given set of values in model representation to an output value in the giveninternal type.
    * This happens according to the format options, if target type is 'string'.If aValues is not defined
    * or null, null will be returned.
    * @param aValues the values to be formatted
    * @param sInternalType the target type
    * @returns the formatted output value
    */
  def formatValue(aValues: js.Array[js.Any], sInternalType: String): js.Any = js.native
  
  /**
    * Validate whether a given value in model representation is valid and meets thedefined constraints (if
    * any).
    * @param aValues the set of values to be validated
    */
  def validateValue(aValues: js.Array[js.Any]): Unit = js.native
}
