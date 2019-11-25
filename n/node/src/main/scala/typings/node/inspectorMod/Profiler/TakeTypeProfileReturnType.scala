package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakeTypeProfileReturnType extends js.Object {
  /**
    * Type profile for all scripts since startTypeProfile() was turned on.
    */
  var result: js.Array[ScriptTypeProfile]
}

object TakeTypeProfileReturnType {
  @scala.inline
  def apply(result: js.Array[ScriptTypeProfile]): TakeTypeProfileReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TakeTypeProfileReturnType]
  }
}

