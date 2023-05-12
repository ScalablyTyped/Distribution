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
    
    /**
      * High priority updating, used by {@link PIXI.AnimatedSprite}
      * @default 25
      */
    @js.native
    sealed trait HIGH
      extends StObject
         with UPDATE_PRIORITY
    /* 25 */ val HIGH: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.HIGH & Double = js.native
    
    /**
      * Highest priority used for interaction events in {@link PIXI.EventSystem}
      * @default 50
      */
    @js.native
    sealed trait INTERACTION
      extends StObject
         with UPDATE_PRIORITY
    /* 50 */ val INTERACTION: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.INTERACTION & Double = js.native
    
    /**
      * Low priority used for {@link PIXI.Application} rendering.
      * @default -25
      */
    @js.native
    sealed trait LOW
      extends StObject
         with UPDATE_PRIORITY
    /* -25 */ val LOW: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.LOW & Double = js.native
    
    /**
      * Default priority for ticker events, see {@link PIXI.Ticker#add}.
      * @default 0
      */
    @js.native
    sealed trait NORMAL
      extends StObject
         with UPDATE_PRIORITY
    /* 0 */ val NORMAL: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.NORMAL & Double = js.native
    
    /**
      * Lowest priority used for {@link PIXI.BasePrepare} utility.
      * @default -50
      */
    @js.native
    sealed trait UTILITY
      extends StObject
         with UPDATE_PRIORITY
    /* -50 */ val UTILITY: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.UTILITY & Double = js.native
  }
}
