package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinFrame extends js.Object {
  var name: String = js.native
  var uuid: String = js.native
  def addEventListener(`type`: String, listener: js.Function0[Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function0[Unit], callback: js.Function0[Unit]): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getInfo(): Unit = js.native
  def getInfo(callback: js.Function1[/* entityInfo */ EntityInfo, Unit]): Unit = js.native
  def getInfo(
    callback: js.Function1[/* entityInfo */ EntityInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getParentWindow(): Unit = js.native
  def getParentWindow(callback: js.Function1[/* entityInfo */ EntityInfo, Unit]): Unit = js.native
  def getParentWindow(
    callback: js.Function1[/* entityInfo */ EntityInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function0[Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function0[Unit], callback: js.Function0[Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
}

