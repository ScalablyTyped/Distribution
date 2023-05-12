package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StrikeThrough extends StObject
@JSImport("photoshop/dom/Constants", "StrikeThrough")
@js.native
object StrikeThrough extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StrikeThrough & String] = js.native
  
  @js.native
  sealed trait STRIKEBOX
    extends StObject
       with StrikeThrough
  /* "eMBoxStrikethroughOn" */ val STRIKEBOX: typings.photoshop.domConstantsMod.StrikeThrough.STRIKEBOX & String = js.native
  
  @js.native
  sealed trait STRIKEHEIGHT
    extends StObject
       with StrikeThrough
  /* "xHeightStrikethroughOn" */ val STRIKEHEIGHT: typings.photoshop.domConstantsMod.StrikeThrough.STRIKEHEIGHT & String = js.native
  
  @js.native
  sealed trait STRIKEOFF
    extends StObject
       with StrikeThrough
  /* "strikethroughOff" */ val STRIKEOFF: typings.photoshop.domConstantsMod.StrikeThrough.STRIKEOFF & String = js.native
}
