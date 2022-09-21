package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InjectedTextCursorStops extends StObject
@JSImport("monaco-editor", "editor.InjectedTextCursorStops")
@js.native
object InjectedTextCursorStops extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InjectedTextCursorStops & Double] = js.native
  
  @js.native
  sealed trait Both
    extends StObject
       with InjectedTextCursorStops
  /* 0 */ val Both: typings.monacoEditor.mod.editor.InjectedTextCursorStops.Both & Double = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with InjectedTextCursorStops
  /* 2 */ val Left: typings.monacoEditor.mod.editor.InjectedTextCursorStops.Left & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with InjectedTextCursorStops
  /* 3 */ val None: typings.monacoEditor.mod.editor.InjectedTextCursorStops.None & Double = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with InjectedTextCursorStops
  /* 1 */ val Right: typings.monacoEditor.mod.editor.InjectedTextCursorStops.Right & Double = js.native
}
