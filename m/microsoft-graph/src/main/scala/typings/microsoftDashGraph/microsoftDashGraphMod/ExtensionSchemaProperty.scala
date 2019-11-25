package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionSchemaProperty extends js.Object {
  // The name of the strongly-typed property defined as part of a schema extension.
  var name: js.UndefOr[String] = js.undefined
  /**
    * The type of the property that is defined as part of a schema extension. Allowed values are Binary, Boolean, DateTime,
    * Integer or String. See the table below for more details.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ExtensionSchemaProperty {
  @scala.inline
  def apply(name: String = null, `type`: String = null): ExtensionSchemaProperty = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionSchemaProperty]
  }
}

