package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentWidgetPositionPreference extends js.Object

@JSImport("monaco-editor", "editor.ContentWidgetPositionPreference")
@js.native
object ContentWidgetPositionPreference extends js.Object {
  /**
    * Place the content widget above a position
    */
  @js.native
  sealed trait ABOVE extends ContentWidgetPositionPreference
  
  /**
    * Place the content widget below a position
    */
  @js.native
  sealed trait BELOW extends ContentWidgetPositionPreference
  
  /**
    * Place the content widget exactly at a position
    */
  @js.native
  sealed trait EXACT extends ContentWidgetPositionPreference
  
  /* 1 */ val ABOVE: typings.monacoDashEditor.monacoDashEditorMod.editor.ContentWidgetPositionPreference.ABOVE with Double = js.native
  /* 2 */ val BELOW: typings.monacoDashEditor.monacoDashEditorMod.editor.ContentWidgetPositionPreference.BELOW with Double = js.native
  /* 0 */ val EXACT: typings.monacoDashEditor.monacoDashEditorMod.editor.ContentWidgetPositionPreference.EXACT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentWidgetPositionPreference with Double] = js.native
}

