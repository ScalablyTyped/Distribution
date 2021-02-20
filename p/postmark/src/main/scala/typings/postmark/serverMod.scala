package typings.postmark

import typings.postmark.messageSupportingTypesMod.LinkTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("postmark/dist/client/models/server/Server", "CreateServerRequest")
  @js.native
  class CreateServerRequest protected () extends UpdateServerRequest {
    def this(
      Name: String,
      Color: js.UndefOr[String],
      SmtpApiActivated: js.UndefOr[Boolean],
      RawEmailEnabled: js.UndefOr[Boolean],
      InboundHookUrl: js.UndefOr[String],
      BounceHookUrl: js.UndefOr[String],
      OpenHookUrl: js.UndefOr[String],
      DeliveryHookUrl: js.UndefOr[String],
      ClickHookUrl: js.UndefOr[String],
      PostFirstOpenOnly: js.UndefOr[Boolean],
      InboundSpamThreshold: js.UndefOr[Double],
      TrackOpens: js.UndefOr[Boolean],
      TrackLinks: js.UndefOr[LinkTrackingOptions],
      IncludeBounceContentInHook: js.UndefOr[Boolean],
      EnableSmtpApiErrorHooks: js.UndefOr[Boolean]
    ) = this()
  }
  
  @JSImport("postmark/dist/client/models/server/Server", "UpdateServerRequest")
  @js.native
  class UpdateServerRequest protected () extends StObject {
    def this(
      Name: js.UndefOr[String],
      Color: js.UndefOr[String],
      SmtpApiActivated: js.UndefOr[Boolean],
      RawEmailEnabled: js.UndefOr[Boolean],
      InboundHookUrl: js.UndefOr[String],
      BounceHookUrl: js.UndefOr[String],
      OpenHookUrl: js.UndefOr[String],
      DeliveryHookUrl: js.UndefOr[String],
      ClickHookUrl: js.UndefOr[String],
      PostFirstOpenOnly: js.UndefOr[Boolean],
      InboundSpamThreshold: js.UndefOr[Double],
      TrackOpens: js.UndefOr[Boolean],
      TrackLinks: js.UndefOr[LinkTrackingOptions],
      IncludeBounceContentInHook: js.UndefOr[Boolean],
      EnableSmtpApiErrorHooks: js.UndefOr[Boolean]
    ) = this()
    
    var BounceHookUrl: js.UndefOr[String] = js.native
    
    var ClickHookUrl: js.UndefOr[String] = js.native
    
    var Color: js.UndefOr[String] = js.native
    
    var DeliveryHookUrl: js.UndefOr[String] = js.native
    
    var EnableSmtpApiErrorHooks: js.UndefOr[Boolean] = js.native
    
    var InboundHookUrl: js.UndefOr[String] = js.native
    
    var InboundSpamThreshold: js.UndefOr[Double] = js.native
    
    var IncludeBounceContentInHook: js.UndefOr[Boolean] = js.native
    
    var Name: js.UndefOr[String] = js.native
    
    var OpenHookUrl: js.UndefOr[String] = js.native
    
    var PostFirstOpenOnly: js.UndefOr[Boolean] = js.native
    
    var RawEmailEnabled: js.UndefOr[Boolean] = js.native
    
    var SmtpApiActivated: js.UndefOr[Boolean] = js.native
    
    var TrackLinks: js.UndefOr[LinkTrackingOptions] = js.native
    
    var TrackOpens: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait Server extends StObject {
    
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
    implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiTokens(value: js.Array[String]): Self = StObject.set(x, "ApiTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiTokensVarargs(value: String*): Self = StObject.set(x, "ApiTokens", js.Array(value :_*))
      
      @scala.inline
      def setBounceHookUrl(value: String): Self = StObject.set(x, "BounceHookUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceHookUrlUndefined: Self = StObject.set(x, "BounceHookUrl", js.undefined)
      
      @scala.inline
      def setClickHookUrl(value: String): Self = StObject.set(x, "ClickHookUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickHookUrlUndefined: Self = StObject.set(x, "ClickHookUrl", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryHookUrl(value: String): Self = StObject.set(x, "DeliveryHookUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryHookUrlUndefined: Self = StObject.set(x, "DeliveryHookUrl", js.undefined)
      
      @scala.inline
      def setEnableSmtpApiErrorHooks(value: Boolean): Self = StObject.set(x, "EnableSmtpApiErrorHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundAddress(value: String): Self = StObject.set(x, "InboundAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundDomain(value: String): Self = StObject.set(x, "InboundDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundDomainUndefined: Self = StObject.set(x, "InboundDomain", js.undefined)
      
      @scala.inline
      def setInboundHash(value: String): Self = StObject.set(x, "InboundHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundHookUrl(value: String): Self = StObject.set(x, "InboundHookUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInboundHookUrlUndefined: Self = StObject.set(x, "InboundHookUrl", js.undefined)
      
      @scala.inline
      def setInboundSpamThreshold(value: Double): Self = StObject.set(x, "InboundSpamThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeBounceContentInHook(value: Boolean): Self = StObject.set(x, "IncludeBounceContentInHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenHookUrl(value: String): Self = StObject.set(x, "OpenHookUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenHookUrlUndefined: Self = StObject.set(x, "OpenHookUrl", js.undefined)
      
      @scala.inline
      def setPostFirstOpenOnly(value: Boolean): Self = StObject.set(x, "PostFirstOpenOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawEmailEnabled(value: Boolean): Self = StObject.set(x, "RawEmailEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerLink(value: String): Self = StObject.set(x, "ServerLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmtpApiActivated(value: Boolean): Self = StObject.set(x, "SmtpApiActivated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackLinks(value: LinkTrackingOptions): Self = StObject.set(x, "TrackLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackOpens(value: Boolean): Self = StObject.set(x, "TrackOpens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackOpensUndefined: Self = StObject.set(x, "TrackOpens", js.undefined)
    }
  }
}
