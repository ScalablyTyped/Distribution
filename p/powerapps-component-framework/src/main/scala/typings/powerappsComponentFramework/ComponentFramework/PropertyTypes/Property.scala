package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for context.parameters.[property_key]
		 */
trait Property extends js.Object {
  var attribute: js.UndefOr[Metadata] = js.undefined
  var error: Boolean
  var errorMessage: String
  var formatted: js.UndefOr[String] = js.undefined
  var raw: js.Any
  var security: js.UndefOr[SecurityValues] = js.undefined
  var `type`: String
}

object Property {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    raw: js.Any,
    `type`: String,
    attribute: Metadata = null,
    formatted: String = null,
    security: SecurityValues = null
  ): Property = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

