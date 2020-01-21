package typings.node.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Runtime {
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
    * Number of milliseconds since epoch.
    */
  type Timestamp = scala.Double
  /**
    * Unique identifier of current debugger.
    * @experimental
    */
  type UniqueDebuggerId = java.lang.String
  /**
    * Primitive value which cannot be JSON-stringified.
    */
  type UnserializableValue = java.lang.String
}
