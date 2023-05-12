package typings.mirada.mod

import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada", "PCA")
@js.native
/**
  *   The default constructor initializes an empty PCA structure. The other constructors initialize the
  * structure and call [PCA::operator()()].
  */
open class PCA ()
  extends typings.mirada.distSrcTypesOpencvMod.PCA {
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
  def this(
    data: typings.mirada.distSrcTypesOpencvTypesMod.InputArray,
    mean: typings.mirada.distSrcTypesOpencvTypesMod.InputArray,
    flags: int
  ) = this()
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
  def this(
    data: typings.mirada.distSrcTypesOpencvTypesMod.InputArray,
    mean: typings.mirada.distSrcTypesOpencvTypesMod.InputArray,
    flags: int,
    maxComponents: double | int
  ) = this()
}
