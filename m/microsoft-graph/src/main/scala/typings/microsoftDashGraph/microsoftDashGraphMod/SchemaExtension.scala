package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaExtension extends Entity {
  // Description for the schema extension.
  var description: js.UndefOr[String] = js.undefined
  /**
    * The appId of the application that is the owner of the schema extension. This property can be supplied on creation, to
    * set the owner. If not supplied, then the calling application's appId will be set as the owner. In either case, the
    * signed-in user must be the owner of the application. Once set, this property is read-only and cannot be changed.
    */
  var owner: js.UndefOr[String] = js.undefined
  // The collection of property names and types that make up the schema extension definition.
  var properties: js.UndefOr[js.Array[ExtensionSchemaProperty]] = js.undefined
  /**
    * The lifecycle state of the schema extension. Possible states are InDevelopment, Available, and Deprecated.
    * Automatically set to InDevelopment on creation. Schema extensions provides more information on the possible state
    * transitions and behaviors.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * Set of Microsoft Graph types (that can support extensions) that the schema extension can be applied to. Select from
    * contact, device, event, group, message, organization, post, or user.
    */
  var targetTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object SchemaExtension {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    owner: String = null,
    properties: js.Array[ExtensionSchemaProperty] = null,
    status: String = null,
    targetTypes: js.Array[String] = null
  ): SchemaExtension = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (status != null) __obj.updateDynamic("status")(status)
    if (targetTypes != null) __obj.updateDynamic("targetTypes")(targetTypes)
    __obj.asInstanceOf[SchemaExtension]
  }
}

