package typings.pgDashLargeDashObject.pgDashLargeDashObjectMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-large-object", "LargeObject")
@js.native
class LargeObject protected () extends js.Object {
  def this(query: js.Any, oid: Double, fd: js.Any) = this()
  def close(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def closeAsync(): js.Promise[_] = js.native
  def getReadableStream(): ReadStream = js.native
  def getReadableStream(bufferSize: Double): ReadStream = js.native
  def getWritableStream(): WriteStream = js.native
  def getWritableStream(bufferSize: Double): WriteStream = js.native
  def read(length: Double, callback: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
  def readAsync(length: Double): js.Promise[Buffer] = js.native
  def seek(position: Double, ref: Double): Unit = js.native
  def seek(
    position: Double,
    ref: Double,
    callback: js.Function2[/* error */ Error, /* position */ Double, Unit]
  ): Unit = js.native
  def seekAsync(position: Double, ref: Double): js.Promise[Double] = js.native
  def size(callback: js.Function2[/* error */ Error, /* size */ Double, Unit]): Unit = js.native
  def sizeAsync(): js.Promise[Double] = js.native
  def tell(callback: js.Function2[/* error */ Error, /* position */ Double, Unit]): Unit = js.native
  def tellAsync(): js.Promise[Double] = js.native
  def truncate(length: Double): Unit = js.native
  def truncate(length: Double, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def truncateAsync(length: Double): js.Promise[_] = js.native
  def write(buffer: Buffer): Unit = js.native
  def write(buffer: Buffer, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def writeAsync(buffer: Buffer): js.Promise[_] = js.native
}

/* static members */
@JSImport("pg-large-object", "LargeObject")
@js.native
object LargeObject extends js.Object {
  val SEEK_CUR: Double = js.native
  val SEEK_END: Double = js.native
  val SEEK_SET: Double = js.native
}

