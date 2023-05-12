package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NoiseDistribution extends StObject
@JSImport("photoshop/dom/Constants", "NoiseDistribution")
@js.native
object NoiseDistribution extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NoiseDistribution & String] = js.native
  
  @js.native
  sealed trait GAUSSIAN
    extends StObject
       with NoiseDistribution
  /* "gaussianDistribution" */ val GAUSSIAN: typings.photoshop.domConstantsMod.NoiseDistribution.GAUSSIAN & String = js.native
  
  @js.native
  sealed trait UNIFORM
    extends StObject
       with NoiseDistribution
  /* "uniformDistribution" */ val UNIFORM: typings.photoshop.domConstantsMod.NoiseDistribution.UNIFORM & String = js.native
}
