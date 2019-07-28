package typings.oboe.oboeMod

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OboeFunction
  extends js.Function {
  var drop: js.Object = js.native
  def apply(options: Options): Oboe = js.native
  def apply(stream: ReadableStream): Oboe = js.native
  def apply(url: String): Oboe = js.native
}

