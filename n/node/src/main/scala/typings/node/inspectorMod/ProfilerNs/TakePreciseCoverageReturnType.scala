package typings.node.inspectorMod.ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakePreciseCoverageReturnType extends js.Object {
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage]
}

object TakePreciseCoverageReturnType {
  @scala.inline
  def apply(result: js.Array[ScriptCoverage]): TakePreciseCoverageReturnType = {
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[TakePreciseCoverageReturnType]
  }
}

