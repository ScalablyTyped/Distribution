package typings.openjscad.CSG

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line2D extends CxG {
  
  def absDistanceToPoint(point: Vector2D): Double = js.native
  
  def direction(): Vector2D = js.native
  
  def equals(l: Line2D): Boolean = js.native
  
  def intersectWithLine(line2d: Line2D): Vector2D = js.native
  
  var normal: Vector2D = js.native
  
  def origin(): Vector2D = js.native
  
  def reverse(): Line2D = js.native
  
  var w: Double = js.native
  
  def xAtY(y: Double): Double = js.native
}
