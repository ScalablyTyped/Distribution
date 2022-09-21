package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AnimTransitions represent connections in the controllers state graph between AnimStates. During
  * each frame, the controller tests to see if any of the AnimTransitions have the current AnimState
  * as their source (from) state. If so and the AnimTransitions parameter based conditions are met,
  * the controller will transition to the destination state.
  *
  * @ignore
  */
@js.native
trait AnimTransition extends StObject {
  
  var _conditions: js.Array[Any] = js.native
  
  var _exitTime: Double = js.native
  
  var _from: String = js.native
  
  var _interruptionSource: String = js.native
  
  var _priority: Double = js.native
  
  var _time: Double = js.native
  
  var _to: String = js.native
  
  var _transitionOffset: Double = js.native
  
  def conditions: js.Array[Any] = js.native
  
  def exitTime: Double = js.native
  
  def from: String = js.native
  
  def hasExitTime: Boolean = js.native
  
  def interruptionSource: String = js.native
  
  def priority: Double = js.native
  
  def time: Double = js.native
  
  def to: String = js.native
  def to_=(arg: String): Unit = js.native
  
  def transitionOffset: Double = js.native
}
