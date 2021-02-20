package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollType extends StObject
@JSImport("monaco-editor", "editor.ScrollType")
@js.native
object ScrollType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollType with Double] = js.native
  
  @js.native
  sealed trait Immediate extends ScrollType
  /* 1 */ val Immediate: typings.monacoEditor.mod.editor.ScrollType.Immediate with Double = js.native
  
  @js.native
  sealed trait Smooth extends ScrollType
  /* 0 */ val Smooth: typings.monacoEditor.mod.editor.ScrollType.Smooth with Double = js.native
}
