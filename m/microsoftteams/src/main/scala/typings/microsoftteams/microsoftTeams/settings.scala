package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace to interact with the settings-specific part of the SDK.
  * This object is usable only on the settings frame.
  */
object settings {
  
  @js.native
  trait RemoveEvent extends StObject {
    
    /**
      * Indicates that removal of the underlying resource failed and that the content cannot be removed.
      * @param reason Specifies a reason for the failure. If provided, this string is displayed to the user; otherwise a generic error is displayed.
      */
    def notifyFailure(): Unit = js.native
    def notifyFailure(reason: String): Unit = js.native
    
    /**
      * Indicates that the underlying resource has been removed and the content can be removed.
      */
    def notifySuccess(): Unit = js.native
  }
  
  @js.native
  trait SaveEvent extends StObject {
    
    /**
      * Indicates that creation of the underlying resource failed and that the settings cannot be saved.
      * @param reason Specifies a reason for the failure. If provided, this string is displayed to the user; otherwise a generic error is displayed.
      */
    def notifyFailure(): Unit = js.native
    def notifyFailure(reason: String): Unit = js.native
    
    /**
      * Indicates that the underlying resource has been created and the settings can be saved.
      */
    def notifySuccess(): Unit = js.native
    
    /**
      * Object containing properties passed as arguments to the settings.save event.
      */
    var result: SaveParameters = js.native
  }
  
  trait SaveParameters extends StObject {
    
    /**
      * Connector's webhook Url returned as arguments to settings.save event as part of user clicking on Save
      */
    var webhookUrl: js.UndefOr[String] = js.undefined
  }
  object SaveParameters {
    
    inline def apply(): SaveParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SaveParameters] (val x: Self) extends AnyVal {
      
      inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
      
      inline def setWebhookUrlUndefined: Self = StObject.set(x, "webhookUrl", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * Sets the URL to use for the content of this instance.
      */
    var contentUrl: String
    
    /**
      * The developer-defined unique ID for the entity to which this content points.
      */
    var entityId: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the URL for the removal configuration experience.
      */
    var removeUrl: js.UndefOr[String] = js.undefined
    
    /**
      * A suggested display name for the new content.
      * In the settings for an existing instance being updated, this call has no effect.
      */
    var suggestedDisplayName: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the URL to use for the external link to view the underlying resource in a browser.
      */
    var websiteUrl: js.UndefOr[String] = js.undefined
  }
  object Settings {
    
    inline def apply(contentUrl: String): Settings = {
      val __obj = js.Dynamic.literal(contentUrl = contentUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      inline def setRemoveUrl(value: String): Self = StObject.set(x, "removeUrl", value.asInstanceOf[js.Any])
      
      inline def setRemoveUrlUndefined: Self = StObject.set(x, "removeUrl", js.undefined)
      
      inline def setSuggestedDisplayName(value: String): Self = StObject.set(x, "suggestedDisplayName", value.asInstanceOf[js.Any])
      
      inline def setSuggestedDisplayNameUndefined: Self = StObject.set(x, "suggestedDisplayName", js.undefined)
      
      inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
    }
  }
}
