package typings.minio.minioMod

import typings.minio.minioStrings.data
import typings.minio.minioStrings.end
import typings.minio.minioStrings.error
import typings.node.streamMod.internal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketStream[T] extends internal {
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* item */ T, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
}

