package typings
package nodeLib.inspectorMod.ProfilerNs

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
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
  /**
    * JavaScript script name or url.
    */
  var url: java.lang.String
}

object ScriptTypeProfile {
  @scala.inline
  def apply(
    entries: js.Array[TypeProfileEntry],
    scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId,
    url: java.lang.String
  ): ScriptTypeProfile = {
    val __obj = js.Dynamic.literal(entries = entries, scriptId = scriptId, url = url)
  
    __obj.asInstanceOf[ScriptTypeProfile]
  }
}

