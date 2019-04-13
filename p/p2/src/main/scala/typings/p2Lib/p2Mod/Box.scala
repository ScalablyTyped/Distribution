package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Box")
@js.native
class Box () extends Shape {
  def this(options: BoxOptions) = this()
  var height: scala.Double = js.native
  var width: scala.Double = js.native
}

