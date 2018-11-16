package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketStream[T]
  extends nodeLib.streamMod.Stream {
  @JSName("on")
  def on_data(event: minioLib.minioLibStrings.data, listener: js.Function1[/* item */ T, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: minioLib.minioLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
}

