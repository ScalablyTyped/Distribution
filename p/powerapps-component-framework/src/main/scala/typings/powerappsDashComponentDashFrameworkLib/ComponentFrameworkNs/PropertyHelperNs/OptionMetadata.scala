package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Option Item Metadata
		 */
trait OptionMetadata extends js.Object {
  var Color: java.lang.String
  var Label: java.lang.String
  var Value: scala.Double
}

object OptionMetadata {
  @scala.inline
  def apply(Color: java.lang.String, Label: java.lang.String, Value: scala.Double): OptionMetadata = {
    val __obj = js.Dynamic.literal(Color = Color, Label = Label, Value = Value)
  
    __obj.asInstanceOf[OptionMetadata]
  }
}

