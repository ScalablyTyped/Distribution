package typings.mirada.mod

import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada", "DescriptorMatcher")
@js.native
open class DescriptorMatcher ()
  extends typings.mirada.distSrcTypesOpencvMod.DescriptorMatcher
/* static members */
object DescriptorMatcher {
  
  @JSImport("mirada", "DescriptorMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param descriptorMatcherType Descriptor matcher type. Now the following matcher types are
    * supported:
    *   BruteForce (it uses L2 )BruteForce-L1BruteForce-HammingBruteForce-Hamming(2)FlannBased
    */
  inline def create(descriptorMatcherType: String): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(descriptorMatcherType.asInstanceOf[js.Any]).asInstanceOf[Ptr]
  inline def create(matcherType: Any): Ptr = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(matcherType.asInstanceOf[js.Any]).asInstanceOf[Ptr]
}
