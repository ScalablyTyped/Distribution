package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleConstructorOptions extends js.Object {
  var colorMode: js.UndefOr[scala.Boolean | nodeLib.nodeLibStrings.auto] = js.undefined
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  var inspectOptions: js.UndefOr[InspectOptions] = js.undefined
  var stderr: js.UndefOr[WritableStream] = js.undefined
  var stdout: WritableStream
}

