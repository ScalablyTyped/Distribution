package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Circle")
@js.native
class Circle () extends Shape {
  def this(options: CircleOptions) = this()
  var radius: Double = js.native
}

