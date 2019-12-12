package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.TextTrackDisplayMode.all
import typings.playerframework.PlayerFramework.TextTrackDisplayMode.custom
import typings.playerframework.PlayerFramework.TextTrackDisplayMode.native
import typings.playerframework.PlayerFramework.TextTrackDisplayMode.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackDisplayMode extends js.Object

@JSGlobal("PlayerFramework.TextTrackDisplayMode")
@js.native
object TextTrackDisplayMode extends js.Object {
  /**
  		* Indicates tracks should be displayed using both custom and native UI. This is useful for debugging.
  		*/
  @js.native
  sealed trait all extends TextTrackDisplayMode
  
  /**
  		* Indicates tracks should be displayed using custom UI.
  		*/
  @js.native
  sealed trait custom extends TextTrackDisplayMode
  
  /**
  		* Indicates tracks should be displayed using native UI.
  		*/
  @js.native
  sealed trait native extends TextTrackDisplayMode
  
  /**
  		* Indicates tracks should not be displayed.
  		*/
  @js.native
  sealed trait none extends TextTrackDisplayMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextTrackDisplayMode with Double] = js.native
  /* 3 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 2 */ @js.native
  object native extends TopLevel[native with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

