package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends StObject
@JSImport("photoshop/dom/Constants", "Orientation")
@js.native
object Orientation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation & String] = js.native
  
  @js.native
  sealed trait HORIZONTAL
    extends StObject
       with Orientation
  /* "horizontal" */ val HORIZONTAL: typings.photoshop.domConstantsMod.Orientation.HORIZONTAL & String = js.native
  
  @js.native
  sealed trait VERTICAL
    extends StObject
       with Orientation
  /* "vertical" */ val VERTICAL: typings.photoshop.domConstantsMod.Orientation.VERTICAL & String = js.native
}
