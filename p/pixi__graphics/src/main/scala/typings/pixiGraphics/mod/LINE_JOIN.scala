package typings.pixiGraphics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LINE_JOIN extends StObject
@JSImport("@pixi/graphics", "LINE_JOIN")
@js.native
object LINE_JOIN extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LINE_JOIN & String] = js.native
  
  @js.native
  sealed trait BEVEL
    extends StObject
       with LINE_JOIN
  /* "bevel" */ val BEVEL: typings.pixiGraphics.mod.LINE_JOIN.BEVEL & String = js.native
  
  @js.native
  sealed trait MITER
    extends StObject
       with LINE_JOIN
  /* "miter" */ val MITER: typings.pixiGraphics.mod.LINE_JOIN.MITER & String = js.native
  
  @js.native
  sealed trait ROUND
    extends StObject
       with LINE_JOIN
  /* "round" */ val ROUND: typings.pixiGraphics.mod.LINE_JOIN.ROUND & String = js.native
}
