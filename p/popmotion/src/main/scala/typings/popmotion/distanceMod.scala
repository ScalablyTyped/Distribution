package typings.popmotion

import typings.popmotion.anon.X
import typings.popmotion.libTypesMod.Point3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distanceMod {
  
  @JSImport("popmotion/lib/utils/distance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def distance(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def distance(a: Point3D, b: Point3D): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def distance[P /* <: X */](a: P, b: P): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
