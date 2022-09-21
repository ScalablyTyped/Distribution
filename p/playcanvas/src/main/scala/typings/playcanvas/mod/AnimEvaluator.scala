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
@JSImport("playcanvas", "AnimEvaluator")
@js.native
open class AnimEvaluator protected () extends StObject {
  /**
    * Create a new animation evaluator.
    *
    * @param {AnimBinder} binder - interface resolves curve paths to instances of {@link AnimTarget}.
    */
  def this(binder: AnimBinder) = this()
  
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
object AnimEvaluator {
  
  @JSImport("playcanvas", "AnimEvaluator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def blend(a: Any, b: Any, t: Any, `type`: Any, additive: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_blend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], additive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def blendQuat(a: Any, b: Any, t: Any, additive: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_blendQuat")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any], additive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def blendVec(a: Any, b: Any, t: Any, additive: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_blendVec")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any], additive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def dot(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def normalize(a: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_normalize")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def set(a: Any, b: Any, `type`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_set")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def stableSort(a: Any, lessFunc: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_stableSort")(a.asInstanceOf[js.Any], lessFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
