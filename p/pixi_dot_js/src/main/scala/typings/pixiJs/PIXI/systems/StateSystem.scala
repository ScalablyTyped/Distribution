package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.State
import typings.pixiJs.PIXI.System
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage WebGL state machines.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
trait StateSystem extends System {
  /**
    * Whether current blend equation is different
    * @member {boolean} PIXI.systems.StateSystem#_blendEq
    * @protected
    */
  var _blendEq: Boolean
  /**
    * Blend mode
    * @member {number} PIXI.systems.StateSystem#blendMode
    * @default PIXI.BLEND_MODES.NONE
    * @readonly
    */
  val blendMode: Double
  /**
    * Collection of check calls
    * @member {function[]} PIXI.systems.StateSystem#checks
    * @readonly
    */
  val checks: js.Array[js.Function1[/* repeated */ _, _]]
  /**
    * Default WebGL State
    * @member {PIXI.State} PIXI.systems.StateSystem#defaultState
    * @readonly
    */
  val defaultState: State
  /**
    * GL context
    * @member {WebGLRenderingContext} PIXI.systems.StateSystem#gl
    * @readonly
    */
  val gl: WebGLRenderingContext
  /**
    * Collection of calls
    * @member {function[]} PIXI.systems.StateSystem#map
    * @readonly
    */
  val map: js.Array[js.Function1[/* repeated */ _, _]]
  /**
    * Polygon offset
    * @member {number} PIXI.systems.StateSystem#polygonOffset
    * @readonly
    */
  val polygonOffset: Double
  /**
    * State ID
    * @member {number} PIXI.systems.StateSystem#stateId
    * @readonly
    */
  val stateId: Double
  /**
    * Sets the state, when previous state is unknown
    *
    * @param {*} state - The state to set
    */
  def forceState(state: js.Any): Unit
  /**
    * Resets all the logic and disables the vaos
    */
  def reset(): Unit
  /**
    * Sets the current state
    *
    * @param {*} state - The state to set.
    */
  def set(state: js.Any): Unit
  /**
    * Enables or disabled blending.
    *
    * @param {boolean} value - Turn on or off webgl blending.
    */
  def setBlend(value: Boolean): Unit
  /**
    * Sets the blend mode.
    *
    * @param {number} value - The blend mode to set to.
    */
  def setBlendMode(value: Double): Unit
  /**
    * Sets whether to enable or disable cull face.
    *
    * @param {boolean} value - Turn on or off webgl cull face.
    */
  def setCullFace(value: Boolean): Unit
  /**
    * Sets whether to enable or disable depth test.
    *
    * @param {boolean} value - Turn on or off webgl depth testing.
    */
  def setDepthTest(value: Boolean): Unit
  /**
    * Sets the gl front face.
    *
    * @param {boolean} value - true is clockwise and false is counter-clockwise
    */
  def setFrontFace(value: Boolean): Unit
  /**
    * Enables or disable polygon offset fill
    *
    * @param {boolean} value - Turn on or off webgl polygon offset testing.
    */
  def setOffset(value: Boolean): Unit
  /**
    * Sets the polygon offset.
    *
    * @param {number} value - the polygon offset
    * @param {number} scale - the polygon offset scale
    */
  def setPolygonOffset(value: Double, scale: Double): Unit
  /**
    * checks to see which updates should be checked based on which settings have been activated.
    * For example, if blend is enabled then we should check the blend modes each time the state is changed
    * or if polygon fill is activated then we need to check if the polygon offset changes.
    * The idea is that we only check what we have too.
    *
    * @param {Function} func - the checking function to add or remove
    * @param {boolean} value - should the check function be added or removed.
    */
  def updateCheck(func: js.Function1[/* repeated */ js.Any, _], value: Boolean): Unit
}

object StateSystem {
  @scala.inline
  def apply(
    _blendEq: Boolean,
    blendMode: Double,
    checks: js.Array[js.Function1[/* repeated */ _, _]],
    defaultState: State,
    destroy: () => Unit,
    forceState: js.Any => Unit,
    gl: WebGLRenderingContext,
    map: js.Array[js.Function1[/* repeated */ _, _]],
    polygonOffset: Double,
    renderer: Renderer,
    reset: () => Unit,
    set: js.Any => Unit,
    setBlend: Boolean => Unit,
    setBlendMode: Double => Unit,
    setCullFace: Boolean => Unit,
    setDepthTest: Boolean => Unit,
    setFrontFace: Boolean => Unit,
    setOffset: Boolean => Unit,
    setPolygonOffset: (Double, Double) => Unit,
    stateId: Double,
    updateCheck: (js.Function1[/* repeated */ js.Any, _], Boolean) => Unit
  ): StateSystem = {
    val __obj = js.Dynamic.literal(_blendEq = _blendEq.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], defaultState = defaultState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), forceState = js.Any.fromFunction1(forceState), gl = gl.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], polygonOffset = polygonOffset.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), setBlend = js.Any.fromFunction1(setBlend), setBlendMode = js.Any.fromFunction1(setBlendMode), setCullFace = js.Any.fromFunction1(setCullFace), setDepthTest = js.Any.fromFunction1(setDepthTest), setFrontFace = js.Any.fromFunction1(setFrontFace), setOffset = js.Any.fromFunction1(setOffset), setPolygonOffset = js.Any.fromFunction2(setPolygonOffset), stateId = stateId.asInstanceOf[js.Any], updateCheck = js.Any.fromFunction2(updateCheck))
    __obj.asInstanceOf[StateSystem]
  }
}

