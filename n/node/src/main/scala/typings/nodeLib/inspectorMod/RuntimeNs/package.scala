package typings
package nodeLib.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RuntimeNs {
  /**
    * Id of an execution context.
    */
  type ExecutionContextId = scala.Double
  /**
    * Unique object identifier.
    */
  type RemoteObjectId = java.lang.String
  /**
    * Unique script identifier.
    */
  type ScriptId = java.lang.String
  /**
    * Number of milliseconds.
    */
  type TimeDelta = scala.Double
  /**
    * Number of milliseconds since epoch.
    */
  type Timestamp = scala.Double
  /**
    * Unique identifier of current debugger.
    * @experimental
    */
  type UniqueDebuggerId = java.lang.String
  /**
    * Primitive value which cannot be JSON-stringified. Includes values `-0`, `NaN`, `Infinity`,
    * `-Infinity`, and bigint literals.
    */
  type UnserializableValue = java.lang.String
}
