package typings.pgDashQueryDashStream.pgDashQueryDashStreamMod

import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Readable
import typings.pg.pgMod.Submittable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStream
  extends Readable
     with Submittable {
  var batchSize: Double = js.native
  var text: String = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

