package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blackberry extends js.Object {
  var blackberry: scala.Boolean
  var blackberry10: scala.Boolean
  var chrome: scala.Boolean
  var device: scala.Boolean
  var firefox: scala.Boolean
  var opera: scala.Boolean
}

object Anon_Blackberry {
  @scala.inline
  def apply(
    blackberry: scala.Boolean,
    blackberry10: scala.Boolean,
    chrome: scala.Boolean,
    device: scala.Boolean,
    firefox: scala.Boolean,
    opera: scala.Boolean
  ): Anon_Blackberry = {
    val __obj = js.Dynamic.literal(blackberry = blackberry, blackberry10 = blackberry10, chrome = chrome, device = device, firefox = firefox, opera = opera)
  
    __obj.asInstanceOf[Anon_Blackberry]
  }
}

