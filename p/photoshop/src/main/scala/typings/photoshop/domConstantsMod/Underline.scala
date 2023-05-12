package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Underline extends StObject
@JSImport("photoshop/dom/Constants", "Underline")
@js.native
object Underline extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Underline & String] = js.native
  
  @js.native
  sealed trait LEFTINVERTICAL
    extends StObject
       with Underline
  /* "underlineOnLeftInVertical" */ val LEFTINVERTICAL: typings.photoshop.domConstantsMod.Underline.LEFTINVERTICAL & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with Underline
  /* "underlineOff" */ val NONE: typings.photoshop.domConstantsMod.Underline.NONE & String = js.native
  
  @js.native
  sealed trait RIGHTINVERTICAL
    extends StObject
       with Underline
  /* "underlineOnRightInVertical" */ val RIGHTINVERTICAL: typings.photoshop.domConstantsMod.Underline.RIGHTINVERTICAL & String = js.native
}
