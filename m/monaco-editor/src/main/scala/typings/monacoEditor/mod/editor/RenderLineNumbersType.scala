package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderLineNumbersType extends StObject
@JSImport("monaco-editor", "editor.RenderLineNumbersType")
@js.native
object RenderLineNumbersType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderLineNumbersType with Double] = js.native
  
  @js.native
  sealed trait Custom extends RenderLineNumbersType
  /* 4 */ val Custom: typings.monacoEditor.mod.editor.RenderLineNumbersType.Custom with Double = js.native
  
  @js.native
  sealed trait Interval extends RenderLineNumbersType
  /* 3 */ val Interval: typings.monacoEditor.mod.editor.RenderLineNumbersType.Interval with Double = js.native
  
  @js.native
  sealed trait Off extends RenderLineNumbersType
  /* 0 */ val Off: typings.monacoEditor.mod.editor.RenderLineNumbersType.Off with Double = js.native
  
  @js.native
  sealed trait On extends RenderLineNumbersType
  /* 1 */ val On: typings.monacoEditor.mod.editor.RenderLineNumbersType.On with Double = js.native
  
  @js.native
  sealed trait Relative extends RenderLineNumbersType
  /* 2 */ val Relative: typings.monacoEditor.mod.editor.RenderLineNumbersType.Relative with Double = js.native
}
