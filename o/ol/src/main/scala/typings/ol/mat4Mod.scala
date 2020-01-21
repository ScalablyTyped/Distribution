package typings.ol

import typings.ol.olMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/vec/mat4", JSImport.Namespace)
@js.native
object mat4Mod extends js.Object {
  def create(): js.Array[Double] = js.native
  def fromTransform(mat4: js.Array[Double], transform: Transform): js.Array[Double] = js.native
}

