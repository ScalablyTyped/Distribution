package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollType extends js.Object
@JSImport("monaco-editor", "editor.ScrollType")
@js.native
object ScrollType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollType with Double] = js.native
  
  @js.native
  sealed trait Immediate extends ScrollType
  /* 1 */ @js.native
  object Immediate extends TopLevel[Immediate with Double]
  
  @js.native
  sealed trait Smooth extends ScrollType
  /* 0 */ @js.native
  object Smooth extends TopLevel[Smooth with Double]
}
