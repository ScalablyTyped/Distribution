package typings.openjscad

import typings.openjscad.CSG.Matrix4x4
import typings.openjscad.CSG.Plane
import typings.openjscad.CSG.Vector3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CxG extends StObject {
  
  def getBounds(): js.Array[CxG] = js.native
  
  def mirrored(plane: Plane): CxG = js.native
  
  def mirroredX(): CxG = js.native
  
  def mirroredY(): CxG = js.native
  
  def mirroredZ(): CxG = js.native
  
  def rotate(rotationCenter: Vector3D, rotationAxis: Vector3D, degrees: Double): CxG = js.native
  
  def rotateEulerAngles(alpha: Double, beta: Double, gamma: Double, position: js.Array[Double]): CxG = js.native
  
  def rotateX(deg: Double): CxG = js.native
  
  def rotateY(deg: Double): CxG = js.native
  
  def rotateZ(deg: Double): CxG = js.native
  
  def scale(f: Vector3D): CxG = js.native
  
  def toAMFString(): Unit = js.native
  def toAMFString(AMFStringOptions: IAMFStringOptions): Unit = js.native
  
  def toStlBinary(): Unit = js.native
  
  def toStlString(): String = js.native
  
  def transform(matrix4x4: Matrix4x4): CxG = js.native
  
  def translate(v: js.Array[Double]): CxG = js.native
  def translate(v: Vector3D): CxG = js.native
}
