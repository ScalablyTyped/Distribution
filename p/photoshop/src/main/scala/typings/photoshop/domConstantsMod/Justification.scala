package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Justification extends StObject
@JSImport("photoshop/dom/Constants", "Justification")
@js.native
object Justification extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Justification & String] = js.native
  
  @js.native
  sealed trait CENTER
    extends StObject
       with Justification
  /* "center" */ val CENTER: typings.photoshop.domConstantsMod.Justification.CENTER & String = js.native
  
  @js.native
  sealed trait CENTERJUSTIFIED
    extends StObject
       with Justification
  /* "justifyCenter" */ val CENTERJUSTIFIED: typings.photoshop.domConstantsMod.Justification.CENTERJUSTIFIED & String = js.native
  
  @js.native
  sealed trait FULLYJUSTIFIED
    extends StObject
       with Justification
  /* "justifyAll" */ val FULLYJUSTIFIED: typings.photoshop.domConstantsMod.Justification.FULLYJUSTIFIED & String = js.native
  
  @js.native
  sealed trait LEFT
    extends StObject
       with Justification
  /* "left" */ val LEFT: typings.photoshop.domConstantsMod.Justification.LEFT & String = js.native
  
  @js.native
  sealed trait LEFTJUSTIFIED
    extends StObject
       with Justification
  /* "justifyLeft" */ val LEFTJUSTIFIED: typings.photoshop.domConstantsMod.Justification.LEFTJUSTIFIED & String = js.native
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with Justification
  /* "right" */ val RIGHT: typings.photoshop.domConstantsMod.Justification.RIGHT & String = js.native
  
  @js.native
  sealed trait RIGHTJUSTIFIED
    extends StObject
       with Justification
  /* "justifyRight" */ val RIGHTJUSTIFIED: typings.photoshop.domConstantsMod.Justification.RIGHTJUSTIFIED & String = js.native
}
