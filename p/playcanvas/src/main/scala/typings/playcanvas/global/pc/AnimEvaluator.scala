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
