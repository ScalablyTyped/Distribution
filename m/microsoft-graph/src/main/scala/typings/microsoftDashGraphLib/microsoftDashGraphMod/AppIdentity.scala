package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppIdentity extends js.Object {
  /** Refers to the Unique GUID representing Application Id in the Azure Active Directory. */
  var appId: js.UndefOr[java.lang.String] = js.undefined
  /** Refers to the Application Name displayed in the Azure Portal. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Refers to the Unique GUID indicating Service Principal Id in Azure Active Directory for the corresponding App. */
  var servicePrincipalId: js.UndefOr[java.lang.String] = js.undefined
  /** Refers to the Service Principal Name is the Application name in the tenant. */
  var servicePrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object AppIdentity {
  @scala.inline
  def apply(
    appId: java.lang.String = null,
    displayName: java.lang.String = null,
    servicePrincipalId: java.lang.String = null,
    servicePrincipalName: java.lang.String = null
  ): AppIdentity = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (servicePrincipalId != null) __obj.updateDynamic("servicePrincipalId")(servicePrincipalId)
    if (servicePrincipalName != null) __obj.updateDynamic("servicePrincipalName")(servicePrincipalName)
    __obj.asInstanceOf[AppIdentity]
  }
}

