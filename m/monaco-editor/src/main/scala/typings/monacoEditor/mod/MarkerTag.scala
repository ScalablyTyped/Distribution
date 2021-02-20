package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerTag extends StObject
@JSImport("monaco-editor", "MarkerTag")
@js.native
object MarkerTag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerTag with Double] = js.native
  
  @js.native
  sealed trait Deprecated extends MarkerTag
  /* 2 */ val Deprecated: typings.monacoEditor.mod.MarkerTag.Deprecated with Double = js.native
  
  @js.native
  sealed trait Unnecessary extends MarkerTag
  /* 1 */ val Unnecessary: typings.monacoEditor.mod.MarkerTag.Unnecessary with Double = js.native
}
