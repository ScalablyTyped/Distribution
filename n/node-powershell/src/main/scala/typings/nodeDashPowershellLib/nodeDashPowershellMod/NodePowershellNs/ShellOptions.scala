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

