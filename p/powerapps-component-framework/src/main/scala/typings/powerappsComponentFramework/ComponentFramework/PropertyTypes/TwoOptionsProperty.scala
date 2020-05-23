package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.TwoOptionMetadata
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is TwoOptions
  */
trait TwoOptionsProperty extends Property {
  var attributes: js.UndefOr[TwoOptionMetadata] = js.undefined
  @JSName("raw")
  var raw_TwoOptionsProperty: Boolean
}

object TwoOptionsProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    raw: Boolean,
    `type`: String,
    attribute: Metadata = null,
    attributes: TwoOptionMetadata = null,
    formatted: String = null,
    security: SecurityValues = null
  ): TwoOptionsProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoOptionsProperty]
  }
}

