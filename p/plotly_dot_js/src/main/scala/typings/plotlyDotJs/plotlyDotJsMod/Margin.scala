package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  var b: Double
  var l: Double
  var pad: Double
  var r: Double
  var t: Double
}

object Margin {
  @scala.inline
  def apply(b: Double, l: Double, pad: Double, r: Double, t: Double): Margin = {
    val __obj = js.Dynamic.literal(b = b, l = l, pad = pad, r = r, t = t)
  
    __obj.asInstanceOf[Margin]
  }
}

