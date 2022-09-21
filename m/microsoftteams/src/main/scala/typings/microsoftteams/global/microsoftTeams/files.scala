package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.FileOpenPreference.Inline
import typings.microsoftteams.microsoftTeams.FileOpenPreference.Web
import typings.microsoftteams.microsoftTeams.SdkError
import typings.microsoftteams.microsoftTeams.files.CloudStorageFolder
import typings.microsoftteams.microsoftTeams.files.CloudStorageFolderItem
import typings.microsoftteams.microsoftTeams.files.CloudStorageProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the files specific part of the SDK.
  *
  * Hide from docs
  */
object files {
  
  @JSGlobal("microsoftTeams.files")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Hide from docs
    *
    * Cloud storage providers registered with Microsoft Teams
    */
  @JSGlobal("microsoftTeams.files.CloudStorageProvider")
  @js.native
  object CloudStorageProvider extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.microsoftteams.microsoftTeams.files.CloudStorageProvider & String] = js.native
    
    /* "BOX" */ val Box: typings.microsoftteams.microsoftTeams.files.CloudStorageProvider.Box & String = js.native
    
    /* "DROPBOX" */ val Dropbox: typings.microsoftteams.microsoftTeams.files.CloudStorageProvider.Dropbox & String = js.native
    
    /* "EGNYTE" */ val Egnyte: typings.microsoftteams.microsoftTeams.files.CloudStorageProvider.Egnyte & String = js.native
    
    /* "GOOGLEDRIVE" */ val GoogleDrive: typings.microsoftteams.microsoftTeams.files.CloudStorageProvider.GoogleDrive & String = js.native
    
    /* "SHAREFILE" */ val Sharefile: typings.microsoftteams.microsoftTeams.files.CloudStorageProvider.Sharefile & String = js.native
  }
  
  /**
    * Hide from docs
    *
    * Cloud storage provider integration type
    */
  @JSGlobal("microsoftTeams.files.CloudStorageProviderType")
  @js.native
  object CloudStorageProviderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftteams.microsoftTeams.files.CloudStorageProviderType & Double] = js.native
    
    /* 2 */ val Google: typings.microsoftteams.microsoftTeams.files.CloudStorageProviderType.Google & Double = js.native
    
    /* 0 */ val Sharepoint: typings.microsoftteams.microsoftTeams.files.CloudStorageProviderType.Sharepoint & Double = js.native
    
    /* 1 */ val WopiIntegration: typings.microsoftteams.microsoftTeams.files.CloudStorageProviderType.WopiIntegration & Double = js.native
  }
  
  /**
    * Hide from docs
    *
    * Initiates the add cloud storage folder flow
    * @param channelId ID of the channel to add cloud storage folder
    * @param callback Callback that will be triggered post add folder flow is compelete
    */
  inline def addCloudStorageFolder(
    channelId: String,
    callback: js.Function3[
      /* error */ SdkError, 
      /* isFolderAdded */ Boolean, 
      /* folders */ js.Array[CloudStorageFolder], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCloudStorageFolder")(channelId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    *
    * Deletes a cloud storage folder from channel
    * @param channelId ID of the channel where folder is to be deleted
    * @param folderToDelete cloud storage folder to be deleted
    * @param callback Callback that will be triggered post delete
    */
  inline def deleteCloudStorageFolder(
    channelId: String,
    folderToDelete: CloudStorageFolder,
    callback: js.Function2[/* error */ SdkError, /* isFolderDeleted */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteCloudStorageFolder")(channelId.asInstanceOf[js.Any], folderToDelete.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCloudStorageFolderContents(
    folder: CloudStorageFolderItem,
    providerCode: CloudStorageProvider,
    callback: js.Function2[/* error */ SdkError, /* items */ js.Array[CloudStorageFolderItem], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloudStorageFolderContents")(folder.asInstanceOf[js.Any], providerCode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Hide from docs
    *
    * Fetches the contents of a Cloud storage folder (CloudStorageFolder) / sub directory
    * @param folder Cloud storage folder (CloudStorageFolder) / sub directory (CloudStorageFolderItem)
    * @param providerCode Code of the cloud storage folder provider
    * @param callback Callback that will be triggered post contents are loaded
    */
  inline def getCloudStorageFolderContents(
    folder: CloudStorageFolder,
    providerCode: CloudStorageProvider,
    callback: js.Function2[/* error */ SdkError, /* items */ js.Array[CloudStorageFolderItem], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloudStorageFolderContents")(folder.asInstanceOf[js.Any], providerCode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    *
    * Gets a list of cloud storage folders added to the channel
    * @param channelId ID of the channel whose cloud storage folders should be retrieved
    * @param callback Callback that will be triggered post folders load
    */
  inline def getCloudStorageFolders(
    channelId: String,
    callback: js.Function2[/* error */ SdkError, /* folders */ js.Array[CloudStorageFolder], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloudStorageFolders")(channelId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    *
    * Open a cloud storage file in teams
    * @param file cloud storage file that should be opened
    * @param providerCode Code of the cloud storage folder provider
    * @param fileOpenPreference Whether file should be opened in web/inline
    */
  inline def openCloudStorageFile(file: CloudStorageFolderItem, providerCode: CloudStorageProvider): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openCloudStorageFile")(file.asInstanceOf[js.Any], providerCode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def openCloudStorageFile(file: CloudStorageFolderItem, providerCode: CloudStorageProvider, fileOpenPreference: Inline): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openCloudStorageFile")(file.asInstanceOf[js.Any], providerCode.asInstanceOf[js.Any], fileOpenPreference.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def openCloudStorageFile(file: CloudStorageFolderItem, providerCode: CloudStorageProvider, fileOpenPreference: Web): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openCloudStorageFile")(file.asInstanceOf[js.Any], providerCode.asInstanceOf[js.Any], fileOpenPreference.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
