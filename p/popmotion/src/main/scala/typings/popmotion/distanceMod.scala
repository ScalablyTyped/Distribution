package typings.popmotion

import typings.popmotion.anon.X
import typings.popmotion.libTypesMod.Point3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/utils/distance", JSImport.Namespace)
@js.native
object distanceMod extends js.Object {
  
  def distance(a: Double, b: Double): Double = js.native
  def distance(a: Point3D, b: Point3D): Double = js.native
  def distance[P /* <: X */](a: P, b: P): Double = js.native
}
