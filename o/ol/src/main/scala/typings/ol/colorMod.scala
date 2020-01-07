package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/color", JSImport.Namespace)
@js.native
object colorMod extends js.Object {
  def asArray(color: String): Color = js.native
  def asArray(color: Color): Color = js.native
  def asString(color: String): String = js.native
  def asString(color: Color): String = js.native
  def isStringColor(s: String): Boolean = js.native
  def normalize(color: Color): Color = js.native
  def toString(color: Color): String = js.native
  type Color = js.Array[Double]
}

