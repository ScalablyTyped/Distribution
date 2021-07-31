package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a WebGL state, and is is passed The WebGL StateManager.
  *
  * Each mesh rendered may require WebGL to be in a different state.
  * For example you may want different blend mode or to enable polygon offsets
  *
  * @class
  * @memberof PIXI
  */
trait State extends StObject {
  
  /**
    * Activates blending of the computed fragment color values
    *
    * @member {boolean}
    */
  var blend: Boolean
  
  /**
    * The blend mode to be applied when this state is set. Apply a value of `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
    * Setting this mode to anything other than NO_BLEND will automatically switch blending on.
    *
    * @member {number}
    * @default PIXI.BLEND_MODES.NORMAL
    * @see PIXI.BLEND_MODES
    */
  var blendMode: Double
  
  /**
    * Specifies whether or not front or back-facing polygons can be culled.
    * @member {boolean}
    * @default false
    */
  var clockwiseFrontFace: Boolean
  
  /**
    * Activates culling of polygons.
    *
    * @member {boolean}
    * @default false
    */
  var culling: Boolean
  
  /**
    * Activates depth comparisons and updates to the depth buffer.
    *
    * @member {boolean}
    * @default false
    */
  var depthTest: Boolean
  
  /**
    * Activates adding an offset to depth values of polygon's fragments
    *
    * @member {boolean}
    * @default false
    */
  var offsets: Boolean
  
  /**
    * The polygon offset. Setting this property to anything other than 0 will automatically enable polygon offset fill.
    *
    * @member {number}
    * @default 0
    */
  var polygonOffset: Double
}
object State {
  
  @scala.inline
  def apply(
    blend: Boolean,
    blendMode: Double,
    clockwiseFrontFace: Boolean,
    culling: Boolean,
    depthTest: Boolean,
    offsets: Boolean,
    polygonOffset: Double
  ): State = {
    val __obj = js.Dynamic.literal(blend = blend.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], clockwiseFrontFace = clockwiseFrontFace.asInstanceOf[js.Any], culling = culling.asInstanceOf[js.Any], depthTest = depthTest.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], polygonOffset = polygonOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlend(value: Boolean): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: Double): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockwiseFrontFace(value: Boolean): Self = StObject.set(x, "clockwiseFrontFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCulling(value: Boolean): Self = StObject.set(x, "culling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthTest(value: Boolean): Self = StObject.set(x, "depthTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsets(value: Boolean): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonOffset(value: Double): Self = StObject.set(x, "polygonOffset", value.asInstanceOf[js.Any])
  }
}
