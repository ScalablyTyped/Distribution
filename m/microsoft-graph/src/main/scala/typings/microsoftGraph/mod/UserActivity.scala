package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserActivity extends Entity {
  
  /**
    * Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a
    * web-based app if no native app exists.
    */
  var activationUrl: js.UndefOr[String] = js.native
  
  /**
    * Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as
    * a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named
    * cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a
    * sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath.
    * You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file
    * and domain is needed for Word vs. PowerPoint.
    */
  var activitySourceHost: js.UndefOr[String] = js.native
  
  // Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
  var appActivityId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Short text description of the app used to generate the activity for use in cases when the app is not
    * installed on the user’s local device.
    */
  var appDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
  var contentInfo: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a
    * pointer to an item in an RSS feed).
    */
  var contentUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Set by the server. DateTime in UTC when the object was created on the server.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Set by the server. DateTime in UTC when the object expired on the server.
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Optional. URL used to launch the activity in a web-based app, if available.
  var fallbackUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
  var historyItems: js.UndefOr[NullableOption[js.Array[ActivityHistoryItem]]] = js.native
  
  // Set by the server. DateTime in UTC when the object was modified on the server.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
  var status: js.UndefOr[NullableOption[Status]] = js.native
  
  /**
    * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time;
    * values supplied as Olson IDs in order to support cross-platform representation.
    */
  var userTimezone: js.UndefOr[NullableOption[String]] = js.native
  
  // Required. The object containing information to render the activity in the UX.
  var visualElements: js.UndefOr[VisualInfo] = js.native
}
object UserActivity {
  
  @scala.inline
  def apply(): UserActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActivity]
  }
  
  @scala.inline
  implicit class UserActivityOps[Self <: UserActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivationUrl(value: String): Self = this.set("activationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationUrl: Self = this.set("activationUrl", js.undefined)
    
    @scala.inline
    def setActivitySourceHost(value: String): Self = this.set("activitySourceHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivitySourceHost: Self = this.set("activitySourceHost", js.undefined)
    
    @scala.inline
    def setAppActivityId(value: String): Self = this.set("appActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppActivityId: Self = this.set("appActivityId", js.undefined)
    
    @scala.inline
    def setAppDisplayName(value: NullableOption[String]): Self = this.set("appDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppDisplayName: Self = this.set("appDisplayName", js.undefined)
    
    @scala.inline
    def setAppDisplayNameNull: Self = this.set("appDisplayName", null)
    
    @scala.inline
    def setContentInfo(value: NullableOption[_]): Self = this.set("contentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInfo: Self = this.set("contentInfo", js.undefined)
    
    @scala.inline
    def setContentInfoNull: Self = this.set("contentInfo", null)
    
    @scala.inline
    def setContentUrl(value: NullableOption[String]): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setContentUrlNull: Self = this.set("contentUrl", null)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setExpirationDateTime(value: NullableOption[String]): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    
    @scala.inline
    def setExpirationDateTimeNull: Self = this.set("expirationDateTime", null)
    
    @scala.inline
    def setFallbackUrl(value: NullableOption[String]): Self = this.set("fallbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackUrl: Self = this.set("fallbackUrl", js.undefined)
    
    @scala.inline
    def setFallbackUrlNull: Self = this.set("fallbackUrl", null)
    
    @scala.inline
    def setHistoryItemsVarargs(value: ActivityHistoryItem*): Self = this.set("historyItems", js.Array(value :_*))
    
    @scala.inline
    def setHistoryItems(value: NullableOption[js.Array[ActivityHistoryItem]]): Self = this.set("historyItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryItems: Self = this.set("historyItems", js.undefined)
    
    @scala.inline
    def setHistoryItemsNull: Self = this.set("historyItems", null)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = this.set("lastModifiedDateTime", null)
    
    @scala.inline
    def setStatus(value: NullableOption[Status]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    
    @scala.inline
    def setUserTimezone(value: NullableOption[String]): Self = this.set("userTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserTimezone: Self = this.set("userTimezone", js.undefined)
    
    @scala.inline
    def setUserTimezoneNull: Self = this.set("userTimezone", null)
    
    @scala.inline
    def setVisualElements(value: VisualInfo): Self = this.set("visualElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualElements: Self = this.set("visualElements", js.undefined)
  }
}
