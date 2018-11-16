package typings
package pgDashQueryDashStreamLib.pgDashQueryDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStream
  extends nodeLib.streamMod.Readable
     with pgLib.pgMod.Submittable {
  var batchSize: scala.Double = js.native
  var text: java.lang.String = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
}

