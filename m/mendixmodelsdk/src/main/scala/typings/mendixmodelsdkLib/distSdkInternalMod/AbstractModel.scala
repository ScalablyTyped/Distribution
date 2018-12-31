package typings
package mendixmodelsdkLib.distSdkInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractModel")
@js.native
abstract class AbstractModel protected ()
  extends mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel {
  def this(_client: mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod.IModelServerClient, _errorHandler: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback) = this()
}

@JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractModel")
@js.native
object AbstractModel extends js.Object {
  var readImpl: js.Any = js.native
  /**
    * Instantiates a new working copy that can communicate with the server for sending and receiving documents.
    * Reading a working copy will automatically fetch all unit interfaces for this working copy and invoke callback,
    * or call the errorHandler if this fails.
    */
  def read[IT /* <: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel */, CT /* <: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel with IT */](
    client: mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod.IModelServerClient,
    workingCopyId: java.lang.String,
    connectionConfig: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ISdkConfig,
    instance: CT,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[IT],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
}

