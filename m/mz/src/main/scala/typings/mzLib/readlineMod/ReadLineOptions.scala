package typings
package mzLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[Completer] = js.undefined
  var historySize: js.UndefOr[scala.Double] = js.undefined
  var input: nodeLib.NodeJSNs.ReadableStream
  var output: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var terminal: js.UndefOr[scala.Boolean] = js.undefined
}

