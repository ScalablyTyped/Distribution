package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../binder/anim-binder.js').AnimBinder} AnimBinder */
/** @typedef {import('./anim-clip.js').AnimClip} AnimClip */
/**
  * AnimEvaluator blends multiple sets of animation clips together.
  *
  * @ignore
  */
@js.native
trait AnimEvaluator extends StObject {
  
  var _binder: AnimBinder = js.native
  
  var _clips: js.Array[Any] = js.native
  
  var _inputs: js.Array[Any] = js.native
  
  var _outputs: js.Array[Any] = js.native
  
  /**
    * Add a clip to the evaluator.
    *
    * @param {AnimClip} clip - The clip to add to the evaluator.
    */
  def addClip(clip: AnimClip): Unit = js.native
  
  def assignMask(mask: Any): Any = js.native
  
  /**
    * The list of animation clips.
    *
    * @type {AnimClip[]}
    */
  def clips: js.Array[AnimClip] = js.native
  
  /**
    * Returns the first clip which matches the given name, or null if no such clip was found.
    *
    * @param {string} name - Name of the clip to find.
    * @returns {AnimClip|null} - The clip with the given name or null if no such clip was found.
    */
  def findClip(name: String): AnimClip | Null = js.native
  
  def rebind(): Unit = js.native
  
  /**
    * Remove a clip from the evaluator.
    *
    * @param {number} index - Index of the clip to remove.
    */
  def removeClip(index: Double): Unit = js.native
  
  /**
    * Remove all clips from the evaluator.
    */
  def removeClips(): Unit = js.native
  
  /**
    * Evaluator frame update function. All the attached {@link AnimClip}s are evaluated, blended
    * and the results set on the {@link AnimTarget}.
    *
    * @param {number} deltaTime - The amount of time that has passed since the last update, in
    * seconds.
    */
  def update(deltaTime: Double): Unit = js.native
}
