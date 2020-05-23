package typings.preact.internalMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HookType extends js.Object

@JSImport("preact/src/internal", "HookType")
@js.native
object HookType extends js.Object {
  @js.native
  sealed trait useCallback extends HookType
  
  @js.native
  sealed trait useContext extends HookType
  
  // Not a real hook, but the devtools treat is as such
  @js.native
  sealed trait useDebugvalue extends HookType
  
  @js.native
  sealed trait useEffect extends HookType
  
  @js.native
  sealed trait useErrorBoundary extends HookType
  
  @js.native
  sealed trait useImperativeHandle extends HookType
  
  @js.native
  sealed trait useLayoutEffect extends HookType
  
  @js.native
  sealed trait useMemo extends HookType
  
  @js.native
  sealed trait useReducer extends HookType
  
  @js.native
  sealed trait useRef extends HookType
  
  @js.native
  sealed trait useState extends HookType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HookType with Double] = js.native
  /* 8 */ @js.native
  object useCallback extends TopLevel[useCallback with Double]
  
  /* 9 */ @js.native
  object useContext extends TopLevel[useContext with Double]
  
  /* 11 */ @js.native
  object useDebugvalue extends TopLevel[useDebugvalue with Double]
  
  /* 3 */ @js.native
  object useEffect extends TopLevel[useEffect with Double]
  
  /* 10 */ @js.native
  object useErrorBoundary extends TopLevel[useErrorBoundary with Double]
  
  /* 6 */ @js.native
  object useImperativeHandle extends TopLevel[useImperativeHandle with Double]
  
  /* 4 */ @js.native
  object useLayoutEffect extends TopLevel[useLayoutEffect with Double]
  
  /* 7 */ @js.native
  object useMemo extends TopLevel[useMemo with Double]
  
  /* 2 */ @js.native
  object useReducer extends TopLevel[useReducer with Double]
  
  /* 5 */ @js.native
  object useRef extends TopLevel[useRef with Double]
  
  /* 1 */ @js.native
  object useState extends TopLevel[useState with Double]
  
}

