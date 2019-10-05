package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverviewRulerLane extends js.Object

@JSImport("monaco-editor", "editor.OverviewRulerLane")
@js.native
object OverviewRulerLane extends js.Object {
  @js.native
  sealed trait Center extends OverviewRulerLane
  
  @js.native
  sealed trait Full extends OverviewRulerLane
  
  @js.native
  sealed trait Left extends OverviewRulerLane
  
  @js.native
  sealed trait Right extends OverviewRulerLane
  
  /* 2 */ val Center: typings.monacoDashEditor.monacoDashEditorMod.editor.OverviewRulerLane.Center with Double = js.native
  /* 7 */ val Full: typings.monacoDashEditor.monacoDashEditorMod.editor.OverviewRulerLane.Full with Double = js.native
  /* 1 */ val Left: typings.monacoDashEditor.monacoDashEditorMod.editor.OverviewRulerLane.Left with Double = js.native
  /* 4 */ val Right: typings.monacoDashEditor.monacoDashEditorMod.editor.OverviewRulerLane.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverviewRulerLane with Double] = js.native
}

