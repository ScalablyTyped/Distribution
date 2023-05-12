package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.FileNode
import typings.mirada.distSrcTypesOpencvHacksMod.FileStorage
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvPcaMod {
  
  @JSImport("mirada/dist/src/types/opencv/PCA", "DATA_AS_COL")
  @js.native
  val DATA_AS_COL: Flags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/PCA", "DATA_AS_ROW")
  @js.native
  val DATA_AS_ROW: Flags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/PCA", "PCA")
  @js.native
  /**
    *   The default constructor initializes an empty PCA structure. The other constructors initialize the
    * structure and call [PCA::operator()()].
    */
  open class PCA () extends StObject {
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param data input samples stored as matrix rows or matrix columns.
      *
      * @param mean optional mean value; if the matrix is empty (noArray()), the mean is computed from the
      * data.
      *
      * @param flags operation flags; currently the parameter is only used to specify the data layout
      * (PCA::Flags)
      *
      * @param maxComponents maximum number of components that PCA should retain; by default, all the
      * components are retained.
      */
    def this(data: InputArray, mean: InputArray, flags: int) = this()
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param data input samples stored as matrix rows or matrix columns.
      *
      * @param mean optional mean value; if the matrix is empty (noArray()), the mean is computed from the
      * data.
      *
      * @param flags operation flags; currently the parameter is only used to specify the data layout
      * (PCA::Flags)
      *
      * @param retainedVariance Percentage of variance that PCA should retain. Using this parameter will
      * let the PCA decided how many components to retain but it will always keep at least 2.
      */
    def this(data: InputArray, mean: InputArray, flags: int, maxComponents: double | int) = this()
    
    /**
      *   The methods are inverse operations to [PCA::project]. They take PC coordinates of projected
      * vectors and reconstruct the original vectors. Unless all the principal components have been
      * retained, the reconstructed vectors are different from the originals. But typically, the difference
      * is small if the number of components is large enough (but still much smaller than the original
      * vector dimensionality). As a result, [PCA] is used.
      *
      * @param vec coordinates of the vectors in the principal component subspace, the layout and size are
      * the same as of PCA::project output vectors.
      */
    def backProject(vec: InputArray): Mat = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param vec coordinates of the vectors in the principal component subspace, the layout and size are
      * the same as of PCA::project output vectors.
      *
      * @param result reconstructed vectors; the layout and size are the same as of PCA::project input
      * vectors.
      */
    def backProject(vec: InputArray, result: OutputArray): InputArray = js.native
    
    var eigenvalues: Mat = js.native
    
    var eigenvectors: Mat = js.native
    
    var mean: Mat = js.native
    
    /**
      *   The methods project one or more vectors to the principal component subspace, where each vector
      * projection is represented by coefficients in the principal component basis. The first form of the
      * method returns the matrix that the second form writes to the result. So the first form can be used
      * as a part of expression while the second form can be more efficient in a processing loop.
      *
      * @param vec input vector(s); must have the same dimensionality and the same layout as the input
      * data used at PCA phase, that is, if DATA_AS_ROW are specified, then vec.cols==data.cols (vector
      * dimensionality) and vec.rows is the number of vectors to project, and the same is true for the
      * PCA::DATA_AS_COL case.
      */
    def project(vec: InputArray): Mat = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param vec input vector(s); must have the same dimensionality and the same layout as the input
      * data used at PCA phase, that is, if DATA_AS_ROW are specified, then vec.cols==data.cols (vector
      * dimensionality) and vec.rows is the number of vectors to project, and the same is true for the
      * PCA::DATA_AS_COL case.
      *
      * @param result output vectors; in case of PCA::DATA_AS_COL, the output matrix has as many columns
      * as the number of input vectors, this means that result.cols==vec.cols and the number of rows match
      * the number of principal components (for example, maxComponents parameter passed to the constructor).
      */
    def project(vec: InputArray, result: OutputArray): InputArray = js.native
    
    /**
      *   Loads [eigenvalues] [eigenvectors] and [mean] from specified [FileNode]
      */
    def read(fn: FileNode): FileNode = js.native
    
    /**
      *   Writes [eigenvalues] [eigenvectors] and [mean] to specified [FileStorage]
      */
    def write(fs: FileStorage): FileStorage = js.native
  }
  
  @JSImport("mirada/dist/src/types/opencv/PCA", "USE_AVG")
  @js.native
  val USE_AVG: Flags = js.native
  
  type Flags = Any
}
