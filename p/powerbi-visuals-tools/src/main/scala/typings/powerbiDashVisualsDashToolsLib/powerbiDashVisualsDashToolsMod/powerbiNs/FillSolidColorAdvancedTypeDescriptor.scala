package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillSolidColorAdvancedTypeDescriptor extends js.Object {
  /** Indicates whether the color value may be nullable, and a 'no fill' option is appropriate. */
  var nullable: scala.Boolean
}

object FillSolidColorAdvancedTypeDescriptor {
  @scala.inline
  def apply(nullable: scala.Boolean): FillSolidColorAdvancedTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nullable")(nullable)
    __obj.asInstanceOf[FillSolidColorAdvancedTypeDescriptor]
  }
}

