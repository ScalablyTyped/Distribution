package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  var b: scala.Double
  var l: scala.Double
  var r: scala.Double
  var t: scala.Double
}

object Margin {
  @scala.inline
  def apply(b: scala.Double, l: scala.Double, r: scala.Double, t: scala.Double): Margin = {
    val __obj = js.Dynamic.literal(b = b, l = l, r = r, t = t)
  
    __obj.asInstanceOf[Margin]
  }
}

