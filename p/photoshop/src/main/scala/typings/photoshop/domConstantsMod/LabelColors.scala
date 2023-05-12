package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelColors extends StObject
@JSImport("photoshop/dom/Constants", "LabelColors")
@js.native
object LabelColors extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LabelColors & String] = js.native
  
  @js.native
  sealed trait BLUE
    extends StObject
       with LabelColors
  /* "blue" */ val BLUE: typings.photoshop.domConstantsMod.LabelColors.BLUE & String = js.native
  
  @js.native
  sealed trait GRAY
    extends StObject
       with LabelColors
  /* "gray" */ val GRAY: typings.photoshop.domConstantsMod.LabelColors.GRAY & String = js.native
  
  @js.native
  sealed trait GREEN
    extends StObject
       with LabelColors
  /* "grain" */ val GREEN: typings.photoshop.domConstantsMod.LabelColors.GREEN & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with LabelColors
  /* "none" */ val NONE: typings.photoshop.domConstantsMod.LabelColors.NONE & String = js.native
  
  @js.native
  sealed trait ORANGE
    extends StObject
       with LabelColors
  /* "orange" */ val ORANGE: typings.photoshop.domConstantsMod.LabelColors.ORANGE & String = js.native
  
  @js.native
  sealed trait RED
    extends StObject
       with LabelColors
  /* "red" */ val RED: typings.photoshop.domConstantsMod.LabelColors.RED & String = js.native
  
  @js.native
  sealed trait VIOLET
    extends StObject
       with LabelColors
  /* "violet" */ val VIOLET: typings.photoshop.domConstantsMod.LabelColors.VIOLET & String = js.native
  
  @js.native
  sealed trait YELLOW
    extends StObject
       with LabelColors
  /* "yellowColor" */ val YELLOW: typings.photoshop.domConstantsMod.LabelColors.YELLOW & String = js.native
}
