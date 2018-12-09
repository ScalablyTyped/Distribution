package typings
package pgDashLargeDashObjectLib.pgDashLargeDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-large-object", "LargeObject")
@js.native
class LargeObject protected () extends js.Object {
  def this(query: js.Any, oid: scala.Double, fd: js.Any) = this()
  def close(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def closeAsync(): js.Promise[_] = js.native
  def getReadableStream(): ReadStream = js.native
  def getReadableStream(bufferSize: scala.Double): ReadStream = js.native
  def getWritableStream(): WriteStream = js.native
  def getWritableStream(bufferSize: scala.Double): WriteStream = js.native
  def read(
    length: scala.Double,
    callback: js.Function2[/* error */ nodeLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readAsync(length: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  def seek(position: scala.Double, ref: scala.Double): scala.Unit = js.native
  def seek(
    position: scala.Double,
    ref: scala.Double,
    callback: js.Function2[/* error */ nodeLib.Error, /* position */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def seekAsync(position: scala.Double, ref: scala.Double): js.Promise[scala.Double] = js.native
  def size(callback: js.Function2[/* error */ nodeLib.Error, /* size */ scala.Double, scala.Unit]): scala.Unit = js.native
  def sizeAsync(): js.Promise[scala.Double] = js.native
  def tell(callback: js.Function2[/* error */ nodeLib.Error, /* position */ scala.Double, scala.Unit]): scala.Unit = js.native
  def tellAsync(): js.Promise[scala.Double] = js.native
  def truncate(length: scala.Double): scala.Unit = js.native
  def truncate(length: scala.Double, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def truncateAsync(length: scala.Double): js.Promise[_] = js.native
  def write(buffer: nodeLib.Buffer): scala.Unit = js.native
  def write(buffer: nodeLib.Buffer, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def writeAsync(buffer: nodeLib.Buffer): js.Promise[_] = js.native
}

@JSImport("pg-large-object", "LargeObject")
@js.native
object LargeObject extends js.Object {
  val SEEK_CUR: scala.Double = js.native
  val SEEK_END: scala.Double = js.native
  val SEEK_SET: scala.Double = js.native
}

