package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlayHintKind extends StObject
@JSImport("monaco-editor", "languages.InlayHintKind")
@js.native
object InlayHintKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlayHintKind & Double] = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with InlayHintKind
  /* 2 */ val Parameter: typings.monacoEditor.mod.languages.InlayHintKind.Parameter & Double = js.native
  
  @js.native
  sealed trait Type
    extends StObject
       with InlayHintKind
  /* 1 */ val Type: typings.monacoEditor.mod.languages.InlayHintKind.Type & Double = js.native
}
