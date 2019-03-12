package typings
package pgDashLargeDashObjectLib.pgDashLargeDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-large-object", "LargeObjectManager")
@js.native
class LargeObjectManager protected () extends js.Object {
  def this(options: js.Object) = this()
  def this(options: LargeObjectManagerSettings) = this()
  def create(callback: js.Function2[/* error */ stdLib.Error, /* oid */ scala.Double, scala.Unit]): scala.Unit = js.native
  def createAndWritableStream(): scala.Unit = js.native
  def createAndWritableStream(bufferSize: scala.Double): scala.Unit = js.native
  def createAndWritableStream(
    bufferSize: scala.Double,
    callback: js.Function3[/* error */ stdLib.Error, /* oid */ scala.Double, /* stream */ WriteStream, scala.Unit]
  ): scala.Unit = js.native
  def createAndWritableStreamAsync(): js.Promise[js.Tuple2[scala.Double, WriteStream]] = js.native
  def createAndWritableStreamAsync(bufferSize: scala.Double): js.Promise[js.Tuple2[scala.Double, WriteStream]] = js.native
  def createAsync(): js.Promise[scala.Double] = js.native
  def open(
    oid: scala.Double,
    mode: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ LargeObject, scala.Unit]
  ): scala.Unit = js.native
  def openAndReadableStream(
    oid: scala.Double,
    bufferSize: scala.Double,
    callback: js.Function3[/* error */ stdLib.Error, /* size */ scala.Double, /* stream */ ReadStream, scala.Unit]
  ): scala.Unit = js.native
  def openAndReadableStreamAsync(oid: scala.Double): js.Promise[js.Tuple2[scala.Double, ReadStream]] = js.native
  def openAndReadableStreamAsync(oid: scala.Double, bufferSize: scala.Double): js.Promise[js.Tuple2[scala.Double, ReadStream]] = js.native
  def openAsync(oid: scala.Double, mode: scala.Double): js.Promise[LargeObject] = js.native
  def unlink(oid: scala.Double): scala.Unit = js.native
  def unlink(oid: scala.Double, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def unlinkAsync(oid: scala.Double): js.Promise[_] = js.native
}

/* static members */
@JSImport("pg-large-object", "LargeObjectManager")
@js.native
object LargeObjectManager extends js.Object {
  val READ: scala.Double = js.native
  val READWRITE: scala.Double = js.native
  val WRITE: scala.Double = js.native
}

