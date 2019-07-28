package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetedManagedAppConfiguration extends ManagedAppConfiguration {
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.undefined
  // Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
  var assignments: js.UndefOr[js.Array[TargetedManagedAppPolicyAssignment]] = js.undefined
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.undefined
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.undefined
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.undefined
}

object TargetedManagedAppConfiguration {
  @scala.inline
  def apply(
    apps: js.Array[ManagedMobileApp] = null,
    assignments: js.Array[TargetedManagedAppPolicyAssignment] = null,
    createdDateTime: String = null,
    customSettings: js.Array[KeyValuePair] = null,
    deployedAppCount: Int | Double = null,
    deploymentSummary: ManagedAppPolicyDeploymentSummary = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    isAssigned: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    version: String = null
  ): TargetedManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    if (apps != null) __obj.updateDynamic("apps")(apps)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (customSettings != null) __obj.updateDynamic("customSettings")(customSettings)
    if (deployedAppCount != null) __obj.updateDynamic("deployedAppCount")(deployedAppCount.asInstanceOf[js.Any])
    if (deploymentSummary != null) __obj.updateDynamic("deploymentSummary")(deploymentSummary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isAssigned)) __obj.updateDynamic("isAssigned")(isAssigned)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TargetedManagedAppConfiguration]
  }
}

