package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyTypes

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.StringMetadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type starts from SingleLine
		 */
trait StringProperty extends Property {
  var attributes: js.UndefOr[StringMetadata] = js.undefined
  @JSName("raw")
  var raw_StringProperty: String | Null
}

object StringProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: StringMetadata = null,
    formatted: String = null,
    raw: String = null,
    security: SecurityValues = null
  ): StringProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[StringProperty]
  }
}

