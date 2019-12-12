package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.editor.TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges
import typings.monacoDashEditor.monacoDashEditorMod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingAfter
import typings.monacoDashEditor.monacoDashEditorMod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingBefore
import typings.monacoDashEditor.monacoDashEditorMod.editor.TrackedRangeStickiness.NeverGrowsWhenTypingAtEdges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackedRangeStickiness extends js.Object

@JSImport("monaco-editor", "editor.TrackedRangeStickiness")
@js.native
object TrackedRangeStickiness extends js.Object {
  @js.native
  sealed trait AlwaysGrowsWhenTypingAtEdges extends TrackedRangeStickiness
  
  @js.native
  sealed trait GrowsOnlyWhenTypingAfter extends TrackedRangeStickiness
  
  @js.native
  sealed trait GrowsOnlyWhenTypingBefore extends TrackedRangeStickiness
  
  @js.native
  sealed trait NeverGrowsWhenTypingAtEdges extends TrackedRangeStickiness
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TrackedRangeStickiness with Double] = js.native
  /* 0 */ @js.native
  object AlwaysGrowsWhenTypingAtEdges extends TopLevel[AlwaysGrowsWhenTypingAtEdges with Double]
  
  /* 3 */ @js.native
  object GrowsOnlyWhenTypingAfter extends TopLevel[GrowsOnlyWhenTypingAfter with Double]
  
  /* 2 */ @js.native
  object GrowsOnlyWhenTypingBefore extends TopLevel[GrowsOnlyWhenTypingBefore with Double]
  
  /* 1 */ @js.native
  object NeverGrowsWhenTypingAtEdges extends TopLevel[NeverGrowsWhenTypingAtEdges with Double]
  
}

