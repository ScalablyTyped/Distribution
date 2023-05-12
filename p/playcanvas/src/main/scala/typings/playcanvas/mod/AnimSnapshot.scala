package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AnimSnapshot stores the state of an animation track at a particular time.
  *
  * @ignore
  */
@JSImport("playcanvas", "AnimSnapshot")
@js.native
open class AnimSnapshot protected () extends StObject {
  /**
    * Create a new animation snapshot.
    *
    * @param {import('./anim-track.js').AnimTrack} animTrack - The source track.
    */
  def this(animTrack: AnimTrack) = this()
  
  var _cache: js.Array[AnimCache] = js.native
  
  var _name: String = js.native
  
  var _results: js.Array[js.Array[Double]] = js.native
  
  var _time: Double = js.native
}
