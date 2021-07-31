package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentWidgetPositionPreference extends StObject
@JSImport("monaco-editor", "editor.ContentWidgetPositionPreference")
@js.native
object ContentWidgetPositionPreference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentWidgetPositionPreference & Double] = js.native
  
  /**
    * Place the content widget above a position
    */
  @js.native
  sealed trait ABOVE
    extends StObject
       with ContentWidgetPositionPreference
  /* 1 */ val ABOVE: typings.monacoEditor.mod.editor.ContentWidgetPositionPreference.ABOVE & Double = js.native
  
  /**
    * Place the content widget below a position
    */
  @js.native
  sealed trait BELOW
    extends StObject
       with ContentWidgetPositionPreference
  /* 2 */ val BELOW: typings.monacoEditor.mod.editor.ContentWidgetPositionPreference.BELOW & Double = js.native
  
  /**
    * Place the content widget exactly at a position
    */
  @js.native
  sealed trait EXACT
    extends StObject
       with ContentWidgetPositionPreference
  /* 0 */ val EXACT: typings.monacoEditor.mod.editor.ContentWidgetPositionPreference.EXACT & Double = js.native
}
