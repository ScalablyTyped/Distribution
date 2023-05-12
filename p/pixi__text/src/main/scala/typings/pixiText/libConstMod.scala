package typings.pixiText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstMod {
  
  @js.native
  sealed trait TEXT_GRADIENT extends StObject
  @JSImport("@pixi/text/lib/const", "TEXT_GRADIENT")
  @js.native
  object TEXT_GRADIENT extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TEXT_GRADIENT & Double] = js.native
    
    /**
      * Linear gradient
      * @default 1
      */
    @js.native
    sealed trait LINEAR_HORIZONTAL
      extends StObject
         with TEXT_GRADIENT
    /* 1 */ val LINEAR_HORIZONTAL: typings.pixiText.libConstMod.TEXT_GRADIENT.LINEAR_HORIZONTAL & Double = js.native
    
    /**
      * Vertical gradient
      * @default 0
      */
    @js.native
    sealed trait LINEAR_VERTICAL
      extends StObject
         with TEXT_GRADIENT
    /* 0 */ val LINEAR_VERTICAL: typings.pixiText.libConstMod.TEXT_GRADIENT.LINEAR_VERTICAL & Double = js.native
  }
}
