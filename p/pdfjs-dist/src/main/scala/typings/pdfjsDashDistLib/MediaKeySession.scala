package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeySession extends EventTarget {
  val closed: js.Promise[scala.Unit] = js.native
  val expiration: scala.Double = js.native
  val keyStatuses: MediaKeyStatusMap = js.native
  val sessionId: java.lang.String = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def generateRequest(initDataType: java.lang.String): js.Promise[scala.Unit] = js.native
  def generateRequest(
    initDataType: java.lang.String,
    initData: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): js.Promise[scala.Unit] = js.native
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def remove(): js.Promise[scala.Unit] = js.native
  def update(): js.Promise[scala.Unit] = js.native
  def update(
    response: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): js.Promise[scala.Unit] = js.native
}

@JSGlobal("MediaKeySession")
@js.native
object MediaKeySession
  extends org.scalablytyped.runtime.Instantiable0[MediaKeySession]

