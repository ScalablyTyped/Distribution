package typings
package nodeDashPowershellLib.nodeDashPowershellMod.NodePowershellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellOptions extends js.Object {
  /**
    * Determines whether to log verbose to the console.
    */
  var debugMsg: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the default execution policy for the current shell session
    */
  var executionPolicy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the input encoding for the current shell.
    */
  var inputEncoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines whether to load the Windows PS profile
    */
  var noProfile: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the output encoding for the current shell.
    */
  var outputEncoding: js.UndefOr[java.lang.String] = js.undefined
}

object ShellOptions {
  @scala.inline
  def apply(
    debugMsg: js.UndefOr[scala.Boolean] = js.undefined,
    executionPolicy: java.lang.String = null,
    inputEncoding: java.lang.String = null,
    noProfile: js.UndefOr[scala.Boolean] = js.undefined,
    outputEncoding: java.lang.String = null
  ): ShellOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debugMsg)) __obj.updateDynamic("debugMsg")(debugMsg)
    if (executionPolicy != null) __obj.updateDynamic("executionPolicy")(executionPolicy)
    if (inputEncoding != null) __obj.updateDynamic("inputEncoding")(inputEncoding)
    if (!js.isUndefined(noProfile)) __obj.updateDynamic("noProfile")(noProfile)
    if (outputEncoding != null) __obj.updateDynamic("outputEncoding")(outputEncoding)
    __obj.asInstanceOf[ShellOptions]
  }
}

