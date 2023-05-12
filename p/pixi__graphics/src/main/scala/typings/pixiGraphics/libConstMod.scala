package typings.pixiGraphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstMod {
  
  object GRAPHICS_CURVES {
    
    @JSImport("@pixi/graphics/lib/const", "GRAPHICS_CURVES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/graphics/lib/const", "GRAPHICS_CURVES.adaptive")
    @js.native
    def adaptive: Boolean = js.native
    inline def adaptive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adaptive")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics/lib/const", "GRAPHICS_CURVES.epsilon")
    @js.native
    def epsilon: Double = js.native
    inline def epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics/lib/const", "GRAPHICS_CURVES.maxLength")
    @js.native
    def maxLength: Double = js.native
    inline def maxLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics/lib/const", "GRAPHICS_CURVES.maxSegments")
    @js.native
    def maxSegments: Double = js.native
    inline def maxSegments_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSegments")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics/lib/const", "GRAPHICS_CURVES.minSegments")
    @js.native
    def minSegments: Double = js.native
    inline def minSegments_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minSegments")(x.asInstanceOf[js.Any])
    
    inline def segmentsCount(length: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_segmentsCount")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def segmentsCount(length: Double, defaultSegments: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_segmentsCount")(length.asInstanceOf[js.Any], defaultSegments.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @js.native
  sealed trait LINE_CAP extends StObject
  @JSImport("@pixi/graphics/lib/const", "LINE_CAP")
  @js.native
  object LINE_CAP extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LINE_CAP & String] = js.native
    
    /**
      * 'butt': don't add any cap at line ends (leaves orthogonal edges)
      * @default butt
      */
    @js.native
    sealed trait BUTT
      extends StObject
         with LINE_CAP
    /* "butt" */ val BUTT: typings.pixiGraphics.libConstMod.LINE_CAP.BUTT & String = js.native
    
    /**
      * 'round': add semicircle at ends
      * @default round
      */
    @js.native
    sealed trait ROUND
      extends StObject
         with LINE_CAP
    /* "round" */ val ROUND: typings.pixiGraphics.libConstMod.LINE_CAP.ROUND & String = js.native
    
    /**
      * 'square': add square at end (like `BUTT` except more length at end)
      * @default square
      */
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
    
    /**
      * 'bevel': add a square butt at each end of line segment and fill the triangle at turn
      * @default bevel
      */
    @js.native
    sealed trait BEVEL
      extends StObject
         with LINE_JOIN
    /* "bevel" */ val BEVEL: typings.pixiGraphics.libConstMod.LINE_JOIN.BEVEL & String = js.native
    
    /**
      * 'miter': make a sharp corner where outer part of lines meet
      * @default miter
      */
    @js.native
    sealed trait MITER
      extends StObject
         with LINE_JOIN
    /* "miter" */ val MITER: typings.pixiGraphics.libConstMod.LINE_JOIN.MITER & String = js.native
    
    /**
      * 'round': add an arc at the joint
      * @default round
      */
    @js.native
    sealed trait ROUND
      extends StObject
         with LINE_JOIN
    /* "round" */ val ROUND: typings.pixiGraphics.libConstMod.LINE_JOIN.ROUND & String = js.native
  }
  
  object curves {
    
    @JSImport("@pixi/graphics/lib/const", "curves")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/graphics/lib/const", "curves.adaptive")
    @js.native
    def adaptive: Boolean = js.native
    inline def adaptive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adaptive")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics/lib/const", "curves.epsilon")
    @js.native
    def epsilon: Double = js.native
    inline def epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics/lib/const", "curves.maxLength")
    @js.native
    def maxLength: Double = js.native
    inline def maxLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics/lib/const", "curves.maxSegments")
    @js.native
    def maxSegments: Double = js.native
    inline def maxSegments_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSegments")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics/lib/const", "curves.minSegments")
    @js.native
    def minSegments: Double = js.native
    inline def minSegments_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minSegments")(x.asInstanceOf[js.Any])
    
    inline def segmentsCount(length: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_segmentsCount")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def segmentsCount(length: Double, defaultSegments: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_segmentsCount")(length.asInstanceOf[js.Any], defaultSegments.asInstanceOf[js.Any])).asInstanceOf[Double]
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
