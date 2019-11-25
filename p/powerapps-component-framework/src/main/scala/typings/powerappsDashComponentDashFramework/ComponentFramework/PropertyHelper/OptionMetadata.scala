package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Option Item Metadata
		 */
trait OptionMetadata extends js.Object {
  var Color: String
  var Label: String
  var Value: Double
}

object OptionMetadata {
  @scala.inline
  def apply(Color: String, Label: String, Value: Double): OptionMetadata = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionMetadata]
  }
}

