package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GridLineStyle extends StObject
@JSImport("photoshop/dom/Constants", "GridLineStyle")
@js.native
object GridLineStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GridLineStyle & String] = js.native
  
  @js.native
  sealed trait DASHED
    extends StObject
       with GridLineStyle
  /* "dashedLines" */ val DASHED: typings.photoshop.domConstantsMod.GridLineStyle.DASHED & String = js.native
  
  @js.native
  sealed trait DOTTED
    extends StObject
       with GridLineStyle
  /* "dots" */ val DOTTED: typings.photoshop.domConstantsMod.GridLineStyle.DOTTED & String = js.native
  
  @js.native
  sealed trait SOLID
    extends StObject
       with GridLineStyle
  /* "lens" */ val SOLID: typings.photoshop.domConstantsMod.GridLineStyle.SOLID & String = js.native
}
