package typings.mendixmodelsdk.distSdkInternalDeltasDeltaDashManagerMod

import typings.mendixmodelsdk.distCommonMod.commonNs.IErrorCallback
import typings.mendixmodelsdk.distCommonMod.commonNs.IVoidCallback
import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
import typings.mendixmodelsdk.distSdkInternalDeltasTransactionDashManagerMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeltaManager extends js.Object {
  val isClosing: Boolean = js.native
  def beginTransaction(): Transaction = js.native
  def closeConnection(callback: IVoidCallback): Unit = js.native
  def closeConnection(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  def onNewDelta(callback: js.Function1[/* delta */ Delta, Unit]): Unit = js.native
  def onTransactionCommitted(callback: js.Function0[Unit]): Unit = js.native
  def onTransactionRollback(callback: js.Function0[Unit]): Unit = js.native
  def processDeltas(deltas: js.Array[Delta]): Unit = js.native
  def push(delta: Delta): Unit = js.native
  def reverseDelta(delta: Delta): Delta = js.native
}

