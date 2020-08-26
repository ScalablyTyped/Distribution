package typings.nwJs.mod.global.NWJSHelpers

import typings.nwJs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Screen screen object
  */
@js.native
trait screen extends js.Object {
  /**
    * Physical screen resolution, can be negative, not necessarily start from 0,depending on screen arrangement
    */
  var bounds: Height = js.native
  /**
    * Unique id for a screen
    */
  var id: Double = js.native
  var isBuiltIn: Boolean = js.native
  var rotation: Double = js.native
  var scaleFactor: Double = js.native
  var touchSupport: Double = js.native
  /**
    * Useable area within the screen bound
    */
  var work_area: Height = js.native
}

object screen {
  @scala.inline
  def apply(
    bounds: Height,
    id: Double,
    isBuiltIn: Boolean,
    rotation: Double,
    scaleFactor: Double,
    touchSupport: Double,
    work_area: Height
  ): screen = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBuiltIn = isBuiltIn.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], touchSupport = touchSupport.asInstanceOf[js.Any], work_area = work_area.asInstanceOf[js.Any])
    __obj.asInstanceOf[screen]
  }
  @scala.inline
  implicit class screenOps[Self <: screen] (val x: Self) extends AnyVal {
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
    def setBounds(value: Height): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBuiltIn(value: Boolean): Self = this.set("isBuiltIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchSupport(value: Double): Self = this.set("touchSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def setWork_area(value: Height): Self = this.set("work_area", value.asInstanceOf[js.Any])
  }
  
}

