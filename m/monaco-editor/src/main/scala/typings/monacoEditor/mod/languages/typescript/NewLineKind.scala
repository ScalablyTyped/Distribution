package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends StObject
@JSImport("monaco-editor", "languages.typescript.NewLineKind")
@js.native
object NewLineKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
  
  @js.native
  sealed trait CarriageReturnLineFeed extends NewLineKind
  /* 0 */ val CarriageReturnLineFeed: typings.monacoEditor.mod.languages.typescript.NewLineKind.CarriageReturnLineFeed with Double = js.native
  
  @js.native
  sealed trait LineFeed extends NewLineKind
  /* 1 */ val LineFeed: typings.monacoEditor.mod.languages.typescript.NewLineKind.LineFeed with Double = js.native
}
