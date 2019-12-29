package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a type collected during runtime.
  * @experimental
  */
trait TypeObject extends js.Object {
  /**
    * Name of a type collected with type profiling.
    */
  var name: String
}

object TypeObject {
  @scala.inline
  def apply(name: String): TypeObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeObject]
  }
}

