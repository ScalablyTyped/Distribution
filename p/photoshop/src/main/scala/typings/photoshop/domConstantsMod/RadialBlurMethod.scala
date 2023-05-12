package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RadialBlurMethod extends StObject
@JSImport("photoshop/dom/Constants", "RadialBlurMethod")
@js.native
object RadialBlurMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RadialBlurMethod & String] = js.native
  
  @js.native
  sealed trait SPIN
    extends StObject
       with RadialBlurMethod
  /* "spin" */ val SPIN: typings.photoshop.domConstantsMod.RadialBlurMethod.SPIN & String = js.native
  
  @js.native
  sealed trait ZOOM
    extends StObject
       with RadialBlurMethod
  /* "zoom" */ val ZOOM: typings.photoshop.domConstantsMod.RadialBlurMethod.ZOOM & String = js.native
}
