package typings.playerframework.global.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PlayerFramework.TextTrackMode")
@js.native
class TextTrackMode ()
  extends StObject
     with typings.playerframework.PlayerFramework.TextTrackMode
object TextTrackMode {
  
  @JSGlobal("PlayerFramework.TextTrackMode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The track is active, but the player is not actively displaying cues.
    **/
  /* static member */
  @JSGlobal("PlayerFramework.TextTrackMode.hidden")
  @js.native
  def hidden: String = js.native
  inline def hidden_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hidden")(x.asInstanceOf[js.Any])
  
  /**
    * The track is disabled.
    **/
  /* static member */
  @JSGlobal("PlayerFramework.TextTrackMode.off")
  @js.native
  def off: String = js.native
  inline def off_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("off")(x.asInstanceOf[js.Any])
  
  /**
    * The track is active and the player is actively displaying cues.
    **/
  /* static member */
  @JSGlobal("PlayerFramework.TextTrackMode.showing")
  @js.native
  def showing: String = js.native
  inline def showing_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showing")(x.asInstanceOf[js.Any])
}
