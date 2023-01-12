package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAppDefinition
  extends StObject
     with Entity {
  
  // The details of the bot specified in the Teams app manifest.
  var bot: js.UndefOr[NullableOption[TeamworkBot]] = js.undefined
  
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Verbose description of the application.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the app provided by the app developer.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The published status of a specific version of a Teams app. Possible values are:submitted — The specific version of the
    * Teams app has been submitted and is under review. published — The request to publish the specific version of the Teams
    * app has been approved by the admin and the app is published. rejected — The request to publish the specific version of
    * the Teams app was rejected by the admin.
    */
  var publishingState: js.UndefOr[NullableOption[TeamsAppPublishingState]] = js.undefined
  
  // Short description of the application.
  var shortDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID from the Teams app manifest.
  var teamsAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The version number of the application.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamsAppDefinition {
  
  inline def apply(): TeamsAppDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAppDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamsAppDefinition] (val x: Self) extends AnyVal {
    
    inline def setBot(value: NullableOption[TeamworkBot]): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
    
    inline def setBotNull: Self = StObject.set(x, "bot", null)
    
    inline def setBotUndefined: Self = StObject.set(x, "bot", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setPublishingState(value: NullableOption[TeamsAppPublishingState]): Self = StObject.set(x, "publishingState", value.asInstanceOf[js.Any])
    
    inline def setPublishingStateNull: Self = StObject.set(x, "publishingState", null)
    
    inline def setPublishingStateUndefined: Self = StObject.set(x, "publishingState", js.undefined)
    
    inline def setShortDescription(value: NullableOption[String]): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionNull: Self = StObject.set(x, "shortDescription", null)
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setTeamsAppId(value: NullableOption[String]): Self = StObject.set(x, "teamsAppId", value.asInstanceOf[js.Any])
    
    inline def setTeamsAppIdNull: Self = StObject.set(x, "teamsAppId", null)
    
    inline def setTeamsAppIdUndefined: Self = StObject.set(x, "teamsAppId", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
