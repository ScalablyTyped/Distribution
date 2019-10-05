package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyTypes

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.SecurityValues
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
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage, raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[Property]
  }
}

