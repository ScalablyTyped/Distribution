package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of an isolated world.
  */
trait ExecutionContextDescription extends js.Object {
  /**
    * Embedder-specific auxiliary data.
    */
  var auxData: js.UndefOr[js.Object] = js.undefined
  /**
    * Unique id of the execution context. It can be used to specify in which execution context
    * script evaluation should be performed.
    */
  var id: ExecutionContextId
  /**
    * Human readable name describing given context.
    */
  var name: java.lang.String
  /**
    * Execution context origin.
    */
  var origin: java.lang.String
}

