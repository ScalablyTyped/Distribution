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
  var name: java.lang.String
}

object TypeObject {
  @scala.inline
  def apply(name: java.lang.String): TypeObject = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[TypeObject]
  }
}

