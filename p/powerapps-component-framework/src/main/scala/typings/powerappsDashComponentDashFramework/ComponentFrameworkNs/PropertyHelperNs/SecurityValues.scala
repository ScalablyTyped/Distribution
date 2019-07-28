package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Entity metadata security values
		 */
trait SecurityValues extends js.Object {
  var editable: Boolean
  var readable: Boolean
  var secured: Boolean
}

object SecurityValues {
  @scala.inline
  def apply(editable: Boolean, readable: Boolean, secured: Boolean): SecurityValues = {
    val __obj = js.Dynamic.literal(editable = editable, readable = readable, secured = secured)
  
    __obj.asInstanceOf[SecurityValues]
  }
}

