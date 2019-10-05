package typings.playerframework.PlayerFramework

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
  
  /* 3 */ val all: typings.playerframework.PlayerFramework.TextTrackDisplayMode.all with Double = js.native
  /* 1 */ val custom: typings.playerframework.PlayerFramework.TextTrackDisplayMode.custom with Double = js.native
  /* 2 */ val native: typings.playerframework.PlayerFramework.TextTrackDisplayMode.native with Double = js.native
  /* 0 */ val none: typings.playerframework.PlayerFramework.TextTrackDisplayMode.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextTrackDisplayMode with Double] = js.native
}

