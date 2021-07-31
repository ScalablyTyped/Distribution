package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenFinFrame extends StObject {
  
  def addEventListener(`type`: String, listener: js.Function0[Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function0[Unit], callback: js.Function0[Unit]): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function0[Unit],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  def getInfo(): Unit = js.native
  def getInfo(callback: js.Function1[/* entityInfo */ EntityInfo, Unit]): Unit = js.native
  def getInfo(
    callback: js.Function1[/* entityInfo */ EntityInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getInfo(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  def getParentWindow(): Unit = js.native
  def getParentWindow(callback: js.Function1[/* entityInfo */ EntityInfo, Unit]): Unit = js.native
  def getParentWindow(
    callback: js.Function1[/* entityInfo */ EntityInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getParentWindow(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  var name: String = js.native
  
  def removeEventListener(`type`: String, listener: js.Function0[Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function0[Unit], callback: js.Function0[Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function0[Unit],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  var uuid: String = js.native
}
