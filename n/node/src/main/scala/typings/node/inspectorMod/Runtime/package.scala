package typings.node.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Runtime {
  /**
    * Id of an execution context.
    */
  type ExecutionContextId = Double
  /**
    * Unique object identifier.
    */
  type RemoteObjectId = String
  /**
    * Unique script identifier.
    */
  type ScriptId = String
  /**
    * Number of milliseconds since epoch.
    */
  type Timestamp = Double
  /**
    * Unique identifier of current debugger.
    * @experimental
    */
  type UniqueDebuggerId = String
  /**
    * Primitive value which cannot be JSON-stringified.
    */
  type UnserializableValue = String
}
