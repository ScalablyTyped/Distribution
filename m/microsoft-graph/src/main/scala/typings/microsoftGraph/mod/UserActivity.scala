package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserActivity
  extends StObject
     with Entity {
  
  /**
    * Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a
    * web-based app if no native app exists.
    */
  var activationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as
    * a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named
    * cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a
    * sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath.
    * You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file
    * and domain is needed for Word vs. PowerPoint.
    */
  var activitySourceHost: js.UndefOr[String] = js.undefined
  
  // Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
  var appActivityId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Short text description of the app used to generate the activity for use in cases when the app is not
    * installed on the user’s local device.
    */
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
  var contentInfo: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a
    * pointer to an item in an RSS feed).
    */
  var contentUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Set by the server. DateTime in UTC when the object was created on the server.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Set by the server. DateTime in UTC when the object expired on the server.
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional. URL used to launch the activity in a web-based app, if available.
  var fallbackUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
  var historyItems: js.UndefOr[NullableOption[js.Array[ActivityHistoryItem]]] = js.undefined
  
  // Set by the server. DateTime in UTC when the object was modified on the server.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
  var status: js.UndefOr[NullableOption[Status]] = js.undefined
  
  /**
    * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time;
    * values supplied as Olson IDs in order to support cross-platform representation.
    */
  var userTimezone: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Required. The object containing information to render the activity in the UX.
  var visualElements: js.UndefOr[VisualInfo] = js.undefined
}
object UserActivity {
  
  inline def apply(): UserActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActivity]
  }
  
  extension [Self <: UserActivity](x: Self) {
    
    inline def setActivationUrl(value: String): Self = StObject.set(x, "activationUrl", value.asInstanceOf[js.Any])
    
    inline def setActivationUrlUndefined: Self = StObject.set(x, "activationUrl", js.undefined)
    
    inline def setActivitySourceHost(value: String): Self = StObject.set(x, "activitySourceHost", value.asInstanceOf[js.Any])
    
    inline def setActivitySourceHostUndefined: Self = StObject.set(x, "activitySourceHost", js.undefined)
    
    inline def setAppActivityId(value: String): Self = StObject.set(x, "appActivityId", value.asInstanceOf[js.Any])
    
    inline def setAppActivityIdUndefined: Self = StObject.set(x, "appActivityId", js.undefined)
    
    inline def setAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "appDisplayName", value.asInstanceOf[js.Any])
    
    inline def setAppDisplayNameNull: Self = StObject.set(x, "appDisplayName", null)
    
    inline def setAppDisplayNameUndefined: Self = StObject.set(x, "appDisplayName", js.undefined)
    
    inline def setContentInfo(value: NullableOption[js.Any]): Self = StObject.set(x, "contentInfo", value.asInstanceOf[js.Any])
    
    inline def setContentInfoNull: Self = StObject.set(x, "contentInfo", null)
    
    inline def setContentInfoUndefined: Self = StObject.set(x, "contentInfo", js.undefined)
    
    inline def setContentUrl(value: NullableOption[String]): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setFallbackUrl(value: NullableOption[String]): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setFallbackUrlNull: Self = StObject.set(x, "fallbackUrl", null)
    
    inline def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
    
    inline def setHistoryItems(value: NullableOption[js.Array[ActivityHistoryItem]]): Self = StObject.set(x, "historyItems", value.asInstanceOf[js.Any])
    
    inline def setHistoryItemsNull: Self = StObject.set(x, "historyItems", null)
    
    inline def setHistoryItemsUndefined: Self = StObject.set(x, "historyItems", js.undefined)
    
    inline def setHistoryItemsVarargs(value: ActivityHistoryItem*): Self = StObject.set(x, "historyItems", js.Array(value :_*))
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[Status]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserTimezone(value: NullableOption[String]): Self = StObject.set(x, "userTimezone", value.asInstanceOf[js.Any])
    
    inline def setUserTimezoneNull: Self = StObject.set(x, "userTimezone", null)
    
    inline def setUserTimezoneUndefined: Self = StObject.set(x, "userTimezone", js.undefined)
    
    inline def setVisualElements(value: VisualInfo): Self = StObject.set(x, "visualElements", value.asInstanceOf[js.Any])
    
    inline def setVisualElementsUndefined: Self = StObject.set(x, "visualElements", js.undefined)
  }
}
