package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScriptSourceParameterType extends js.Object {
  /**
    * If true the change will not actually be applied. Dry run may be used to get result
    * description without actually modifying the code.
    */
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Id of the script to edit.
    */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
  /**
    * New content of the script.
    */
  var scriptSource: java.lang.String
}

