package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends StObject {
  
  /**
    * Color value.
    */
  def backgroundColor(color: String): Animation = js.native
  
  /**
    * Set the bottom:length values, in px, such as 300 px.
    */
  def bottom(value: Double): Animation = js.native
  
  /**
    * Set the height:length values, in px, such as 300 px.
    */
  def height(value: Double): Animation = js.native
  
  /**
    * Set the left:length values, in px, such as 300 px.
    */
  def left(value: Double): Animation = js.native
  
  /**
    * Same as [transform-function](https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/matrix).
    */
  def matrix(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Animation = js.native
  
  /**
    * Same as [transform-function matrix3d](https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/matrix3d).
    */
  def matrix3d(
    a1: Double,
    b1: Double,
    c1: Double,
    d1: Double,
    a2: Double,
    b2: Double,
    c2: Double,
    d2: Double,
    a3: Double,
    b3: Double,
    c3: Double,
    d3: Double,
    a4: Double,
    b4: Double,
    c4: Double,
    d4: Double
  ): Animation = js.native
  
  /**
    * Transparency, range 0~1.
    */
  def opacity(value: Double): Animation = js.native
  
  /**
    * Set the right:length values, in px, such as 300 px.
    */
  def right(value: Double): Animation = js.native
  
  /**
    * deg range -180 ~ 180, rotate by deg degrees clockwise from origin.
    */
  def rotate(value: Double): Animation = js.native
  
  /**
    * Same as [transform-function rotate3d](https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/rotate3d).
    */
  def rotate3d(x: Double, y: Double, z: Double): Animation = js.native
  
  /**
    * deg range -180 ~ 180, rotate by deg degrees on X axis.
    */
  def rotateX(value: Double): Animation = js.native
  
  /**
    * deg range -180 ~ 180, rotate by deg degrees on Y axis.
    */
  def rotateY(value: Double): Animation = js.native
  
  /**
    * deg range -180 ~ 180, rotate by deg degrees on Z axis.
    */
  def rotateZ(value: Double): Animation = js.native
  
  /**
    * When there is only one parameter, it indicates scaling sx
    * times on X and Y axises at the same time.
    *
    * When there are two parameters, it indicates scaling sx times
    * on X axis and sy times on Y axis.
    */
  def scale(sx: Double): Animation = js.native
  def scale(sx: Double, sy: Double): Animation = js.native
  
  /**
    * Scale sx times on X axis, sy times on Y axis and sz times on Z axis.
    */
  def scale3d(sx: Double, sy: Double, sz: Double): Animation = js.native
  
  /**
    * Scale sx times on X axis.
    */
  def scaleX(sx: Double): Animation = js.native
  
  /**
    * Scale sy times on Y axis.
    */
  def scaleY(sy: Double): Animation = js.native
  
  /**
    * Scale sz times on Z axis.
    */
  def scaleZ(sz: Double): Animation = js.native
  
  /**
    * Range -180~180 When there is only one parameter, Y stays
    * unchanged and X skews by ax degrees clockwise. When there
    * are two parameters, X skews by ax degrees and Y skews by ay degrees.
    */
  def skew(ax: Double): Animation = js.native
  def skew(ax: Double, ay: Double): Animation = js.native
  
  /**
    * Range -180~180 Y stays unchanged and X skews by ax degrees clockwise. Degree.
    */
  def skewX(ax: Double): Animation = js.native
  
  /**
    * Range -180~180 X stays unchanged and Y skews by ay degrees clockwise.
    */
  def skewY(ay: Double): Animation = js.native
  
  def step(): Animation = js.native
  
  /**
    * Set the top:length values, in px, such as 300 px.
    */
  def top(value: Double): Animation = js.native
  
  /**
    * When there is only one parameter, it indicates translating
    * by tx on X axis. When there are two parameters, it indicates
    * translating by tx on X axis and ty on Y axis.
    */
  def translate(tx: Double): Animation = js.native
  def translate(tx: Double, ty: Double): Animation = js.native
  
  /**
    * Translate by tx on X axis, ty on Y axis and tz on Z axis, in px.
    */
  def translate3d(tx: Double, ty: Double, tz: Double): Animation = js.native
  
  /**
    * Translate by tx on X axis, in px.
    */
  def translateX(tx: Double): Animation = js.native
  
  /**
    * Translate by ty on Y axis, in px.
    */
  def translateY(ty: Double): Animation = js.native
  
  /**
    * Translate by ty on Z axis, in px.
    */
  def translateZ(tz: Double): Animation = js.native
  
  /**
    * Set the width:length values, in px, such as 300 px.
    */
  def width(value: Double): Animation = js.native
}
