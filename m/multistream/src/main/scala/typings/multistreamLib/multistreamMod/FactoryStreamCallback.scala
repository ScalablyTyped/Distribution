package typings
package multistreamLib.multistreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FactoryStreamCallback extends js.Object {
  def apply(): js.Any = js.native
  def apply(err: scala.Null, stream: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def apply(err: stdLib.Error): js.Any = js.native
}

