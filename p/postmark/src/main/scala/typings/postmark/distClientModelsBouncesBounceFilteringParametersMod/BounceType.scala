package typings.postmark.distClientModelsBouncesBounceFilteringParametersMod

import org.scalablytyped.runtime.TopLevel
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.AddressChange
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.AutoResponder
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.BadEmailAddress
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Blocked
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.ChallengeVerification
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.DMARCPolicy
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.DnsError
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.HardBounce
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.InboundError
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.ManuallyDeactivated
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.OpenRelayTest
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SMTPApiError
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SoftBounce
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SpamComplaint
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.SpamNotification
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Subscribe
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.TemplateRenderingFailed
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Transient
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unconfirmed
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unknown
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.Unsubscribe
import typings.postmark.distClientModelsBouncesBounceFilteringParametersMod.BounceType.VirusNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BounceType extends js.Object

@JSImport("postmark/dist/client/models/bounces/BounceFilteringParameters", "BounceType")
@js.native
object BounceType extends js.Object {
  @js.native
  sealed trait AddressChange extends BounceType
  
  @js.native
  sealed trait AutoResponder extends BounceType
  
  @js.native
  sealed trait BadEmailAddress extends BounceType
  
  @js.native
  sealed trait Blocked extends BounceType
  
  @js.native
  sealed trait ChallengeVerification extends BounceType
  
  @js.native
  sealed trait DMARCPolicy extends BounceType
  
  @js.native
  sealed trait DnsError extends BounceType
  
  @js.native
  sealed trait HardBounce extends BounceType
  
  @js.native
  sealed trait InboundError extends BounceType
  
  @js.native
  sealed trait ManuallyDeactivated extends BounceType
  
  @js.native
  sealed trait OpenRelayTest extends BounceType
  
  @js.native
  sealed trait SMTPApiError extends BounceType
  
  @js.native
  sealed trait SoftBounce extends BounceType
  
  @js.native
  sealed trait SpamComplaint extends BounceType
  
  @js.native
  sealed trait SpamNotification extends BounceType
  
  @js.native
  sealed trait Subscribe extends BounceType
  
  @js.native
  sealed trait TemplateRenderingFailed extends BounceType
  
  @js.native
  sealed trait Transient extends BounceType
  
  @js.native
  sealed trait Unconfirmed extends BounceType
  
  @js.native
  sealed trait Unknown extends BounceType
  
  @js.native
  sealed trait Unsubscribe extends BounceType
  
  @js.native
  sealed trait VirusNotification extends BounceType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BounceType with String] = js.native
  /* "AddressChange" */ @js.native
  object AddressChange extends TopLevel[AddressChange with String]
  
  /* "AutoResponder" */ @js.native
  object AutoResponder extends TopLevel[AutoResponder with String]
  
  /* "BadEmailAddress" */ @js.native
  object BadEmailAddress extends TopLevel[BadEmailAddress with String]
  
  /* "Blocked" */ @js.native
  object Blocked extends TopLevel[Blocked with String]
  
  /* "ChallengeVerification" */ @js.native
  object ChallengeVerification extends TopLevel[ChallengeVerification with String]
  
  /* "DMARCPolicy" */ @js.native
  object DMARCPolicy extends TopLevel[DMARCPolicy with String]
  
  /* "DnsError" */ @js.native
  object DnsError extends TopLevel[DnsError with String]
  
  /* "HardBounce" */ @js.native
  object HardBounce extends TopLevel[HardBounce with String]
  
  /* "InboundError" */ @js.native
  object InboundError extends TopLevel[InboundError with String]
  
  /* "ManuallyDeactivated" */ @js.native
  object ManuallyDeactivated extends TopLevel[ManuallyDeactivated with String]
  
  /* "OpenRelayTest" */ @js.native
  object OpenRelayTest extends TopLevel[OpenRelayTest with String]
  
  /* "SMTPApiError" */ @js.native
  object SMTPApiError extends TopLevel[SMTPApiError with String]
  
  /* "SoftBounce" */ @js.native
  object SoftBounce extends TopLevel[SoftBounce with String]
  
  /* "SpamComplaint" */ @js.native
  object SpamComplaint extends TopLevel[SpamComplaint with String]
  
  /* "SpamNotification" */ @js.native
  object SpamNotification extends TopLevel[SpamNotification with String]
  
  /* "Subscribe" */ @js.native
  object Subscribe extends TopLevel[Subscribe with String]
  
  /* "TemplateRenderingFailed" */ @js.native
  object TemplateRenderingFailed extends TopLevel[TemplateRenderingFailed with String]
  
  /* "Transient" */ @js.native
  object Transient extends TopLevel[Transient with String]
  
  /* "Unconfirmed" */ @js.native
  object Unconfirmed extends TopLevel[Unconfirmed with String]
  
  /* "Unknown" */ @js.native
  object Unknown extends TopLevel[Unknown with String]
  
  /* "Unsubscribe" */ @js.native
  object Unsubscribe extends TopLevel[Unsubscribe with String]
  
  /* "VirusNotification" */ @js.native
  object VirusNotification extends TopLevel[VirusNotification with String]
  
}

