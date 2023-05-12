package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An AnimTrack stores the curve data necessary to animate a set of target nodes. It can be linked
  * to the nodes it should animate using the {@link AnimComponent#assignAnimation} method.
  */
@JSGlobal("pc.AnimTrack")
@js.native
open class AnimTrack protected ()
  extends typings.playcanvas.mod.AnimTrack {
  /**
    * Create a new AnimTrack instance.
    *
    * @param {string} name - The track name.
    * @param {number} duration - The duration of the track in seconds.
    * @param {import('./anim-data.js').AnimData[]} inputs - List of curve key data.
    * @param {import('./anim-data.js').AnimData[]} outputs - List of curve value data.
    * @param {import('./anim-curve.js').AnimCurve[]} curves - The list of curves.
    * @param {AnimEvents} animEvents - A sequence of animation events.
    * @hideconstructor
    */
  def this(
    name: String,
    duration: Double,
    inputs: js.Array[typings.playcanvas.mod.AnimData],
    outputs: js.Array[typings.playcanvas.mod.AnimData],
    curves: js.Array[typings.playcanvas.mod.AnimCurve]
  ) = this()
  def this(
    name: String,
    duration: Double,
    inputs: js.Array[typings.playcanvas.mod.AnimData],
    outputs: js.Array[typings.playcanvas.mod.AnimData],
    curves: js.Array[typings.playcanvas.mod.AnimCurve],
    animEvents: typings.playcanvas.mod.AnimEvents
  ) = this()
}
object AnimTrack {
  
  @JSGlobal("pc.AnimTrack")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This AnimTrack can be used as a placeholder track when creating a state graph before having all associated animation data available.
    *
    * @type {AnimTrack}
    */
  /* static member */
  @JSGlobal("pc.AnimTrack.EMPTY")
  @js.native
  def EMPTY: typings.playcanvas.mod.AnimTrack = js.native
  inline def EMPTY_=(x: typings.playcanvas.mod.AnimTrack): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
}
