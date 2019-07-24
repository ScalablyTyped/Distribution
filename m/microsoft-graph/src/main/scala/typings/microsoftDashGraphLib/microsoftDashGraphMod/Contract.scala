package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contract extends DirectoryObject {
  /**
    * Type of contract.Possible values are: SyndicationPartner - Partner that exclusively resells and manages O365 and Intune
    * for this customer. They resell and support their customers. BreadthPartner - Partner has the ability to provide
    * administrative support for this customer. However, the partner is not allowed to resell to the customer.ResellerPartner
    * - Partner that is similar to a syndication partner, except that the partner doesn’t have exclusive access to a tenant.
    * In the syndication case, the customer cannot buy additional direct subscriptions from Microsoft or from other partners.
    */
  var contractType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the
    * customer tenant's organization resource.
    */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A copy of the customer tenant's default domain name. The copy is made when the partnership with the customer is
    * established. It is not automatically updated if the customer tenant's default domain name changes.
    */
  var defaultDomainName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A copy of the customer tenant's display name. The copy is made when the partnership with the customer is established.
    * It is not automatically updated if the customer tenant's display name changes.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object Contract {
  @scala.inline
  def apply(
    contractType: java.lang.String = null,
    customerId: java.lang.String = null,
    defaultDomainName: java.lang.String = null,
    deletedDateTime: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null
  ): Contract = {
    val __obj = js.Dynamic.literal()
    if (contractType != null) __obj.updateDynamic("contractType")(contractType)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (defaultDomainName != null) __obj.updateDynamic("defaultDomainName")(defaultDomainName)
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Contract]
  }
}

