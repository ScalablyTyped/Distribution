package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Entity metadata security values
		 */
trait SecurityValues extends js.Object {
  var editable: scala.Boolean
  var readable: scala.Boolean
  var secured: scala.Boolean
}

object SecurityValues {
  @scala.inline
  def apply(editable: scala.Boolean, readable: scala.Boolean, secured: scala.Boolean): SecurityValues = {
    val __obj = js.Dynamic.literal(editable = editable, readable = readable, secured = secured)
  
    __obj.asInstanceOf[SecurityValues]
  }
}

