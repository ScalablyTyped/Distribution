package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Box")
@js.native
class Box () extends Shape {
  def this(options: BoxOptions) = this()
  var height: Double = js.native
  var width: Double = js.native
}

