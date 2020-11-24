package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contract extends DirectoryObject {
  
  /**
    * Type of contract.Possible values are: SyndicationPartner - Partner that exclusively resells and manages O365 and Intune
    * for this customer. They resell and support their customers. BreadthPartner - Partner has the ability to provide
    * administrative support for this customer. However, the partner is not allowed to resell to the customer.ResellerPartner
    * - Partner that is similar to a syndication partner, except that the partner doesn’t have exclusive access to a tenant.
    * In the syndication case, the customer cannot buy additional direct subscriptions from Microsoft or from other partners.
    */
  var contractType: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the
    * customer tenant's organization resource.
    */
  var customerId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A copy of the customer tenant's default domain name. The copy is made when the partnership with the customer is
    * established. It is not automatically updated if the customer tenant's default domain name changes.
    */
  var defaultDomainName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A copy of the customer tenant's display name. The copy is made when the partnership with the customer is established.
    * It is not automatically updated if the customer tenant's display name changes.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.native
}
object Contract {
  
  @scala.inline
  def apply(): Contract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contract]
  }
  
  @scala.inline
  implicit class ContractOps[Self <: Contract] (val x: Self) extends AnyVal {
    
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
    def setContractType(value: NullableOption[String]): Self = this.set("contractType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContractType: Self = this.set("contractType", js.undefined)
    
    @scala.inline
    def setContractTypeNull: Self = this.set("contractType", null)
    
    @scala.inline
    def setCustomerId(value: NullableOption[String]): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setCustomerIdNull: Self = this.set("customerId", null)
    
    @scala.inline
    def setDefaultDomainName(value: NullableOption[String]): Self = this.set("defaultDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDomainName: Self = this.set("defaultDomainName", js.undefined)
    
    @scala.inline
    def setDefaultDomainNameNull: Self = this.set("defaultDomainName", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
  }
}
