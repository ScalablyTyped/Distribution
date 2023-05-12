package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RadialBlurQuality extends StObject
@JSImport("photoshop/dom/Constants", "RadialBlurQuality")
@js.native
object RadialBlurQuality extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RadialBlurQuality & String] = js.native
  
  @js.native
  sealed trait BEST
    extends StObject
       with RadialBlurQuality
  /* "best" */ val BEST: typings.photoshop.domConstantsMod.RadialBlurQuality.BEST & String = js.native
  
  @js.native
  sealed trait DRAFT
    extends StObject
       with RadialBlurQuality
  /* "draft" */ val DRAFT: typings.photoshop.domConstantsMod.RadialBlurQuality.DRAFT & String = js.native
  
  @js.native
  sealed trait GOOD
    extends StObject
       with RadialBlurQuality
  /* "good" */ val GOOD: typings.photoshop.domConstantsMod.RadialBlurQuality.GOOD & String = js.native
}
