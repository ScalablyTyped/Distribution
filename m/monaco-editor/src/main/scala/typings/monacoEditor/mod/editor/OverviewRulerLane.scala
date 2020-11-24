package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverviewRulerLane extends js.Object
@JSImport("monaco-editor", "editor.OverviewRulerLane")
@js.native
object OverviewRulerLane extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverviewRulerLane with Double] = js.native
  
  @js.native
  sealed trait Center extends OverviewRulerLane
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  @js.native
  sealed trait Full extends OverviewRulerLane
  /* 7 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  @js.native
  sealed trait Left extends OverviewRulerLane
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  @js.native
  sealed trait Right extends OverviewRulerLane
  /* 4 */ @js.native
  object Right extends TopLevel[Right with Double]
}
