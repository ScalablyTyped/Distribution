package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

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
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], secured = secured.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityValues]
  }
}

