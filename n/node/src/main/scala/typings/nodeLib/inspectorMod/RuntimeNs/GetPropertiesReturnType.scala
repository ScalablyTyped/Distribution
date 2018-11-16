package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetPropertiesReturnType extends js.Object {
  /**
               * Exception details.
               */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
               * Internal object properties (only of the element itself).
               */
  var internalProperties: js.UndefOr[js.Array[InternalPropertyDescriptor]] = js.undefined
  /**
               * Object properties.
               */
  var result: js.Array[PropertyDescriptor]
}

