package typings.monacoDashEditor.monacoDashEditorMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerSeverity extends js.Object

@JSImport("monaco-editor", "MarkerSeverity")
@js.native
object MarkerSeverity extends js.Object {
  @js.native
  sealed trait Error extends MarkerSeverity
  
  @js.native
  sealed trait Hint extends MarkerSeverity
  
  @js.native
  sealed trait Info extends MarkerSeverity
  
  @js.native
  sealed trait Warning extends MarkerSeverity
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSeverity with Double] = js.native
  /* 8 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object Hint extends TopLevel[Hint with Double]
  
  /* 2 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  /* 4 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

