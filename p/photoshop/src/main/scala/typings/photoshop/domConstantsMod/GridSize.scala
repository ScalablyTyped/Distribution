package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GridSize extends StObject
@JSImport("photoshop/dom/Constants", "GridSize")
@js.native
object GridSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GridSize & String] = js.native
  
  /**
    * Large grid squares.
    */
  @js.native
  sealed trait LARGE
    extends StObject
       with GridSize
  /* "large" */ val LARGE: typings.photoshop.domConstantsMod.GridSize.LARGE & String = js.native
  
  /**
    * Medium grid squares.
    */
  @js.native
  sealed trait MEDIUM
    extends StObject
       with GridSize
  /* "medium" */ val MEDIUM: typings.photoshop.domConstantsMod.GridSize.MEDIUM & String = js.native
  
  /**
    * No grid is displayed.
    */
  @js.native
  sealed trait NONE
    extends StObject
       with GridSize
  /* "none" */ val NONE: typings.photoshop.domConstantsMod.GridSize.NONE & String = js.native
  
  /**
    * Small grid squares.
    */
  @js.native
  sealed trait SMALL
    extends StObject
       with GridSize
  /* "small" */ val SMALL: typings.photoshop.domConstantsMod.GridSize.SMALL & String = js.native
}
