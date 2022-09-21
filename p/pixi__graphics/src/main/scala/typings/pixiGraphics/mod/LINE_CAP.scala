package typings.pixiGraphics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LINE_CAP extends StObject
@JSImport("@pixi/graphics", "LINE_CAP")
@js.native
object LINE_CAP extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LINE_CAP & String] = js.native
  
  @js.native
  sealed trait BUTT
    extends StObject
       with LINE_CAP
  /* "butt" */ val BUTT: typings.pixiGraphics.mod.LINE_CAP.BUTT & String = js.native
  
  @js.native
  sealed trait ROUND
    extends StObject
       with LINE_CAP
  /* "round" */ val ROUND: typings.pixiGraphics.mod.LINE_CAP.ROUND & String = js.native
  
  @js.native
  sealed trait SQUARE
    extends StObject
       with LINE_CAP
  /* "square" */ val SQUARE: typings.pixiGraphics.mod.LINE_CAP.SQUARE & String = js.native
}
