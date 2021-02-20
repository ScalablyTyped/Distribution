package typings.popmotion

import typings.popmotion.anon.X
import typings.popmotion.libTypesMod.Point3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distanceMod {
  
  @JSImport("popmotion/lib/utils/distance", "distance")
  @js.native
  def distance(a: Double, b: Double): Double = js.native
  @JSImport("popmotion/lib/utils/distance", "distance")
  @js.native
  def distance(a: Point3D, b: Point3D): Double = js.native
  @JSImport("popmotion/lib/utils/distance", "distance")
  @js.native
  def distance[P /* <: X */](a: P, b: P): Double = js.native
}
