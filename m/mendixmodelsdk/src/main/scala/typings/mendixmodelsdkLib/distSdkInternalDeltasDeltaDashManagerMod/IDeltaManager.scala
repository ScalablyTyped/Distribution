package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltaDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeltaManager extends js.Object {
  val isClosing: scala.Boolean = js.native
  def closeConnection(callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback): scala.Unit = js.native
  def closeConnection(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def onNewDelta(
    callback: js.Function1[/* delta */ mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta, scala.Unit]
  ): scala.Unit = js.native
  def onTransactionDidCommit(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def processDeltas(deltas: js.Array[mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta]): scala.Unit = js.native
  def push(delta: mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta): scala.Unit = js.native
  def reverseDelta(delta: mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta): mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta = js.native
}

