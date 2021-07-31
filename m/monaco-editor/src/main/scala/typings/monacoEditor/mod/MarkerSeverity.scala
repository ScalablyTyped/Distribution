package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerSeverity extends StObject
@JSImport("monaco-editor", "MarkerSeverity")
@js.native
object MarkerSeverity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSeverity & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with MarkerSeverity
  /* 8 */ val Error: typings.monacoEditor.mod.MarkerSeverity.Error & Double = js.native
  
  @js.native
  sealed trait Hint
    extends StObject
       with MarkerSeverity
  /* 1 */ val Hint: typings.monacoEditor.mod.MarkerSeverity.Hint & Double = js.native
  
  @js.native
  sealed trait Info
    extends StObject
       with MarkerSeverity
  /* 2 */ val Info: typings.monacoEditor.mod.MarkerSeverity.Info & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with MarkerSeverity
  /* 4 */ val Warning: typings.monacoEditor.mod.MarkerSeverity.Warning & Double = js.native
}
