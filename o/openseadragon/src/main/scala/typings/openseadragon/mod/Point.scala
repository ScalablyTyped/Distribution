package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Point")
@js.native
class Point () extends StObject {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  
  @JSName("apply")
  def apply(func: js.Function1[/* v */ Double, Double]): Point = js.native
  
  def distanceTo(point: Point): Double = js.native
  
  def divide(factor: Double): Point = js.native
  
  def equals(point: Point): Boolean = js.native
  
  def minus(point: Point): Point = js.native
  
  def negate(): Point = js.native
  
  def plus(point: Point): Point = js.native
  
  def rotate(degrees: Double): Point = js.native
  def rotate(degrees: Double, pivot: Point): Point = js.native
  
  def squaredDistanceTo(point: Point): Double = js.native
  
  def times(factor: Double): Rect = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
