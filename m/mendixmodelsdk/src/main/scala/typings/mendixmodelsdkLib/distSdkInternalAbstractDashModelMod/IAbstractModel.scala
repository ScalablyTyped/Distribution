package typings
package mendixmodelsdkLib.distSdkInternalAbstractDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractModel extends js.Object {
  /**
       * Working copy id of the current opened model (read only)
       */
  var id: java.lang.String = js.native
  /**
       * The Mendix meta model version related to the project.
       */
  var metaModelVersion: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version = js.native
  /**
       * The Mendix product version the model was created with/in.
       * Note: this does not have to equal the meta model version.
       */
  var mxVersionForModel: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version = js.native
  /**
       * The meta data of the model.
       */
  var workingCopy: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IWorkingCopy = js.native
  /**
       * Returns all units in the project, including modules, folders etc.
       * To retrieve all "real" documents (pages, microflows etc.), use allDocuments().
       */
  def allUnits(): js.Array[mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit] = js.native
  def closeConnection(): js.Promise[scala.Unit] = js.native
  /**
       * Ends the connection with the Model API client.
       * Flushes any pending deltas and invokes the callback once complete.
       * If a callback is provided but no error callback is provided, errors will be handled through the default modelstore error handler.
       */
  def closeConnection(callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback): scala.Unit = js.native
  /**
       * Ends the connection with the Model API client.
       * Flushes any pending deltas and invokes the callback once complete.
       * If a callback is provided but no error callback is provided, errors will be handled through the default modelstore error handler.
       */
  def closeConnection(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def deleteFile(filePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Deletes the file with the specified filepath.
       */
  def deleteFile(
    filePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def deleteWorkingCopy(): js.Promise[scala.Unit] = js.native
  /**
       * Deletes this model from the server, and the (SDK) client.
       * If you are altering the model before deleting it, make sure to call this method in the callback of {@link closeConnection}.
       *
       */
  def deleteWorkingCopy(callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback): scala.Unit = js.native
  /**
       * Deletes this model from the server, and the (SDK) client.
       * If you are altering the model before deleting it, make sure to call this method in the callback of {@link closeConnection}.
       *
       */
  def deleteWorkingCopy(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def exportModuleMpk(moduleId: java.lang.String, outFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Exports the module as MPK.
       * If you are altering the model before running an export make sure to call this method in the callback of {@link closeConnection}.
       * If outFilePath is empty, the raw request response will be provided in the callback
       */
  def exportModuleMpk(
    moduleId: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback
  ): scala.Unit = js.native
  /**
       * Exports the module as MPK.
       * If you are altering the model before running an export make sure to call this method in the callback of {@link closeConnection}.
       * If outFilePath is empty, the raw request response will be provided in the callback
       */
  def exportModuleMpk(
    moduleId: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def exportMpk(outFilePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Exports this model as MPK.
       * If you are altering the model before running an export make sure to call this method in the callback of {@link closeConnection}.
       * If outFilePath is empty, the raw request response will be provided in the callback
       */
  def exportMpk(outFilePath: java.lang.String, callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback): scala.Unit = js.native
  /**
       * Exports this model as MPK.
       * If you are altering the model before running an export make sure to call this method in the callback of {@link closeConnection}.
       * If outFilePath is empty, the raw request response will be provided in the callback
       */
  def exportMpk(
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def filterUnitsByCustomWidgetId(workingCopyId: java.lang.String, widgetId: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Returns a list of unitIds that contains a specific custom widget
       */
  def filterUnitsByCustomWidgetId(
    workingCopyId: java.lang.String,
    widgetId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[js.Array[java.lang.String]]
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
  def getAppEnvironmentStatus(): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus] = js.native
  /**
       * Get the deployment status of the working copy. Can be STAGING, STARTED, STARTING, UPDATING, STOPPED,
       * FAILED_STAGING, FAILED and APP_NOT_FOUND.
       * Contains other deployment info as well.
       */
  def getAppEnvironmentStatus(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getAppEnvironmentStatusV2(): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus] = js.native
  /**
       * Get the deployment status of the working copy. Can be STAGING, STARTED, STARTING, UPDATING, STOPPED,
       * FAILED_STAGING, FAILED, APP_NOT_FOUND, INVALID_PROJECTID, INVALID_OPENID, UNKNOWN_DEPLOYER, UNKNOWN_PROJECT,
       * UNKNOWN_ACCOUNT, BUSY_PROVISIONIN, UNLINKED, NO_WEBMODELER_TARGET_SELECTED.
       * Contains other deployment info as well.
       */
  def getAppEnvironmentStatusV2(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getAppUpdateStatus(jobId: java.lang.String): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus] = js.native
  /**
       * Retrieves App Job by jobId. See also `startAppUpdate`.
       * In the response the most important field is status.
       *
       * Polling for job status should stop once it has reeached "started" | "failed" | "consistencyerrors".
       * Jobs will be cleaned up 10 minutes after the have reached one of this states.
       */
  def getAppUpdateStatus(
    jobId: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getFile(filePath: java.lang.String, outFilePath: java.lang.String): js.Promise[_] = js.native
  /**
       * Downloads the file specified by the supplied filepath.
       * If filePath is empty, the raw request response will be provided in the callback
       */
  def getFile(
    filePath: java.lang.String,
    outFilePath: java.lang.String,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getFilePaths(): js.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Returns an array of all filepaths in the working copy.
       */
  def getFilePaths(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[js.Array[java.lang.String]],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getFiles(): js.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Returns all files or a subset of files
       * options.filter: glob pattern to limit the set of files
       * options.format: "json" or "zip"
       * options.path: useful if format is "zip". If provided the zip will be stored on disk
       */
  def getFiles(
    callback: js.Function1[/* response */ js.UndefOr[js.Array[java.lang.String]], scala.Unit],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def getFiles(options: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IGetFilesOptions): js.Promise[js.Array[java.lang.String] | _] = js.native
  def getFiles(
    options: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IGetFilesOptions,
    callback: js.Function1[/* response */ js.UndefOr[js.Array[java.lang.String] | js.Any], scala.Unit],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def importModuleMpk(mpkPath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Imports the given module MPK.
       *
       * Importing a module **overwrites existing files** in the project.
       *
       * Gives **error** if
       * - A module with the same name already exists
       * - The module package is not using the same metamodel version as the project
       */
  def importModuleMpk(
    mpkPath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def importModuleMpk(mpkPath: stdLib.Blob): js.Promise[scala.Unit] = js.native
  /**
       * Imports the given module MPK.
       *
       * Importing a module **overwrites existing files** in the project.
       *
       * Gives **error** if
       * - A module with the same name already exists
       * - The module package is not using the same metamodel version as the project
       */
  def importModuleMpk(
    mpkPath: stdLib.Blob,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def loadUnitById[T /* <: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit */](id: java.lang.String, forceRefresh: scala.Boolean): js.Promise[T] = js.native
  /**
       * Given an id, fetches a complete unit. The result might be returned from the cache.
       * Use this method if you have just a unit Id, otherwise, unit.fetch() is a simpler alternative.
       */
  def loadUnitById[T /* <: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit */](
    id: java.lang.String,
    forceRefresh: scala.Boolean,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[T]
  ): scala.Unit = js.native
  /**
       * Given an id, fetches a complete unit. The result might be returned from the cache.
       * Use this method if you have just a unit Id, otherwise, unit.fetch() is a simpler alternative.
       */
  def loadUnitById[T /* <: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit */](
    id: java.lang.String,
    forceRefresh: scala.Boolean,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[T],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def onEventProcessed(callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback): scala.Unit = js.native
  def putFile(inFilePath: java.lang.String, filePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Uploads the supplied file to the specified filepath.
       */
  def putFile(
    inFilePath: java.lang.String,
    filePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def putFile(inFilePath: stdLib.Blob, filePath: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Uploads the supplied file to the specified filepath.
       */
  def putFile(
    inFilePath: stdLib.Blob,
    filePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  /**
       * Sets the callback that is invoked when an error occurs in an asynchronous operation for which no error callback is specified.
       *
       * Examples of such operations are making changes to the model and loading elements.
       */
  def setErrorHandler(callback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback): scala.Unit = js.native
  def startAppUpdate(): js.Promise[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus] = js.native
  /**
       * Start async deploy flow, creates new app job and returns it.
       * This call immediately returns after successfully initiating the deployment job, and it's progress
       * can be tracked using `getAppUpdateStates.
       *
       * A start update packs the mpk and sends it to the the cloud environment to update the application,
       * a new application will be provisioned if needed.
       *
       * The update job will always converge to a stable state (one of "started" | "failed" | "consistencyerrors").
       * Use the returned job id to poll for this.
       */
  def startAppUpdate(
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IDeployJobStatus],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def startReceivingEvents(): scala.Unit = js.native
  def stopReceivingEvents(): scala.Unit = js.native
}

