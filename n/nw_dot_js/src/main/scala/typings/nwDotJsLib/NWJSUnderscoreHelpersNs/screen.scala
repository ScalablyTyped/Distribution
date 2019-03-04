package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

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
  var bounds: nwDotJsLib.Anon_Height
  /**
    * Unique id for a screen
    */
  var id: scala.Double
  var isBuiltIn: scala.Boolean
  var rotation: scala.Double
  var scaleFactor: scala.Double
  var touchSupport: scala.Double
  /**
    * Useable area within the screen bound
    */
  var work_area: nwDotJsLib.Anon_Height
}

object screen {
  @scala.inline
  def apply(
    bounds: nwDotJsLib.Anon_Height,
    id: scala.Double,
    isBuiltIn: scala.Boolean,
    rotation: scala.Double,
    scaleFactor: scala.Double,
    touchSupport: scala.Double,
    work_area: nwDotJsLib.Anon_Height
  ): screen = {
    val __obj = js.Dynamic.literal(bounds = bounds, id = id, isBuiltIn = isBuiltIn, rotation = rotation, scaleFactor = scaleFactor, touchSupport = touchSupport, work_area = work_area)
  
    __obj.asInstanceOf[screen]
  }
}

