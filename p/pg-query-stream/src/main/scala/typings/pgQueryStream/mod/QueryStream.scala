package typings.pgQueryStream.mod

import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Readable
import typings.pg.mod.Submittable
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
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}

