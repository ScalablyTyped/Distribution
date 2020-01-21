package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderMinimap extends js.Object

@JSImport("monaco-editor", "editor.RenderMinimap")
@js.native
object RenderMinimap extends js.Object {
  @js.native
  sealed trait Large extends RenderMinimap
  
  @js.native
  sealed trait LargeBlocks extends RenderMinimap
  
  @js.native
  sealed trait None extends RenderMinimap
  
  @js.native
  sealed trait Small extends RenderMinimap
  
  @js.native
  sealed trait SmallBlocks extends RenderMinimap
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderMinimap with Double] = js.native
  /* 2 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  /* 4 */ @js.native
  object LargeBlocks extends TopLevel[LargeBlocks with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Small extends TopLevel[Small with Double]
  
  /* 3 */ @js.native
  object SmallBlocks extends TopLevel[SmallBlocks with Double]
  
}

