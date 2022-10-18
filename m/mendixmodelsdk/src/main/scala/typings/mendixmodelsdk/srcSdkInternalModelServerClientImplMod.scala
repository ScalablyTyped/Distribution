package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcCommonMod.common.ICallback
import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.srcSdkConfigurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalModelServerClientImplMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/ModelServerClientImpl", "ModelServerClientImpl")
  @js.native
  open class ModelServerClientImpl protected ()
    extends StObject
       with IModelServerClient {
    def this(config: ISdkConfig) = this()
    
    /* private */ var MAX_PARALLEL_REQUESTS: Any = js.native
    
    /* private */ var awaitTask: Any = js.native
    
    /* private */ var completeGetUnitRequest: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var createDownloadHandler: Any = js.native
    
    /* private */ var editLockId: Any = js.native
    
    /* private */ var getAuthorizationHeader: Any = js.native
    
    /* private */ var getCreateWorkingCopyData: Any = js.native
    
    /* private */ var getCreateWorkingCopyFromTeamServerData: Any = js.native
    
    def getFile(
      workingCopyId: String,
      filePath: String,
      outFilePath: String,
      callback: ICallback[Any],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /* private */ var getFullUrl: Any = js.native
    
    /* private */ var getHeadersForModificationRequest: Any = js.native
    
    var getTaskDelayInMs: Double = js.native
    
    /* private */ var loadUnitByIdBatched: Any = js.native
    
    /* private */ var pendingRequests: Any = js.native
    
    /* private */ var runningRequests: Any = js.native
    
    /* private */ var sendGetUnitRequest: Any = js.native
    
    /* private */ var storeResponseAsFile: Any = js.native
    
    /* private */ var transportation: Any = js.native
  }
}
