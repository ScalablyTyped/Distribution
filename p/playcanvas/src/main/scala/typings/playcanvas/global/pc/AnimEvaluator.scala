package typings.playcanvas.global.pc

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
@JSGlobal("pc.AnimEvaluator")
@js.native
open class AnimEvaluator protected ()
  extends typings.playcanvas.mod.AnimEvaluator {
  /**
    * Create a new animation evaluator.
    *
    * @param {AnimBinder} binder - interface resolves curve paths to instances of {@link AnimTarget}.
    */
  def this(binder: typings.playcanvas.mod.AnimBinder) = this()
}
object AnimEvaluator {
  
  @JSGlobal("pc.AnimEvaluator")
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
