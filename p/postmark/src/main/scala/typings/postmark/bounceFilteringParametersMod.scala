package typings.postmark

import typings.postmark.filteringParametersMod.FilteringParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bounceFilteringParametersMod {
  
  @JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceFilteringParameters")
  @js.native
  class BounceFilteringParameters protected () extends FilteringParameters {
    def this(
      count: js.UndefOr[Double],
      offset: js.UndefOr[Double],
      `type`: js.UndefOr[BounceType],
      inactive: js.UndefOr[Boolean],
      emailFilter: js.UndefOr[String],
      tag: js.UndefOr[String],
      messageID: js.UndefOr[String],
      fromDate: js.UndefOr[String],
      toDate: js.UndefOr[String],
      messageStream: js.UndefOr[String]
    ) = this()
    
    var emailFilter: js.UndefOr[String] = js.native
    
    var fromDate: js.UndefOr[String] = js.native
    
    var inactive: js.UndefOr[Boolean] = js.native
    
    var messageID: js.UndefOr[String] = js.native
    
    var messageStream: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var toDate: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[BounceType] = js.native
  }
  
  @js.native
  sealed trait BounceType extends StObject
  @JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceType")
  @js.native
  object BounceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BounceType with String] = js.native
    
    @js.native
    sealed trait AddressChange extends BounceType
    /* "AddressChange" */ val AddressChange: typings.postmark.bounceFilteringParametersMod.BounceType.AddressChange with String = js.native
    
    @js.native
    sealed trait AutoResponder extends BounceType
    /* "AutoResponder" */ val AutoResponder: typings.postmark.bounceFilteringParametersMod.BounceType.AutoResponder with String = js.native
    
    @js.native
    sealed trait BadEmailAddress extends BounceType
    /* "BadEmailAddress" */ val BadEmailAddress: typings.postmark.bounceFilteringParametersMod.BounceType.BadEmailAddress with String = js.native
    
    @js.native
    sealed trait Blocked extends BounceType
    /* "Blocked" */ val Blocked: typings.postmark.bounceFilteringParametersMod.BounceType.Blocked with String = js.native
    
    @js.native
    sealed trait ChallengeVerification extends BounceType
    /* "ChallengeVerification" */ val ChallengeVerification: typings.postmark.bounceFilteringParametersMod.BounceType.ChallengeVerification with String = js.native
    
    @js.native
    sealed trait DMARCPolicy extends BounceType
    /* "DMARCPolicy" */ val DMARCPolicy: typings.postmark.bounceFilteringParametersMod.BounceType.DMARCPolicy with String = js.native
    
    @js.native
    sealed trait DnsError extends BounceType
    /* "DnsError" */ val DnsError: typings.postmark.bounceFilteringParametersMod.BounceType.DnsError with String = js.native
    
    @js.native
    sealed trait HardBounce extends BounceType
    /* "HardBounce" */ val HardBounce: typings.postmark.bounceFilteringParametersMod.BounceType.HardBounce with String = js.native
    
    @js.native
    sealed trait InboundError extends BounceType
    /* "InboundError" */ val InboundError: typings.postmark.bounceFilteringParametersMod.BounceType.InboundError with String = js.native
    
    @js.native
    sealed trait ManuallyDeactivated extends BounceType
    /* "ManuallyDeactivated" */ val ManuallyDeactivated: typings.postmark.bounceFilteringParametersMod.BounceType.ManuallyDeactivated with String = js.native
    
    @js.native
    sealed trait OpenRelayTest extends BounceType
    /* "OpenRelayTest" */ val OpenRelayTest: typings.postmark.bounceFilteringParametersMod.BounceType.OpenRelayTest with String = js.native
    
    @js.native
    sealed trait SMTPApiError extends BounceType
    /* "SMTPApiError" */ val SMTPApiError: typings.postmark.bounceFilteringParametersMod.BounceType.SMTPApiError with String = js.native
    
    @js.native
    sealed trait SoftBounce extends BounceType
    /* "SoftBounce" */ val SoftBounce: typings.postmark.bounceFilteringParametersMod.BounceType.SoftBounce with String = js.native
    
    @js.native
    sealed trait SpamComplaint extends BounceType
    /* "SpamComplaint" */ val SpamComplaint: typings.postmark.bounceFilteringParametersMod.BounceType.SpamComplaint with String = js.native
    
    @js.native
    sealed trait SpamNotification extends BounceType
    /* "SpamNotification" */ val SpamNotification: typings.postmark.bounceFilteringParametersMod.BounceType.SpamNotification with String = js.native
    
    @js.native
    sealed trait Subscribe extends BounceType
    /* "Subscribe" */ val Subscribe: typings.postmark.bounceFilteringParametersMod.BounceType.Subscribe with String = js.native
    
    @js.native
    sealed trait TemplateRenderingFailed extends BounceType
    /* "TemplateRenderingFailed" */ val TemplateRenderingFailed: typings.postmark.bounceFilteringParametersMod.BounceType.TemplateRenderingFailed with String = js.native
    
    @js.native
    sealed trait Transient extends BounceType
    /* "Transient" */ val Transient: typings.postmark.bounceFilteringParametersMod.BounceType.Transient with String = js.native
    
    @js.native
    sealed trait Unconfirmed extends BounceType
    /* "Unconfirmed" */ val Unconfirmed: typings.postmark.bounceFilteringParametersMod.BounceType.Unconfirmed with String = js.native
    
    @js.native
    sealed trait Unknown extends BounceType
    /* "Unknown" */ val Unknown: typings.postmark.bounceFilteringParametersMod.BounceType.Unknown with String = js.native
    
    @js.native
    sealed trait Unsubscribe extends BounceType
    /* "Unsubscribe" */ val Unsubscribe: typings.postmark.bounceFilteringParametersMod.BounceType.Unsubscribe with String = js.native
    
    @js.native
    sealed trait VirusNotification extends BounceType
    /* "VirusNotification" */ val VirusNotification: typings.postmark.bounceFilteringParametersMod.BounceType.VirusNotification with String = js.native
  }
}
