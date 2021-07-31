package typings.phaser.spine.webgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vector3 extends StObject {
  
  def add(v: Vector3): Vector3
  
  def cross(v: Vector3): Vector3
  
  def distance(v: Vector3): Double
  
  def dot(v: Vector3): Double
  
  def length(): Double
  
  def multiply(matrix: Matrix4): Vector3
  
  def normalize(): Vector3
  
  def project(matrix: Matrix4): Vector3
  
  def scale(s: Double): Vector3
  
  def set(x: Double, y: Double, z: Double): Vector3
  
  def setFrom(v: Vector3): Vector3
  
  def sub(v: Vector3): Vector3
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object Vector3 {
  
  @scala.inline
  def apply(
    add: Vector3 => Vector3,
    cross: Vector3 => Vector3,
    distance: Vector3 => Double,
    dot: Vector3 => Double,
    length: () => Double,
    multiply: Matrix4 => Vector3,
    normalize: () => Vector3,
    project: Matrix4 => Vector3,
    scale: Double => Vector3,
    set: (Double, Double, Double) => Vector3,
    setFrom: Vector3 => Vector3,
    sub: Vector3 => Vector3,
    x: Double,
    y: Double,
    z: Double
  ): Vector3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), cross = js.Any.fromFunction1(cross), distance = js.Any.fromFunction1(distance), dot = js.Any.fromFunction1(dot), length = js.Any.fromFunction0(length), multiply = js.Any.fromFunction1(multiply), normalize = js.Any.fromFunction0(normalize), project = js.Any.fromFunction1(project), scale = js.Any.fromFunction1(scale), set = js.Any.fromFunction3(set), setFrom = js.Any.fromFunction1(setFrom), sub = js.Any.fromFunction1(sub), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector3]
  }
  
  @scala.inline
  implicit class Vector3MutableBuilder[Self <: Vector3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Vector3 => Vector3): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCross(value: Vector3 => Vector3): Self = StObject.set(x, "cross", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDistance(value: Vector3 => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDot(value: Vector3 => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMultiply(value: Matrix4 => Vector3): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormalize(value: () => Vector3): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProject(value: Matrix4 => Vector3): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScale(value: Double => Vector3): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (Double, Double, Double) => Vector3): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetFrom(value: Vector3 => Vector3): Self = StObject.set(x, "setFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSub(value: Vector3 => Vector3): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
