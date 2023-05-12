package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("ol/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(transform: js.Array[Double], coordinate: Coordinate | Pixel): Coordinate | Pixel = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(transform.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[Coordinate | Pixel]
  
  inline def compose(
    transform: js.Array[Double],
    dx1: Double,
    dy1: Double,
    sx: Double,
    sy: Double,
    angle: Double,
    dx2: Double,
    dy2: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(transform.asInstanceOf[js.Any], dx1.asInstanceOf[js.Any], dy1.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], dx2.asInstanceOf[js.Any], dy2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def composeCssTransform(dx1: Double, dy1: Double, sx: Double, sy: Double, angle: Double, dx2: Double, dy2: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCssTransform")(dx1.asInstanceOf[js.Any], dy1.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], dx2.asInstanceOf[js.Any], dy2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def create(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Array[Double]]
  
  inline def determinant(mat: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(mat.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def invert(source: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def makeInverse(target: js.Array[Double], source: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeInverse")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def makeScale(target: js.Array[Double], x: Double, y: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeScale")(target.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def multiply(transform1: js.Array[Double], transform2: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def reset(transform: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(transform.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def rotate(transform: js.Array[Double], angle: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(transform.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def scale(transform: js.Array[Double], x: Double, y: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(transform.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def set(transform: js.Array[Double], a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(transform.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def setFromArray(transform1: js.Array[Double], transform2: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setFromArray")(transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def toString_(mat: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(mat.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def translate(transform: js.Array[Double], dx: Double, dy: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(transform.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  type Transform = js.Array[Double]
}
