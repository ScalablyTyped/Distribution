package typings.pixiCore

import typings.pixiConstants.mod.BLEND_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateStateMod {
  
  @JSImport("@pixi/core/lib/state/State", "State")
  @js.native
  open class State () extends StObject {
    
    var _blendMode: BLEND_MODES = js.native
    
    var _polygonOffset: Double = js.native
    
    /**
      * Activates blending of the computed fragment color values.
      * @default true
      */
    def blend: Boolean = js.native
    
    /**
      * The blend mode to be applied when this state is set. Apply a value of `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
      * Setting this mode to anything other than NO_BLEND will automatically switch blending on.
      * @default PIXI.BLEND_MODES.NORMAL
      */
    def blendMode: BLEND_MODES = js.native
    def blendMode_=(value: BLEND_MODES): Unit = js.native
    
    def blend_=(value: Boolean): Unit = js.native
    
    /**
      * Specifies whether or not front or back-facing polygons can be culled.
      * @default false
      */
    def clockwiseFrontFace: Boolean = js.native
    def clockwiseFrontFace_=(value: Boolean): Unit = js.native
    
    /**
      * Activates culling of polygons.
      * @default false
      */
    def culling: Boolean = js.native
    def culling_=(value: Boolean): Unit = js.native
    
    var data: Double = js.native
    
    /**
      * Enables or disables writing to the depth buffer.
      * @default true
      */
    def depthMask: Boolean = js.native
    def depthMask_=(value: Boolean): Unit = js.native
    
    /**
      * Activates depth comparisons and updates to the depth buffer.
      * @default false
      */
    def depthTest: Boolean = js.native
    def depthTest_=(value: Boolean): Unit = js.native
    
    /**
      * Activates adding an offset to depth values of polygon's fragments
      * @default false
      */
    def offsets: Boolean = js.native
    def offsets_=(value: Boolean): Unit = js.native
    
    /**
      * The polygon offset. Setting this property to anything other than 0 will automatically enable polygon offset fill.
      * @default 0
      */
    def polygonOffset: Double = js.native
    def polygonOffset_=(value: Double): Unit = js.native
  }
  /* static members */
  object State {
    
    @JSImport("@pixi/core/lib/state/State", "State")
    @js.native
    val ^ : js.Any = js.native
    
    inline def for2d(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("for2d")().asInstanceOf[State]
  }
}
