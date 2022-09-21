package typings.playcanvas.mod

import typings.playcanvas.playcanvasStrings.quaternion
import typings.playcanvas.playcanvasStrings.vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback function that the {@link AnimEvaluator} uses to set final animation values. These
  * callbacks are stored in {@link AnimTarget} instances which are constructed by an
  * {@link AnimBinder}.
  *
  * @callback AnimSetter
  * @param {number[]} value - Updated animation value.
  * @ignore
  */
/**
  * Stores the information required by {@link AnimEvaluator} for updating a target value.
  *
  * @ignore
  */
@JSImport("playcanvas", "AnimTarget")
@js.native
open class AnimTarget protected () extends StObject {
  /**
    * Create a new AnimTarget instance.
    *
    * @param {AnimSetter} func - This function will be called when a new animation value is output
    * by the {@link AnimEvaluator}.
    * @param {'vector'|'quaternion'} type - The type of animation data this target expects.
    * @param {number} components - The number of components on this target (this should ideally
    * match the number of components found on all attached animation curves).
    * @param {string} targetPath - The path to the target value.
    */
  def this(func: AnimSetter, `type`: vector | quaternion, components: Double, targetPath: String) = this()
  
  var _components: Double = js.native
  
  var _get: Any = js.native
  
  var _isTransform: Boolean = js.native
  
  var _set: Any = js.native
  
  var _targetPath: String = js.native
  
  var _type: quaternion | vector = js.native
  
  def components: Double = js.native
  
  def get: Any = js.native
  
  def isTransform: Boolean = js.native
  
  def set: Any = js.native
  
  def targetPath: String = js.native
  
  def `type`: quaternion | vector = js.native
}
