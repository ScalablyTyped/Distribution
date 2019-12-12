package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.editor.ContentWidgetPositionPreference.ABOVE
import typings.monacoDashEditor.monacoDashEditorMod.editor.ContentWidgetPositionPreference.BELOW
import typings.monacoDashEditor.monacoDashEditorMod.editor.ContentWidgetPositionPreference.EXACT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentWidgetPositionPreference with Double] = js.native
  /* 1 */ @js.native
  object ABOVE extends TopLevel[ABOVE with Double]
  
  /* 2 */ @js.native
  object BELOW extends TopLevel[BELOW with Double]
  
  /* 0 */ @js.native
  object EXACT extends TopLevel[EXACT with Double]
  
}

