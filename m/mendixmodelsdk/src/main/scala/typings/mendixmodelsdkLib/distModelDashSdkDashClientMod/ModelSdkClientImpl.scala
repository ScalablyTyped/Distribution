package typings
package mendixmodelsdkLib.distModelDashSdkDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/model-sdk-client", "ModelSdkClientImpl")
@js.native
class ModelSdkClientImpl[IT /* <: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel */, CT /* <: mendixmodelsdkLib.distSdkInternalMod.AbstractModel with IT */] protected () extends js.Object {
  def this(connectionConfig: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ISdkConfig, modelConstructor: mendixmodelsdkLib.Anon_Client[CT]) = this()
  var client: js.Any = js.native
  var connectionConfig: js.Any = js.native
  var modelConstructor: js.Any = js.native
  def checkAccess(workingCopyId: java.lang.String, memberOpenId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Returns whether the member specified to his/her OpenID has (been granted) access to this working copy.
    */
  def checkAccess(
    workingCopyId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[scala.Boolean],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def commitToTeamServer(
    workingCopyId: java.lang.String,
    options: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ICommitToTeamServerOptions
  ): js.Promise[scala.Unit] = js.native
  /**
    * Commits the contents of the working copy with the given id to the team server
    */
  def commitToTeamServer(
    workingCopyId: java.lang.String,
    options: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ICommitToTeamServerOptions,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def createAndOpenWorkingCopy(
    workingCopyParameters: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ICreateWorkingCopyParameters
  ): js.Promise[IT] = js.native
  /**
    * Create a new working copy on the model server, and reads it for immediate editing.
    */
  def createAndOpenWorkingCopy(
    workingCopyParameters: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ICreateWorkingCopyParameters,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[IT],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def createWorkingCopy(
    workingCopyParameters: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ICreateWorkingCopyParameters
  ): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy] = js.native
  /**
    * Create a new working copy on the model server.
    */
  def createWorkingCopy(
    workingCopyParameters: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ICreateWorkingCopyParameters,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def createWorkingCopyFromTeamServer(
    workingCopyParameters: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ICreateWorkingCopyFromTeamServerParameters
  ): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy] = js.native
  /**
    * Create a new working copy on the model server from a team server repository.
    */
  def createWorkingCopyFromTeamServer(
    workingCopyParameters: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ICreateWorkingCopyFromTeamServerParameters,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def deleteWorkingCopy(workingCopyId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Deletes this working copy from the server, and the (SDK) client.
    */
  def deleteWorkingCopy(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def deleteWorkingCopyByProject(projectId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Deletes the project-to-working copy mapping for given project ID.
    */
  def deleteWorkingCopyByProject(
    projectId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def exportModuleMpk(workingCopyId: java.lang.String, moduleId: java.lang.String, outFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Exports the module with the specified ID as MPK.
    */
  def exportModuleMpk(
    workingCopyId: java.lang.String,
    moduleId: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def exportMpk(workingCopyId: java.lang.String, outFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Exports this working copy as MPK.
    */
  def exportMpk(
    workingCopyId: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getAppEnvironmentStatus(workingCopyId: java.lang.String): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus] = js.native
  def getAppEnvironmentStatus(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getAppEnvironmentStatusV2(workingCopyId: java.lang.String): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus] = js.native
  def getAppEnvironmentStatusV2(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getAppUpdateStatus(workingCopyId: java.lang.String, jobId: java.lang.String): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus] = js.native
  /**
    * Start deploy this working copy and create new job.
    */
  def getAppUpdateStatus(
    workingCopyId: java.lang.String,
    jobId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getMyWorkingCopies(): js.Promise[
    js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy]
  ] = js.native
  /**
    * Retrieves an array of all working copies you are a member of.
    */
  def getMyWorkingCopies(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[
      js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy]
    ],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getWorkingCopyByProject(projectId: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
    * Retrieves the working copy id that the given project ID maps to.
    */
  def getWorkingCopyByProject(
    projectId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[java.lang.String],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def grantAccess(workingCopyId: java.lang.String, memberOpenId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Grants access to the member specified to his/her OpenID on this working copy.
    */
  def grantAccess(
    workingCopyId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def grantAccessByProject(projectId: java.lang.String, memberOpenId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Grants access to the member specified to his/her OpenID to the default working copy of this project.
    */
  def grantAccessByProject(
    projectId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def loadWorkingCopyMetaData(workingCopyId: java.lang.String): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy] = js.native
  /**
    * Gets meta data of a working copy
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
  def lockWorkingCopy(
    workingCopyId: java.lang.String,
    lockOptions: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILockWorkingCopyOptions
  ): js.Promise[
    mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILockWorkingCopyResponse
  ] = js.native
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
    lockOptions: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.LockType
  ): js.Promise[
    mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILockWorkingCopyResponse
  ] = js.native
  def lockWorkingCopy(
    workingCopyId: java.lang.String,
    lockOptions: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.LockType,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[
      mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.ILockWorkingCopyResponse
    ],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def openWorkingCopy(workingCopyId: java.lang.String): js.Promise[IT] = js.native
  /**
    * Reads a working copy on the model server so it can be edited.
    */
  def openWorkingCopy(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[IT],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def revokeAccess(workingCopyId: java.lang.String, memberOpenId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Revokes access of the member specified to his/her OpenID on this working copy.
    */
  def revokeAccess(
    workingCopyId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def revokeAccessByProject(projectId: java.lang.String, memberOpenId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Revokes access of the member specified to his/her OpenID to the default working copy of this project.
    */
  def revokeAccessByProject(
    projectId: java.lang.String,
    memberOpenId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def startAppUpdate(workingCopyId: java.lang.String): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus] = js.native
  /**
    * Start deploy this working copy and create new job.
    */
  def startAppUpdate(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def unlockWorkingCopy(workingCopyId: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Unlock the working copy (will be unlocked for the currently authenticated openid, will fail if it's locked by another openid).
    *
    * Provide a lockType to only unlock the working copy if it is locked with this specific type.
    */
  def unlockWorkingCopy(
    workingCopyId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def unlockWorkingCopy(
    workingCopyId: java.lang.String,
    lockType: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.LockType
  ): js.Promise[scala.Unit] = js.native
  def unlockWorkingCopy(
    workingCopyId: java.lang.String,
    lockType: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.LockType,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def updateWorkingCopyByProject(projectId: java.lang.String, workingCopyId: java.lang.String): js.Promise[scala.Unit] = js.native
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

