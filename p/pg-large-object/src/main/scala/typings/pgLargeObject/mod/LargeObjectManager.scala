package typings.pgLargeObject.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-large-object", "LargeObjectManager")
@js.native
class LargeObjectManager protected () extends js.Object {
  def this(options: js.Object) = this()
  def this(options: LargeObjectManagerSettings) = this()
  def create(callback: js.Function2[/* error */ Error, /* oid */ Double, Unit]): Unit = js.native
  def createAndWritableStream(): Unit = js.native
  def createAndWritableStream(bufferSize: Double): Unit = js.native
  def createAndWritableStream(
    bufferSize: Double,
    callback: js.Function3[/* error */ Error, /* oid */ Double, /* stream */ WriteStream, Unit]
  ): Unit = js.native
  def createAndWritableStreamAsync(): js.Promise[js.Tuple2[Double, WriteStream]] = js.native
  def createAndWritableStreamAsync(bufferSize: Double): js.Promise[js.Tuple2[Double, WriteStream]] = js.native
  def createAsync(): js.Promise[Double] = js.native
  def open(
    oid: Double,
    mode: Double,
    callback: js.Function2[/* error */ Error, /* result */ LargeObject, Unit]
  ): Unit = js.native
  def openAndReadableStream(
    oid: Double,
    bufferSize: Double,
    callback: js.Function3[/* error */ Error, /* size */ Double, /* stream */ ReadStream, Unit]
  ): Unit = js.native
  def openAndReadableStreamAsync(oid: Double): js.Promise[js.Tuple2[Double, ReadStream]] = js.native
  def openAndReadableStreamAsync(oid: Double, bufferSize: Double): js.Promise[js.Tuple2[Double, ReadStream]] = js.native
  def openAsync(oid: Double, mode: Double): js.Promise[LargeObject] = js.native
  def unlink(oid: Double): Unit = js.native
  def unlink(oid: Double, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def unlinkAsync(oid: Double): js.Promise[_] = js.native
}

/* static members */
@JSImport("pg-large-object", "LargeObjectManager")
@js.native
object LargeObjectManager extends js.Object {
  val READ: Double = js.native
  val READWRITE: Double = js.native
  val WRITE: Double = js.native
}

