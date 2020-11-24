package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix4x4 extends js.Object {
  
  var elements: js.Array[Double] = js.native
  
  def isMirroring(): Boolean = js.native
  
  def leftMultiply1x2Vector(v: Vector2D): Vector2D = js.native
  
  def leftMultiply1x3Vector(v: Vector3D): Vector3D = js.native
  
  def minus(m: Matrix4x4): Matrix4x4 = js.native
  
  def multiply(m: Matrix4x4): Matrix4x4 = js.native
  
  def plus(m: Matrix4x4): Matrix4x4 = js.native
  
  def rightMultiply1x2Vector(v: Vector2D): Vector2D = js.native
  
  def rightMultiply1x3Vector(v: Vector3D): Vector3D = js.native
}
object Matrix4x4 {
  
  @scala.inline
  def apply(
    elements: js.Array[Double],
    isMirroring: () => Boolean,
    leftMultiply1x2Vector: Vector2D => Vector2D,
    leftMultiply1x3Vector: Vector3D => Vector3D,
    minus: Matrix4x4 => Matrix4x4,
    multiply: Matrix4x4 => Matrix4x4,
    plus: Matrix4x4 => Matrix4x4,
    rightMultiply1x2Vector: Vector2D => Vector2D,
    rightMultiply1x3Vector: Vector3D => Vector3D
  ): Matrix4x4 = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], isMirroring = js.Any.fromFunction0(isMirroring), leftMultiply1x2Vector = js.Any.fromFunction1(leftMultiply1x2Vector), leftMultiply1x3Vector = js.Any.fromFunction1(leftMultiply1x3Vector), minus = js.Any.fromFunction1(minus), multiply = js.Any.fromFunction1(multiply), plus = js.Any.fromFunction1(plus), rightMultiply1x2Vector = js.Any.fromFunction1(rightMultiply1x2Vector), rightMultiply1x3Vector = js.Any.fromFunction1(rightMultiply1x3Vector))
    __obj.asInstanceOf[Matrix4x4]
  }
  
  @scala.inline
  implicit class Matrix4x4Ops[Self <: Matrix4x4] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElementsVarargs(value: Double*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[Double]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMirroring(value: () => Boolean): Self = this.set("isMirroring", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeftMultiply1x2Vector(value: Vector2D => Vector2D): Self = this.set("leftMultiply1x2Vector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLeftMultiply1x3Vector(value: Vector3D => Vector3D): Self = this.set("leftMultiply1x3Vector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinus(value: Matrix4x4 => Matrix4x4): Self = this.set("minus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiply(value: Matrix4x4 => Matrix4x4): Self = this.set("multiply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlus(value: Matrix4x4 => Matrix4x4): Self = this.set("plus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRightMultiply1x2Vector(value: Vector2D => Vector2D): Self = this.set("rightMultiply1x2Vector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRightMultiply1x3Vector(value: Vector3D => Vector3D): Self = this.set("rightMultiply1x3Vector", js.Any.fromFunction1(value))
  }
}
