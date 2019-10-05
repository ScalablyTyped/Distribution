package typings.nwDotJs.NWJS_Helpers

import typings.nwDotJs.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Screen screen object
  */
trait screen extends js.Object {
  /**
    * Physical screen resolution, can be negative, not necessarily start from 0,depending on screen arrangement
    */
  var bounds: Anon_Height
  /**
    * Unique id for a screen
    */
  var id: Double
  var isBuiltIn: Boolean
  var rotation: Double
  var scaleFactor: Double
  var touchSupport: Double
  /**
    * Useable area within the screen bound
    */
  var work_area: Anon_Height
}

object screen {
  @scala.inline
  def apply(
    bounds: Anon_Height,
    id: Double,
    isBuiltIn: Boolean,
    rotation: Double,
    scaleFactor: Double,
    touchSupport: Double,
    work_area: Anon_Height
  ): screen = {
    val __obj = js.Dynamic.literal(bounds = bounds, id = id, isBuiltIn = isBuiltIn, rotation = rotation, scaleFactor = scaleFactor, touchSupport = touchSupport, work_area = work_area)
  
    __obj.asInstanceOf[screen]
  }
}

