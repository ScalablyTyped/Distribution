package typings.preact.internalMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HookType extends js.Object
@JSImport("preact/src/internal", "HookType")
@js.native
object HookType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HookType with Double] = js.native
  
  @js.native
  sealed trait useCallback extends HookType
  /* 8 */ @js.native
  object useCallback extends TopLevel[useCallback with Double]
  
  @js.native
  sealed trait useContext extends HookType
  /* 9 */ @js.native
  object useContext extends TopLevel[useContext with Double]
  
  // Not a real hook, but the devtools treat is as such
  @js.native
  sealed trait useDebugvalue extends HookType
  /* 11 */ @js.native
  object useDebugvalue extends TopLevel[useDebugvalue with Double]
  
  @js.native
  sealed trait useEffect extends HookType
  /* 3 */ @js.native
  object useEffect extends TopLevel[useEffect with Double]
  
  @js.native
  sealed trait useErrorBoundary extends HookType
  /* 10 */ @js.native
  object useErrorBoundary extends TopLevel[useErrorBoundary with Double]
  
  @js.native
  sealed trait useImperativeHandle extends HookType
  /* 6 */ @js.native
  object useImperativeHandle extends TopLevel[useImperativeHandle with Double]
  
  @js.native
  sealed trait useLayoutEffect extends HookType
  /* 4 */ @js.native
  object useLayoutEffect extends TopLevel[useLayoutEffect with Double]
  
  @js.native
  sealed trait useMemo extends HookType
  /* 7 */ @js.native
  object useMemo extends TopLevel[useMemo with Double]
  
  @js.native
  sealed trait useReducer extends HookType
  /* 2 */ @js.native
  object useReducer extends TopLevel[useReducer with Double]
  
  @js.native
  sealed trait useRef extends HookType
  /* 5 */ @js.native
  object useRef extends TopLevel[useRef with Double]
  
  @js.native
  sealed trait useState extends HookType
  /* 1 */ @js.native
  object useState extends TopLevel[useState with Double]
}
