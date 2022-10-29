package typings.pixiGraphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstMod {
  
  @JSImport("@pixi/graphics/lib/const", "GRAPHICS_CURVES")
  @js.native
  val GRAPHICS_CURVES: IGraphicsCurvesSettings = js.native
  
  @js.native
  sealed trait LINE_CAP extends StObject
  @JSImport("@pixi/graphics/lib/const", "LINE_CAP")
  @js.native
  object LINE_CAP extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LINE_CAP & String] = js.native
    
    @js.native
    sealed trait BUTT
      extends StObject
         with LINE_CAP
    /* "butt" */ val BUTT: typings.pixiGraphics.libConstMod.LINE_CAP.BUTT & String = js.native
    
    @js.native
    sealed trait ROUND
      extends StObject
         with LINE_CAP
    /* "round" */ val ROUND: typings.pixiGraphics.libConstMod.LINE_CAP.ROUND & String = js.native
    
    @js.native
    sealed trait SQUARE
      extends StObject
         with LINE_CAP
    /* "square" */ val SQUARE: typings.pixiGraphics.libConstMod.LINE_CAP.SQUARE & String = js.native
  }
  
  @js.native
  sealed trait LINE_JOIN extends StObject
  @JSImport("@pixi/graphics/lib/const", "LINE_JOIN")
  @js.native
  object LINE_JOIN extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LINE_JOIN & String] = js.native
    
    @js.native
    sealed trait BEVEL
      extends StObject
         with LINE_JOIN
    /* "bevel" */ val BEVEL: typings.pixiGraphics.libConstMod.LINE_JOIN.BEVEL & String = js.native
    
    @js.native
    sealed trait MITER
      extends StObject
         with LINE_JOIN
    /* "miter" */ val MITER: typings.pixiGraphics.libConstMod.LINE_JOIN.MITER & String = js.native
    
    @js.native
    sealed trait ROUND
      extends StObject
         with LINE_JOIN
    /* "round" */ val ROUND: typings.pixiGraphics.libConstMod.LINE_JOIN.ROUND & String = js.native
  }
  
  @js.native
  trait IGraphicsCurvesSettings extends StObject {
    
    def _segmentsCount(length: Double): Double = js.native
    def _segmentsCount(length: Double, defaultSegments: Double): Double = js.native
    
    var adaptive: Boolean = js.native
    
    var epsilon: Double = js.native
    
    var maxLength: Double = js.native
    
    var maxSegments: Double = js.native
    
    var minSegments: Double = js.native
  }
}
