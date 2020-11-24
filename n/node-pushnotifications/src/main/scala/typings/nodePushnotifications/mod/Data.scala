package typings.nodePushnotifications.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  /** apn and gcm for ios */
  var action: js.UndefOr[String] = js.native
  
  /** apn, will take precedence over title and body. It is also accepted a text message in alert */
  var alert: js.UndefOr[js.Object | String] = js.native
  
  /** gcm for ios, apn */
  var badge: js.UndefOr[Double] = js.native
  
  /** REQUIRED */
  var body: String = js.native
  
  /** gcm, apn */
  var bodyLocArgs: js.UndefOr[String] = js.native
  
  /** apn and gcm for ios */
  var category: js.UndefOr[String] = js.native
  
  /** gcm for android. In ios, category will be used if not supplied */
  var clickAction: js.UndefOr[String] = js.native
  
  /** gcm for android, used as collapseId in apn */
  var collapseKey: js.UndefOr[String] = js.native
  
  /** gcm for android */
  var color: js.UndefOr[String] = js.native
  
  /** ADM */
  var consolidationKey: js.UndefOr[String] = js.native
  
  /** gcm for android */
  var contentAvailable: js.UndefOr[Boolean | String] = js.native
  
  var custom: js.UndefOr[(StringDictionary[String | Double]) | String] = js.native
  
  /** gcm for android */
  var delayWhileIdle: js.UndefOr[Boolean] = js.native
  
  /** gcm for android */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /** wns */
  var duration: js.UndefOr[String] = js.native
  
  /** apn */
  var encoding: js.UndefOr[String] = js.native
  
  /** seconds */
  var expiry: js.UndefOr[Double] = js.native
  
  /** wns */
  var headers: js.UndefOr[js.Array[String]] = js.native
  
  /** gcm for android */
  var icon: js.UndefOr[String] = js.native
  
  /** wns */
  var launch: js.UndefOr[String] = js.native
  
  /** apn and gcm for ios */
  var launchImage: js.UndefOr[String] = js.native
  
  /** gcm, apn */
  var locKey: js.UndefOr[String] = js.native
  
  /** apn and gcm for ios */
  var mdm: js.UndefOr[String] = js.native
  
  /** apn */
  var mutableContent: js.UndefOr[Double] = js.native
  
  /**
    * gcm, apn. Supported values are 'high' or 'normal' (gcm). Will be translated to 10 and 5 for apn. Defaults
    * to 'high'
    */
  var priority: js.UndefOr[String] = js.native
  
  /** gcm for android */
  var restrictedPackageName: js.UndefOr[String] = js.native
  
  /** gcm, apn */
  var retries: js.UndefOr[Double] = js.native
  
  /** gcm, apn */
  var sound: js.UndefOr[String] = js.native
  
  /** gcm for android */
  var tag: js.UndefOr[String] = js.native
  
  /** if both expiry and timeToLive are given, expiry will take precedency */
  var timeToLive: js.UndefOr[Double] = js.native
  
  /** REQUIRED */
  var title: String = js.native
  
  /** gcm, apn */
  var titleLocArgs: js.UndefOr[String] = js.native
  
  /** gcm, apn */
  var titleLocKey: js.UndefOr[String] = js.native
  
  /** apn and gcm for ios */
  var topic: js.UndefOr[String] = js.native
  
  /** apn and gcm for ios */
  var truncateAtWordEnd: js.UndefOr[Boolean] = js.native
  
  /** apn and gcm for ios */
  var urlArgs: js.UndefOr[String] = js.native
}
object Data {
  
  @scala.inline
  def apply(body: String, title: String): Data = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAlert(value: js.Object | String): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    
    @scala.inline
    def setBadge(value: Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setBodyLocArgs(value: String): Self = this.set("bodyLocArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLocArgs: Self = this.set("bodyLocArgs", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setClickAction(value: String): Self = this.set("clickAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickAction: Self = this.set("clickAction", js.undefined)
    
    @scala.inline
    def setCollapseKey(value: String): Self = this.set("collapseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseKey: Self = this.set("collapseKey", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setConsolidationKey(value: String): Self = this.set("consolidationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsolidationKey: Self = this.set("consolidationKey", js.undefined)
    
    @scala.inline
    def setContentAvailable(value: Boolean | String): Self = this.set("contentAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAvailable: Self = this.set("contentAvailable", js.undefined)
    
    @scala.inline
    def setCustom(value: (StringDictionary[String | Double]) | String): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDelayWhileIdle(value: Boolean): Self = this.set("delayWhileIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayWhileIdle: Self = this.set("delayWhileIdle", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setExpiry(value: Double): Self = this.set("expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiry: Self = this.set("expiry", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLaunch(value: String): Self = this.set("launch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunch: Self = this.set("launch", js.undefined)
    
    @scala.inline
    def setLaunchImage(value: String): Self = this.set("launchImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchImage: Self = this.set("launchImage", js.undefined)
    
    @scala.inline
    def setLocKey(value: String): Self = this.set("locKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocKey: Self = this.set("locKey", js.undefined)
    
    @scala.inline
    def setMdm(value: String): Self = this.set("mdm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMdm: Self = this.set("mdm", js.undefined)
    
    @scala.inline
    def setMutableContent(value: Double): Self = this.set("mutableContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutableContent: Self = this.set("mutableContent", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setRestrictedPackageName(value: String): Self = this.set("restrictedPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedPackageName: Self = this.set("restrictedPackageName", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLive: Self = this.set("timeToLive", js.undefined)
    
    @scala.inline
    def setTitleLocArgs(value: String): Self = this.set("titleLocArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLocArgs: Self = this.set("titleLocArgs", js.undefined)
    
    @scala.inline
    def setTitleLocKey(value: String): Self = this.set("titleLocKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLocKey: Self = this.set("titleLocKey", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    
    @scala.inline
    def setTruncateAtWordEnd(value: Boolean): Self = this.set("truncateAtWordEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncateAtWordEnd: Self = this.set("truncateAtWordEnd", js.undefined)
    
    @scala.inline
    def setUrlArgs(value: String): Self = this.set("urlArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlArgs: Self = this.set("urlArgs", js.undefined)
  }
}
