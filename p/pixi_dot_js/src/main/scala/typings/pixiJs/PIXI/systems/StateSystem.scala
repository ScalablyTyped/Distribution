package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.State
import typings.pixiJs.PIXI.System
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System plugin to the renderer to manage WebGL state machines.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait StateSystem extends System {
  
  /**
    * Whether current blend equation is different
    * @member {boolean} PIXI.systems.StateSystem#_blendEq
    * @protected
    */
  var _blendEq: Boolean = js.native
  
  /**
    * Blend mode
    * @member {number} PIXI.systems.StateSystem#blendMode
    * @default PIXI.BLEND_MODES.NONE
    * @readonly
    */
  val blendMode: Double = js.native
  
  /**
    * Collection of check calls
    * @member {function[]} PIXI.systems.StateSystem#checks
    * @readonly
    */
  val checks: js.Array[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * Default WebGL State
    * @member {PIXI.State} PIXI.systems.StateSystem#defaultState
    * @readonly
    */
  val defaultState: State = js.native
  
  /**
    * Sets the state, when previous state is unknown
    *
    * @param {*} state - The state to set
    */
  def forceState(state: js.Any): Unit = js.native
  
  /**
    * GL context
    * @member {WebGLRenderingContext} PIXI.systems.StateSystem#gl
    * @readonly
    */
  val gl: WebGLRenderingContext = js.native
  
  /**
    * Collection of calls
    * @member {function[]} PIXI.systems.StateSystem#map
    * @readonly
    */
  val map: js.Array[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * Polygon offset
    * @member {number} PIXI.systems.StateSystem#polygonOffset
    * @readonly
    */
  val polygonOffset: Double = js.native
  
  /**
    * Resets all the logic and disables the vaos
    */
  def reset(): Unit = js.native
  
  /**
    * Sets the current state
    *
    * @param {*} state - The state to set.
    */
  def set(state: js.Any): Unit = js.native
  
  /**
    * Enables or disabled blending.
    *
    * @param {boolean} value - Turn on or off webgl blending.
    */
  def setBlend(value: Boolean): Unit = js.native
  
  /**
    * Sets the blend mode.
    *
    * @param {number} value - The blend mode to set to.
    */
  def setBlendMode(value: Double): Unit = js.native
  
  /**
    * Sets whether to enable or disable cull face.
    *
    * @param {boolean} value - Turn on or off webgl cull face.
    */
  def setCullFace(value: Boolean): Unit = js.native
  
  /**
    * Sets whether to enable or disable depth test.
    *
    * @param {boolean} value - Turn on or off webgl depth testing.
    */
  def setDepthTest(value: Boolean): Unit = js.native
  
  /**
    * Sets the gl front face.
    *
    * @param {boolean} value - true is clockwise and false is counter-clockwise
    */
  def setFrontFace(value: Boolean): Unit = js.native
  
  /**
    * Enables or disable polygon offset fill
    *
    * @param {boolean} value - Turn on or off webgl polygon offset testing.
    */
  def setOffset(value: Boolean): Unit = js.native
  
  /**
    * Sets the polygon offset.
    *
    * @param {number} value - the polygon offset
    * @param {number} scale - the polygon offset scale
    */
  def setPolygonOffset(value: Double, scale: Double): Unit = js.native
  
  /**
    * State ID
    * @member {number} PIXI.systems.StateSystem#stateId
    * @readonly
    */
  val stateId: Double = js.native
  
  /**
    * checks to see which updates should be checked based on which settings have been activated.
    * For example, if blend is enabled then we should check the blend modes each time the state is changed
    * or if polygon fill is activated then we need to check if the polygon offset changes.
    * The idea is that we only check what we have too.
    *
    * @param {Function} func - the checking function to add or remove
    * @param {boolean} value - should the check function be added or removed.
    */
  def updateCheck(func: js.Function1[/* repeated */ js.Any, _], value: Boolean): Unit = js.native
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
  
  @scala.inline
  implicit class StateSystemOps[Self <: StateSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_blendEq(value: Boolean): Self = this.set("_blendEq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: Double): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksVarargs(value: (js.Function1[js.Any, js.Any])*): Self = this.set("checks", js.Array(value :_*))
    
    @scala.inline
    def setChecks(value: js.Array[js.Function1[/* repeated */ _, _]]): Self = this.set("checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultState(value: State): Self = this.set("defaultState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceState(value: js.Any => Unit): Self = this.set("forceState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGl(value: WebGLRenderingContext): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapVarargs(value: (js.Function1[js.Any, js.Any])*): Self = this.set("map", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: js.Array[js.Function1[/* repeated */ _, _]]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonOffset(value: Double): Self = this.set("polygonOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: js.Any => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBlend(value: Boolean => Unit): Self = this.set("setBlend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBlendMode(value: Double => Unit): Self = this.set("setBlendMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCullFace(value: Boolean => Unit): Self = this.set("setCullFace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDepthTest(value: Boolean => Unit): Self = this.set("setDepthTest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFrontFace(value: Boolean => Unit): Self = this.set("setFrontFace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOffset(value: Boolean => Unit): Self = this.set("setOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPolygonOffset(value: (Double, Double) => Unit): Self = this.set("setPolygonOffset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateId(value: Double): Self = this.set("stateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCheck(value: (js.Function1[/* repeated */ js.Any, _], Boolean) => Unit): Self = this.set("updateCheck", js.Any.fromFunction2(value))
  }
}
