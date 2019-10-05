package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverlayWidgetPositionPreference extends js.Object

@JSImport("monaco-editor", "editor.OverlayWidgetPositionPreference")
@js.native
object OverlayWidgetPositionPreference extends js.Object {
  /**
    * Position the overlay widget in the bottom right corner
    */
  @js.native
  sealed trait BOTTOM_RIGHT_CORNER extends OverlayWidgetPositionPreference
  
  /**
    * Position the overlay widget in the top center
    */
  @js.native
  sealed trait TOP_CENTER extends OverlayWidgetPositionPreference
  
  /**
    * Position the overlay widget in the top right corner
    */
  @js.native
  sealed trait TOP_RIGHT_CORNER extends OverlayWidgetPositionPreference
  
  /* 1 */ val BOTTOM_RIGHT_CORNER: typings.monacoDashEditor.monacoDashEditorMod.editor.OverlayWidgetPositionPreference.BOTTOM_RIGHT_CORNER with Double = js.native
  /* 2 */ val TOP_CENTER: typings.monacoDashEditor.monacoDashEditorMod.editor.OverlayWidgetPositionPreference.TOP_CENTER with Double = js.native
  /* 0 */ val TOP_RIGHT_CORNER: typings.monacoDashEditor.monacoDashEditorMod.editor.OverlayWidgetPositionPreference.TOP_RIGHT_CORNER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayWidgetPositionPreference with Double] = js.native
}

