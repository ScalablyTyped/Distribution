package typings.mirada.distSrcTypesOpencvTypesMod

import typings.mirada.distSrcTypesOpencvHacksMod.Mat3
import typings.mirada.distSrcTypesOpencvHacksMod.Mat4
import typings.mirada.distSrcTypesOpencvHacksMod.Vec3
import typings.mirada.distSrcTypesOpencvHacksMod.floatType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_types", "Affine3")
@js.native
open class Affine3 ()
  extends typings.mirada.distSrcTypesOpencvAffine3Mod.Affine3 {
  /**
    *   The resulting 4x4 matrix is
    *
    *   `\\[ \\begin{bmatrix} R & t\\\\ 0 & 1\\\\ \\end{bmatrix} \\]`
    *
    * @param R 3x3 rotation matrix.
    *
    * @param t 3x1 translation vector.
    */
  /**
    *   Rodrigues vector.
    *
    *   The last row of the current matrix is set to [0,0,0,1].
    *
    * @param rvec 3x1 rotation vector. Its direction indicates the rotation axis and its length
    * indicates the rotation angle in radian (using right hand rule).
    *
    * @param t 3x1 translation vector.
    */
  def this(affine: Mat3 | Mat4 | Vec3 | floatType) = this()
  /**
    *   Combines all constructors above. Supports 4x4, 3x4, 3x3, 1x3, 3x1 sizes of data matrix.
    *
    *   The last row of the current matrix is set to [0,0,0,1] when data is not 4x4.
    *
    * @param data 1-channel matrix. when it is 4x4, it is copied to the current matrix and t is not
    * used. When it is 3x4, it is copied to the upper part 3x4 of the current matrix and t is not used.
    * When it is 3x3, it is copied to the upper left 3x3 part of the current matrix. When it is 3x1 or
    * 1x3, it is treated as a rotation vector and the Rodrigues formula is used to compute a 3x3 rotation
    * matrix.
    *
    * @param t 3x1 translation vector. It is used only when data is neither 4x4 nor 3x4.
    */
  def this(data: Mat) = this()
  def this(R: Mat3 | Vec3, t: Vec3) = this()
  def this(data: Mat, t: Vec3) = this()
}
/* static members */
object Affine3 {
  
  @JSImport("mirada/dist/src/types/opencv/_types", "Affine3")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Identity(): typings.mirada.distSrcTypesOpencvAffine3Mod.Affine3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Identity")().asInstanceOf[typings.mirada.distSrcTypesOpencvAffine3Mod.Affine3]
}
