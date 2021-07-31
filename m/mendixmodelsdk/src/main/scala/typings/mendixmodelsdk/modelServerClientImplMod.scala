package typings.mendixmodelsdk

import typings.mendixmodelsdk.commonMod.common.ICallback
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelServerClientImplMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/ModelServerClientImpl", "ModelServerClientImpl")
  @js.native
  class ModelServerClientImpl protected ()
    extends StObject
       with IModelServerClient {
    def this(config: ISdkConfig) = this()
    
    var MAX_PARALLEL_REQUESTS: js.Any = js.native
    
    var completeGetUnitRequest: js.Any = js.native
    
    var config: js.Any = js.native
    
    var createDownloadHandler: js.Any = js.native
    
    var editLockId: js.Any = js.native
    
    var getCreateWorkingCopyData: js.Any = js.native
    
    var getCreateWorkingCopyFromTeamServerData: js.Any = js.native
    
    def getFile(
      workingCopyId: String,
      filePath: String,
      outFilePath: String,
      callback: ICallback[js.Any],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
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
  }
}
