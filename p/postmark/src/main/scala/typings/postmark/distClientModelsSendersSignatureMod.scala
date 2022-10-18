package typings.postmark

import typings.postmark.distClientModelsDomainsDomainMod.DomainDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsSendersSignatureMod {
  
  @JSImport("postmark/dist/client/models/senders/Signature", "CreateSignatureRequest")
  @js.native
  open class CreateSignatureRequest protected () extends StObject {
    def this(Name: String, FromEmail: String) = this()
    def this(Name: String, FromEmail: String, ReplyToEmail: String) = this()
    def this(Name: String, FromEmail: String, ReplyToEmail: String, ReturnPathDomain: String) = this()
    def this(Name: String, FromEmail: String, ReplyToEmail: Unit, ReturnPathDomain: String) = this()
    def this(
      Name: String,
      FromEmail: String,
      ReplyToEmail: String,
      ReturnPathDomain: String,
      ConfirmationPersonalNote: String
    ) = this()
    def this(
      Name: String,
      FromEmail: String,
      ReplyToEmail: String,
      ReturnPathDomain: Unit,
      ConfirmationPersonalNote: String
    ) = this()
    def this(
      Name: String,
      FromEmail: String,
      ReplyToEmail: Unit,
      ReturnPathDomain: String,
      ConfirmationPersonalNote: String
    ) = this()
    def this(
      Name: String,
      FromEmail: String,
      ReplyToEmail: Unit,
      ReturnPathDomain: Unit,
      ConfirmationPersonalNote: String
    ) = this()
    
    var ConfirmationPersonalNote: js.UndefOr[String] = js.native
    
    var FromEmail: String = js.native
    
    var Name: js.UndefOr[String] = js.native
    
    var ReplyToEmail: js.UndefOr[String] = js.native
    
    var ReturnPathDomain: js.UndefOr[String] = js.native
  }
  
  @JSImport("postmark/dist/client/models/senders/Signature", "UpdateSignatureRequest")
  @js.native
  open class UpdateSignatureRequest protected () extends StObject {
    def this(Name: String) = this()
    def this(Name: String, ReplyToEmail: String) = this()
    def this(Name: String, ReplyToEmail: String, ReturnPathDomain: String) = this()
    def this(Name: String, ReplyToEmail: Unit, ReturnPathDomain: String) = this()
    def this(Name: String, ReplyToEmail: String, ReturnPathDomain: String, ConfirmationPersonalNote: String) = this()
    def this(Name: String, ReplyToEmail: String, ReturnPathDomain: Unit, ConfirmationPersonalNote: String) = this()
    def this(Name: String, ReplyToEmail: Unit, ReturnPathDomain: String, ConfirmationPersonalNote: String) = this()
    def this(Name: String, ReplyToEmail: Unit, ReturnPathDomain: Unit, ConfirmationPersonalNote: String) = this()
    
    var ConfirmationPersonalNote: js.UndefOr[String] = js.native
    
    var Name: String = js.native
    
    var ReplyToEmail: js.UndefOr[String] = js.native
    
    var ReturnPathDomain: js.UndefOr[String] = js.native
  }
  
  trait Signature extends StObject {
    
    var Confirmed: Boolean
    
    var Domain: String
    
    var EmailAddress: String
    
    var ID: Double
    
    var Name: String
    
    var ReplyToEmailAddress: String
  }
  object Signature {
    
    inline def apply(
      Confirmed: Boolean,
      Domain: String,
      EmailAddress: String,
      ID: Double,
      Name: String,
      ReplyToEmailAddress: String
    ): Signature = {
      val __obj = js.Dynamic.literal(Confirmed = Confirmed.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReplyToEmailAddress = ReplyToEmailAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signature]
    }
    
    extension [Self <: Signature](x: Self) {
      
      inline def setConfirmed(value: Boolean): Self = StObject.set(x, "Confirmed", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setReplyToEmailAddress(value: String): Self = StObject.set(x, "ReplyToEmailAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignatureDetails
    extends StObject
       with DomainDetails {
    
    var ConfirmationPersonalNote: String
    
    var Confirmed: Boolean
    
    var Domain: String
    
    var EmailAddress: String
    
    var ReplyToEmailAddress: String
  }
  object SignatureDetails {
    
    inline def apply(
      ConfirmationPersonalNote: String,
      Confirmed: Boolean,
      DKIMHost: String,
      DKIMPendingHost: String,
      DKIMPendingTextValue: String,
      DKIMRevokedHost: String,
      DKIMRevokedTextValue: String,
      DKIMTextValue: String,
      DKIMUpdateStatus: String,
      DKIMVerified: Boolean,
      Domain: String,
      EmailAddress: String,
      ID: Double,
      Name: String,
      ReplyToEmailAddress: String,
      ReturnPathDomain: String,
      ReturnPathDomainCNAMEValue: String,
      ReturnPathDomainVerified: Boolean,
      SPFHost: String,
      SPFTextValue: String,
      SPFVerified: Boolean,
      SafeToRemoveRevokedKeyFromDNS: String,
      WeakDKIM: Boolean
    ): SignatureDetails = {
      val __obj = js.Dynamic.literal(ConfirmationPersonalNote = ConfirmationPersonalNote.asInstanceOf[js.Any], Confirmed = Confirmed.asInstanceOf[js.Any], DKIMHost = DKIMHost.asInstanceOf[js.Any], DKIMPendingHost = DKIMPendingHost.asInstanceOf[js.Any], DKIMPendingTextValue = DKIMPendingTextValue.asInstanceOf[js.Any], DKIMRevokedHost = DKIMRevokedHost.asInstanceOf[js.Any], DKIMRevokedTextValue = DKIMRevokedTextValue.asInstanceOf[js.Any], DKIMTextValue = DKIMTextValue.asInstanceOf[js.Any], DKIMUpdateStatus = DKIMUpdateStatus.asInstanceOf[js.Any], DKIMVerified = DKIMVerified.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReplyToEmailAddress = ReplyToEmailAddress.asInstanceOf[js.Any], ReturnPathDomain = ReturnPathDomain.asInstanceOf[js.Any], ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SPFHost = SPFHost.asInstanceOf[js.Any], SPFTextValue = SPFTextValue.asInstanceOf[js.Any], SPFVerified = SPFVerified.asInstanceOf[js.Any], SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureDetails]
    }
    
    extension [Self <: SignatureDetails](x: Self) {
      
      inline def setConfirmationPersonalNote(value: String): Self = StObject.set(x, "ConfirmationPersonalNote", value.asInstanceOf[js.Any])
      
      inline def setConfirmed(value: Boolean): Self = StObject.set(x, "Confirmed", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      inline def setReplyToEmailAddress(value: String): Self = StObject.set(x, "ReplyToEmailAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait Signatures extends StObject {
    
    var SenderSignatures: js.Array[Signature]
    
    var TotalCount: Double
  }
  object Signatures {
    
    inline def apply(SenderSignatures: js.Array[Signature], TotalCount: Double): Signatures = {
      val __obj = js.Dynamic.literal(SenderSignatures = SenderSignatures.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signatures]
    }
    
    extension [Self <: Signatures](x: Self) {
      
      inline def setSenderSignatures(value: js.Array[Signature]): Self = StObject.set(x, "SenderSignatures", value.asInstanceOf[js.Any])
      
      inline def setSenderSignaturesVarargs(value: Signature*): Self = StObject.set(x, "SenderSignatures", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
