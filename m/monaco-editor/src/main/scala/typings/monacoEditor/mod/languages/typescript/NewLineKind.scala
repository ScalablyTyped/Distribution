package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
  /* 0 */ @js.native
  object CarriageReturnLineFeed extends TopLevel[CarriageReturnLineFeed with Double]
  
  /* 1 */ @js.native
  object LineFeed extends TopLevel[LineFeed with Double]
  
}

