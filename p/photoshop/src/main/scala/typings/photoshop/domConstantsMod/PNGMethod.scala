package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PNGMethod extends StObject
@JSImport("photoshop/dom/Constants", "PNGMethod")
@js.native
object PNGMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PNGMethod & String] = js.native
  
  @js.native
  sealed trait MODERATE
    extends StObject
       with PNGMethod
  /* "moderate" */ val MODERATE: typings.photoshop.domConstantsMod.PNGMethod.MODERATE & String = js.native
  
  @js.native
  sealed trait QUICK
    extends StObject
       with PNGMethod
  /* "quick" */ val QUICK: typings.photoshop.domConstantsMod.PNGMethod.QUICK & String = js.native
  
  @js.native
  sealed trait THOROUGH
    extends StObject
       with PNGMethod
  /* "thorough" */ val THOROUGH: typings.photoshop.domConstantsMod.PNGMethod.THOROUGH & String = js.native
}
