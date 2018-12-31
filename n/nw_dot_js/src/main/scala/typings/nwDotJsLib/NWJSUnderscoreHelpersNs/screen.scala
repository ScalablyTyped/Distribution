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
  var bounds: nwDotJsLib.Anon_Y
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
  var work_area: nwDotJsLib.Anon_Y
}

