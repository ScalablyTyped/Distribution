package typings.postmark.serverMod

import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var ApiTokens: js.Array[String] = js.native
  var BounceHookUrl: js.UndefOr[String] = js.native
  var ClickHookUrl: js.UndefOr[String] = js.native
  var Color: String = js.native
  var DeliveryHookUrl: js.UndefOr[String] = js.native
  var EnableSmtpApiErrorHooks: Boolean = js.native
  var ID: Double = js.native
  var InboundAddress: String = js.native
  var InboundDomain: js.UndefOr[String] = js.native
  var InboundHash: String = js.native
  var InboundHookUrl: js.UndefOr[String] = js.native
  var InboundSpamThreshold: Double = js.native
  var IncludeBounceContentInHook: Boolean = js.native
  var Name: String = js.native
  var OpenHookUrl: js.UndefOr[String] = js.native
  var PostFirstOpenOnly: Boolean = js.native
  var RawEmailEnabled: Boolean = js.native
  var ServerLink: String = js.native
  var SmtpApiActivated: Boolean = js.native
  var TrackLinks: LinkTrackingOptions = js.native
  var TrackOpens: js.UndefOr[Boolean] = js.native
}

object Server {
  @scala.inline
  def apply(
    ApiTokens: js.Array[String],
    Color: String,
    EnableSmtpApiErrorHooks: Boolean,
    ID: Double,
    InboundAddress: String,
    InboundHash: String,
    InboundSpamThreshold: Double,
    IncludeBounceContentInHook: Boolean,
    Name: String,
    PostFirstOpenOnly: Boolean,
    RawEmailEnabled: Boolean,
    ServerLink: String,
    SmtpApiActivated: Boolean,
    TrackLinks: LinkTrackingOptions
  ): Server = {
    val __obj = js.Dynamic.literal(ApiTokens = ApiTokens.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], EnableSmtpApiErrorHooks = EnableSmtpApiErrorHooks.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InboundAddress = InboundAddress.asInstanceOf[js.Any], InboundHash = InboundHash.asInstanceOf[js.Any], InboundSpamThreshold = InboundSpamThreshold.asInstanceOf[js.Any], IncludeBounceContentInHook = IncludeBounceContentInHook.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PostFirstOpenOnly = PostFirstOpenOnly.asInstanceOf[js.Any], RawEmailEnabled = RawEmailEnabled.asInstanceOf[js.Any], ServerLink = ServerLink.asInstanceOf[js.Any], SmtpApiActivated = SmtpApiActivated.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  @scala.inline
  implicit class ServerOps[Self <: Server] (val x: Self) extends AnyVal {
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
    def setApiTokensVarargs(value: String*): Self = this.set("ApiTokens", js.Array(value :_*))
    @scala.inline
    def setApiTokens(value: js.Array[String]): Self = this.set("ApiTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableSmtpApiErrorHooks(value: Boolean): Self = this.set("EnableSmtpApiErrorHooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setInboundAddress(value: String): Self = this.set("InboundAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setInboundHash(value: String): Self = this.set("InboundHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setInboundSpamThreshold(value: Double): Self = this.set("InboundSpamThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeBounceContentInHook(value: Boolean): Self = this.set("IncludeBounceContentInHook", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostFirstOpenOnly(value: Boolean): Self = this.set("PostFirstOpenOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawEmailEnabled(value: Boolean): Self = this.set("RawEmailEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerLink(value: String): Self = this.set("ServerLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmtpApiActivated(value: Boolean): Self = this.set("SmtpApiActivated", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackLinks(value: LinkTrackingOptions): Self = this.set("TrackLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounceHookUrl(value: String): Self = this.set("BounceHookUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounceHookUrl: Self = this.set("BounceHookUrl", js.undefined)
    @scala.inline
    def setClickHookUrl(value: String): Self = this.set("ClickHookUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickHookUrl: Self = this.set("ClickHookUrl", js.undefined)
    @scala.inline
    def setDeliveryHookUrl(value: String): Self = this.set("DeliveryHookUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryHookUrl: Self = this.set("DeliveryHookUrl", js.undefined)
    @scala.inline
    def setInboundDomain(value: String): Self = this.set("InboundDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboundDomain: Self = this.set("InboundDomain", js.undefined)
    @scala.inline
    def setInboundHookUrl(value: String): Self = this.set("InboundHookUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboundHookUrl: Self = this.set("InboundHookUrl", js.undefined)
    @scala.inline
    def setOpenHookUrl(value: String): Self = this.set("OpenHookUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenHookUrl: Self = this.set("OpenHookUrl", js.undefined)
    @scala.inline
    def setTrackOpens(value: Boolean): Self = this.set("TrackOpens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackOpens: Self = this.set("TrackOpens", js.undefined)
  }
  
}

