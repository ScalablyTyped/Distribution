package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olMod {
  
  @JSImport("ol/transform", "apply")
  @js.native
  def apply(transform: Transform, coordinate: Coordinate | Pixel): Coordinate | Pixel = js.native
  
  @JSImport("ol/transform", "compose")
  @js.native
  def compose(
    transform: Transform,
    dx1: Double,
    dy1: Double,
    sx: Double,
    sy: Double,
    angle: Double,
    dx2: Double,
    dy2: Double
  ): Transform = js.native
  
  @JSImport("ol/transform", "composeCssTransform")
  @js.native
  def composeCssTransform(dx1: Double, dy1: Double, sx: Double, sy: Double, angle: Double, dx2: Double, dy2: Double): String = js.native
  
  @JSImport("ol/transform", "create")
  @js.native
  def create(): Transform = js.native
  
  @JSImport("ol/transform", "determinant")
  @js.native
  def determinant(mat: Transform): Double = js.native
  
  @JSImport("ol/transform", "invert")
  @js.native
  def invert(source: Transform): Transform = js.native
  
  @JSImport("ol/transform", "makeInverse")
  @js.native
  def makeInverse(target: Transform, source: Transform): Transform = js.native
  
  @JSImport("ol/transform", "makeScale")
  @js.native
  def makeScale(target: Transform, x: Double, y: Double): Transform = js.native
  
  @JSImport("ol/transform", "multiply")
  @js.native
  def multiply(transform1: Transform, transform2: Transform): Transform = js.native
  
  @JSImport("ol/transform", "reset")
  @js.native
  def reset(transform: Transform): Transform = js.native
  
  @JSImport("ol/transform", "rotate")
  @js.native
  def rotate(transform: Transform, angle: Double): Transform = js.native
  
  @JSImport("ol/transform", "scale")
  @js.native
  def scale(transform: Transform, x: Double, y: Double): Transform = js.native
  
  @JSImport("ol/transform", "set")
  @js.native
  def set(transform: Transform, a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Transform = js.native
  
  @JSImport("ol/transform", "setFromArray")
  @js.native
  def setFromArray(transform1: Transform, transform2: Transform): Transform = js.native
  
  @JSImport("ol/transform", "toString")
  @js.native
  def toString_(mat: Transform): String = js.native
  
  @JSImport("ol/transform", "translate")
  @js.native
  def translate(transform: Transform, dx: Double, dy: Double): Transform = js.native
  
  type Transform = js.Array[Double]
}
