package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./anim-curve.js').AnimCurve} AnimCurve */
/** @typedef {import('./anim-data.js').AnimData} AnimData */
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
    * @param {AnimData[]} inputs - List of curve key data.
    * @param {AnimData[]} outputs - List of curve value data.
    * @param {AnimCurve[]} curves - The list of curves.
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
