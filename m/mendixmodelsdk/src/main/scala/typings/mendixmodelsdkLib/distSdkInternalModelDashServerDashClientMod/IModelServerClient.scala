package typings
package mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelServerClient extends js.Object {
  def checkAccess(
    workingCopyId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[scala.Boolean],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Commits the contents of the working copy with the given id to the team server
    */
  def commitToTeamServer(
    workingCopyId: java.lang.String,
    branchName: java.lang.String,
    message: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[scala.Double],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def createWorkingCopy(
    workingCopyInfo: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ICreateWorkingCopyParameters,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def createWorkingCopyFromTeamServer(
    workingCopyInfo: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ICreateWorkingCopyFromTeamServerParameters,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Deletes the file with the specified filepath.
    */
  def deleteFile(
    workingCopyId: java.lang.String,
    filePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def deleteWorkingCopy(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Deletes the project-to-working copy mapping for given project ID.
    */
  def deleteWorkingCopyByProject(
    projectId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def exportModuleMpk(
    workingCopyId: java.lang.String,
    moduleId: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def exportMpk(
    workingCopyId: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Returns a list of unitIds that contains a specific custom widget
    */
  def filterUnitsByCustomWidgetId(
    workingCopyId: java.lang.String,
    widgetId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[js.Array[java.lang.String]],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getAppEnvironmentStatus(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getAppEnvironmentStatusV2(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Retrieves App Job by jobId
    */
  def getAppUpdateStatus(
    workingCopyId: java.lang.String,
    jobId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Downloads the file specified by the supplied filepath.
    */
  def getFile(
    workingCopyId: java.lang.String,
    filePath: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Returns an array of all filepaths in the working copy.
    */
  def getFiles(
    workingCopyId: java.lang.String,
    options: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IGetFilesOptions,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[js.Array[java.lang.String]],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Returns an EventSource instance that will emit events that occur on the working copy.
    */
  def getModelEventSource(workingCopyId: java.lang.String, lastFetchedEventId: scala.Double): eventsourceLib.eventsourceMod.namespaced = js.native
  def getMyWorkingCopies(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[
      js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy]
    ],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Retrieves the working copy id that the given project ID maps to.
    */
  def getWorkingCopyByProject(
    projectId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[java.lang.String],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def grantAccess(
    workingCopyId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def grantAccessByProject(
    projectId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def importModuleMpk(
    workingCopyId: java.lang.String,
    mpkPath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[java.lang.String],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def importModuleMpk(
    workingCopyId: java.lang.String,
    mpkPath: stdLib.Blob,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[java.lang.String],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Retrieves a unit, as normalized model JSON, by working copy and unit ID.
    */
  def loadUnitById(
    workingCopyId: java.lang.String,
    unitId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILoadUnitResponse],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Loads all unit interfaces of the working copy indicated with `workingCopyId` as an array of normalized model JSON.
    */
  def loadUnitInterfaces(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[
      mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILoadUnitInterfacesResponse
    ],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def loadUnitInterfaces(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[
      mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILoadUnitInterfacesResponse
    ],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback,
    rootUnitId: java.lang.String
  ): scala.Unit = js.native
  /**
    * Retrieves the top-level working copy information/meta data for the working copy with given `workingCopyId`.
    */
  def loadWorkingCopyMetaData(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Lock the working copy (will be locked for the currently authenticated openid)
    */
  def lockWorkingCopy(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[
      mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILockWorkingCopyResponse
    ],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Lock the working copy with lockOptions (will be locked for the currently authenticated openid)
    */
  def lockWorkingCopy(
    workingCopyId: java.lang.String,
    lockOptions: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILockWorkingCopyOptions,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[
      mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILockWorkingCopyResponse
    ],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def lockWorkingCopy(
    workingCopyId: java.lang.String,
    lockOptions: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.LockType,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[
      mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILockWorkingCopyResponse
    ],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Uploads the supplied file to the specified filepath.
    */
  def putFile(
    workingCopyId: java.lang.String,
    inFilePath: java.lang.String,
    filePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def putFile(
    workingCopyId: java.lang.String,
    inFilePath: stdLib.Blob,
    filePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def revokeAccess(
    workingCopyId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def revokeAccessByProject(
    projectId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Sends a sequence of deltas on the working copy with the given `workingCopyId` to the Model API Server;
    * batched if more than one is passed, as a single delta otherwise.
    */
  def sendDeltas(
    workingCopyId: java.lang.String,
    deltas: js.Array[mendixmodelsdkLib.distSdkInternalDeltasDeltasMod.Delta],
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[ISendDeltasResult],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Start async deploy flow, creates new app job and returns it
    */
  def startAppUpdate(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Unlock the working copy (will be unlocked for the currently authenticated openid, will fail if it's locked by another openid)
    *
    * @param lockType if specified, only unlock if the working copy has this specified lock
    */
  def unlockWorkingCopy(
    workingCopyId: java.lang.String,
    lockType: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.LockType | js.UndefOr[scala.Nothing],
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
    * Update the project-to-working copy mapping with the given data.
    */
  def updateWorkingCopyByProject(
    projectId: java.lang.String,
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
}

