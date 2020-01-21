package typings.ol

import typings.ol.projectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj/projections", JSImport.Namespace)
@js.native
object projectionsMod extends js.Object {
  def add(code: String, projection: default): Unit = js.native
  def clear(): Unit = js.native
  def get(code: String): default = js.native
}

