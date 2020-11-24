package typings.openjscad.CSG

import typings.openjscad.CAG
import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path2D extends CxG {
  
  def appendArc(endpoint: Vector2D, options: IEllpiticalArcOptions): Path2D = js.native
  
  def appendBezier(controlpoints: js.Any, options: js.Any): Path2D = js.native
  
  def appendPoint(point: Vector2D): Path2D = js.native
  
  def appendPoints(points: js.Array[Vector2D]): Path2D = js.native
  
  def close(): Path2D = js.native
  
  var closed: Boolean = js.native
  
  def concat(otherpath: Path2D): Path2D = js.native
  
  def expandToCAG(pathradius: Double, resolution: Double): CAG = js.native
  
  def innerToCAG(): CAG = js.native
  
  var lastBezierControlPoint: Vector2D = js.native
  
  var points: js.Array[Vector2D] = js.native
  
  def rectangularExtrude(width: Double, height: Double, resolution: Double): typings.openjscad.CSG = js.native
}
