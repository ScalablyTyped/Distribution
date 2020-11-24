package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderLineNumbersType extends js.Object
@JSImport("monaco-editor", "editor.RenderLineNumbersType")
@js.native
object RenderLineNumbersType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderLineNumbersType with Double] = js.native
  
  @js.native
  sealed trait Custom extends RenderLineNumbersType
  /* 4 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  @js.native
  sealed trait Interval extends RenderLineNumbersType
  /* 3 */ @js.native
  object Interval extends TopLevel[Interval with Double]
  
  @js.native
  sealed trait Off extends RenderLineNumbersType
  /* 0 */ @js.native
  object Off extends TopLevel[Off with Double]
  
  @js.native
  sealed trait On extends RenderLineNumbersType
  /* 1 */ @js.native
  object On extends TopLevel[On with Double]
  
  @js.native
  sealed trait Relative extends RenderLineNumbersType
  /* 2 */ @js.native
  object Relative extends TopLevel[Relative with Double]
}
