package typings.openjscad.CSG

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector2D extends CxG {
  
  def abs(): Vector2D = js.native
  
  def angle(): Double = js.native
  
  def angleDegrees(): Double = js.native
  
  def angleRadians(): Double = js.native
  
  def cross(a: Vector2D): Double = js.native
  
  def distanceTo(a: Vector2D): Double = js.native
  
  def distanceToSquared(a: Vector2D): Double = js.native
  
  def dividedBy(a: Double): Vector2D = js.native
  
  def dot(a: Vector2D): Double = js.native
  
  def equals(a: Vector2D): Boolean = js.native
  
  def length(): Double = js.native
  
  def lengthSquared(): Double = js.native
  
  def lerp(a: Vector2D, t: Double): Vector2D = js.native
  
  def max(p: Vector2D): Vector2D = js.native
  
  def min(p: Vector2D): Vector2D = js.native
  
  def minus(a: Vector2D): Vector2D = js.native
  
  def multiply4x4(matrix4x4: Matrix4x4): Vector2D = js.native
  
  def negated(): Vector2D = js.native
  
  def normal(): Vector2D = js.native
  
  def plus(a: Vector2D): Vector2D = js.native
  
  def times(a: Double): Vector2D = js.native
  
  def toVector3D(z: Double): Vector3D = js.native
  
  def unit(): Vector2D = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
