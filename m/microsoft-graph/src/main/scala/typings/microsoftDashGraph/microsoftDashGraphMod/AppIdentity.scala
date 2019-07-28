package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppIdentity extends js.Object {
  // Refers to the Unique GUID representing Application Id in the Azure Active Directory.
  var appId: js.UndefOr[String] = js.undefined
  // Refers to the Application Name displayed in the Azure Portal.
  var displayName: js.UndefOr[String] = js.undefined
  // Refers to the Unique GUID indicating Service Principal Id in Azure Active Directory for the corresponding App.
  var servicePrincipalId: js.UndefOr[String] = js.undefined
  // Refers to the Service Principal Name is the Application name in the tenant.
  var servicePrincipalName: js.UndefOr[String] = js.undefined
}

object AppIdentity {
  @scala.inline
  def apply(
    appId: String = null,
    displayName: String = null,
    servicePrincipalId: String = null,
    servicePrincipalName: String = null
  ): AppIdentity = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (servicePrincipalId != null) __obj.updateDynamic("servicePrincipalId")(servicePrincipalId)
    if (servicePrincipalName != null) __obj.updateDynamic("servicePrincipalName")(servicePrincipalName)
    __obj.asInstanceOf[AppIdentity]
  }
}

