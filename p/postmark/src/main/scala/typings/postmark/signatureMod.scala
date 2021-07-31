package typings.postmark

import typings.postmark.domainMod.DomainDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("postmark/dist/client/models/senders/Signature", "CreateSignatureRequest")
  @js.native
  class CreateSignatureRequest protected () extends StObject {
    def this(name: String, fromEmail: String) = this()
    def this(name: String, fromEmail: String, replyToEmail: String) = this()
    def this(name: String, fromEmail: String, replyToEmail: String, returnPathDomain: String) = this()
    def this(name: String, fromEmail: String, replyToEmail: Unit, returnPathDomain: String) = this()
    
    var FromEmail: String = js.native
    
    var Name: js.UndefOr[String] = js.native
    
    var ReplyToEmail: js.UndefOr[String] = js.native
    
    var ReturnPathDomain: js.UndefOr[String] = js.native
  }
  
  @JSImport("postmark/dist/client/models/senders/Signature", "UpdateSignatureRequest")
  @js.native
  class UpdateSignatureRequest () extends StObject {
    def this(Name: String) = this()
    def this(Name: String, ReplyToEmail: String) = this()
    def this(Name: Unit, ReplyToEmail: String) = this()
    def this(Name: String, ReplyToEmail: String, ReturnPathDomain: String) = this()
    def this(Name: String, ReplyToEmail: Unit, ReturnPathDomain: String) = this()
    def this(Name: Unit, ReplyToEmail: String, ReturnPathDomain: String) = this()
    def this(Name: Unit, ReplyToEmail: Unit, ReturnPathDomain: String) = this()
    
    var Name: js.UndefOr[String] = js.native
    
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SignatureMutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmed(value: Boolean): Self = StObject.set(x, "Confirmed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToEmailAddress(value: String): Self = StObject.set(x, "ReplyToEmailAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignatureDetails
    extends StObject
       with DomainDetails {
    
    var Confirmed: Boolean
    
    var Domain: String
    
    var EmailAddress: String
    
    var ReplyToEmailAddress: String
  }
  object SignatureDetails {
    
    @scala.inline
    def apply(
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
      val __obj = js.Dynamic.literal(Confirmed = Confirmed.asInstanceOf[js.Any], DKIMHost = DKIMHost.asInstanceOf[js.Any], DKIMPendingHost = DKIMPendingHost.asInstanceOf[js.Any], DKIMPendingTextValue = DKIMPendingTextValue.asInstanceOf[js.Any], DKIMRevokedHost = DKIMRevokedHost.asInstanceOf[js.Any], DKIMRevokedTextValue = DKIMRevokedTextValue.asInstanceOf[js.Any], DKIMTextValue = DKIMTextValue.asInstanceOf[js.Any], DKIMUpdateStatus = DKIMUpdateStatus.asInstanceOf[js.Any], DKIMVerified = DKIMVerified.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReplyToEmailAddress = ReplyToEmailAddress.asInstanceOf[js.Any], ReturnPathDomain = ReturnPathDomain.asInstanceOf[js.Any], ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SPFHost = SPFHost.asInstanceOf[js.Any], SPFTextValue = SPFTextValue.asInstanceOf[js.Any], SPFVerified = SPFVerified.asInstanceOf[js.Any], SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureDetails]
    }
    
    @scala.inline
    implicit class SignatureDetailsMutableBuilder[Self <: SignatureDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmed(value: Boolean): Self = StObject.set(x, "Confirmed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToEmailAddress(value: String): Self = StObject.set(x, "ReplyToEmailAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait Signatures extends StObject {
    
    var SenderSignatures: js.Array[Signature]
    
    var TotalCount: Double
  }
  object Signatures {
    
    @scala.inline
    def apply(SenderSignatures: js.Array[Signature], TotalCount: Double): Signatures = {
      val __obj = js.Dynamic.literal(SenderSignatures = SenderSignatures.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signatures]
    }
    
    @scala.inline
    implicit class SignaturesMutableBuilder[Self <: Signatures] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSenderSignatures(value: js.Array[Signature]): Self = StObject.set(x, "SenderSignatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderSignaturesVarargs(value: Signature*): Self = StObject.set(x, "SenderSignatures", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
