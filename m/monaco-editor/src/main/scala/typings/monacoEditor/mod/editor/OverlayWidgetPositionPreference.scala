package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverlayWidgetPositionPreference extends StObject
@JSImport("monaco-editor", "editor.OverlayWidgetPositionPreference")
@js.native
object OverlayWidgetPositionPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverlayWidgetPositionPreference with Double] = js.native
  
  /**
    * Position the overlay widget in the bottom right corner
    */
  @js.native
  sealed trait BOTTOM_RIGHT_CORNER extends OverlayWidgetPositionPreference
  /* 1 */ val BOTTOM_RIGHT_CORNER: typings.monacoEditor.mod.editor.OverlayWidgetPositionPreference.BOTTOM_RIGHT_CORNER with Double = js.native
  
  /**
    * Position the overlay widget in the top center
    */
  @js.native
  sealed trait TOP_CENTER extends OverlayWidgetPositionPreference
  /* 2 */ val TOP_CENTER: typings.monacoEditor.mod.editor.OverlayWidgetPositionPreference.TOP_CENTER with Double = js.native
  
  /**
    * Position the overlay widget in the top right corner
    */
  @js.native
  sealed trait TOP_RIGHT_CORNER extends OverlayWidgetPositionPreference
  /* 0 */ val TOP_RIGHT_CORNER: typings.monacoEditor.mod.editor.OverlayWidgetPositionPreference.TOP_RIGHT_CORNER with Double = js.native
}
