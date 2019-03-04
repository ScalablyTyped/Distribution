package typings
package nodeLib.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapSpaceInfo extends js.Object {
  var physical_space_size: scala.Double
  var space_available_size: scala.Double
  var space_name: java.lang.String
  var space_size: scala.Double
  var space_used_size: scala.Double
}

object HeapSpaceInfo {
  @scala.inline
  def apply(
    physical_space_size: scala.Double,
    space_available_size: scala.Double,
    space_name: java.lang.String,
    space_size: scala.Double,
    space_used_size: scala.Double
  ): HeapSpaceInfo = {
    val __obj = js.Dynamic.literal(physical_space_size = physical_space_size, space_available_size = space_available_size, space_name = space_name, space_size = space_size, space_used_size = space_used_size)
  
    __obj.asInstanceOf[HeapSpaceInfo]
  }
}

