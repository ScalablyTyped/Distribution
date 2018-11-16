package typings
package nodeLib.streamMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends Duplex {
  def _flush(callback: TransformCallback): scala.Unit = js.native
  def _transform(chunk: js.Any, encoding: java.lang.String, callback: TransformCallback): scala.Unit = js.native
}

