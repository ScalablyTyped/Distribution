package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewHintMod {
  
  @JSImport("ol/ViewHint", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ViewHint & Double] = js.native
    
    /* 0 */ val ANIMATING: typings.ol.viewHintMod.ViewHint.ANIMATING & Double = js.native
    
    /* 1 */ val INTERACTING: typings.ol.viewHintMod.ViewHint.INTERACTING & Double = js.native
  }
  
  @js.native
  sealed trait ViewHint extends StObject
  @JSImport("ol/ViewHint", "ViewHint")
  @js.native
  object ViewHint extends StObject {
    
    @js.native
    sealed trait ANIMATING
      extends StObject
         with ViewHint
    
    @js.native
    sealed trait INTERACTING
      extends StObject
         with ViewHint
  }
}
