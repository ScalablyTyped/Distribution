package typings.pixiMath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstMod {
  
  @JSImport("@pixi/math/lib/const", "DEG_TO_RAD")
  @js.native
  val DEG_TO_RAD: Double = js.native
  
  @JSImport("@pixi/math/lib/const", "PI_2")
  @js.native
  val PI_2: Double = js.native
  
  @JSImport("@pixi/math/lib/const", "RAD_TO_DEG")
  @js.native
  val RAD_TO_DEG: Double = js.native
  
  @js.native
  sealed trait SHAPES extends StObject
  @JSImport("@pixi/math/lib/const", "SHAPES")
  @js.native
  object SHAPES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SHAPES & Double] = js.native
    
    @js.native
    sealed trait CIRC
      extends StObject
         with SHAPES
    /* 2 */ val CIRC: typings.pixiMath.libConstMod.SHAPES.CIRC & Double = js.native
    
    @js.native
    sealed trait ELIP
      extends StObject
         with SHAPES
    /* 3 */ val ELIP: typings.pixiMath.libConstMod.SHAPES.ELIP & Double = js.native
    
    @js.native
    sealed trait POLY
      extends StObject
         with SHAPES
    /* 0 */ val POLY: typings.pixiMath.libConstMod.SHAPES.POLY & Double = js.native
    
    @js.native
    sealed trait RECT
      extends StObject
         with SHAPES
    /* 1 */ val RECT: typings.pixiMath.libConstMod.SHAPES.RECT & Double = js.native
    
    @js.native
    sealed trait RREC
      extends StObject
         with SHAPES
    /* 4 */ val RREC: typings.pixiMath.libConstMod.SHAPES.RREC & Double = js.native
  }
}
