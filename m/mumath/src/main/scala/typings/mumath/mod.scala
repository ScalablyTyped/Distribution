package typings.mumath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mumath", "clamp")
  @js.native
  def clamp(value: Double, left: Double, right: Double): Double = js.native
  
  @JSImport("mumath", "closest")
  @js.native
  def closest(value: Double, list: js.Array[Double]): Double = js.native
  
  @JSImport("mumath", "isMultiple")
  @js.native
  def isMultiple(a: Double, b: Double): Boolean = js.native
  @JSImport("mumath", "isMultiple")
  @js.native
  def isMultiple(a: Double, b: Double, eps: Double): Boolean = js.native
  
  @JSImport("mumath", "len")
  @js.native
  def len(a: Double, b: Double): Double = js.native
  
  @JSImport("mumath", "lerp")
  @js.native
  def lerp(x: Double, y: Double, ratio: Double): Double = js.native
  
  @JSImport("mumath", "mod")
  @js.native
  def mod(value: Double, max: Double): Double = js.native
  @JSImport("mumath", "mod")
  @js.native
  def mod(value: Double, max: Double, min: Double): Double = js.native
  
  @JSImport("mumath", "order")
  @js.native
  def order(value: Double): Double = js.native
  
  @JSImport("mumath", "precision")
  @js.native
  def precision(value: Double): Double = js.native
  
  @JSImport("mumath", "round")
  @js.native
  def round(value: Double): Double = js.native
  @JSImport("mumath", "round")
  @js.native
  def round(value: Double, step: Double): Double = js.native
  
  @JSImport("mumath", "scale")
  @js.native
  def scale(value: Double, list: js.Array[Double]): Double = js.native
  
  @JSImport("mumath", "within")
  @js.native
  def within(value: Double, left: Double, right: Double): Double = js.native
}
