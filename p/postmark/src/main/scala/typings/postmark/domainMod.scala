package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("postmark/dist/client/models/domains/Domain", "CreateDomainRequest")
  @js.native
  open class CreateDomainRequest protected () extends StObject {
    def this(Name: String) = this()
    def this(Name: String, ReturnPathDomain: String) = this()
    
    var Name: String = js.native
    
    var ReturnPathDomain: js.UndefOr[String] = js.native
  }
  
  @JSImport("postmark/dist/client/models/domains/Domain", "UpdateDomainRequest")
  @js.native
  open class UpdateDomainRequest protected () extends StObject {
    def this(ReturnPathDomain: String) = this()
    
    var ReturnPathDomain: js.UndefOr[String] = js.native
  }
  
  trait Domain extends StObject {
    
    var DKIMVerified: Boolean
    
    var ID: Double
    
    var Name: String
    
    var ReturnPathDomainVerified: Boolean
    
    var SPFVerified: Boolean
    
    var WeakDKIM: Boolean
  }
  object Domain {
    
    inline def apply(
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
    
    extension [Self <: Domain](x: Self) {
      
      inline def setDKIMVerified(value: Boolean): Self = StObject.set(x, "DKIMVerified", value.asInstanceOf[js.Any])
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setReturnPathDomainVerified(value: Boolean): Self = StObject.set(x, "ReturnPathDomainVerified", value.asInstanceOf[js.Any])
      
      inline def setSPFVerified(value: Boolean): Self = StObject.set(x, "SPFVerified", value.asInstanceOf[js.Any])
      
      inline def setWeakDKIM(value: Boolean): Self = StObject.set(x, "WeakDKIM", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainDetails
    extends StObject
       with Domain {
    
    var DKIMHost: String
    
    var DKIMPendingHost: String
    
    var DKIMPendingTextValue: String
    
    var DKIMRevokedHost: String
    
    var DKIMRevokedTextValue: String
    
    var DKIMTextValue: String
    
    var DKIMUpdateStatus: String
    
    var ReturnPathDomain: String
    
    var ReturnPathDomainCNAMEValue: String
    
    var SPFHost: String
    
    var SPFTextValue: String
    
    var SafeToRemoveRevokedKeyFromDNS: String
  }
  object DomainDetails {
    
    inline def apply(
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
    
    extension [Self <: DomainDetails](x: Self) {
      
      inline def setDKIMHost(value: String): Self = StObject.set(x, "DKIMHost", value.asInstanceOf[js.Any])
      
      inline def setDKIMPendingHost(value: String): Self = StObject.set(x, "DKIMPendingHost", value.asInstanceOf[js.Any])
      
      inline def setDKIMPendingTextValue(value: String): Self = StObject.set(x, "DKIMPendingTextValue", value.asInstanceOf[js.Any])
      
      inline def setDKIMRevokedHost(value: String): Self = StObject.set(x, "DKIMRevokedHost", value.asInstanceOf[js.Any])
      
      inline def setDKIMRevokedTextValue(value: String): Self = StObject.set(x, "DKIMRevokedTextValue", value.asInstanceOf[js.Any])
      
      inline def setDKIMTextValue(value: String): Self = StObject.set(x, "DKIMTextValue", value.asInstanceOf[js.Any])
      
      inline def setDKIMUpdateStatus(value: String): Self = StObject.set(x, "DKIMUpdateStatus", value.asInstanceOf[js.Any])
      
      inline def setReturnPathDomain(value: String): Self = StObject.set(x, "ReturnPathDomain", value.asInstanceOf[js.Any])
      
      inline def setReturnPathDomainCNAMEValue(value: String): Self = StObject.set(x, "ReturnPathDomainCNAMEValue", value.asInstanceOf[js.Any])
      
      inline def setSPFHost(value: String): Self = StObject.set(x, "SPFHost", value.asInstanceOf[js.Any])
      
      inline def setSPFTextValue(value: String): Self = StObject.set(x, "SPFTextValue", value.asInstanceOf[js.Any])
      
      inline def setSafeToRemoveRevokedKeyFromDNS(value: String): Self = StObject.set(x, "SafeToRemoveRevokedKeyFromDNS", value.asInstanceOf[js.Any])
    }
  }
  
  trait Domains extends StObject {
    
    var Domains: js.Array[Domain]
    
    var TotalCount: Double
  }
  object Domains {
    
    inline def apply(Domains: js.Array[Domain], TotalCount: Double): Domains = {
      val __obj = js.Dynamic.literal(Domains = Domains.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domains]
    }
    
    extension [Self <: Domains](x: Self) {
      
      inline def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "Domains", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
}
