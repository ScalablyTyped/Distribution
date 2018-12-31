package typings
package nodeLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[Completer | AsyncCompleter] = js.undefined
  var crlfDelay: js.UndefOr[scala.Double] = js.undefined
  var historySize: js.UndefOr[scala.Double] = js.undefined
  var input: nodeLib.NodeJSNs.ReadableStream
  var output: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var removeHistoryDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  var terminal: js.UndefOr[scala.Boolean] = js.undefined
}

