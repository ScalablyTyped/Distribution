package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TrackedRangeStickiness extends js.Object
@JSImport("monaco-editor", "editor.TrackedRangeStickiness")
@js.native
object TrackedRangeStickiness extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TrackedRangeStickiness with Double] = js.native
  
  @js.native
  sealed trait AlwaysGrowsWhenTypingAtEdges extends TrackedRangeStickiness
  /* 0 */ @js.native
  object AlwaysGrowsWhenTypingAtEdges extends TopLevel[AlwaysGrowsWhenTypingAtEdges with Double]
  
  @js.native
  sealed trait GrowsOnlyWhenTypingAfter extends TrackedRangeStickiness
  /* 3 */ @js.native
  object GrowsOnlyWhenTypingAfter extends TopLevel[GrowsOnlyWhenTypingAfter with Double]
  
  @js.native
  sealed trait GrowsOnlyWhenTypingBefore extends TrackedRangeStickiness
  /* 2 */ @js.native
  object GrowsOnlyWhenTypingBefore extends TopLevel[GrowsOnlyWhenTypingBefore with Double]
  
  @js.native
  sealed trait NeverGrowsWhenTypingAtEdges extends TrackedRangeStickiness
  /* 1 */ @js.native
  object NeverGrowsWhenTypingAtEdges extends TopLevel[NeverGrowsWhenTypingAtEdges with Double]
}
