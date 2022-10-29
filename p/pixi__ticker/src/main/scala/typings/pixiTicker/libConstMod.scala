package typings.pixiTicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstMod {
  
  @js.native
  sealed trait UPDATE_PRIORITY extends StObject
  @JSImport("@pixi/ticker/lib/const", "UPDATE_PRIORITY")
  @js.native
  object UPDATE_PRIORITY extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UPDATE_PRIORITY & Double] = js.native
    
    @js.native
    sealed trait HIGH
      extends StObject
         with UPDATE_PRIORITY
    /* 25 */ val HIGH: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.HIGH & Double = js.native
    
    @js.native
    sealed trait LOW
      extends StObject
         with UPDATE_PRIORITY
    /* -25 */ val LOW: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.LOW & Double = js.native
    
    @js.native
    sealed trait NORMAL
      extends StObject
         with UPDATE_PRIORITY
    /* 0 */ val NORMAL: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.NORMAL & Double = js.native
    
    @js.native
    sealed trait UTILITY
      extends StObject
         with UPDATE_PRIORITY
    /* -50 */ val UTILITY: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.UTILITY & Double = js.native
  }
}
