package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverviewRulerLane extends StObject
@JSImport("monaco-editor", "editor.OverviewRulerLane")
@js.native
object OverviewRulerLane extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverviewRulerLane with Double] = js.native
  
  @js.native
  sealed trait Center extends OverviewRulerLane
  /* 2 */ val Center: typings.monacoEditor.mod.editor.OverviewRulerLane.Center with Double = js.native
  
  @js.native
  sealed trait Full extends OverviewRulerLane
  /* 7 */ val Full: typings.monacoEditor.mod.editor.OverviewRulerLane.Full with Double = js.native
  
  @js.native
  sealed trait Left extends OverviewRulerLane
  /* 1 */ val Left: typings.monacoEditor.mod.editor.OverviewRulerLane.Left with Double = js.native
  
  @js.native
  sealed trait Right extends OverviewRulerLane
  /* 4 */ val Right: typings.monacoEditor.mod.editor.OverviewRulerLane.Right with Double = js.native
}
