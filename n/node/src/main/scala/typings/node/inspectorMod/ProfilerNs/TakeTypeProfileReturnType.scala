package typings.node.inspectorMod.ProfilerNs

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
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[TakeTypeProfileReturnType]
  }
}

