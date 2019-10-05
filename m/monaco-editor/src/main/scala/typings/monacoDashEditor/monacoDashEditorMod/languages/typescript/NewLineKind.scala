package typings.monacoDashEditor.monacoDashEditorMod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NewLineKind extends js.Object

@JSImport("monaco-editor", "languages.typescript.NewLineKind")
@js.native
object NewLineKind extends js.Object {
  @js.native
  sealed trait CarriageReturnLineFeed extends NewLineKind
  
  @js.native
  sealed trait LineFeed extends NewLineKind
  
  /* 0 */ val CarriageReturnLineFeed: typings.monacoDashEditor.monacoDashEditorMod.languages.typescript.NewLineKind.CarriageReturnLineFeed with Double = js.native
  /* 1 */ val LineFeed: typings.monacoDashEditor.monacoDashEditorMod.languages.typescript.NewLineKind.LineFeed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
}

