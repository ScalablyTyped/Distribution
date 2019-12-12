package typings.monacoDashEditor.monacoDashEditorMod.languages.typescript

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.languages.typescript.JsxEmit.None
import typings.monacoDashEditor.monacoDashEditorMod.languages.typescript.JsxEmit.Preserve
import typings.monacoDashEditor.monacoDashEditorMod.languages.typescript.JsxEmit.React
import typings.monacoDashEditor.monacoDashEditorMod.languages.typescript.JsxEmit.ReactNative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsxEmit extends js.Object

@JSImport("monaco-editor", "languages.typescript.JsxEmit")
@js.native
object JsxEmit extends js.Object {
  @js.native
  sealed trait None extends JsxEmit
  
  @js.native
  sealed trait Preserve extends JsxEmit
  
  @js.native
  sealed trait React extends JsxEmit
  
  @js.native
  sealed trait ReactNative extends JsxEmit
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Preserve extends TopLevel[Preserve with Double]
  
  /* 2 */ @js.native
  object React extends TopLevel[React with Double]
  
  /* 3 */ @js.native
  object ReactNative extends TopLevel[ReactNative with Double]
  
}

