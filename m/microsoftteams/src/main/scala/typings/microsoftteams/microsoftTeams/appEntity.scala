package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the application entities specific part of the SDK.
  *
  * Hide from docs
  */
object appEntity {
  
  /**
    * Hide from docs
    * --------
    * Information on an app entity
    */
  trait AppEntity extends StObject {
    
    /**
      * URL for the application's icon
      */
    var appIconUrl: String
    
    /**
      * App ID of the application
      */
    var appId: String
    
    /**
      * Content URL for the app entity
      */
    var contentUrl: String
    
    /**
      * The display name for the app entity
      */
    var displayName: String
    
    /**
      * Website URL for the app entity. It is meant to be opened by the user in a browser.
      */
    var websiteUrl: String
  }
  object AppEntity {
    
    inline def apply(appIconUrl: String, appId: String, contentUrl: String, displayName: String, websiteUrl: String): AppEntity = {
      val __obj = js.Dynamic.literal(appIconUrl = appIconUrl.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], websiteUrl = websiteUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppEntity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppEntity] (val x: Self) extends AnyVal {
      
      inline def setAppIconUrl(value: String): Self = StObject.set(x, "appIconUrl", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    }
  }
}
