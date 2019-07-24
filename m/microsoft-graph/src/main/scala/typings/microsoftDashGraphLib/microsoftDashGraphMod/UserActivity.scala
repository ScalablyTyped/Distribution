package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserActivity extends Entity {
  /**
    * Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a
    * web-based app if no native app exists.
    */
  var activationUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as
    * a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named
    * cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a
    * sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath.
    * You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file
    * and domain is needed for Word vs. PowerPoint.
    */
  var activitySourceHost: js.UndefOr[java.lang.String] = js.undefined
  // Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
  var appActivityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. Short text description of the app used to generate the activity for use in cases when the app is not
    * installed on the user’s local device.
    */
  var appDisplayName: js.UndefOr[java.lang.String] = js.undefined
  // Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
  var contentInfo: js.UndefOr[js.Any] = js.undefined
  /**
    * Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a
    * pointer to an item in an RSS feed).
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  // Set by the server. DateTime in UTC when the object was created on the server.
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Set by the server. DateTime in UTC when the object expired on the server.
  var expirationDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Optional. URL used to launch the activity in a web-based app, if available.
  var fallbackUrl: js.UndefOr[java.lang.String] = js.undefined
  // Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
  var historyItems: js.UndefOr[js.Array[ActivityHistoryItem]] = js.undefined
  // Set by the server. DateTime in UTC when the object was modified on the server.
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
  var status: js.UndefOr[Status] = js.undefined
  /**
    * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time;
    * values supplied as Olson IDs in order to support cross-platform representation.
    */
  var userTimezone: js.UndefOr[java.lang.String] = js.undefined
  // Required. The object containing information to render the activity in the UX.
  var visualElements: js.UndefOr[VisualInfo] = js.undefined
}

object UserActivity {
  @scala.inline
  def apply(
    activationUrl: java.lang.String = null,
    activitySourceHost: java.lang.String = null,
    appActivityId: java.lang.String = null,
    appDisplayName: java.lang.String = null,
    contentInfo: js.Any = null,
    contentUrl: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    expirationDateTime: java.lang.String = null,
    fallbackUrl: java.lang.String = null,
    historyItems: js.Array[ActivityHistoryItem] = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    status: Status = null,
    userTimezone: java.lang.String = null,
    visualElements: VisualInfo = null
  ): UserActivity = {
    val __obj = js.Dynamic.literal()
    if (activationUrl != null) __obj.updateDynamic("activationUrl")(activationUrl)
    if (activitySourceHost != null) __obj.updateDynamic("activitySourceHost")(activitySourceHost)
    if (appActivityId != null) __obj.updateDynamic("appActivityId")(appActivityId)
    if (appDisplayName != null) __obj.updateDynamic("appDisplayName")(appDisplayName)
    if (contentInfo != null) __obj.updateDynamic("contentInfo")(contentInfo)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime)
    if (fallbackUrl != null) __obj.updateDynamic("fallbackUrl")(fallbackUrl)
    if (historyItems != null) __obj.updateDynamic("historyItems")(historyItems)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userTimezone != null) __obj.updateDynamic("userTimezone")(userTimezone)
    if (visualElements != null) __obj.updateDynamic("visualElements")(visualElements)
    __obj.asInstanceOf[UserActivity]
  }
}

