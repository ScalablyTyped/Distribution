package typings.mendixmodelsdk

import typings.eventsource.mod.^
import typings.mendixmodelsdk.srcCommonMod.common.ICallback
import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.srcCommonMod.common.IVoidCallback
import typings.mendixmodelsdk.srcSdkConfigurationMod.configuration.ICreateWorkingCopyFromTeamServerParameters
import typings.mendixmodelsdk.srcSdkConfigurationMod.configuration.ICreateWorkingCopyParameters
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IExportMpkResponse
import typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.Delta
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ICommitToTeamServerOptions
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IGetFilesOptions
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ILoadUnitInterfacesResponse
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ILoadUnitResponse
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ILockWorkingCopyOptions
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.ILockWorkingCopyResponse
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IWorkingCopy
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.LockType
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalImodelserverclientMod {
  
  @js.native
  trait IModelServerClient extends StObject {
    
    def checkAccess(
      workingCopyId: String,
      memberOpenId: String,
      callback: ICallback[Boolean],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /**
      * Commits the contents of the working copy with the given id to the team server
      */
    def commitToTeamServer(
      workingCopyId: String,
      options: ICommitToTeamServerOptions,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def createWorkingCopy(
      workingCopyInfo: ICreateWorkingCopyParameters,
      callback: ICallback[IWorkingCopy],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def createWorkingCopyFromTeamServer(
      workingCopyInfo: ICreateWorkingCopyFromTeamServerParameters,
      callback: ICallback[IWorkingCopy],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /**
      * Deletes the file with the specified filepath.
      */
    def deleteFile(
      workingCopyId: String,
      filePath: String,
      callback: ICallback[Double],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def deleteWorkingCopy(workingCopyId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Deletes the project-to-working copy mapping for given project ID.
      */
    def deleteWorkingCopyByProject(projectId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def exportModuleMpk(
      workingCopyId: String,
      moduleId: String,
      outFilePath: String,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def exportMpk(
      workingCopyId: String,
      outFilePath: String,
      callback: ICallback[IExportMpkResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /**
      * Returns a list of unitIds that contains a specific custom widget
      */
    def filterUnitsByCustomWidgetId(
      workingCopyId: String,
      widgetId: String,
      callback: ICallback[js.Array[String]],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /**
      * Downloads the file specified by the supplied filepath.
      */
    def getFile(
      workingCopyId: String,
      filePath: String,
      outFilePath: String,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /**
      * Returns an array of all filepaths in the working copy.
      */
    def getFiles(
      workingCopyId: String,
      options: IGetFilesOptions,
      callback: ICallback[js.Array[String]],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /**
      * Returns an EventSource instance that will emit events that occur on the working copy model.
      */
    def getModelEventSource(workingCopyId: String, lastFetchedEventId: Double): ^ = js.native
    
    def getMyWorkingCopies(callback: ICallback[js.Array[IWorkingCopy]], errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Retrieves the working copy id that the given project ID maps to.
      */
    def getWorkingCopyByProject(projectId: String, callback: ICallback[String], errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Returns an EventSource instance that will emit events that occur on the working copy level.
      */
    def getWorkingCopyEventSource(workingCopyId: String): ^ = js.native
    
    def grantAccess(
      workingCopyId: String,
      memberOpenId: String,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def grantAccessByProject(projectId: String, memberOpenId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def importModuleMpk(workingCopyId: String, mpkPath: String, callback: ICallback[String], errorCallback: IErrorCallback): Unit = js.native
    def importModuleMpk(workingCopyId: String, mpkPath: Blob, callback: ICallback[String], errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Retrieves a unit, as normalized model JSON, by working copy and unit ID.
      */
    def loadUnitById(
      workingCopyId: String,
      unitId: String,
      callback: ICallback[ILoadUnitResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /**
      * Loads all unit interfaces of the working copy indicated with `workingCopyId` as an array of normalized model JSON.
      */
    def loadUnitInterfaces(
      workingCopyId: String,
      callback: ICallback[ILoadUnitInterfacesResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    def loadUnitInterfaces(
      workingCopyId: String,
      callback: ICallback[ILoadUnitInterfacesResponse],
      errorCallback: IErrorCallback,
      rootUnitId: String
    ): Unit = js.native
    
    /**
      * Retrieves the top-level working copy information/meta data for the working copy with given `workingCopyId`.
      */
    def loadWorkingCopyMetaData(workingCopyId: String, callback: ICallback[IWorkingCopy], errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Lock the working copy (will be locked for the currently authenticated openid)
      */
    def lockWorkingCopy(
      workingCopyId: String,
      callback: ICallback[ILockWorkingCopyResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    /**
      * Lock the working copy with lockOptions (will be locked for the currently authenticated openid)
      */
    def lockWorkingCopy(
      workingCopyId: String,
      lockOptions: ILockWorkingCopyOptions,
      callback: ICallback[ILockWorkingCopyResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    def lockWorkingCopy(
      workingCopyId: String,
      lockOptions: LockType,
      callback: ICallback[ILockWorkingCopyResponse],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    /**
      * Uploads the supplied file to the specified filepath.
      */
    def putFile(
      workingCopyId: String,
      inFilePath: String,
      filePath: String,
      callback: ICallback[Double],
      errorCallback: IErrorCallback
    ): Unit = js.native
    def putFile(
      workingCopyId: String,
      inFilePath: Blob,
      filePath: String,
      callback: ICallback[Double],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def revokeAccess(
      workingCopyId: String,
      memberOpenId: String,
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def revokeAccessByProject(projectId: String, memberOpenId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Sends a sequence of deltas on the working copy with the given `workingCopyId` to the Model API Server;
      * batched if more than one is passed, as a single delta otherwise.
      */
    def sendDeltas(
      workingCopyId: String,
      deltas: js.Array[Delta],
      callback: ICallback[ISendDeltasResult],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def setProjectMembers(
      projectId: String,
      memberOpenids: js.Array[String],
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def setWorkingCopyMembers(
      workingCopyId: String,
      memberOpenIds: js.Array[String],
      callback: IVoidCallback,
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def unlockWorkingCopy(workingCopyId: String, lockType: Unit, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    /**
      * Unlock the working copy (will be unlocked for the currently authenticated openid, will fail if it's locked by another openid)
      *
      * @param lockType if specified, only unlock if the working copy has this specified lock
      */
    def unlockWorkingCopy(workingCopyId: String, lockType: LockType, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Update the project-to-working copy mapping with the given data.
      */
    def updateWorkingCopyByProject(projectId: String, workingCopyId: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  }
  
  trait ISendDeltasResult extends StObject {
    
    var eventId: Double
    
    var firstError: Any
  }
  object ISendDeltasResult {
    
    inline def apply(eventId: Double, firstError: Any): ISendDeltasResult = {
      val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], firstError = firstError.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISendDeltasResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISendDeltasResult] (val x: Self) extends AnyVal {
      
      inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setFirstError(value: Any): Self = StObject.set(x, "firstError", value.asInstanceOf[js.Any])
    }
  }
}
