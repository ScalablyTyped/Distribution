package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("postmark/dist/client/models/domains/Domain", "CreateDomainRequest")
  @js.native
  class CreateDomainRequest protected () extends StObject {
    def this(Name: String) = this()
    def this(Name: String, ReturnPathDomain: String) = this()
    
    var Name: String = js.native
    
    var ReturnPathDomain: js.UndefOr[String] = js.native
  }
  
  @JSImport("postmark/dist/client/models/domains/Domain", "UpdateDomainRequest")
  @js.native
  class UpdateDomainRequest protected () extends StObject {
    def this(ReturnPathDomain: String) = this()
    
    var ReturnPathDomain: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Domain extends StObject {
    
    var DKIMVerified: Boolean = js.native
    
    var ID: Double = js.native
    
    var Name: String = js.native
    
    var ReturnPathDomainVerified: Boolean = js.native
    
    var SPFVerified: Boolean = js.native
    
    var WeakDKIM: Boolean = js.native
  }
  object Domain {
    
    @scala.inline
    def apply(
      DKIMVerified: Boolean,
      ID: Double,
      Name: String,
      ReturnPathDomainVerified: Boolean,
      SPFVerified: Boolean,
      WeakDKIM: Boolean
    ): Domain = {
      val __obj = js.Dynamic.literal(DKIMVerified = DKIMVerified.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SPFVerified = SPFVerified.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDKIMVerified(value: Boolean): Self = StObject.set(x, "DKIMVerified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnPathDomainVerified(value: Boolean): Self = StObject.set(x, "ReturnPathDomainVerified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPFVerified(value: Boolean): Self = StObject.set(x, "SPFVerified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeakDKIM(value: Boolean): Self = StObject.set(x, "WeakDKIM", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DomainDetails extends Domain {
    
    var DKIMHost: String = js.native
    
    var DKIMPendingHost: String = js.native
    
    var DKIMPendingTextValue: String = js.native
    
    var DKIMRevokedHost: String = js.native
    
    var DKIMRevokedTextValue: String = js.native
    
    var DKIMTextValue: String = js.native
    
    var DKIMUpdateStatus: String = js.native
    
    var ReturnPathDomain: String = js.native
    
    var ReturnPathDomainCNAMEValue: String = js.native
    
    var SPFHost: String = js.native
    
    var SPFTextValue: String = js.native
    
    var SafeToRemoveRevokedKeyFromDNS: String = js.native
  }
  object DomainDetails {
    
    @scala.inline
    def apply(
      DKIMHost: String,
      DKIMPendingHost: String,
      DKIMPendingTextValue: String,
      DKIMRevokedHost: String,
      DKIMRevokedTextValue: String,
      DKIMTextValue: String,
      DKIMUpdateStatus: String,
      DKIMVerified: Boolean,
      ID: Double,
      Name: String,
      ReturnPathDomain: String,
      ReturnPathDomainCNAMEValue: String,
      ReturnPathDomainVerified: Boolean,
      SPFHost: String,
      SPFTextValue: String,
      SPFVerified: Boolean,
      SafeToRemoveRevokedKeyFromDNS: String,
      WeakDKIM: Boolean
    ): DomainDetails = {
      val __obj = js.Dynamic.literal(DKIMHost = DKIMHost.asInstanceOf[js.Any], DKIMPendingHost = DKIMPendingHost.asInstanceOf[js.Any], DKIMPendingTextValue = DKIMPendingTextValue.asInstanceOf[js.Any], DKIMRevokedHost = DKIMRevokedHost.asInstanceOf[js.Any], DKIMRevokedTextValue = DKIMRevokedTextValue.asInstanceOf[js.Any], DKIMTextValue = DKIMTextValue.asInstanceOf[js.Any], DKIMUpdateStatus = DKIMUpdateStatus.asInstanceOf[js.Any], DKIMVerified = DKIMVerified.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReturnPathDomain = ReturnPathDomain.asInstanceOf[js.Any], ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SPFHost = SPFHost.asInstanceOf[js.Any], SPFTextValue = SPFTextValue.asInstanceOf[js.Any], SPFVerified = SPFVerified.asInstanceOf[js.Any], SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainDetails]
    }
    
    @scala.inline
    implicit class DomainDetailsMutableBuilder[Self <: DomainDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDKIMHost(value: String): Self = StObject.set(x, "DKIMHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDKIMPendingHost(value: String): Self = StObject.set(x, "DKIMPendingHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDKIMPendingTextValue(value: String): Self = StObject.set(x, "DKIMPendingTextValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDKIMRevokedHost(value: String): Self = StObject.set(x, "DKIMRevokedHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDKIMRevokedTextValue(value: String): Self = StObject.set(x, "DKIMRevokedTextValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDKIMTextValue(value: String): Self = StObject.set(x, "DKIMTextValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDKIMUpdateStatus(value: String): Self = StObject.set(x, "DKIMUpdateStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnPathDomain(value: String): Self = StObject.set(x, "ReturnPathDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnPathDomainCNAMEValue(value: String): Self = StObject.set(x, "ReturnPathDomainCNAMEValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPFHost(value: String): Self = StObject.set(x, "SPFHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPFTextValue(value: String): Self = StObject.set(x, "SPFTextValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeToRemoveRevokedKeyFromDNS(value: String): Self = StObject.set(x, "SafeToRemoveRevokedKeyFromDNS", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Domains extends StObject {
    
    var Domains: js.Array[Domain] = js.native
    
    var TotalCount: Double = js.native
  }
  object Domains {
    
    @scala.inline
    def apply(Domains: js.Array[Domain], TotalCount: Double): Domains = {
      val __obj = js.Dynamic.literal(Domains = Domains.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domains]
    }
    
    @scala.inline
    implicit class DomainsMutableBuilder[Self <: Domains] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "Domains", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
