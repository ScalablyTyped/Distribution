package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type profile data collected during runtime for a JavaScript script.
  * @experimental
  */
trait ScriptTypeProfile extends js.Object {
  /**
    * Type profile entries for parameters and return values of the functions in the script.
    */
  var entries: js.Array[TypeProfileEntry]
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId
  /**
    * JavaScript script name or url.
    */
  var url: String
}

object ScriptTypeProfile {
  @scala.inline
  def apply(entries: js.Array[TypeProfileEntry], scriptId: ScriptId, url: String): ScriptTypeProfile = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScriptTypeProfile]
  }
}

