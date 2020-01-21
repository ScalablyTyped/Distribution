package typings.mendixmodelsdk

import typings.mendixmodelsdk.commonMod.common.ICallback
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/ModelServerClientImpl", JSImport.Namespace)
@js.native
object modelServerClientImplMod extends js.Object {
  @js.native
  class ModelServerClientImpl protected () extends IModelServerClient {
    def this(config: ISdkConfig) = this()
    var MAX_PARALLEL_REQUESTS: js.Any = js.native
    var completeGetUnitRequest: js.Any = js.native
    var config: js.Any = js.native
    var createDownloadHandler: js.Any = js.native
    var editLockId: js.Any = js.native
    var getCreateWorkingCopyData: js.Any = js.native
    var getCreateWorkingCopyFromTeamServerData: js.Any = js.native
    var getHeadersForModificationRequest: js.Any = js.native
    var handleRawDeploymentResult: js.Any = js.native
    var loadUnitByIdBatched: js.Any = js.native
    var parseAppUpdateStatus: js.Any = js.native
    var parseBuildStatus: js.Any = js.native
    var pendingRequests: js.Any = js.native
    var runningRequests: js.Any = js.native
    var sendGetUnitRequest: js.Any = js.native
    var storeResponseAsFile: js.Any = js.native
    var transportation: js.Any = js.native
    def getFile(
      workingCopyId: String,
      filePath: String,
      outFilePath: String,
      callback: ICallback[_],
      errorCallback: IErrorCallback
    ): Unit = js.native
  }
  
}

