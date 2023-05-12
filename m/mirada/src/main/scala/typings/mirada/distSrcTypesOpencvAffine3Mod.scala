package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.Mat3
import typings.mirada.distSrcTypesOpencvHacksMod.Mat4
import typings.mirada.distSrcTypesOpencvHacksMod.Vec3
import typings.mirada.distSrcTypesOpencvHacksMod.floatType
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvAffine3Mod {
  
  @JSImport("mirada/dist/src/types/opencv/Affine3", "Affine3")
  @js.native
  open class Affine3 () extends StObject {
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
    
    def cast(arg401: Any): Affine3 = js.native
    
    def concatenate(affine: Affine3): Affine3 = js.native
    
    /**
      *   the inverse of the current matrix.
      */
    def inv(): Affine3 = js.native
    def inv(method: int): Affine3 = js.native
    
    /**
      *   the upper left 3x3 part
      */
    def linear(): Mat3 = js.native
    /**
      *   Copy the 3x3 matrix L to the upper left part of the current matrix
      *
      *   It sets the upper left 3x3 part of the matrix. The remaining part is unaffected.
      *
      * @param L 3x3 matrix.
      */
    def linear(L: Mat3): Mat3 = js.native
    
    var matrix: Mat4 = js.native
    
    def rotate(R: Mat3 | Vec3): Affine3 = js.native
    
    /**
      *   the upper left 3x3 part
      */
    def rotation(): Mat3 = js.native
    /**
      *   Rotation matrix.
      *
      *   Copy the rotation matrix to the upper left 3x3 part of the current matrix. The remaining elements
      * of the current matrix are not changed.
      *
      * @param R 3x3 rotation matrix.
      */
    def rotation(R: Mat3): Mat3 = js.native
    /**
      *   Combines rotation methods above. Supports 3x3, 1x3, 3x1 sizes of data matrix.
      *
      *   It sets the upper left 3x3 part of the matrix. The remaining part is unaffected.
      *
      * @param data 1-channel matrix. When it is a 3x3 matrix, it sets the upper left 3x3 part of the
      * current matrix. When it is a 1x3 or 3x1 matrix, it is used as a rotation vector. The Rodrigues
      * formula is used to compute the rotation matrix and sets the upper left 3x3 part of the current
      * matrix.
      */
    def rotation(data: Mat): Mat = js.native
    /**
      *   Rodrigues vector.
      *
      *   It sets the upper left 3x3 part of the matrix. The remaining part is unaffected.
      *
      * @param rvec 3x1 rotation vector. The direction indicates the rotation axis and its length
      * indicates the rotation angle in radian (using the right thumb convention).
      */
    @JSName("rotation")
    def rotation_Vec3(rvec: Vec3): Vec3 = js.native
    
    /**
      *   Rodrigues vector.
      *
      *   a vector representing the upper left 3x3 rotation matrix of the current matrix.
      *
      *   Since the mapping between rotation vectors and rotation matrices is many to one, this function
      * returns only one rotation vector that represents the current rotation matrix, which is not
      * necessarily the same one set by `[rotation(const Vec3& rvec)]`.
      */
    def rvec(): Vec3 = js.native
    
    def translate(t: Vec3): Affine3 = js.native
    
    /**
      *   the upper right 3x1 part
      */
    def translation(): Vec3 = js.native
    /**
      *   Copy t to the first three elements of the last column of the current matrix
      *
      *   It sets the upper right 3x1 part of the matrix. The remaining part is unaffected.
      *
      * @param t 3x1 translation vector.
      */
    def translation(t: Vec3): Vec3 = js.native
  }
  /* static members */
  object Affine3 {
    
    @JSImport("mirada/dist/src/types/opencv/Affine3", "Affine3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Identity(): Affine3 = ^.asInstanceOf[js.Dynamic].applyDynamic("Identity")().asInstanceOf[Affine3]
  }
}
