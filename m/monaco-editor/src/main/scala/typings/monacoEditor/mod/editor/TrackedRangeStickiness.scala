package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TrackedRangeStickiness extends StObject
@JSImport("monaco-editor", "editor.TrackedRangeStickiness")
@js.native
object TrackedRangeStickiness extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TrackedRangeStickiness with Double] = js.native
  
  @js.native
  sealed trait AlwaysGrowsWhenTypingAtEdges extends TrackedRangeStickiness
  /* 0 */ val AlwaysGrowsWhenTypingAtEdges: typings.monacoEditor.mod.editor.TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges with Double = js.native
  
  @js.native
  sealed trait GrowsOnlyWhenTypingAfter extends TrackedRangeStickiness
  /* 3 */ val GrowsOnlyWhenTypingAfter: typings.monacoEditor.mod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingAfter with Double = js.native
  
  @js.native
  sealed trait GrowsOnlyWhenTypingBefore extends TrackedRangeStickiness
  /* 2 */ val GrowsOnlyWhenTypingBefore: typings.monacoEditor.mod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingBefore with Double = js.native
  
  @js.native
  sealed trait NeverGrowsWhenTypingAtEdges extends TrackedRangeStickiness
  /* 1 */ val NeverGrowsWhenTypingAtEdges: typings.monacoEditor.mod.editor.TrackedRangeStickiness.NeverGrowsWhenTypingAtEdges with Double = js.native
}
