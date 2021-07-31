package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TrackedRangeStickiness extends StObject
@JSImport("monaco-editor", "editor.TrackedRangeStickiness")
@js.native
object TrackedRangeStickiness extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TrackedRangeStickiness & Double] = js.native
  
  @js.native
  sealed trait AlwaysGrowsWhenTypingAtEdges
    extends StObject
       with TrackedRangeStickiness
  /* 0 */ val AlwaysGrowsWhenTypingAtEdges: typings.monacoEditor.mod.editor.TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges & Double = js.native
  
  @js.native
  sealed trait GrowsOnlyWhenTypingAfter
    extends StObject
       with TrackedRangeStickiness
  /* 3 */ val GrowsOnlyWhenTypingAfter: typings.monacoEditor.mod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingAfter & Double = js.native
  
  @js.native
  sealed trait GrowsOnlyWhenTypingBefore
    extends StObject
       with TrackedRangeStickiness
  /* 2 */ val GrowsOnlyWhenTypingBefore: typings.monacoEditor.mod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingBefore & Double = js.native
  
  @js.native
  sealed trait NeverGrowsWhenTypingAtEdges
    extends StObject
       with TrackedRangeStickiness
  /* 1 */ val NeverGrowsWhenTypingAtEdges: typings.monacoEditor.mod.editor.TrackedRangeStickiness.NeverGrowsWhenTypingAtEdges & Double = js.native
}
