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
    
    /* private */ var MAX_PARALLEL_REQUESTS: js.Any = js.native
    
    /* private */ var completeGetUnitRequest: js.Any = js.native
    
    /* private */ var config: js.Any = js.native
    
    /* private */ var createDownloadHandler: js.Any = js.native
    
    /* private */ var editLockId: js.Any = js.native
    
    /* private */ var getCreateWorkingCopyData: js.Any = js.native
    
    /* private */ var getCreateWorkingCopyFromTeamServerData: js.Any = js.native
    
    def getFile(
      workingCopyId: String,
      filePath: String,
      outFilePath: String,
      callback: ICallback[js.Any],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /* private */ var getHeadersForModificationRequest: js.Any = js.native
    
    /* private */ var handleRawDeploymentResult: js.Any = js.native
    
    /* private */ var loadUnitByIdBatched: js.Any = js.native
    
    /* private */ var parseAppUpdateStatus: js.Any = js.native
    
    /* private */ var parseBuildStatus: js.Any = js.native
    
    /* private */ var pendingRequests: js.Any = js.native
    
    /* private */ var runningRequests: js.Any = js.native
    
    /* private */ var sendGetUnitRequest: js.Any = js.native
    
    /* private */ var storeResponseAsFile: js.Any = js.native
    
    /* private */ var transportation: js.Any = js.native
  }
}
