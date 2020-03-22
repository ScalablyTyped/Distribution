package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditorAutoIndentStrategy extends js.Object

@JSImport("monaco-editor", "editor.EditorAutoIndentStrategy")
@js.native
object EditorAutoIndentStrategy extends js.Object {
  @js.native
  sealed trait Advanced extends EditorAutoIndentStrategy
  
  @js.native
  sealed trait Brackets extends EditorAutoIndentStrategy
  
  @js.native
  sealed trait Full extends EditorAutoIndentStrategy
  
  @js.native
  sealed trait Keep extends EditorAutoIndentStrategy
  
  @js.native
  sealed trait None extends EditorAutoIndentStrategy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditorAutoIndentStrategy with Double] = js.native
  /* 3 */ @js.native
  object Advanced extends TopLevel[Advanced with Double]
  
  /* 2 */ @js.native
  object Brackets extends TopLevel[Brackets with Double]
  
  /* 4 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /* 1 */ @js.native
  object Keep extends TopLevel[Keep with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

