package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltaDashSenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/delta-sender", "DeltaSender")
@js.native
class DeltaSender protected () extends js.Object {
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, closeCallback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback, errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback) = this()
  var closeCallback: js.Any = js.native
  var errorCallback: js.Any = js.native
  var hasError: js.Any = js.native
  var isClosing: scala.Boolean = js.native
  var model: js.Any = js.native
  var pending: scala.Boolean = js.native
  var processQueue: js.Any = js.native
  var queue: js.Any = js.native
  var sendDeltas: js.Any = js.native
  def closeConnection(): scala.Unit = js.native
  def scheduleDeltas(deltas: js.Array[mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta]): scala.Unit = js.native
}

