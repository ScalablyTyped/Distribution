package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerSeverity extends StObject
@JSImport("monaco-editor", "MarkerSeverity")
@js.native
object MarkerSeverity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSeverity with Double] = js.native
  
  @js.native
  sealed trait Error extends MarkerSeverity
  /* 8 */ val Error: typings.monacoEditor.mod.MarkerSeverity.Error with Double = js.native
  
  @js.native
  sealed trait Hint extends MarkerSeverity
  /* 1 */ val Hint: typings.monacoEditor.mod.MarkerSeverity.Hint with Double = js.native
  
  @js.native
  sealed trait Info extends MarkerSeverity
  /* 2 */ val Info: typings.monacoEditor.mod.MarkerSeverity.Info with Double = js.native
  
  @js.native
  sealed trait Warning extends MarkerSeverity
  /* 4 */ val Warning: typings.monacoEditor.mod.MarkerSeverity.Warning with Double = js.native
}
