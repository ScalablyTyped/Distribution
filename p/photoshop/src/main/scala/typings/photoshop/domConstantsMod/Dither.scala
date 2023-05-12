package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Dither extends StObject
@JSImport("photoshop/dom/Constants", "Dither")
@js.native
object Dither extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Dither & String] = js.native
  
  @js.native
  sealed trait DIFFUSION
    extends StObject
       with Dither
  /* "diffusion" */ val DIFFUSION: typings.photoshop.domConstantsMod.Dither.DIFFUSION & String = js.native
  
  @js.native
  sealed trait NOISE
    extends StObject
       with Dither
  /* "blue" */ val NOISE: typings.photoshop.domConstantsMod.Dither.NOISE & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with Dither
  /* "none" */ val NONE: typings.photoshop.domConstantsMod.Dither.NONE & String = js.native
  
  @js.native
  sealed trait PATTERN
    extends StObject
       with Dither
  /* "pattern" */ val PATTERN: typings.photoshop.domConstantsMod.Dither.PATTERN & String = js.native
}
