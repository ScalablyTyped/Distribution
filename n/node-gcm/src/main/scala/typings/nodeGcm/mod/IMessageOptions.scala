package typings.nodeGcm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageOptions extends js.Object {
  var collapseKey: js.UndefOr[String] = js.native
  var contentAvailable: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[StringDictionary[String]] = js.native
  var delayWhileIdle: js.UndefOr[Boolean] = js.native
  var dryRun: js.UndefOr[Boolean] = js.native
  var mutableContent: js.UndefOr[Boolean] = js.native
  var notification: js.UndefOr[INotificationOptions] = js.native
  var priority: js.UndefOr[String] = js.native
  var restrictedPackageName: js.UndefOr[String] = js.native
  var timeToLive: js.UndefOr[Double] = js.native
}

object IMessageOptions {
  @scala.inline
  def apply(): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageOptions]
  }
  @scala.inline
  implicit class IMessageOptionsOps[Self <: IMessageOptions] (val x: Self) extends AnyVal {
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
    def setCollapseKey(value: String): Self = this.set("collapseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseKey: Self = this.set("collapseKey", js.undefined)
    @scala.inline
    def setContentAvailable(value: Boolean): Self = this.set("contentAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentAvailable: Self = this.set("contentAvailable", js.undefined)
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDelayWhileIdle(value: Boolean): Self = this.set("delayWhileIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayWhileIdle: Self = this.set("delayWhileIdle", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setMutableContent(value: Boolean): Self = this.set("mutableContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutableContent: Self = this.set("mutableContent", js.undefined)
    @scala.inline
    def setNotification(value: INotificationOptions): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setRestrictedPackageName(value: String): Self = this.set("restrictedPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictedPackageName: Self = this.set("restrictedPackageName", js.undefined)
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLive: Self = this.set("timeToLive", js.undefined)
  }
  
}

