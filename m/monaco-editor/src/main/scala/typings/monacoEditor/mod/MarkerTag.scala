package typings.monacoEditor.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarkerTag extends js.Object
@JSImport("monaco-editor", "MarkerTag")
@js.native
object MarkerTag extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerTag with Double] = js.native
  
  @js.native
  sealed trait Deprecated extends MarkerTag
  /* 2 */ @js.native
  object Deprecated extends TopLevel[Deprecated with Double]
  
  @js.native
  sealed trait Unnecessary extends MarkerTag
  /* 1 */ @js.native
  object Unnecessary extends TopLevel[Unnecessary with Double]
}
