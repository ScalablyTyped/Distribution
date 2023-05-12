package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends StObject
@JSImport("photoshop/dom/Constants", "Direction")
@js.native
object Direction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction & String] = js.native
  
  @js.native
  sealed trait HORIZONTAL
    extends StObject
       with Direction
  /* "horizontal" */ val HORIZONTAL: typings.photoshop.domConstantsMod.Direction.HORIZONTAL & String = js.native
  
  @js.native
  sealed trait VERTICAL
    extends StObject
       with Direction
  /* "vertical" */ val VERTICAL: typings.photoshop.domConstantsMod.Direction.VERTICAL & String = js.native
}
