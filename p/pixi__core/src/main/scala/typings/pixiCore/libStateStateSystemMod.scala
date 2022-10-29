package typings.pixiCore

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libStateStateMod.State
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateStateSystemMod {
  
  @JSImport("@pixi/core/lib/state/StateSystem", "StateSystem")
  @js.native
  open class StateSystem ()
    extends StObject
       with ISystem[Null, Null] {
    
    /** Whether current blend equation is different */
    /* protected */ var _blendEq: Boolean = js.native
    
    /**
      * Blend mode
      * @default PIXI.BLEND_MODES.NONE
      * @readonly
      */
    var blendMode: BLEND_MODES = js.native
    
    /* protected */ var blendModes: js.Array[js.Array[Double]] = js.native
    
    /**
      * Collection of check calls
      * @member {Function[]}
      */
    /* protected */ val checks: js.Array[js.Function2[/* system */ this.type, /* state */ State, Unit]] = js.native
    
    def contextChange(gl: IRenderingContext): Unit = js.native
    
    /**
      * Default WebGL State
      * @readonly
      */
    /* protected */ var defaultState: State = js.native
    
    /**
      * @ignore
      */
    @JSName("destroy")
    def destroy_MStateSystem(): Unit = js.native
    
    /**
      * Sets the state, when previous state is unknown.
      * @param {*} state - The state to set
      */
    def forceState(state: State): Unit = js.native
    
    /**
      * GL context
      * @member {WebGLRenderingContext}
      * @readonly
      */
    /* protected */ var gl: IRenderingContext = js.native
    
    /**
      * Collection of calls
      * @member {Function[]}
      */
    /* protected */ val map: js.Array[js.Function1[/* value */ Boolean, Unit]] = js.native
    
    /**
      * Polygon offset
      * @readonly
      */
    var polygonOffset: Double = js.native
    
    /** Resets all the logic and disables the VAOs. */
    def reset(): Unit = js.native
    
    /**
      * Sets the current state
      * @param {*} state - The state to set.
      */
    def set(state: State): Unit = js.native
    
    /**
      * Sets whether to enable or disable blending.
      * @param value - Turn on or off WebGl blending.
      */
    def setBlend(value: Boolean): Unit = js.native
    
    /**
      * Sets the blend mode.
      * @param {number} value - The blend mode to set to.
      */
    def setBlendMode(value: Double): Unit = js.native
    
    /**
      * Sets whether to enable or disable cull face.
      * @param {boolean} value - Turn on or off webgl cull face.
      */
    def setCullFace(value: Boolean): Unit = js.native
    
    /**
      * Sets whether to enable or disable depth mask.
      * @param value - Turn on or off webgl depth mask.
      */
    def setDepthMask(value: Boolean): Unit = js.native
    
    /**
      * Sets whether to enable or disable depth test.
      * @param value - Turn on or off webgl depth testing.
      */
    def setDepthTest(value: Boolean): Unit = js.native
    
    /**
      * Sets the gl front face.
      * @param {boolean} value - true is clockwise and false is counter-clockwise
      */
    def setFrontFace(value: Boolean): Unit = js.native
    
    /**
      * Sets whether to enable or disable polygon offset fill.
      * @param value - Turn on or off webgl polygon offset testing.
      */
    def setOffset(value: Boolean): Unit = js.native
    
    /**
      * Sets the polygon offset.
      * @param {number} value - the polygon offset
      * @param {number} scale - the polygon offset scale
      */
    def setPolygonOffset(value: Double, scale: Double): Unit = js.native
    
    /**
      * State ID
      * @readonly
      */
    var stateId: Double = js.native
    
    /**
      * Checks to see which updates should be checked based on which settings have been activated.
      *
      * For example, if blend is enabled then we should check the blend modes each time the state is changed
      * or if polygon fill is activated then we need to check if the polygon offset changes.
      * The idea is that we only check what we have too.
      * @param func - the checking function to add or remove
      * @param value - should the check function be added or removed.
      */
    def updateCheck(func: js.Function2[/* system */ this.type, /* state */ State, Unit], value: Boolean): Unit = js.native
  }
  /* static members */
  object StateSystem {
    
    @JSImport("@pixi/core/lib/state/StateSystem", "StateSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A private little wrapper function that we call to check the blend mode.
      * @param system - the System to perform the state check on
      * @param state - the state that the blendMode will pulled from
      */
    @JSImport("@pixi/core/lib/state/StateSystem", "StateSystem.checkBlendMode")
    @js.native
    def checkBlendMode: Any = js.native
    inline def checkBlendMode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkBlendMode")(x.asInstanceOf[js.Any])
    
    /**
      * A private little wrapper function that we call to check the polygon offset.
      * @param system - the System to perform the state check on
      * @param state - the state that the blendMode will pulled from
      */
    @JSImport("@pixi/core/lib/state/StateSystem", "StateSystem.checkPolygonOffset")
    @js.native
    def checkPolygonOffset: Any = js.native
    inline def checkPolygonOffset_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkPolygonOffset")(x.asInstanceOf[js.Any])
    
    /** @ignore */
    @JSImport("@pixi/core/lib/state/StateSystem", "StateSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
