package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Intent extends StObject
@JSImport("photoshop/dom/Constants", "Intent")
@js.native
object Intent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Intent & String] = js.native
  
  @js.native
  sealed trait ABSOLUTECOLORIMETRIC
    extends StObject
       with Intent
  /* "absColorimetric" */ val ABSOLUTECOLORIMETRIC: typings.photoshop.domConstantsMod.Intent.ABSOLUTECOLORIMETRIC & String = js.native
  
  @js.native
  sealed trait PERCEPTUAL
    extends StObject
       with Intent
  /* "image" */ val PERCEPTUAL: typings.photoshop.domConstantsMod.Intent.PERCEPTUAL & String = js.native
  
  @js.native
  sealed trait RELATIVECOLORIMETRIC
    extends StObject
       with Intent
  /* "colorimetric" */ val RELATIVECOLORIMETRIC: typings.photoshop.domConstantsMod.Intent.RELATIVECOLORIMETRIC & String = js.native
  
  @js.native
  sealed trait SATURATION
    extends StObject
       with Intent
  /* "graphics" */ val SATURATION: typings.photoshop.domConstantsMod.Intent.SATURATION & String = js.native
}
