package typings.mendixmodelsdk.distSdkInternalDeltasDeltaDashSenderMod

import typings.mendixmodelsdk.distCommonMod.commonNs.IErrorCallback
import typings.mendixmodelsdk.distCommonMod.commonNs.IVoidCallback
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/delta-sender", "DeltaSender")
@js.native
class DeltaSender protected () extends js.Object {
  def this(model: AbstractModel, closeCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  var closeCallback: js.Any = js.native
  var errorCallback: js.Any = js.native
  var hasError: js.Any = js.native
  var isClosing: Boolean = js.native
  var model: js.Any = js.native
  var pending: Boolean = js.native
  var processQueue: js.Any = js.native
  var queue: js.Any = js.native
  var sendDeltas: js.Any = js.native
  def closeConnection(): Unit = js.native
  def scheduleDeltas(deltas: js.Array[Delta]): Unit = js.native
}

