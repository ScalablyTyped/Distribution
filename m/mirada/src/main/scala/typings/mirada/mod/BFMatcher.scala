package typings.mirada.mod

import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada", "BFMatcher")
@js.native
open class BFMatcher ()
  extends typings.mirada.distSrcTypesOpencvMod.BFMatcher {
  def this(normType: int) = this()
  def this(normType: Unit, crossCheck: bool) = this()
  def this(normType: int, crossCheck: bool) = this()
}
/* static members */
object BFMatcher {
  
  @JSImport("mirada", "BFMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param normType One of NORM_L1, NORM_L2, NORM_HAMMING, NORM_HAMMING2. L1 and L2 norms are
    * preferable choices for SIFT and SURF descriptors, NORM_HAMMING should be used with ORB, BRISK and
    * BRIEF, NORM_HAMMING2 should be used with ORB when WTA_K==3 or 4 (see ORB::ORB constructor
    * description).
    *
    * @param crossCheck If it is false, this is will be default BFMatcher behaviour when it finds the k
    * nearest neighbors for each query descriptor. If crossCheck==true, then the knnMatch() method with
    * k=1 will only return pairs (i,j) such that for i-th query descriptor the j-th descriptor in the
    * matcher's collection is the nearest and vice versa, i.e. the BFMatcher will only return consistent
    * pairs. Such technique usually produces best results with minimal number of outliers when there are
    * enough matches. This is alternative to the ratio test, used by D. Lowe in SIFT paper.
    */
  inline def create(): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Ptr]
  inline def create(normType: Unit, crossCheck: bool): Ptr = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(normType.asInstanceOf[js.Any], crossCheck.asInstanceOf[js.Any])).asInstanceOf[Ptr]
  inline def create(normType: int): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(normType.asInstanceOf[js.Any]).asInstanceOf[Ptr]
  inline def create(normType: int, crossCheck: bool): Ptr = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(normType.asInstanceOf[js.Any], crossCheck.asInstanceOf[js.Any])).asInstanceOf[Ptr]
}
