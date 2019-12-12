package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.editor.OverviewRulerLane.Center
import typings.monacoDashEditor.monacoDashEditorMod.editor.OverviewRulerLane.Full
import typings.monacoDashEditor.monacoDashEditorMod.editor.OverviewRulerLane.Left
import typings.monacoDashEditor.monacoDashEditorMod.editor.OverviewRulerLane.Right
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverviewRulerLane with Double] = js.native
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 7 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 4 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

