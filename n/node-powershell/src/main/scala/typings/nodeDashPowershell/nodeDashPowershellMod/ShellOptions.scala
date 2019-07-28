package typings.nodeDashPowershell.nodeDashPowershellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellOptions extends js.Object {
  /**
    * Determines whether to log verbose to the console.
    */
  var debugMsg: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the default execution policy for the current shell session
    */
  var executionPolicy: js.UndefOr[String] = js.undefined
  /**
    * Sets the input encoding for the current shell.
    */
  var inputEncoding: js.UndefOr[String] = js.undefined
  /**
    * Determines whether to load the Windows PS profile
    */
  var noProfile: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the output encoding for the current shell.
    */
  var outputEncoding: js.UndefOr[String] = js.undefined
}

object ShellOptions {
  @scala.inline
  def apply(
    debugMsg: js.UndefOr[Boolean] = js.undefined,
    executionPolicy: String = null,
    inputEncoding: String = null,
    noProfile: js.UndefOr[Boolean] = js.undefined,
    outputEncoding: String = null
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

