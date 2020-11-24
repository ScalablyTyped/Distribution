package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CSG.Matrix4x4")
@js.native
class Matrix4x4 ()
  extends typings.openjscad.CSG.Matrix4x4 {
  def this(elements: js.Array[Double]) = this()
}
/* static members */
@JSGlobal("CSG.Matrix4x4")
@js.native
object Matrix4x4 extends js.Object {
  
  def mirroring(plane: typings.openjscad.CSG.Plane): typings.openjscad.CSG.Matrix4x4 = js.native
  
  def rotation(
    rotationCenter: typings.openjscad.CSG.Vector3D,
    rotationAxis: typings.openjscad.CSG.Vector3D,
    degrees: Double
  ): typings.openjscad.CSG.Matrix4x4 = js.native
  
  def rotationX(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
  
  def rotationY(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
  
  def rotationZ(degrees: Double): typings.openjscad.CSG.Matrix4x4 = js.native
  
  def scaling(v: js.Array[Double]): typings.openjscad.CSG.Matrix4x4 = js.native
  def scaling(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Matrix4x4 = js.native
  
  def translation(v: js.Array[Double]): typings.openjscad.CSG.Matrix4x4 = js.native
  def translation(v: typings.openjscad.CSG.Vector3D): typings.openjscad.CSG.Matrix4x4 = js.native
  
  def unity(): typings.openjscad.CSG.Matrix4x4 = js.native
}
