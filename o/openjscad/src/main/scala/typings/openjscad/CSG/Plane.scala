package typings.openjscad.CSG

import typings.openjscad.CxG
import typings.openjscad.anon.Back
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plane extends CxG {
  
  def equals(n: Plane): Boolean = js.native
  
  def flipped(): Plane = js.native
  
  def getTag(): Double = js.native
  
  def intersectWithLine(line3d: Line3D): Vector3D = js.native
  
  def intersectWithPlane(plane: Plane): Line3D = js.native
  
  def mirrorPoint(point3d: Vector3D): Vector3D = js.native
  
  var normal: Vector3D = js.native
  
  def signedDistanceToPoint(point: Vector3D): Double = js.native
  
  def splitLineBetweenPoints(p1: Vector3D, p2: Vector3D): Vector3D = js.native
  
  def splitPolygon(polygon: Polygon): Back = js.native
  
  var tag: Double = js.native
  
  var w: Double = js.native
}
