package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxEmit extends StObject
@JSImport("monaco-editor", "languages.typescript.JsxEmit")
@js.native
object JsxEmit extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit with Double] = js.native
  
  @js.native
  sealed trait None extends JsxEmit
  /* 0 */ val None: typings.monacoEditor.mod.languages.typescript.JsxEmit.None with Double = js.native
  
  @js.native
  sealed trait Preserve extends JsxEmit
  /* 1 */ val Preserve: typings.monacoEditor.mod.languages.typescript.JsxEmit.Preserve with Double = js.native
  
  @js.native
  sealed trait React extends JsxEmit
  /* 2 */ val React: typings.monacoEditor.mod.languages.typescript.JsxEmit.React with Double = js.native
  
  @js.native
  sealed trait ReactNative extends JsxEmit
  /* 3 */ val ReactNative: typings.monacoEditor.mod.languages.typescript.JsxEmit.ReactNative with Double = js.native
}
