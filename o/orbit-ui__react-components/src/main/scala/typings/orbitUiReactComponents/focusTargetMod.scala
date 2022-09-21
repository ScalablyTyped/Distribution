package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusTargetMod {
  
  @js.native
  sealed trait FocusTarget extends StObject
  @JSImport("@orbit-ui/react-components/dist/shared/src/focusTarget", "FocusTarget")
  @js.native
  object FocusTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FocusTarget & String] = js.native
    
    @js.native
    sealed trait first
      extends StObject
         with FocusTarget
    /* "first" */ val first: typings.orbitUiReactComponents.focusTargetMod.FocusTarget.first & String = js.native
    
    @js.native
    sealed trait last
      extends StObject
         with FocusTarget
    /* "last" */ val last: typings.orbitUiReactComponents.focusTargetMod.FocusTarget.last & String = js.native
  }
}
