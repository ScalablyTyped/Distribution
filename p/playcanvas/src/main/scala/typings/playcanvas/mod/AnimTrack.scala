package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./anim-curve.js').AnimCurve} AnimCurve */
/** @typedef {import('./anim-data.js').AnimData} AnimData */
/**
  * An AnimTrack stores the curve data necessary to animate a set of target nodes. It can be linked
  * to the nodes it should animate using the {@link AnimComponent#assignAnimation} method.
  */
@JSImport("playcanvas", "AnimTrack")
@js.native
open class AnimTrack protected () extends StObject {
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
    inputs: js.Array[AnimData],
    outputs: js.Array[AnimData],
    curves: js.Array[AnimCurve]
  ) = this()
  def this(
    name: String,
    duration: Double,
    inputs: js.Array[AnimData],
    outputs: js.Array[AnimData],
    curves: js.Array[AnimCurve],
    animEvents: AnimEvents
  ) = this()
  
  var _animEvents: AnimEvents = js.native
  
  var _curves: js.Array[AnimCurve] = js.native
  
  var _duration: Double = js.native
  
  var _inputs: js.Array[AnimData] = js.native
  
  var _name: String = js.native
  
  var _outputs: js.Array[AnimData] = js.native
  
  /**
    * Gets the list of curves contained in the AnimTrack.
    *
    * @type {AnimCurve[]}
    */
  def curves: js.Array[AnimCurve] = js.native
  
  /**
    * Gets the duration of the AnimTrack.
    *
    * @type {number}
    */
  def duration: Double = js.native
  
  def eval(time: Any, snapshot: Any): Unit = js.native
  
  def events: js.Array[Any] = js.native
  /**
    * The animation events that will fire during the playback of this anim track.
    *
    * @type {AnimEvents}
    */
  def events_=(arg: js.Array[Any]): Unit = js.native
  
  /**
    * Gets the list of curve key data contained in the AnimTrack.
    *
    * @type {AnimData[]}
    */
  def inputs: js.Array[AnimData] = js.native
  
  /**
    * Gets the name of the AnimTrack.
    *
    * @type {string}
    */
  def name: String = js.native
  
  /**
    * Gets the list of curve values contained in the AnimTrack.
    *
    * @type {AnimData[]}
    */
  def outputs: js.Array[AnimData] = js.native
}
