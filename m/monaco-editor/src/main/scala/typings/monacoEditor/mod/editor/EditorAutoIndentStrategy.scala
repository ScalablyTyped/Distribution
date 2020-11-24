package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditorAutoIndentStrategy extends js.Object
@JSImport("monaco-editor", "editor.EditorAutoIndentStrategy")
@js.native
object EditorAutoIndentStrategy extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditorAutoIndentStrategy with Double] = js.native
  
  @js.native
  sealed trait Advanced extends EditorAutoIndentStrategy
  /* 3 */ @js.native
  object Advanced extends TopLevel[Advanced with Double]
  
  @js.native
  sealed trait Brackets extends EditorAutoIndentStrategy
  /* 2 */ @js.native
  object Brackets extends TopLevel[Brackets with Double]
  
  @js.native
  sealed trait Full extends EditorAutoIndentStrategy
  /* 4 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  @js.native
  sealed trait Keep extends EditorAutoIndentStrategy
  /* 1 */ @js.native
  object Keep extends TopLevel[Keep with Double]
  
  @js.native
  sealed trait None extends EditorAutoIndentStrategy
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
