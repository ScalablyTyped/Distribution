package typings.postmark.bounceFilteringParametersMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BounceType extends js.Object
@JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceType")
@js.native
object BounceType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BounceType with String] = js.native
  
  @js.native
  sealed trait AddressChange extends BounceType
  /* "AddressChange" */ @js.native
  object AddressChange extends TopLevel[AddressChange with String]
  
  @js.native
  sealed trait AutoResponder extends BounceType
  /* "AutoResponder" */ @js.native
  object AutoResponder extends TopLevel[AutoResponder with String]
  
  @js.native
  sealed trait BadEmailAddress extends BounceType
  /* "BadEmailAddress" */ @js.native
  object BadEmailAddress extends TopLevel[BadEmailAddress with String]
  
  @js.native
  sealed trait Blocked extends BounceType
  /* "Blocked" */ @js.native
  object Blocked extends TopLevel[Blocked with String]
  
  @js.native
  sealed trait ChallengeVerification extends BounceType
  /* "ChallengeVerification" */ @js.native
  object ChallengeVerification extends TopLevel[ChallengeVerification with String]
  
  @js.native
  sealed trait DMARCPolicy extends BounceType
  /* "DMARCPolicy" */ @js.native
  object DMARCPolicy extends TopLevel[DMARCPolicy with String]
  
  @js.native
  sealed trait DnsError extends BounceType
  /* "DnsError" */ @js.native
  object DnsError extends TopLevel[DnsError with String]
  
  @js.native
  sealed trait HardBounce extends BounceType
  /* "HardBounce" */ @js.native
  object HardBounce extends TopLevel[HardBounce with String]
  
  @js.native
  sealed trait InboundError extends BounceType
  /* "InboundError" */ @js.native
  object InboundError extends TopLevel[InboundError with String]
  
  @js.native
  sealed trait ManuallyDeactivated extends BounceType
  /* "ManuallyDeactivated" */ @js.native
  object ManuallyDeactivated extends TopLevel[ManuallyDeactivated with String]
  
  @js.native
  sealed trait OpenRelayTest extends BounceType
  /* "OpenRelayTest" */ @js.native
  object OpenRelayTest extends TopLevel[OpenRelayTest with String]
  
  @js.native
  sealed trait SMTPApiError extends BounceType
  /* "SMTPApiError" */ @js.native
  object SMTPApiError extends TopLevel[SMTPApiError with String]
  
  @js.native
  sealed trait SoftBounce extends BounceType
  /* "SoftBounce" */ @js.native
  object SoftBounce extends TopLevel[SoftBounce with String]
  
  @js.native
  sealed trait SpamComplaint extends BounceType
  /* "SpamComplaint" */ @js.native
  object SpamComplaint extends TopLevel[SpamComplaint with String]
  
  @js.native
  sealed trait SpamNotification extends BounceType
  /* "SpamNotification" */ @js.native
  object SpamNotification extends TopLevel[SpamNotification with String]
  
  @js.native
  sealed trait Subscribe extends BounceType
  /* "Subscribe" */ @js.native
  object Subscribe extends TopLevel[Subscribe with String]
  
  @js.native
  sealed trait TemplateRenderingFailed extends BounceType
  /* "TemplateRenderingFailed" */ @js.native
  object TemplateRenderingFailed extends TopLevel[TemplateRenderingFailed with String]
  
  @js.native
  sealed trait Transient extends BounceType
  /* "Transient" */ @js.native
  object Transient extends TopLevel[Transient with String]
  
  @js.native
  sealed trait Unconfirmed extends BounceType
  /* "Unconfirmed" */ @js.native
  object Unconfirmed extends TopLevel[Unconfirmed with String]
  
  @js.native
  sealed trait Unknown extends BounceType
  /* "Unknown" */ @js.native
  object Unknown extends TopLevel[Unknown with String]
  
  @js.native
  sealed trait Unsubscribe extends BounceType
  /* "Unsubscribe" */ @js.native
  object Unsubscribe extends TopLevel[Unsubscribe with String]
  
  @js.native
  sealed trait VirusNotification extends BounceType
  /* "VirusNotification" */ @js.native
  object VirusNotification extends TopLevel[VirusNotification with String]
}
