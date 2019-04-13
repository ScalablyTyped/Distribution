package typings
package oboeLib.oboeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OboeFunction
  extends js.Function {
  var drop: js.Object = js.native
  def apply(options: Options): Oboe = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream): Oboe = js.native
  def apply(url: java.lang.String): Oboe = js.native
}

