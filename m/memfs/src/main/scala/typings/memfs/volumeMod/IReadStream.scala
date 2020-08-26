package typings.memfs.volumeMod

import org.scalablytyped.runtime.Instantiable2
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.fsMod.PathLike
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReadStream
  extends Readable
     with Instantiable2[/* path */ PathLike, /* options */ IReadStreamOptions, js.Any] {
  var bytesRead: Double = js.native
  var path: String = js.native
  def close(callback: TCallback[Unit]): js.Any = js.native
  def open(): js.Any = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}

