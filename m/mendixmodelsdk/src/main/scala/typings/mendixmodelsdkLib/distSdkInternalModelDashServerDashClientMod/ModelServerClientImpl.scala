package typings
package mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/model-server-client", "ModelServerClientImpl")
@js.native
class ModelServerClientImpl protected () extends IModelServerClient {
  def this(config: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ISdkConfig) = this()
  var MAX_PARALLEL_REQUESTS: js.Any = js.native
  var completeGetUnitRequest: js.Any = js.native
  var config: js.Any = js.native
  var createDownloadHandler: js.Any = js.native
  var editLockId: js.Any = js.native
  var getHeadersForModificationRequest: js.Any = js.native
  var getWorkingCopyData: js.Any = js.native
  var handleRawDeploymentResult: js.Any = js.native
  var loadUnitByIdBatched: js.Any = js.native
  var parseAppUpdateStatus: js.Any = js.native
  var parseBuildStatus: js.Any = js.native
  var pendingRequests: js.Any = js.native
  var runningRequests: js.Any = js.native
  var sendGetUnitRequest: js.Any = js.native
  var storeResponseAsFile: js.Any = js.native
  var transportation: js.Any = js.native
  def createWorkingCopyByProject(
    projectId: java.lang.String,
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getFile(
    workingCopyId: java.lang.String,
    filePath: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[_],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
}

