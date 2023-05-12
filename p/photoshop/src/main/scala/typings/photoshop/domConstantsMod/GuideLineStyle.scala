package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GuideLineStyle extends StObject
@JSImport("photoshop/dom/Constants", "GuideLineStyle")
@js.native
object GuideLineStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GuideLineStyle & String] = js.native
  
  @js.native
  sealed trait DASHED
    extends StObject
       with GuideLineStyle
  /* "dashedLines" */ val DASHED: typings.photoshop.domConstantsMod.GuideLineStyle.DASHED & String = js.native
  
  @js.native
  sealed trait SOLID
    extends StObject
       with GuideLineStyle
  /* "lens" */ val SOLID: typings.photoshop.domConstantsMod.GuideLineStyle.SOLID & String = js.native
}
