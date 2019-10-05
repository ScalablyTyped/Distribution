package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBestEffortCoverageReturnType extends js.Object {
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage]
}

object GetBestEffortCoverageReturnType {
  @scala.inline
  def apply(result: js.Array[ScriptCoverage]): GetBestEffortCoverageReturnType = {
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[GetBestEffortCoverageReturnType]
  }
}

