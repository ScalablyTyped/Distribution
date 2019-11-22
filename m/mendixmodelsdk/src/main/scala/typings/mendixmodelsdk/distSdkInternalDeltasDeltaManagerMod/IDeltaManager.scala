package typings.mendixmodelsdk.distSdkInternalDeltasDeltaManagerMod

import typings.mendixmodelsdk.distCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.distCommonMod.common.IVoidCallback
import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
import typings.mendixmodelsdk.distSdkInternalDeltasTransactionManagerMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeltaManager extends js.Object {
  def beginTransaction(): Transaction = js.native
  def closeConnection(callback: IVoidCallback): Unit = js.native
  def closeConnection(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  def flushChanges(callback: IVoidCallback): Unit = js.native
  def flushChanges(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  def onNewDelta(callback: js.Function1[/* delta */ Delta, Unit]): Unit = js.native
  def onTransactionCommitted(callback: js.Function0[Unit]): Unit = js.native
  def onTransactionRollback(callback: js.Function0[Unit]): Unit = js.native
  def processDeltas(deltas: js.Array[Delta]): Unit = js.native
  def push(delta: Delta): Unit = js.native
  def reverseDelta(delta: Delta): Delta = js.native
}

