package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A extends js.Object {
  var a: Double
  var c: Double
  var d: Double
  var w: String
}

object A {
  @scala.inline
  def apply(a: Double, c: Double, d: Double, w: String): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
}

