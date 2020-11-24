package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentWidgetPositionPreference extends js.Object
@JSImport("monaco-editor", "editor.ContentWidgetPositionPreference")
@js.native
object ContentWidgetPositionPreference extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentWidgetPositionPreference with Double] = js.native
  
  /**
    * Place the content widget above a position
    */
  @js.native
  sealed trait ABOVE extends ContentWidgetPositionPreference
  /* 1 */ @js.native
  object ABOVE extends TopLevel[ABOVE with Double]
  
  /**
    * Place the content widget below a position
    */
  @js.native
  sealed trait BELOW extends ContentWidgetPositionPreference
  /* 2 */ @js.native
  object BELOW extends TopLevel[BELOW with Double]
  
  /**
    * Place the content widget exactly at a position
    */
  @js.native
  sealed trait EXACT extends ContentWidgetPositionPreference
  /* 0 */ @js.native
  object EXACT extends TopLevel[EXACT with Double]
}
