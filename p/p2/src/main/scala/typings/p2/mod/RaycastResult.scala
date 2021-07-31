package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "RaycastResult")
@js.native
class RaycastResult () extends StObject {
  
  var body: Body = js.native
  
  var faceIndex: Double = js.native
  
  var fraction: Double = js.native
  
  def getHitDistance(ray: Ray): Double = js.native
  
  def getHitPoint(out: js.Tuple2[Double, Double], ray: Ray): Unit = js.native
  
  def hasHit(): Boolean = js.native
  
  var isStopped: Boolean = js.native
  
  var normal: js.Tuple2[Double, Double] = js.native
  
  def reset(): Unit = js.native
  
  def set(normal: js.Tuple2[Double, Double], shape: Shape, body: Body, friction: Double, faceIndex: Double): Unit = js.native
  
  var shape: Shape = js.native
  
  def shouldStop(ray: Ray): Boolean = js.native
  
  def stop(): Unit = js.native
}
