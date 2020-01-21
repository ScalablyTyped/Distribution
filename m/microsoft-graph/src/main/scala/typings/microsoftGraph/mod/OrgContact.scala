package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgContact extends DirectoryObject {
  var addresses: js.UndefOr[js.Array[PhysicalOfficeAddress]] = js.undefined
  var companyName: js.UndefOr[String] = js.undefined
  var department: js.UndefOr[String] = js.undefined
  var directReports: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var givenName: js.UndefOr[String] = js.undefined
  var jobTitle: js.UndefOr[String] = js.undefined
  var mail: js.UndefOr[String] = js.undefined
  var mailNickname: js.UndefOr[String] = js.undefined
  var manager: js.UndefOr[DirectoryObject] = js.undefined
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  var onPremisesLastSyncDateTime: js.UndefOr[String] = js.undefined
  var onPremisesProvisioningErrors: js.UndefOr[js.Array[OnPremisesProvisioningError]] = js.undefined
  var onPremisesSyncEnabled: js.UndefOr[Boolean] = js.undefined
  var phones: js.UndefOr[js.Array[Phone]] = js.undefined
  var proxyAddresses: js.UndefOr[js.Array[String]] = js.undefined
  var surname: js.UndefOr[String] = js.undefined
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
}

object OrgContact {
  @scala.inline
  def apply(
    addresses: js.Array[PhysicalOfficeAddress] = null,
    companyName: String = null,
    deletedDateTime: String = null,
    department: String = null,
    directReports: js.Array[DirectoryObject] = null,
    displayName: String = null,
    givenName: String = null,
    id: String = null,
    jobTitle: String = null,
    mail: String = null,
    mailNickname: String = null,
    manager: DirectoryObject = null,
    memberOf: js.Array[DirectoryObject] = null,
    onPremisesLastSyncDateTime: String = null,
    onPremisesProvisioningErrors: js.Array[OnPremisesProvisioningError] = null,
    onPremisesSyncEnabled: js.UndefOr[Boolean] = js.undefined,
    phones: js.Array[Phone] = null,
    proxyAddresses: js.Array[String] = null,
    surname: String = null,
    transitiveMemberOf: js.Array[DirectoryObject] = null
  ): OrgContact = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (directReports != null) __obj.updateDynamic("directReports")(directReports.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle.asInstanceOf[js.Any])
    if (mail != null) __obj.updateDynamic("mail")(mail.asInstanceOf[js.Any])
    if (mailNickname != null) __obj.updateDynamic("mailNickname")(mailNickname.asInstanceOf[js.Any])
    if (manager != null) __obj.updateDynamic("manager")(manager.asInstanceOf[js.Any])
    if (memberOf != null) __obj.updateDynamic("memberOf")(memberOf.asInstanceOf[js.Any])
    if (onPremisesLastSyncDateTime != null) __obj.updateDynamic("onPremisesLastSyncDateTime")(onPremisesLastSyncDateTime.asInstanceOf[js.Any])
    if (onPremisesProvisioningErrors != null) __obj.updateDynamic("onPremisesProvisioningErrors")(onPremisesProvisioningErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(onPremisesSyncEnabled)) __obj.updateDynamic("onPremisesSyncEnabled")(onPremisesSyncEnabled.asInstanceOf[js.Any])
    if (phones != null) __obj.updateDynamic("phones")(phones.asInstanceOf[js.Any])
    if (proxyAddresses != null) __obj.updateDynamic("proxyAddresses")(proxyAddresses.asInstanceOf[js.Any])
    if (surname != null) __obj.updateDynamic("surname")(surname.asInstanceOf[js.Any])
    if (transitiveMemberOf != null) __obj.updateDynamic("transitiveMemberOf")(transitiveMemberOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgContact]
  }
}

