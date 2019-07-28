package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Capsule")
@js.native
class Capsule () extends Shape {
  def this(options: CapsuleOptions) = this()
  var length: Double = js.native
  var radius: Double = js.native
}

