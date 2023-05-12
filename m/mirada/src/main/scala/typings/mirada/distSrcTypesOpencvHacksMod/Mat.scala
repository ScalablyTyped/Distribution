package typings.mirada.distSrcTypesOpencvHacksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_hacks", "Mat_")
@js.native
open class Mat ()
  extends Vector[typings.mirada.distSrcTypesOpencvMod.Mat] {
  
  def charAt(i: Any): Any = js.native
  
  def charPtr(i: Any, j: Any): Any = js.native
  
  var data: js.typedarray.Uint8Array = js.native
  
  var data16S: js.typedarray.Int16Array = js.native
  
  var data16U: js.typedarray.Uint16Array = js.native
  
  var data32F: js.typedarray.Float32Array = js.native
  
  var data32S: js.typedarray.Int32Array = js.native
  
  var data32U: js.typedarray.Uint32Array = js.native
  
  var data64F: js.typedarray.Float64Array = js.native
  
  var data8S: js.typedarray.Int8Array = js.native
  
  var data8U: js.typedarray.Uint8Array = js.native
  
  def doublePtr(i: Any, j: Any): Any = js.native
  
  def floatPtr(i: Any, j: Any): Any = js.native
  
  def intPtr(i: Any, j: Any): Any = js.native
  
  def roi(expr: Mat): typings.mirada.distSrcTypesOpencvMod.Mat = js.native
  /**
    * Sometimes, you will have to play with certain region of images.
    * For eye detection in images, first face detection is done all
    * over the image and when face is obtained, we select the face region alone and search for eyes inside it instead of searching whole image.
    * It improves accuracy (because eyes are always on faces) and performance (because we search for a small area).
    *
    * Heads up : in JS seems only one argument is expected.
    */
  def roi(expr: Rect): typings.mirada.distSrcTypesOpencvMod.Mat = js.native
  
  def setTo(value: Mat): Mat = js.native
  def setTo(value: Mat, mask: Mat): Mat = js.native
  def setTo(value: Scalar): Mat = js.native
  def setTo(value: Scalar, mask: Mat): Mat = js.native
  
  def shortPtr(i: Any, j: Any): Any = js.native
  
  def ucharAt(i: Any): Any = js.native
  
  def ucharPtr(i: Any, j: Any): Any = js.native
  
  def ushortPtr(i: Any, j: Any): Any = js.native
}
