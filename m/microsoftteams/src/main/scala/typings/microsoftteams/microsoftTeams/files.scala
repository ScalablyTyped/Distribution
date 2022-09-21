package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the files specific part of the SDK.
  *
  * Hide from docs
  */
object files {
  
  @js.native
  sealed trait CloudStorageProvider extends StObject
  /**
    * Hide from docs
    *
    * Cloud storage providers registered with Microsoft Teams
    */
  @JSGlobal("microsoftTeams.files.CloudStorageProvider")
  @js.native
  object CloudStorageProvider extends StObject {
    
    @js.native
    sealed trait Box
      extends StObject
         with CloudStorageProvider
    
    @js.native
    sealed trait Dropbox
      extends StObject
         with CloudStorageProvider
    
    @js.native
    sealed trait Egnyte
      extends StObject
         with CloudStorageProvider
    
    @js.native
    sealed trait GoogleDrive
      extends StObject
         with CloudStorageProvider
    
    @js.native
    sealed trait Sharefile
      extends StObject
         with CloudStorageProvider
  }
  
  @js.native
  sealed trait CloudStorageProviderType extends StObject
  /**
    * Hide from docs
    *
    * Cloud storage provider integration type
    */
  @JSGlobal("microsoftTeams.files.CloudStorageProviderType")
  @js.native
  object CloudStorageProviderType extends StObject {
    
    @js.native
    sealed trait Google
      extends StObject
         with CloudStorageProviderType
    
    @js.native
    sealed trait Sharepoint
      extends StObject
         with CloudStorageProviderType
    
    @js.native
    sealed trait WopiIntegration
      extends StObject
         with CloudStorageProviderType
  }
  
  /**
    * Hide from docs
    *
    * Cloud storage folder interface
    */
  trait CloudStorageFolder extends StObject {
    
    /**
      * Sharepoint specific accessType of the folder
      */
    var accessType: js.UndefOr[String] = js.undefined
    
    /**
      * ID of the cloud storage folder in the provider
      */
    var folderId: String
    
    /**
      * ID of the cloud storage folder
      */
    var id: String
    
    /**
      * Sharepoint specific libraryType of the folder
      */
    var libraryType: js.UndefOr[String] = js.undefined
    
    /**
      * Display name of the owner of the cloud storage folder provider
      */
    var ownerDisplayName: String
    
    /**
      * Code of the supported cloud storage folder provider
      */
    var providerCode: CloudStorageProvider
    
    /**
      * Type of the cloud storage folder provider integration
      */
    var providerType: CloudStorageProviderType
    
    /**
      * Sharepoint specific serverRelativeUrl of the folder
      */
    var serverRelativeUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Sharepoint specific siteURL of the folder
      */
    var siteUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Display Name/Title of the cloud storage folder
      */
    var title: String
  }
  object CloudStorageFolder {
    
    inline def apply(
      folderId: String,
      id: String,
      ownerDisplayName: String,
      providerCode: CloudStorageProvider,
      providerType: CloudStorageProviderType,
      title: String
    ): CloudStorageFolder = {
      val __obj = js.Dynamic.literal(folderId = folderId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerDisplayName = ownerDisplayName.asInstanceOf[js.Any], providerCode = providerCode.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudStorageFolder]
    }
    
    extension [Self <: CloudStorageFolder](x: Self) {
      
      inline def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
      
      inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
      
      inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLibraryType(value: String): Self = StObject.set(x, "libraryType", value.asInstanceOf[js.Any])
      
      inline def setLibraryTypeUndefined: Self = StObject.set(x, "libraryType", js.undefined)
      
      inline def setOwnerDisplayName(value: String): Self = StObject.set(x, "ownerDisplayName", value.asInstanceOf[js.Any])
      
      inline def setProviderCode(value: CloudStorageProvider): Self = StObject.set(x, "providerCode", value.asInstanceOf[js.Any])
      
      inline def setProviderType(value: CloudStorageProviderType): Self = StObject.set(x, "providerType", value.asInstanceOf[js.Any])
      
      inline def setServerRelativeUrl(value: String): Self = StObject.set(x, "serverRelativeUrl", value.asInstanceOf[js.Any])
      
      inline def setServerRelativeUrlUndefined: Self = StObject.set(x, "serverRelativeUrl", js.undefined)
      
      inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
      
      inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Hide from docs
    *
    * Cloud storage item interface
    */
  trait CloudStorageFolderItem extends StObject {
    
    /**
      * Temporary access token for the item
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      * ID of the item in the provider
      */
    var id: String
    
    /**
      * Key to differentiate files and subdirectory
      */
    var isSubdirectory: Boolean
    
    /**
      * Last modifed time of the item
      */
    var lastModifiedTime: String
    
    /**
      * URL of the file
      */
    var objectUrl: String
    
    /**
      * Display size of the items in bytes
      */
    var size: Double
    
    /**
      * Display name/title
      */
    var title: String
    
    /**
      * File extension
      */
    var `type`: String
  }
  object CloudStorageFolderItem {
    
    inline def apply(
      id: String,
      isSubdirectory: Boolean,
      lastModifiedTime: String,
      objectUrl: String,
      size: Double,
      title: String,
      `type`: String
    ): CloudStorageFolderItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSubdirectory = isSubdirectory.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], objectUrl = objectUrl.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudStorageFolderItem]
    }
    
    extension [Self <: CloudStorageFolderItem](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsSubdirectory(value: Boolean): Self = StObject.set(x, "isSubdirectory", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
      
      inline def setObjectUrl(value: String): Self = StObject.set(x, "objectUrl", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
