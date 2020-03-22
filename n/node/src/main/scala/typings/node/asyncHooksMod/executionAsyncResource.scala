package typings.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async_hooks", "executionAsyncResource")
@js.native
object executionAsyncResource extends js.Object {
  /**
    * The resource representing the current execution.
    *  Useful to store data within the resource.
    *
    * Resource objects returned by `executionAsyncResource()` are most often internal
    * Node.js handle objects with undocumented APIs. Using any functions or properties
    * on the object is likely to crash your application and should be avoided.
    *
    * Using `executionAsyncResource()` in the top-level execution context will
    * return an empty object as there is no handle or request object to use,
    * but having an object representing the top-level can be helpful.
    */
  def apply(): js.Object = js.native
}

