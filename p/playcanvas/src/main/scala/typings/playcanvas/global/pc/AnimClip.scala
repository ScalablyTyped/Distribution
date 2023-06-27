package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AnimClip wraps the running state of an animation track. It contains and update the animation
  * 'cursor' and performs looping logic.
  *
  * @ignore
  */
@JSGlobal("pc.AnimClip")
@js.native
open class AnimClip protected ()
  extends typings.playcanvas.mod.AnimClip {
  /**
    * Create a new animation clip.
    *
    * @param {import('./anim-track.js').AnimTrack} track - The animation data.
    * @param {number} time - The initial time of the clip.
    * @param {number} speed - Speed of the animation playback.
    * @param {boolean} playing - true if the clip is playing and false otherwise.
    * @param {boolean} loop - Whether the clip should loop.
    * @param {import('../../../core/event-handler.js').EventHandler} [eventHandler] - The handler
    * to call when an event is fired by the clip.
    */
  def this(
    track: typings.playcanvas.mod.AnimTrack,
    time: Double,
    speed: Double,
    playing: Boolean,
    loop: Boolean
  ) = this()
  def this(
    track: typings.playcanvas.mod.AnimTrack,
    time: Double,
    speed: Double,
    playing: Boolean,
    loop: Boolean,
    eventHandler: typings.playcanvas.mod.EventHandler
  ) = this()
}
object AnimClip {
  
  /* static member */
  object eventFrame {
    
    @JSGlobal("pc.AnimClip.eventFrame")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("pc.AnimClip.eventFrame.end")
    @js.native
    def end: Double = js.native
    inline def end_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.AnimClip.eventFrame.residual")
    @js.native
    def residual: Double = js.native
    inline def residual_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("residual")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.AnimClip.eventFrame.start")
    @js.native
    def start: Double = js.native
    inline def start_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
}
