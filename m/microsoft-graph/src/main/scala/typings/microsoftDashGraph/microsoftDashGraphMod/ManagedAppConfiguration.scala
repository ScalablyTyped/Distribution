package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppConfiguration extends ManagedAppPolicy {
  /**
    * A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned
    * by this service
    */
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
}

object ManagedAppConfiguration {
  @scala.inline
  def apply(
    createdDateTime: String = null,
    customSettings: js.Array[KeyValuePair] = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    version: String = null
  ): ManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (customSettings != null) __obj.updateDynamic("customSettings")(customSettings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAppConfiguration]
  }
}

