package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Rect")
@js.native
class Rect () extends StObject {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Unit, width: Double) = this()
  def this(x: Unit, y: Double, width: Double) = this()
  def this(x: Unit, y: Unit, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double, degrees: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Unit, degrees: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Double, degrees: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Unit, degrees: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Double, degrees: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Unit, degrees: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Double, degrees: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Unit, degrees: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Double, degrees: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Unit, degrees: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Double, degrees: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Unit, degrees: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Double, degrees: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Unit, degrees: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Double, degrees: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Unit, degrees: Double) = this()
  
  def containsPoint(point: Point): Boolean = js.native
  def containsPoint(point: Point, epsilon: Double): Boolean = js.native
  
  var degrees: Double = js.native
  
  def equals(rectangle: Rect): Boolean = js.native
  
  def getAspectRatio(): Double = js.native
  
  def getBottomLeft(): Point = js.native
  
  def getBottomRight(): Point = js.native
  
  def getBoundingBox(): Rect = js.native
  
  def getCenter(): Point = js.native
  
  def getIntegerBoundingBox(): Rect = js.native
  
  def getSize(): Point = js.native
  
  def getTopLeft(): Point = js.native
  
  def getTopRight(): Point = js.native
  
  var height: Double = js.native
  
  def intersection(rect: Rect): Rect = js.native
  
  def rotate(degrees: Double): Rect = js.native
  def rotate(degrees: Double, pivot: Rect): Rect = js.native
  
  def times(factor: Double): Rect = js.native
  
  def translate(delta: Point): Rect = js.native
  
  def union(rect: Rect): Rect = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
