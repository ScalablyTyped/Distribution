package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeapSpaceInfo extends js.Object {
  var physical_space_size: Double = js.native
  var space_available_size: Double = js.native
  var space_name: String = js.native
  var space_size: Double = js.native
  var space_used_size: Double = js.native
}

object HeapSpaceInfo {
  @scala.inline
  def apply(
    physical_space_size: Double,
    space_available_size: Double,
    space_name: String,
    space_size: Double,
    space_used_size: Double
  ): HeapSpaceInfo = {
    val __obj = js.Dynamic.literal(physical_space_size = physical_space_size.asInstanceOf[js.Any], space_available_size = space_available_size.asInstanceOf[js.Any], space_name = space_name.asInstanceOf[js.Any], space_size = space_size.asInstanceOf[js.Any], space_used_size = space_used_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapSpaceInfo]
  }
  @scala.inline
  implicit class HeapSpaceInfoOps[Self <: HeapSpaceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPhysical_space_size(value: Double): Self = this.set("physical_space_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace_available_size(value: Double): Self = this.set("space_available_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace_name(value: String): Self = this.set("space_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace_size(value: Double): Self = this.set("space_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace_used_size(value: Double): Self = this.set("space_used_size", value.asInstanceOf[js.Any])
  }
  
}

