package typings.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import typings.mendixmodelsdk.srcCommonMod.common.ICallback
import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.srcCommonMod.common.IVoidCallback
import typings.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractUnitJson
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IGetFilesOptions
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IWorkingCopy
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.Version
import typings.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IBuildResultEvent
import typings.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IWorkingCopyDataEvent
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalAbstractModelMod {
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/sdk/internal/AbstractModel", "AbstractModel")
  @js.native
  open class AbstractModel protected ()
    extends StObject
       with IAbstractModel {
    def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
    
    def getFile(filePath: String, outFilePath: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def handleError(message: String): Unit = js.native
    def handleError(message: String, errorCallback: IErrorCallback): Unit = js.native
    
    @JSName("id")
    def id_MAbstractModel: String = js.native
    
    def loadUnitById[T /* <: IAbstractUnit */](id: String): js.Promise[T] = js.native
    def loadUnitById[T /* <: IAbstractUnit */](id: String, forceRefresh: Unit, callback: ICallback[T]): Unit = js.native
    def loadUnitById[T /* <: IAbstractUnit */](id: String, forceRefresh: Unit, callback: ICallback[T], errorCallback: IErrorCallback): Unit = js.native
    
    def root: IStructuralUnit = js.native
  }
  
  @js.native
  trait IAbstractModel extends StObject {
    
    /**
      * Adds the given module json to the project, which will make the module and its units read-only and unloadable.
      * Returns the added module.
      *
      * Gives **error** if
      * - The JSON isn't an array
      * - The module package is not compatible with the same metamodel version as the project
      */
    def addModuleUnitInterfaces(moduleJson: String): IStructuralUnit = js.native
    def addModuleUnitInterfaces(moduleJson: js.Array[IAbstractUnitJson]): IStructuralUnit = js.native
    
    /**
      * Returns all units in the project, including modules, folders etc.
      * To retrieve all "real" documents (pages, microflows etc.), use allDocuments().
      */
    def allUnits(): js.Array[IAbstractUnit] = js.native
    
    def closeConnection(): js.Promise[Unit] = js.native
    /**
      * Ends the connection with the Model API client.
      * Flushes any pending deltas and invokes the callback once complete.
      * If a callback is provided but no error callback is provided, errors will be handled through the default modelstore error handler.
      */
    def closeConnection(callback: IVoidCallback): Unit = js.native
    def closeConnection(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def deleteFile(filePath: String): js.Promise[Unit] = js.native
    /**
      * Deletes the file with the specified filepath.
      */
    def deleteFile(filePath: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def deleteWorkingCopy(): js.Promise[Unit] = js.native
    /**
      * Deletes this model from the server, and the (SDK) client.
      */
    def deleteWorkingCopy(callback: IVoidCallback): Unit = js.native
    def deleteWorkingCopy(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def exportModuleMpk(moduleId: String, outFilePath: String): js.Promise[Unit] = js.native
    /**
      * Exports the module as MPK.
      * If outFilePath is empty, the raw response body will be provided in the callback
      */
    def exportModuleMpk(moduleId: String, outFilePath: String, callback: IVoidCallback): Unit = js.native
    def exportModuleMpk(moduleId: String, outFilePath: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def exportMpk(outFilePath: String): js.Promise[IExportMpkResponse] = js.native
    /**
      * Exports this model as MPK.
      * If outFilePath is empty, the raw response body will be provided.
      */
    def exportMpk(outFilePath: String, callback: IExportMpkCallback): Unit = js.native
    def exportMpk(outFilePath: String, callback: IExportMpkCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def filterUnitsByCustomWidgetId(workingCopyId: String, widgetId: String): js.Promise[js.Array[String]] = js.native
    /**
      * Returns a list of unitIds that contains a specific custom widget
      */
    def filterUnitsByCustomWidgetId(workingCopyId: String, widgetId: String, callback: ICallback[js.Array[String]]): Unit = js.native
    def filterUnitsByCustomWidgetId(
      workingCopyId: String,
      widgetId: String,
      callback: ICallback[js.Array[String]],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def flushChanges(): js.Promise[Unit] = js.native
    /**
      * Flushes any pending deltas and invokes the callback once complete.
      * If a callback is provided but no error callback is provided, errors will be handled through the default modelstore error handler.
      */
    def flushChanges(callback: IVoidCallback): Unit = js.native
    def flushChanges(callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def getFile(filePath: String, outFilePath: String): js.Promise[Any] = js.native
    /**
      * Downloads the file specified by the supplied filepath.
      * If outFilePath is empty, the raw response body will be provided in the callback
      */
    def getFile(
      filePath: String,
      outFilePath: String,
      callback: js.Function1[/* response */ js.UndefOr[Any], Unit],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def getFilePaths(): js.Promise[js.Array[String]] = js.native
    /**
      * Returns an array of all filepaths in the working copy.
      */
    def getFilePaths(callback: ICallback[js.Array[String]], errorCallback: IErrorCallback): Unit = js.native
    
    def getFiles(): js.Promise[js.Array[String]] = js.native
    /**
      * Returns all files or a subset of files
      * options.filter: glob pattern to limit the set of files
      * options.format: "json" or "zip"
      * options.path: useful if format is "zip". If provided the zip will be stored on disk
      */
    def getFiles(
      callback: js.Function1[/* response */ js.UndefOr[js.Array[String]], Unit],
      errorCallback: IErrorCallback
    ): Unit = js.native
    def getFiles(options: IGetFilesOptions): js.Promise[js.Array[String] | Any] = js.native
    def getFiles(
      options: IGetFilesOptions,
      callback: js.Function1[/* response */ js.UndefOr[js.Array[String] | Any], Unit],
      errorCallback: IErrorCallback
    ): Unit = js.native
    
    def getLastEventId(): js.Promise[Double] = js.native
    /**
      * Get the event id for the last processed batch of deltas in Model Server after flushing any pending deltas.
      * If a callback is provided but no error callback is provided, errors will be handled through the default modelstore error handler.
      */
    def getLastEventId(callback: ICallback[Double]): Unit = js.native
    def getLastEventId(callback: ICallback[Double], errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Working copy id of the current opened model (read only)
      */
    var id: String = js.native
    
    def importModuleMpk(mpkPath: String): js.Promise[Unit] = js.native
    /**
      * Imports the given module MPK.
      *
      * Importing a module **overwrites existing files** in the project.
      *
      * Gives **error** if
      * - A module with the same name already exists
      * - The module package is not using the same metamodel version as the project
      */
    def importModuleMpk(mpkPath: String, callback: IVoidCallback): Unit = js.native
    def importModuleMpk(mpkPath: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    def importModuleMpk(mpkPath: Blob): js.Promise[Unit] = js.native
    def importModuleMpk(mpkPath: Blob, callback: IVoidCallback): Unit = js.native
    def importModuleMpk(mpkPath: Blob, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    def loadUnitById[T /* <: IAbstractUnit */](id: String, forceRefresh: Boolean): js.Promise[T] = js.native
    /**
      * Given an id, fetches a complete unit. The result might be returned from the cache.
      * Use this method if you have just a unit Id, otherwise, unit.fetch() is a simpler alternative.
      */
    def loadUnitById[T /* <: IAbstractUnit */](id: String, forceRefresh: Boolean, callback: ICallback[T]): Unit = js.native
    def loadUnitById[T /* <: IAbstractUnit */](id: String, forceRefresh: Boolean, callback: ICallback[T], errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * The Mendix meta model version related to the project.
      */
    var metaModelVersion: Version = js.native
    
    /**
      * The Mendix product version the model was created with/in.
      * Note: this does not have to equal the meta model version.
      */
    var mxVersionForModel: Version = js.native
    
    def onBuildResultEventReceived(callback: js.Function1[/* buildResultEvent */ IBuildResultEvent, Unit]): Unit = js.native
    
    def onFileChangesReceived(callback: js.Function1[/* files */ js.Array[String], Unit]): Unit = js.native
    
    def onModelChange(callback: IVoidCallback): Unit = js.native
    
    def onModelEventProcessed(callback: IVoidCallback): Unit = js.native
    
    def onWorkingCopyDataEventReceived(callback: js.Function1[/* workingCopyDataEvent */ IWorkingCopyDataEvent, Unit]): Unit = js.native
    
    def putFile(inFilePath: String, filePath: String): js.Promise[Unit] = js.native
    /**
      * Uploads the supplied file to the specified filepath.
      */
    def putFile(inFilePath: String, filePath: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    def putFile(inFilePath: Blob, filePath: String): js.Promise[Unit] = js.native
    def putFile(inFilePath: Blob, filePath: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
    
    /**
      * Sets the callback that is invoked when an error occurs in an asynchronous operation for which no error callback is specified.
      *
      * Examples of such operations are making changes to the model and loading elements.
      */
    def setErrorHandler(callback: IErrorCallback): Unit = js.native
    
    def startReceivingModelEvents(): Unit = js.native
    
    def startReceivingWorkingCopyEvents(): Unit = js.native
    
    def stopReceivingModelEvents(): Unit = js.native
    
    def stopReceivingWorkingCopyEvents(): Unit = js.native
    
    /**
      * The meta data of the model.
      */
    var workingCopy: IWorkingCopy = js.native
  }
  
  type IExportMpkCallback = js.Function2[/* data */ Any, /* lastEventId */ Double, Unit]
  
  trait IExportMpkResponse extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var lastEventId: Double
  }
  object IExportMpkResponse {
    
    inline def apply(lastEventId: Double): IExportMpkResponse = {
      val __obj = js.Dynamic.literal(lastEventId = lastEventId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExportMpkResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IExportMpkResponse] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLastEventId(value: Double): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    }
  }
  
  type ISubResolver = js.Function2[/* parent */ IStructure, /* partName */ String, IStructure]
  
  type IUnitsByTypeCache = StringDictionary[js.Array[IAbstractUnit]]
  
  type IUnitsMap = StringDictionary[IAbstractUnit]
}
