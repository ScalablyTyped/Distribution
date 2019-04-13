package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc")
@js.native
object ^ extends js.Object {
  /**
    * @static
    * @readonly
    * @type Number
    * @name pc.ADDRESS_CLAMP_TO_EDGE
    * @description Clamps texture coordinate to the range 0 to 1.
    */
  val ADDRESS_CLAMP_TO_EDGE: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @static
    * @readonly
    * @type Number
    * @name pc.ADDRESS_MIRRORED_REPEAT
    * @description Texture coordinate to be set to the fractional part if the integer part is even; if the integer part is odd;
    * then the texture coordinate is set to 1 minus the fractional part.
    */
  val ADDRESS_MIRRORED_REPEAT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @static
    * @readonly
    * @type Number
    * @name pc.ADDRESS_REPEAT
    * @description Ignores the integer part of texture coordinates; using only the fractional part.
    */
  val ADDRESS_REPEAT: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val ASSET_ANIMATION: playcanvasLib.playcanvasLibStrings.animation = js.native
  val ASSET_AUDIO: playcanvasLib.playcanvasLibStrings.audio = js.native
  val ASSET_CSS: playcanvasLib.playcanvasLibStrings.css = js.native
  val ASSET_CUBEMAP: playcanvasLib.playcanvasLibStrings.cubemap = js.native
  val ASSET_HTML: playcanvasLib.playcanvasLibStrings.html = js.native
  val ASSET_IMAGE: playcanvasLib.playcanvasLibStrings.image = js.native
  val ASSET_JSON: playcanvasLib.playcanvasLibStrings.json = js.native
  val ASSET_MATERIAL: playcanvasLib.playcanvasLibStrings.material = js.native
  val ASSET_MODEL: playcanvasLib.playcanvasLibStrings.model = js.native
  val ASSET_SCRIPT: playcanvasLib.playcanvasLibStrings.script = js.native
  val ASSET_SHADER: playcanvasLib.playcanvasLibStrings.shader = js.native
  val ASSET_TEXT: playcanvasLib.playcanvasLibStrings.text = js.native
  val ASSET_TEXTURE: playcanvasLib.playcanvasLibStrings.texture = js.native
  val BAKE_COLOR: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val BAKE_COLORDIR: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.BLENDEQUATION
    * @name pc.BLENDEQUATION_ADD
    * @description Add the results of the source and destination fragment multiplies.
    */
  val BLENDEQUATION_ADD: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.BLENDEQUATION
    * @name pc.BLENDEQUATION_MAX
    * @description Use the largest value. Check app.graphicsDevice.extBlendMinmax for support.
    */
  val BLENDEQUATION_MAX: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @enum pc.BLENDEQUATION
    * @name pc.BLENDEQUATION_MIN
    * @description Use the smallest value. Check app.graphicsDevice.extBlendMinmax for support.
    */
  val BLENDEQUATION_MIN: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.BLENDEQUATION
    * @name pc.BLENDEQUATION_REVERSE_SUBTRACT
    * @description Reverse and subtract the results of the source and destination fragment multiplies.
    */
  val BLENDEQUATION_REVERSE_SUBTRACT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.BLENDEQUATION
    * @name pc.BLENDEQUATION_SUBTRACT
    * @description Subtract the results of the source and destination fragment multiplies.
    */
  val BLENDEQUATION_SUBTRACT: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_DST_ALPHA
    * @description Multiply all fragment components by the alpha value of the destination fragment.
    */
  val BLENDMODE_DST_ALPHA: playcanvasLib.playcanvasLibNumbers.`9` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_DST_COLOR
    * @description Multiply all fragment components by the components of the destination fragment.
    */
  val BLENDMODE_DST_COLOR: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_ONE
    * @description Multiply all fragment components by one.
    */
  val BLENDMODE_ONE: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_ONE_MINUS_DST_ALPHA
    * @description Multiply all fragment components by one minus the alpha value of the destination fragment.
    */
  val BLENDMODE_ONE_MINUS_DST_ALPHA: playcanvasLib.playcanvasLibNumbers.`10` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_ONE_MINUS_DST_COLOR
    * @description Multiply all fragment components by one minus the components of the destination fragment.
    */
  val BLENDMODE_ONE_MINUS_DST_COLOR: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_ONE_MINUS_SRC_ALPHA
    * @description Multiply all fragment components by one minus the alpha value of the source fragment.
    */
  val BLENDMODE_ONE_MINUS_SRC_ALPHA: playcanvasLib.playcanvasLibNumbers.`8` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_ONE_MINUS_SRC_COLOR
    * @description Multiply all fragment components by one minus the components of the source fragment.
    */
  val BLENDMODE_ONE_MINUS_SRC_COLOR: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_SRC_ALPHA
    * @description Multiply all fragment components by the alpha value of the source fragment.
    */
  val BLENDMODE_SRC_ALPHA: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_SRC_ALPHA_SATURATE
    * @description Multiply all fragment components by the alpha value of the source fragment.
    */
  val BLENDMODE_SRC_ALPHA_SATURATE: playcanvasLib.playcanvasLibNumbers.`7` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_SRC_COLOR
    * @description Multiply all fragment components by the components of the source fragment.
    */
  val BLENDMODE_SRC_COLOR: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.BLENDMODE
    * @name pc.BLENDMODE_ZERO
    * @description Multiply all fragment components by zero.
    */
  val BLENDMODE_ZERO: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_ADDITIVE
    * @description Add the color of the source fragment to the destination fragment
    * and write the result to the frame buffer.
    */
  val BLEND_ADDITIVE: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_ADDITIVEALPHA
    * @description Same as pc.BLEND_ADDITIVE except the source RGB is multiplied by the source alpha.
    */
  val BLEND_ADDITIVEALPHA: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_MAX
    * @description Maximum color. Check app.graphicsDevice.extBlendMinmax for support.
    */
  val BLEND_MAX: playcanvasLib.playcanvasLibNumbers.`10` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_MIN
    * @description Minimum color. Check app.graphicsDevice.extBlendMinmax for support.
    */
  val BLEND_MIN: playcanvasLib.playcanvasLibNumbers.`9` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_MULTIPLICATIVE
    * @description Multiply the color of the source fragment by the color of the destination
    * fragment and write the result to the frame buffer.
    */
  val BLEND_MULTIPLICATIVE: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_MULTIPLICATIVE2X
    * @description Multiplies colors and doubles the result
    */
  val BLEND_MULTIPLICATIVE2X: playcanvasLib.playcanvasLibNumbers.`7` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_NONE
    * @description Disable blending.
    */
  val BLEND_NONE: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_NORMAL
    * @description Enable simple translucency for materials such as glass. This is
    * equivalent to enabling a source blend mode of pc.BLENDMODE_SRC_ALPHA and a destination
    * blend mode of pc.BLENDMODE_ONE_MINUS_SRC_ALPHA.
    */
  val BLEND_NORMAL: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_PREMULTIPLIED
    * @description Similar to pc.BLEND_NORMAL expect the source fragment is assumed to have
    * already been multiplied by the source alpha value.
    */
  val BLEND_PREMULTIPLIED: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_SCREEN
    * @description Softer version of additive
    */
  val BLEND_SCREEN: playcanvasLib.playcanvasLibNumbers.`8` = js.native
  /**
    * @enum pc.BLEND
    * @name pc.BLEND_SUBTRACTIVE
    * @description Subtract the color of the source fragment from the destination fragment
    * and write the result to the frame buffer.
    */
  val BLEND_SUBTRACTIVE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val BLUR_BOX: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val BLUR_GAUSSIAN: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val BODYFLAG_KINEMATIC_OBJECT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val BODYFLAG_NORESPONSE_OBJECT: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  // Collision flags
  val BODYFLAG_STATIC_OBJECT: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val BODYGROUP_DEFAULT: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val BODYGROUP_DYNAMIC: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val BODYGROUP_ENGINE_1: playcanvasLib.playcanvasLibNumbers.`8` = js.native
  val BODYGROUP_ENGINE_2: playcanvasLib.playcanvasLibNumbers.`32` = js.native
  val BODYGROUP_ENGINE_3: playcanvasLib.playcanvasLibNumbers.`64` = js.native
  val BODYGROUP_KINEMATIC: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  // groups
  val BODYGROUP_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val BODYGROUP_STATIC: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val BODYGROUP_TRIGGER: playcanvasLib.playcanvasLibNumbers.`16` = js.native
  val BODYGROUP_USER_1: playcanvasLib.playcanvasLibNumbers.`128` = js.native
  val BODYGROUP_USER_2: playcanvasLib.playcanvasLibNumbers.`256` = js.native
  val BODYGROUP_USER_3: playcanvasLib.playcanvasLibNumbers.`512` = js.native
  val BODYGROUP_USER_4: playcanvasLib.playcanvasLibNumbers.`1024` = js.native
  val BODYGROUP_USER_5: playcanvasLib.playcanvasLibNumbers.`2048` = js.native
  val BODYGROUP_USER_6: playcanvasLib.playcanvasLibNumbers.`4096` = js.native
  val BODYGROUP_USER_7: playcanvasLib.playcanvasLibNumbers.`8192` = js.native
  val BODYGROUP_USER_8: playcanvasLib.playcanvasLibNumbers.`16384` = js.native
  val BODYMASK_ALL: playcanvasLib.playcanvasLibNumbers.`65535` = js.native
  // masks
  val BODYMASK_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val BODYMASK_NOT_STATIC: scala.Double = js.native
  val BODYMASK_NOT_STATIC_KINEMATIC: scala.Double = js.native
  val BODYMASK_STATIC: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  // Activation states
  val BODYSTATE_ACTIVE_TAG: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val BODYSTATE_DISABLE_DEACTIVATION: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  val BODYSTATE_DISABLE_SIMULATION: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  val BODYSTATE_ISLAND_SLEEPING: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val BODYSTATE_WANTS_DEACTIVATION: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  val BODYTYPE_DYNAMIC: playcanvasLib.playcanvasLibStrings.dynamic = js.native
  val BODYTYPE_KINEMATIC: playcanvasLib.playcanvasLibStrings.kinematic = js.native
  // types
  val BODYTYPE_STATIC: playcanvasLib.playcanvasLibStrings.static = js.native
  /**
    * @enum pc.BUFFER
    * @name pc.BUFFER_DYNAMIC
    * @description The data store contents will be modified repeatedly and used many times.
    */
  val BUFFER_DYNAMIC: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.BUFFER
    * @name pc.BUFFER_GPUDYNAMIC
    * @description The data store contents will be modified repeatedly on the GPU and used many times. Optimal for transform feedback usage (WebGL2 only).
    */
  val BUFFER_GPUDYNAMIC: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.BUFFER
    * @name pc.BUFFER_STATIC
    * @description The data store contents will be modified once and used many times.
    */
  val BUFFER_STATIC: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.BUFFER
    * @name pc.BUFFER_STREAM
    * @description The data store contents will be modified once and used at most a few times.
    */
  val BUFFER_STREAM: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.CLEARFLAG
    * @name pc.CLEARFLAG_COLOR
    * @description Clear the color buffer.
    */
  val CLEARFLAG_COLOR: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.CLEARFLAG
    * @name pc.CLEARFLAG_DEPTH
    * @description Clear the depth buffer.
    */
  val CLEARFLAG_DEPTH: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.CLEARFLAG
    * @name pc.CLEARFLAG_STENCIL
    * @description Clear the stencil buffer.
    */
  val CLEARFLAG_STENCIL: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @enum pc.CUBEFACE
    * @name pc.CUBEFACE_NEGX
    * @description The negative X face of a cubemap.
    */
  val CUBEFACE_NEGX: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.CUBEFACE
    * @name pc.CUBEFACE_NEGY
    * @description The negative Y face of a cubemap.
    */
  val CUBEFACE_NEGY: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.CUBEFACE
    * @name pc.CUBEFACE_NEGZ
    * @description The negative Z face of a cubemap.
    */
  val CUBEFACE_NEGZ: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  /**
    * @enum pc.CUBEFACE
    * @name pc.CUBEFACE_POSX
    * @description The positive X face of a cubemap.
    */
  val CUBEFACE_POSX: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.CUBEFACE
    * @name pc.CUBEFACE_POSY
    * @description The positive Y face of a cubemap.
    */
  val CUBEFACE_POSY: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.CUBEFACE
    * @name pc.CUBEFACE_POSZ
    * @description The positive Z face of a cubemap.
    */
  val CUBEFACE_POSZ: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  val CUBEPROJ_BOX: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val CUBEPROJ_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.CULLFACE
    * @name pc.CULLFACE_BACK
    * @description Triangles facing away from the view direction are culled.
    */
  val CULLFACE_BACK: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.CULLFACE
    * @name pc.CULLFACE_FRONT
    * @description Triangles facing the view direction are culled.
    */
  val CULLFACE_FRONT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.CULLFACE
    * @name pc.CULLFACE_FRONTANDBACK
    * @description Triangles are culled regardless of their orientation with respect to the view
    * direction. Note that point or line primitives are unaffected by this render state.
    */
  val CULLFACE_FRONTANDBACK: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.CULLFACE
    * @name pc.CULLFACE_NONE
    * @description No triangles are culled.
    */
  val CULLFACE_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.CURVE
    * @name pc.CURVE_CARDINAL
    * @description A cardinal spline interpolation scheme.
    */
  val CURVE_CARDINAL: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.CURVE
    * @name pc.CURVE_CATMULL
    * @description A Catmull-Rom spline interpolation scheme.
    */
  val CURVE_CATMULL: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.CURVE
    * @name pc.CURVE_LINEAR
    * @description A linear interpolation scheme.
    */
  val CURVE_LINEAR: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.CURVE
    * @name pc.CURVE_SMOOTHSTEP
    * @description A smooth step interpolation scheme.
    */
  val CURVE_SMOOTHSTEP: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @static
    * @readonly
    * @type String
    * @name pc.DISTANCE_EXPONENTIAL
    * @description Exponential distance model
    */
  val DISTANCE_EXPONENTIAL: playcanvasLib.playcanvasLibStrings.exponential = js.native
  /**
    * @static
    * @readonly
    * @type String
    * @name pc.DISTANCE_INVERSE
    * @description Inverse distance model
    */
  val DISTANCE_INVERSE: playcanvasLib.playcanvasLibStrings.inverse = js.native
  /**
    * @static
    * @readOnly
    * @name pc.DISTANCE_LINEAR
    * @type String
    * @description Linear distance model
    */
  val DISTANCE_LINEAR: playcanvasLib.playcanvasLibStrings.linear = js.native
  /**
    * @enum pc.ELEMENTTYPE
    * @name pc.ELEMENTTYPE_GROUP
    * @description A {@link pc.ElementComponent} that contains child {@link pc.ElementComponent}s.
    */
  val ELEMENTTYPE_GROUP: playcanvasLib.playcanvasLibStrings.group = js.native
  /**
    * @enum pc.ELEMENTTYPE
    * @name pc.ELEMENTTYPE_IMAGE
    * @description A {@link pc.ElementComponent} that displays an image.
    */
  val ELEMENTTYPE_IMAGE: playcanvasLib.playcanvasLibStrings.image = js.native
  /**
    * @enum pc.ELEMENTTYPE
    * @name pc.ELEMENTTYPE_TEXT
    * @description A {@link pc.ElementComponent} that displays text.
    */
  val ELEMENTTYPE_TEXT: playcanvasLib.playcanvasLibStrings.text = js.native
  val EMITTERSHAPE_BOX: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val EMITTERSHAPE_SPHERE: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_KEYDOWN
    * @description Name of event fired when a key is pressed
    */
  val EVENT_KEYDOWN: playcanvasLib.playcanvasLibStrings.keydown = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_KEYUP
    * @description Name of event fired when a key is released
    */
  val EVENT_KEYUP: playcanvasLib.playcanvasLibStrings.keyup = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_MOUSEDOWN
    * @description Name of event fired when a mouse button is pressed
    */
  val EVENT_MOUSEDOWN: playcanvasLib.playcanvasLibStrings.mousedown = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_MOUSEMOVE
    * @description Name of event fired when the mouse is moved
    */
  val EVENT_MOUSEMOVE: playcanvasLib.playcanvasLibStrings.mousemove = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_MOUSEUP
    * @description Name of event fired when a mouse button is released
    */
  val EVENT_MOUSEUP: playcanvasLib.playcanvasLibStrings.mouseup = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_MOUSEWHEEL
    * @description Name of event fired when the mouse wheel is rotated
    */
  val EVENT_MOUSEWHEEL: playcanvasLib.playcanvasLibStrings.mousewheel = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_TOUCHCANCEL
    * @description Name of event fired when a touch point is interrupted in some way.
    * The exact reasons for cancelling a touch can vary from device to device.
    * For example, a modal alert pops up during the interaction; the touch point leaves the document area;
    * or there are more touch points than the device supports, in which case the earliest touch point is canceled.
    */
  val EVENT_TOUCHCANCEL: playcanvasLib.playcanvasLibStrings.touchcancel = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_TOUCHEND
    * @description Name of event fired when touch ends. For example, a finger is lifted off the device.
    */
  val EVENT_TOUCHEND: playcanvasLib.playcanvasLibStrings.touchend = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_TOUCHMOVE
    * @description Name of event fired when a touch moves.
    */
  val EVENT_TOUCHMOVE: playcanvasLib.playcanvasLibStrings.touchmove = js.native
  /**
    * @enum pc.EVENT
    * @name pc.EVENT_TOUCHSTART
    * @description Name of event fired when a new touch occurs. For example, a finger is placed on the device.
    */
  val EVENT_TOUCHSTART: playcanvasLib.playcanvasLibStrings.touchstart = js.native
  /**
    * @enum pc.FILLMODE
    * @name pc.FILLMODE_FILL_WINDOW
    * @description When resizing the window the size of the canvas will change to fill the window exactly.
    */
  val FILLMODE_FILL_WINDOW: playcanvasLib.playcanvasLibStrings.FILL_WINDOW = js.native
  /**
    * @enum pc.FILLMODE
    * @name pc.FILLMODE_KEEP_ASPECT
    * @description When resizing the window the size of the canvas will change to fill the window as best it can, while maintaining the same aspect ratio.
    */
  val FILLMODE_KEEP_ASPECT: playcanvasLib.playcanvasLibStrings.KEEP_ASPECT = js.native
  /**
    * @enum pc.FILLMODE
    * @name pc.FILLMODE_NONE
    * @description When resizing the window the size of the canvas will not change.
    */
  val FILLMODE_NONE: playcanvasLib.playcanvasLibStrings.NONE = js.native
  /**
    * @enum pc.FILTER
    * @name pc.FILTER_LINEAR
    * @description Bilinear filtering.
    */
  val FILTER_LINEAR: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.FILTER
    * @name pc.FILTER_LINEAR_MIPMAP_LINEAR
    * @description Linearly interpolate both the mipmap levels and between texels.
    */
  val FILTER_LINEAR_MIPMAP_LINEAR: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  /**
    * @enum pc.FILTER
    * @name pc.FILTER_LINEAR_MIPMAP_NEAREST
    * @description Use the nearest neighbor after linearly interpolating between mipmap levels.
    */
  val FILTER_LINEAR_MIPMAP_NEAREST: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @enum pc.FILTER
    * @name pc.FILTER_NEAREST
    * @description Point sample filtering.
    */
  val FILTER_NEAREST: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.FILTER
    * @name pc.FILTER_NEAREST_MIPMAP_LINEAR
    * @description Linearly interpolate in the nearest mipmap level.
    */
  val FILTER_NEAREST_MIPMAP_LINEAR: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.FILTER
    * @name pc.FILTER_NEAREST_MIPMAP_NEAREST
    * @description Use the nearest neighbor in the nearest mipmap level.
    */
  val FILTER_NEAREST_MIPMAP_NEAREST: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.FOG
    * @name pc.FOG_EXP
    * @description Fog rises according to an exponential curve controlled by a density value.
    */
  val FOG_EXP: playcanvasLib.playcanvasLibStrings.exp = js.native
  /**
    * @enum pc.FOG
    * @name pc.FOG_EXP2
    * @description Fog rises according to an exponential curve controlled by a density value.
    */
  val FOG_EXP2: playcanvasLib.playcanvasLibStrings.exp2 = js.native
  /**
    * @enum pc.FOG
    * @name pc.FOG_LINEAR
    * @description Fog rises linearly from zero to 1 between a start and end depth.
    */
  val FOG_LINEAR: playcanvasLib.playcanvasLibStrings.linear = js.native
  /**
    * @enum pc.FOG
    * @name pc.FOG_NONE
    * @description No fog is applied to the scene.
    */
  val FOG_NONE: playcanvasLib.playcanvasLibStrings.none = js.native
  val FRESNEL_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val FRESNEL_SCHLICK: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val FUNC_ALWAYS: playcanvasLib.playcanvasLibNumbers.`7` = js.native
  val FUNC_EQUAL: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val FUNC_GREATER: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  val FUNC_GREATEREQUAL: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  val FUNC_LESS: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val FUNC_LESSEQUAL: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  val FUNC_NEVER: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val FUNC_NOTEQUAL: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  val GAMMA_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val GAMMA_SRGB: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val GAMMA_SRGBFAST: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val GAMMA_SRGBHDR: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.INDEXFORMAT
    * @name pc.INDEXFORMAT_UINT16
    * @description 16-bit unsigned vertex indices.
    */
  val INDEXFORMAT_UINT16: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.INDEXFORMAT
    * @name pc.INDEXFORMAT_UINT32
    * @description 32-bit unsigned vertex indices.
    */
  val INDEXFORMAT_UINT32: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.INDEXFORMAT
    * @name pc.INDEXFORMAT_UINT8
    * @description 8-bit unsigned vertex indices.
    */
  val INDEXFORMAT_UINT8: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_0
    */
  val KEY_0: playcanvasLib.playcanvasLibNumbers.`48` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_1
    */
  val KEY_1: playcanvasLib.playcanvasLibNumbers.`49` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_2
    */
  val KEY_2: playcanvasLib.playcanvasLibNumbers.`50` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_3
    */
  val KEY_3: playcanvasLib.playcanvasLibNumbers.`51` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_4
    */
  val KEY_4: playcanvasLib.playcanvasLibNumbers.`52` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_5
    */
  val KEY_5: playcanvasLib.playcanvasLibNumbers.`53` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_6
    */
  val KEY_6: playcanvasLib.playcanvasLibNumbers.`54` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_7
    */
  val KEY_7: playcanvasLib.playcanvasLibNumbers.`55` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_8
    */
  val KEY_8: playcanvasLib.playcanvasLibNumbers.`56` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_9
    */
  val KEY_9: playcanvasLib.playcanvasLibNumbers.`57` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_A
    */
  val KEY_A: playcanvasLib.playcanvasLibNumbers.`65` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_ADD
    */
  val KEY_ADD: playcanvasLib.playcanvasLibNumbers.`107` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_ALT
    */
  val KEY_ALT: playcanvasLib.playcanvasLibNumbers.`18` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_B
    */
  val KEY_B: playcanvasLib.playcanvasLibNumbers.`66` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_BACKSPACE
    */
  val KEY_BACKSPACE: playcanvasLib.playcanvasLibNumbers.`8` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_BACK_SLASH
    */
  val KEY_BACK_SLASH: playcanvasLib.playcanvasLibNumbers.`220` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_C
    */
  val KEY_C: playcanvasLib.playcanvasLibNumbers.`67` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_CAPS_LOCK
    */
  val KEY_CAPS_LOCK: playcanvasLib.playcanvasLibNumbers.`20` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_CLOSE_BRACKET
    */
  val KEY_CLOSE_BRACKET: playcanvasLib.playcanvasLibNumbers.`221` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_COMMA
    */
  val KEY_COMMA: playcanvasLib.playcanvasLibNumbers.`188` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_CONTEXT_MENU
    */
  val KEY_CONTEXT_MENU: playcanvasLib.playcanvasLibNumbers.`93` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_CONTROL
    */
  val KEY_CONTROL: playcanvasLib.playcanvasLibNumbers.`17` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_D
    */
  val KEY_D: playcanvasLib.playcanvasLibNumbers.`68` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_DECIMAL
    */
  val KEY_DECIMAL: playcanvasLib.playcanvasLibNumbers.`110` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_DELETE
    */
  val KEY_DELETE: playcanvasLib.playcanvasLibNumbers.`46` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_DIVIDE
    */
  val KEY_DIVIDE: playcanvasLib.playcanvasLibNumbers.`111` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_DOWN
    */
  val KEY_DOWN: playcanvasLib.playcanvasLibNumbers.`40` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_E
    */
  val KEY_E: playcanvasLib.playcanvasLibNumbers.`69` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_END
    */
  val KEY_END: playcanvasLib.playcanvasLibNumbers.`35` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_ENTER
    */
  val KEY_ENTER: playcanvasLib.playcanvasLibNumbers.`13` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_EQUAL
    */
  val KEY_EQUAL: playcanvasLib.playcanvasLibNumbers.`61` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_ESCAPE
    */
  val KEY_ESCAPE: playcanvasLib.playcanvasLibNumbers.`27` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F
    */
  val KEY_F: playcanvasLib.playcanvasLibNumbers.`70` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F1
    */
  val KEY_F1: playcanvasLib.playcanvasLibNumbers.`112` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F10
    */
  val KEY_F10: playcanvasLib.playcanvasLibNumbers.`121` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F11
    */
  val KEY_F11: playcanvasLib.playcanvasLibNumbers.`122` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F12
    */
  val KEY_F12: playcanvasLib.playcanvasLibNumbers.`123` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F2
    */
  val KEY_F2: playcanvasLib.playcanvasLibNumbers.`113` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F3
    */
  val KEY_F3: playcanvasLib.playcanvasLibNumbers.`114` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F4
    */
  val KEY_F4: playcanvasLib.playcanvasLibNumbers.`115` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F5
    */
  val KEY_F5: playcanvasLib.playcanvasLibNumbers.`116` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F6
    */
  val KEY_F6: playcanvasLib.playcanvasLibNumbers.`117` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F7
    */
  val KEY_F7: playcanvasLib.playcanvasLibNumbers.`118` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F8
    */
  val KEY_F8: playcanvasLib.playcanvasLibNumbers.`119` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_F9
    */
  val KEY_F9: playcanvasLib.playcanvasLibNumbers.`120` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_G
    */
  val KEY_G: playcanvasLib.playcanvasLibNumbers.`71` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_H
    */
  val KEY_H: playcanvasLib.playcanvasLibNumbers.`72` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_HOME
    */
  val KEY_HOME: playcanvasLib.playcanvasLibNumbers.`36` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_I
    */
  val KEY_I: playcanvasLib.playcanvasLibNumbers.`73` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_INSERT
    */
  val KEY_INSERT: playcanvasLib.playcanvasLibNumbers.`45` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_J
    */
  val KEY_J: playcanvasLib.playcanvasLibNumbers.`74` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_K
    */
  val KEY_K: playcanvasLib.playcanvasLibNumbers.`75` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_L
    */
  val KEY_L: playcanvasLib.playcanvasLibNumbers.`76` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_LEFT
    */
  val KEY_LEFT: playcanvasLib.playcanvasLibNumbers.`37` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_M
    */
  val KEY_M: playcanvasLib.playcanvasLibNumbers.`77` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_META
    */
  val KEY_META: playcanvasLib.playcanvasLibNumbers.`224` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_MULTIPLY
    */
  val KEY_MULTIPLY: playcanvasLib.playcanvasLibNumbers.`106` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_N
    */
  val KEY_N: playcanvasLib.playcanvasLibNumbers.`78` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_0
    */
  val KEY_NUMPAD_0: playcanvasLib.playcanvasLibNumbers.`96` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_1
    */
  val KEY_NUMPAD_1: playcanvasLib.playcanvasLibNumbers.`97` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_2
    */
  val KEY_NUMPAD_2: playcanvasLib.playcanvasLibNumbers.`98` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_3
    */
  val KEY_NUMPAD_3: playcanvasLib.playcanvasLibNumbers.`99` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_4
    */
  val KEY_NUMPAD_4: playcanvasLib.playcanvasLibNumbers.`100` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_5
    */
  val KEY_NUMPAD_5: playcanvasLib.playcanvasLibNumbers.`101` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_6
    */
  val KEY_NUMPAD_6: playcanvasLib.playcanvasLibNumbers.`102` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_7
    */
  val KEY_NUMPAD_7: playcanvasLib.playcanvasLibNumbers.`103` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_8
    */
  val KEY_NUMPAD_8: playcanvasLib.playcanvasLibNumbers.`104` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_NUMPAD_9
    */
  val KEY_NUMPAD_9: playcanvasLib.playcanvasLibNumbers.`105` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_O
    */
  val KEY_O: playcanvasLib.playcanvasLibNumbers.`79` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_OPEN_BRACKET
    */
  val KEY_OPEN_BRACKET: playcanvasLib.playcanvasLibNumbers.`219` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_P
    */
  val KEY_P: playcanvasLib.playcanvasLibNumbers.`80` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_PAGE_DOWN
    */
  val KEY_PAGE_DOWN: playcanvasLib.playcanvasLibNumbers.`34` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_PAGE_UP
    */
  val KEY_PAGE_UP: playcanvasLib.playcanvasLibNumbers.`33` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_PAUSE
    */
  val KEY_PAUSE: playcanvasLib.playcanvasLibNumbers.`19` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_PERIOD
    */
  val KEY_PERIOD: playcanvasLib.playcanvasLibNumbers.`190` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_PRINT_SCREEN
    */
  val KEY_PRINT_SCREEN: playcanvasLib.playcanvasLibNumbers.`44` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_Q
    */
  val KEY_Q: playcanvasLib.playcanvasLibNumbers.`81` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_R
    */
  val KEY_R: playcanvasLib.playcanvasLibNumbers.`82` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_RETURN
    */
  val KEY_RETURN: playcanvasLib.playcanvasLibNumbers.`13` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_RIGHT
    */
  val KEY_RIGHT: playcanvasLib.playcanvasLibNumbers.`39` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_S
    */
  val KEY_S: playcanvasLib.playcanvasLibNumbers.`83` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_SEMICOLON
    */
  val KEY_SEMICOLON: playcanvasLib.playcanvasLibNumbers.`59` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_SEPARATOR
    */
  val KEY_SEPARATOR: playcanvasLib.playcanvasLibNumbers.`108` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_SHIFT
    */
  val KEY_SHIFT: playcanvasLib.playcanvasLibNumbers.`16` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_SLASH
    */
  val KEY_SLASH: playcanvasLib.playcanvasLibNumbers.`191` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_SPACE
    */
  val KEY_SPACE: playcanvasLib.playcanvasLibNumbers.`32` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_SUBTRACT
    */
  val KEY_SUBTRACT: playcanvasLib.playcanvasLibNumbers.`109` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_T
    */
  val KEY_T: playcanvasLib.playcanvasLibNumbers.`84` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_TAB
    */
  val KEY_TAB: playcanvasLib.playcanvasLibNumbers.`9` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_U
    */
  val KEY_U: playcanvasLib.playcanvasLibNumbers.`85` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_UP
    */
  val KEY_UP: playcanvasLib.playcanvasLibNumbers.`38` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_V
    */
  val KEY_V: playcanvasLib.playcanvasLibNumbers.`86` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_W
    */
  val KEY_W: playcanvasLib.playcanvasLibNumbers.`87` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_WINDOWS
    */
  val KEY_WINDOWS: playcanvasLib.playcanvasLibNumbers.`91` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_X
    */
  val KEY_X: playcanvasLib.playcanvasLibNumbers.`88` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_Y
    */
  val KEY_Y: playcanvasLib.playcanvasLibNumbers.`89` = js.native
  /**
    * @enum pc.KEY
    * @name pc.KEY_Z
    */
  val KEY_Z: playcanvasLib.playcanvasLibNumbers.`90` = js.native
  val LAYER_FX: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val LAYER_GIZMO: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val LAYER_HUD: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  // 3 - 14 are custom user layers
  val LAYER_WORLD: playcanvasLib.playcanvasLibNumbers.`15` = js.native
  val LIGHTFALLOFF_INVERSESQUARED: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val LIGHTFALLOFF_LINEAR: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.LIGHTTYPE
    * @name pc.LIGHTTYPE_DIRECTIONAL
    * @description Directional (global) light source.
    */
  val LIGHTTYPE_DIRECTIONAL: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.LIGHTTYPE
    * @name pc.LIGHTTYPE_POINT
    * @description Point (local) light source.
    */
  val LIGHTTYPE_POINT: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.LIGHTTYPE
    * @name pc.LIGHTTYPE_SPOT
    * @description Spot (local) light source.
    */
  val LIGHTTYPE_SPOT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val LINEBATCH_GIZMO: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val LINEBATCH_OVERLAY: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val LINEBATCH_WORLD: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.MOUSEBUTTON
    * @name pc.MOUSEBUTTON_LEFT
    * @description The left mouse button
    */
  val MOUSEBUTTON_LEFT: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.MOUSEBUTTON
    * @name pc.MOUSEBUTTON_MIDDLE
    * @description The middle mouse button
    */
  val MOUSEBUTTON_MIDDLE: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.MOUSEBUTTON
    * @name pc.MOUSEBUTTON_NONE
    * @description No mouse buttons pressed
    */
  val MOUSEBUTTON_NONE: playcanvasLib.playcanvasLibNumbers.`-1` = js.native
  /**
    * @enum pc.MOUSEBUTTON
    * @name pc.MOUSEBUTTON_RIGHT
    * @description The right mouse button
    */
  val MOUSEBUTTON_RIGHT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @description Index for pad 1
    */
  val PAD_1: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @description Index for pad 2
    */
  val PAD_2: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @description Index for pad 3
    */
  val PAD_3: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @description Index for pad 4
    */
  val PAD_4: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @description Direction pad down
    */
  val PAD_DOWN: playcanvasLib.playcanvasLibNumbers.`13` = js.native
  /**
    * @description The first face button, from bottom going clockwise
    */
  val PAD_FACE_1: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @description The second face button, from bottom going clockwise
    */
  val PAD_FACE_2: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @description The third face button, from bottom going clockwise
    */
  val PAD_FACE_3: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @description The fourth face button, from bottom going clockwise
    */
  val PAD_FACE_4: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @description Direction pad left
    */
  val PAD_LEFT: playcanvasLib.playcanvasLibNumbers.`14` = js.native
  /**
    * @description The first shoulder button on the left
    */
  val PAD_L_SHOULDER_1: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @description The second shoulder button on the left
    */
  val PAD_L_SHOULDER_2: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  /**
    * @description The button when depressing the left analogue stick
    */
  val PAD_L_STICK_BUTTON: playcanvasLib.playcanvasLibNumbers.`10` = js.native
  /**
    * @description Horizontal axis on the left analogue stick
    */
  val PAD_L_STICK_X: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @description Vertical axis on the left analogue stick
    */
  val PAD_L_STICK_Y: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @description Direction pad right
    */
  val PAD_RIGHT: playcanvasLib.playcanvasLibNumbers.`15` = js.native
  /**
    * @description The first shoulder button on the right
    */
  val PAD_R_SHOULDER_1: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  /**
    * @description The second shoulder button on the right
    */
  val PAD_R_SHOULDER_2: playcanvasLib.playcanvasLibNumbers.`7` = js.native
  /**
    * @description The button when depressing the right analogue stick
    */
  val PAD_R_STICK_BUTTON: playcanvasLib.playcanvasLibNumbers.`11` = js.native
  /**
    * @description Horizontal axis on the right analogue stick
    */
  val PAD_R_STICK_X: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @description Vertical axis on the right analogue stick
    */
  val PAD_R_STICK_Y: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @description The select button
    */
  val PAD_SELECT: playcanvasLib.playcanvasLibNumbers.`8` = js.native
  /**
    * @description The start button
    */
  val PAD_START: playcanvasLib.playcanvasLibNumbers.`9` = js.native
  /**
    * @description Direction pad up
    */
  val PAD_UP: playcanvasLib.playcanvasLibNumbers.`12` = js.native
  /**
    * @description Vendor specific button
    */
  val PAD_VENDOR: playcanvasLib.playcanvasLibNumbers.`16` = js.native
  val PARTICLEMODE_CPU: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val PARTICLEMODE_GPU: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val PARTICLESORT_DISTANCE: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val PARTICLESORT_NEWER_FIRST: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val PARTICLESORT_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val PARTICLESORT_OLDER_FIRST: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_111110F
    * @description A floating-point color-only format with 11 bits for red and green channels; and 10 bits for the blue channel (WebGL2 only).
    */
  val PIXELFORMAT_111110F: playcanvasLib.playcanvasLibNumbers.`18` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_A8
    * @description 8-bit alpha.
    */
  val PIXELFORMAT_A8: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_DEPTH
    * @description A readable depth buffer format
    */
  val PIXELFORMAT_DEPTH: playcanvasLib.playcanvasLibNumbers.`16` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_DEPTHSTENCIL
    * @description A readable depth/stencil buffer format (WebGL2 only).
    */
  val PIXELFORMAT_DEPTHSTENCIL: playcanvasLib.playcanvasLibNumbers.`17` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_DXT1
    * @description Block compressed format; storing 16 input pixels in 64 bits of output; consisting of two 16-bit RGB 5 =6 =5 color values and a 4x4 two bit lookup table.
    */
  val PIXELFORMAT_DXT1: playcanvasLib.playcanvasLibNumbers.`8` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_DXT3
    * @description Block compressed format; storing 16 input pixels (corresponding to a 4x4 pixel block) into 128 bits of output; consisting of 64 bits of alpha channel data (4 bits for each pixel) followed by 64 bits of color data; encoded the same way as DXT1.
    */
  val PIXELFORMAT_DXT3: playcanvasLib.playcanvasLibNumbers.`9` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_DXT5
    * @description Block compressed format; storing 16 input pixels into 128 bits of output; consisting of 64 bits of alpha channel data (two 8 bit alpha values and a 4x4 3 bit lookup table) followed by 64 bits of color data (encoded the same way as DXT1).
    */
  val PIXELFORMAT_DXT5: playcanvasLib.playcanvasLibNumbers.`10` = js.native
  val PIXELFORMAT_ETC1: playcanvasLib.playcanvasLibNumbers.`21` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_L8
    * @description 8-bit luminance.
    */
  val PIXELFORMAT_L8: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_L8_A8
    * @description 8-bit luminance with 8-bit alpha.
    */
  val PIXELFORMAT_L8_A8: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val PIXELFORMAT_PVRTC_2BPP_RGBA_1: playcanvasLib.playcanvasLibNumbers.`23` = js.native
  val PIXELFORMAT_PVRTC_2BPP_RGB_1: playcanvasLib.playcanvasLibNumbers.`22` = js.native
  val PIXELFORMAT_PVRTC_4BPP_RGBA_1: playcanvasLib.playcanvasLibNumbers.`25` = js.native
  val PIXELFORMAT_PVRTC_4BPP_RGB_1: playcanvasLib.playcanvasLibNumbers.`24` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_R32F
    * @description 32-bit floating point single channel format (WebGL2 only).
    */
  val PIXELFORMAT_R32F: playcanvasLib.playcanvasLibNumbers.`15` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_R4_G4_B4_A4
    * @description 16-bit RGBA (4-bits for red channel; 4 for green; 4 for blue with 4-bit alpha).
    */
  val PIXELFORMAT_R4_G4_B4_A4: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_R5_G5_B5_A1
    * @description 16-bit RGBA (5-bits for red channel; 5 for green; 5 for blue with 1-bit alpha).
    */
  val PIXELFORMAT_R5_G5_B5_A1: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_R5_G6_B5
    * @description 16-bit RGB (5-bits for red channel; 6 for green and 5 for blue).
    */
  val PIXELFORMAT_R5_G6_B5: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_R8_G8_B8
    * @description 24-bit RGB (8-bits for red channel; 8 for green and 8 for blue).
    */
  val PIXELFORMAT_R8_G8_B8: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_R8_G8_B8_A8
    * @description 32-bit RGBA (8-bits for red channel; 8 for green; 8 for blue with 8-bit alpha).
    */
  val PIXELFORMAT_R8_G8_B8_A8: playcanvasLib.playcanvasLibNumbers.`7` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_RGB16F
    * @description 16-bit floating point RGB (16-bit float for each red; green and blue channels).
    */
  val PIXELFORMAT_RGB16F: playcanvasLib.playcanvasLibNumbers.`11` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_RGB32F
    * @description 32-bit floating point RGB (32-bit float for each red; green and blue channels).
    */
  val PIXELFORMAT_RGB32F: playcanvasLib.playcanvasLibNumbers.`13` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_RGBA16F
    * @description 16-bit floating point RGBA (16-bit float for each red; green; blue and alpha channels).
    */
  val PIXELFORMAT_RGBA16F: playcanvasLib.playcanvasLibNumbers.`12` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_RGBA32F
    * @description 32-bit floating point RGBA (32-bit float for each red; green; blue and alpha channels).
    */
  val PIXELFORMAT_RGBA32F: playcanvasLib.playcanvasLibNumbers.`14` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_SRGB
    * @description Color-only sRGB format (WebGL2 only).
    */
  val PIXELFORMAT_SRGB: playcanvasLib.playcanvasLibNumbers.`19` = js.native
  /**
    * @enum pc.PIXELFORMAT
    * @name pc.PIXELFORMAT_SRGBA
    * @description Color sRGB format with additional alpha channel (WebGL2 only).
    */
  val PIXELFORMAT_SRGBA: playcanvasLib.playcanvasLibNumbers.`20` = js.native
  /**
    * @enum pc.PRIMITIVE
    * @name pc.PRIMITIVE_LINELOOP
    * @description List of points that are linked sequentially by line segments; with a closing line segment between the last and first points.
    */
  val PRIMITIVE_LINELOOP: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.PRIMITIVE
    * @name pc.PRIMITIVE_LINES
    * @description Discrete list of line segments.
    */
  val PRIMITIVE_LINES: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.PRIMITIVE
    * @name pc.PRIMITIVE_LINESTRIP
    * @description List of points that are linked sequentially by line segments.
    */
  val PRIMITIVE_LINESTRIP: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  // only add compressed formats next
  /**
    * @enum pc.PRIMITIVE
    * @name pc.PRIMITIVE_POINTS
    * @description List of distinct points.
    */
  val PRIMITIVE_POINTS: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.PRIMITIVE
    * @name pc.PRIMITIVE_TRIANGLES
    * @description Discrete list of triangles.
    */
  val PRIMITIVE_TRIANGLES: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @enum pc.PRIMITIVE
    * @name pc.PRIMITIVE_TRIFAN
    * @description Connected fan of triangles where the first vertex forms triangles with the following pairs of vertices.
    */
  val PRIMITIVE_TRIFAN: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  /**
    * @enum pc.PRIMITIVE
    * @name pc.PRIMITIVE_TRISTRIP
    * @description Connected strip of triangles where a specified vertex forms a triangle using the previous two.
    */
  val PRIMITIVE_TRISTRIP: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  /**
    * @enum pc.PROJECTION
    * @name pc.PROJECTION_ORTHOGRAPHIC
    * @description An orthographic camera projection where the frustum shape is essentially a cuboid.
    */
  val PROJECTION_ORTHOGRAPHIC: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.PROJECTION
    * @name pc.PROJECTION_PERSPECTIVE
    * @description A perspective camera projection where the frustum shape is essentially pyramidal.
    */
  val PROJECTION_PERSPECTIVE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val RENDERSTYLE_POINTS: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val RENDERSTYLE_SOLID: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val RENDERSTYLE_WIREFRAME: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.RESOLUTION
    * @name pc.RESOLUTION_AUTO
    * @description When the canvas is resized the resolution of the canvas will change to match the size of the canvas.
    */
  val RESOLUTION_AUTO: playcanvasLib.playcanvasLibStrings.AUTO = js.native
  /**
    * @enum pc.RESOLUTION
    * @name pc.RESOLUTION_FIXED
    * @description When the canvas is resized the resolution of the canvas will remain at the same value and the output will just be scaled to fit the canvas.
    */
  val RESOLUTION_FIXED: playcanvasLib.playcanvasLibStrings.FIXED = js.native
  /**
    * @enum pc.SCALEMODE
    * @name pc.SCALEMODE_BLEND
    * @description Scale the {@link pc.ScreenComponent} when the application's resolution is different than the ScreenComponent's referenceResolution.
    */
  val SCALEMODE_BLEND: playcanvasLib.playcanvasLibStrings.blend = js.native
  /**
    * @enum pc.SCALEMODE
    * @name pc.SCALEMODE_NONE
    * @description Always use the application's resolution as the resolution for the {@link pc.ScreenComponent}.
    */
  val SCALEMODE_NONE: playcanvasLib.playcanvasLibStrings.none = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR0
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR0: playcanvasLib.playcanvasLibStrings.ATTR0 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR1
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR1: playcanvasLib.playcanvasLibStrings.ATTR1 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR10
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR10: playcanvasLib.playcanvasLibStrings.ATTR10 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR11
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR11: playcanvasLib.playcanvasLibStrings.ATTR11 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR12
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR12: playcanvasLib.playcanvasLibStrings.ATTR12 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR13
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR13: playcanvasLib.playcanvasLibStrings.ATTR13 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR14
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR14: playcanvasLib.playcanvasLibStrings.ATTR14 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR15
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR15: playcanvasLib.playcanvasLibStrings.ATTR15 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR2
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR2: playcanvasLib.playcanvasLibStrings.ATTR2 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR3
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR3: playcanvasLib.playcanvasLibStrings.ATTR3 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR4
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR4: playcanvasLib.playcanvasLibStrings.ATTR4 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR5
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR5: playcanvasLib.playcanvasLibStrings.ATTR5 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR6
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR6: playcanvasLib.playcanvasLibStrings.ATTR6 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR7
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR7: playcanvasLib.playcanvasLibStrings.ATTR7 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR8
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR8: playcanvasLib.playcanvasLibStrings.ATTR8 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_ATTR9
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR9: playcanvasLib.playcanvasLibStrings.ATTR9 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_BLENDINDICES
    * @description Vertex attribute to be treated as skin blend indices.
    */
  val SEMANTIC_BLENDINDICES: playcanvasLib.playcanvasLibStrings.BLENDINDICES = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_BLENDWEIGHT
    * @description Vertex attribute to be treated as skin blend weights.
    */
  val SEMANTIC_BLENDWEIGHT: playcanvasLib.playcanvasLibStrings.BLENDWEIGHT = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_COLOR
    * @description Vertex attribute to be treated as a color.
    */
  val SEMANTIC_COLOR: playcanvasLib.playcanvasLibStrings.COLOR = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_NORMAL
    * @description Vertex attribute to be treated as a normal.
    */
  val SEMANTIC_NORMAL: playcanvasLib.playcanvasLibStrings.NORMAL = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_POSITION
    * @description Vertex attribute to be treated as a position.
    */
  val SEMANTIC_POSITION: playcanvasLib.playcanvasLibStrings.POSITION = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TANGENT
    * @description Vertex attribute to be treated as a tangent.
    */
  val SEMANTIC_TANGENT: playcanvasLib.playcanvasLibStrings.TANGENT = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TEXCOORD0
    * @description Vertex attribute to be treated as a texture coordinate (set 0).
    */
  val SEMANTIC_TEXCOORD0: playcanvasLib.playcanvasLibStrings.TEXCOORD0 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TEXCOORD1
    * @description Vertex attribute to be treated as a texture coordinate (set 1).
    */
  val SEMANTIC_TEXCOORD1: playcanvasLib.playcanvasLibStrings.TEXCOORD1 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TEXCOORD2
    * @description Vertex attribute to be treated as a texture coordinate (set 2).
    */
  val SEMANTIC_TEXCOORD2: playcanvasLib.playcanvasLibStrings.TEXCOORD2 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TEXCOORD3
    * @description Vertex attribute to be treated as a texture coordinate (set 3).
    */
  val SEMANTIC_TEXCOORD3: playcanvasLib.playcanvasLibStrings.TEXCOORD3 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TEXCOORD4
    * @description Vertex attribute to be treated as a texture coordinate (set 4).
    */
  val SEMANTIC_TEXCOORD4: playcanvasLib.playcanvasLibStrings.TEXCOORD4 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TEXCOORD5
    * @description Vertex attribute to be treated as a texture coordinate (set 5).
    */
  val SEMANTIC_TEXCOORD5: playcanvasLib.playcanvasLibStrings.TEXCOORD5 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TEXCOORD6
    * @description Vertex attribute to be treated as a texture coordinate (set 6).
    */
  val SEMANTIC_TEXCOORD6: playcanvasLib.playcanvasLibStrings.TEXCOORD6 = js.native
  /**
    * @enum pc.SEMANTIC
    * @name pc.SEMANTIC_TEXCOORD7
    * @description Vertex attribute to be treated as a texture coordinate (set 7).
    */
  val SEMANTIC_TEXCOORD7: playcanvasLib.playcanvasLibStrings.TEXCOORD7 = js.native
  val SHADERDEF_DIRLM: playcanvasLib.playcanvasLibNumbers.`128` = js.native
  val SHADERDEF_INSTANCING: playcanvasLib.playcanvasLibNumbers.`32` = js.native
  val SHADERDEF_LM: playcanvasLib.playcanvasLibNumbers.`64` = js.native
  val SHADERDEF_NOSHADOW: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val SHADERDEF_SCREENSPACE: playcanvasLib.playcanvasLibNumbers.`256` = js.native
  val SHADERDEF_SKIN: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val SHADERDEF_UV0: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  val SHADERDEF_UV1: playcanvasLib.playcanvasLibNumbers.`8` = js.native
  val SHADERDEF_VCOLOR: playcanvasLib.playcanvasLibNumbers.`16` = js.native
  val SHADERTAG_MATERIAL: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val SHADER_DEPTH: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val SHADER_FORWARD: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val SHADER_FORWARDHDR: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  // 4: VSM8,
  // 5: VSM16,
  // 6: VSM32,
  // 7: PCF5,
  // 8: PCF3 POINT
  // 9: VSM8 POINT,
  // 10: VSM16 POINT,
  // 11: VSM32 POINT,
  // 12: PCF5 POINT
  // 13: PCF3 SPOT
  // 14: VSM8 SPOT,
  // 15: VSM16 SPOT,
  // 16: VSM32 SPOT,
  // 17: PCF5 SPOT
  val SHADER_PICK: playcanvasLib.playcanvasLibNumbers.`18` = js.native
  val SHADER_SHADOW: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  val SHADOWUPDATE_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val SHADOWUPDATE_REALTIME: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val SHADOWUPDATE_THISFRAME: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val SHADOW_DEPTH: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val SHADOW_PCF3: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val SHADOW_PCF5: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  val SHADOW_VSM16: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val SHADOW_VSM32: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  val SHADOW_VSM8: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val SORTKEY_DEPTH: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val SORTKEY_FORWARD: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val SPECOCC_AO: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val SPECOCC_GLOSSDEPENDENT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val SPECOCC_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val SPECULAR_BLINN: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val SPECULAR_PHONG: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val STENCILOP_DECREMENT: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  val STENCILOP_DECREMENTWRAP: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  val STENCILOP_INCREMENT: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  val STENCILOP_INCREMENTWRAP: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  val STENCILOP_INVERT: playcanvasLib.playcanvasLibNumbers.`7` = js.native
  val STENCILOP_KEEP: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val STENCILOP_REPLACE: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val STENCILOP_ZERO: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val TEXHINT_ASSET: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val TEXHINT_LIGHTMAP: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  val TEXHINT_NONE: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val TEXHINT_SHADOWMAP: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.TEXTURELOCK
    * @name pc.TEXTURELOCK_READ
    * @description Read only. Any changes to the locked mip level's pixels will not update the texture.
    */
  val TEXTURELOCK_READ: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  /**
    * @enum pc.TEXTURELOCK
    * @name pc.TEXTURELOCK_WRITE
    * @description Write only. The contents of the specified mip level will be entirely replaced.
    */
  val TEXTURELOCK_WRITE: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val TONEMAP_ACES: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  val TONEMAP_ACES2: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  val TONEMAP_FILMIC: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val TONEMAP_HEJL: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val TONEMAP_LINEAR: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.TYPE
    * @name pc.TYPE_FLOAT32
    * @description Floating point vertex element type.
    */
  val TYPE_FLOAT32: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  /**
    * @enum pc.TYPE
    * @name pc.TYPE_INT16
    * @description Signed short vertex element type.
    */
  val TYPE_INT16: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  /**
    * @enum pc.TYPE
    * @name pc.TYPE_INT32
    * @description Signed integer vertex element type.
    */
  val TYPE_INT32: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  /**
    * @enum pc.TYPE
    * @name pc.TYPE_INT8
    * @description Signed byte vertex element type.
    */
  val TYPE_INT8: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  /**
    * @enum pc.TYPE
    * @name pc.TYPE_UINT16
    * @description Unsigned short vertex element type.
    */
  val TYPE_UINT16: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  /**
    * @enum pc.TYPE
    * @name pc.TYPE_UINT32
    * @description Unsigned integer vertex element type.
    */
  val TYPE_UINT32: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  /**
    * @enum pc.TYPE
    * @name pc.TYPE_UINT8
    * @description Unsigned byte vertex element type.
    */
  val TYPE_UINT8: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val UNIFORMTYPE_BOOL: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val UNIFORMTYPE_BVEC2: playcanvasLib.playcanvasLibNumbers.`9` = js.native
  val UNIFORMTYPE_BVEC3: playcanvasLib.playcanvasLibNumbers.`10` = js.native
  val UNIFORMTYPE_BVEC4: playcanvasLib.playcanvasLibNumbers.`11` = js.native
  val UNIFORMTYPE_FLOAT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val UNIFORMTYPE_FLOATARRAY: playcanvasLib.playcanvasLibNumbers.`17` = js.native
  val UNIFORMTYPE_INT: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val UNIFORMTYPE_IVEC2: playcanvasLib.playcanvasLibNumbers.`6` = js.native
  val UNIFORMTYPE_IVEC3: playcanvasLib.playcanvasLibNumbers.`7` = js.native
  val UNIFORMTYPE_IVEC4: playcanvasLib.playcanvasLibNumbers.`8` = js.native
  val UNIFORMTYPE_MAT2: playcanvasLib.playcanvasLibNumbers.`12` = js.native
  val UNIFORMTYPE_MAT3: playcanvasLib.playcanvasLibNumbers.`13` = js.native
  val UNIFORMTYPE_MAT4: playcanvasLib.playcanvasLibNumbers.`14` = js.native
  val UNIFORMTYPE_TEXTURE2D: playcanvasLib.playcanvasLibNumbers.`15` = js.native
  val UNIFORMTYPE_TEXTURE2D_SHADOW: playcanvasLib.playcanvasLibNumbers.`18` = js.native
  val UNIFORMTYPE_TEXTURE3D: playcanvasLib.playcanvasLibNumbers.`20` = js.native
  val UNIFORMTYPE_TEXTURECUBE: playcanvasLib.playcanvasLibNumbers.`16` = js.native
  val UNIFORMTYPE_TEXTURECUBE_SHADOW: playcanvasLib.playcanvasLibNumbers.`19` = js.native
  val UNIFORMTYPE_VEC2: playcanvasLib.playcanvasLibNumbers.`3` = js.native
  val UNIFORMTYPE_VEC3: playcanvasLib.playcanvasLibNumbers.`4` = js.native
  val UNIFORMTYPE_VEC4: playcanvasLib.playcanvasLibNumbers.`5` = js.native
  val VIEW_CENTER: playcanvasLib.playcanvasLibNumbers.`0` = js.native
  val VIEW_LEFT: playcanvasLib.playcanvasLibNumbers.`1` = js.native
  val VIEW_RIGHT: playcanvasLib.playcanvasLibNumbers.`2` = js.native
  val revision: java.lang.String = js.native
  val version: java.lang.String = js.native
  /**
    * @private
    * @name pc._typeLookup
    * @function
    * @description Create look up table for types
    */
  def _typeLookup(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * @function
    * @name pc.calculateNormals
    * @description Generates normal information from the specified positions and triangle indices. See {@link pc.createMesh}.
    * @param {Number[]} positions An array of 3-dimensional vertex positions.
    * @param {Number[]} indices An array of triangle indices.
    * @returns {Number[]} An array of 3-dimensional vertex normals.
    * @example
    * var normals = pc.calculateNormals(positions, indices);
    * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
    * var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
    * @author Will Eas
    * tcott
    */
  def calculateNormals(positions: js.Array[scala.Double], indices: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /**
    * @function
    * @name pc.calculateTangents
    * @description Generates tangent information from the specified positions, normals, texture coordinates
    * and triangle indices. See {@link pc.createMesh}.
    * @param {Number[]} positions An array of 3-dimensional vertex positions.
    * @param {Number[]} normals An array of 3-dimensional vertex normals.
    * @param {Number[]} uvs An array of 2-dimensional vertex texture coordinates.
    * @param {Number[]} indices An array of triangle indices.
    * @returns {Number[]} An array of 3-dimensional vertex tangents.
    * @example
    * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
    * var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
    * @author Will Eastcott
    */
  def calculateTangents(
    positions: js.Array[scala.Double],
    normals: js.Array[scala.Double],
    uvs: js.Array[scala.Double],
    indices: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  /**
    * @function
    * @name pc.createBox
    * @description Creates a procedural box-shaped mesh.
    * The size, shape and tesselation properties of the box can be controlled via function parameters. By
    * default, the function will create a box centred on the object space origin with a width, length and
    * height of 1.0 unit and 10 segments in either axis (50 triangles per face).<br />
    * Note that the box is created with UVs in the range of 0 to 1 on each face. Additionally, tangent
    * information is generated into the vertex buffer of the box's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} opts An object that specifies optional inputs for the function as follows:
    * @param {pc.Vec3} opts.halfExtents The half dimensions of the box in each axis (defaults to [0.5, 0.5, 0.5]).
    * @param {Number} opts.widthSegments The number of divisions along the X axis of the box (defaults to 1).
    * @param {Number} opts.lengthSegments The number of divisions along the Z axis of the box (defaults to 1).
    * @param {Number} opts.heightSegments The number of divisions along the Y axis of the box (defaults to 1).
    * @return {pc.Mesh} A new box-shaped mesh.
    * @author Will Eastcott
    */
  def createBox(device: GraphicsDevice): Mesh = js.native
  def createBox(device: GraphicsDevice, opts: playcanvasLib.Anon_HalfExtentsHeightSegments): Mesh = js.native
  /**
    * @function
    * @name pc.createCapsule
    * @description Creates a procedural capsule-shaped mesh.
    * The size, shape and tesselation properties of the capsule can be controlled via function parameters.
    * By default, the function will create a capsule standing vertically centred on the XZ-plane with a radius
    * of 0.25, a height of 1.0, 1 height segment and 10 cap segments.<br />
    * Note that the capsule is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the capsule's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} opts An object that specifies optional inputs for the function as follows:
    * @param {Number} opts.radius The radius of the tube forming the body of the capsule (defaults to 0.3).
    * @param {Number} opts.height The length of the body of the capsule from tip to tip (defaults to 1.0).
    * @param {Number} opts.heightSegments The number of divisions along the tubular length of the capsule (defaults to 1).
    * @param {Number} opts.sides The number of divisions around the tubular body of the capsule (defaults to 20).
    * @returns {pc.Mesh} A new cylinder-shaped mesh.
    * @author Will Eastcott
    */
  def createCapsule(device: GraphicsDevice): Mesh = js.native
  def createCapsule(device: GraphicsDevice, opts: playcanvasLib.Anon_HeightHeightSegments): Mesh = js.native
  /**
    * @function
    * @name pc.createCone
    * @description Creates a procedural cone-shaped mesh.</p>
    * The size, shape and tesselation properties of the cone can be controlled via function parameters.
    * By default, the function will create a cone standing vertically centred on the XZ-plane with a base radius
    * of 0.5, a height of 1.0, 5 height segments and 20 cap segments.<br />
    * Note that the cone is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the cone's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} opts An object that specifies optional inputs for the function as follows:
    * @param {Number} opts.baseRadius The base radius of the cone (defaults to 0.5).
    * @param {Number} opts.peakRadius The peak radius of the cone (defaults to 0.0).
    * @param {Number} opts.height The length of the body of the cone (defaults to 1.0).
    * @param {Number} opts.heightSegments The number of divisions along the length of the cone (defaults to 5).
    * @param {Number} opts.capSegments The number of divisions around the tubular body of the cone (defaults to 18).
    * @returns {pc.Mesh} A new cone-shaped mesh.
    * @author Will Eastcott
    */
  def createCone(device: GraphicsDevice): Mesh = js.native
  def createCone(device: GraphicsDevice, opts: playcanvasLib.Anon_BaseRadius): Mesh = js.native
  /**
    * @function
    * @name pc.createCylinder
    * @description Creates a procedural cylinder-shaped mesh.
    * The size, shape and tesselation properties of the cylinder can be controlled via function parameters.
    * By default, the function will create a cylinder standing vertically centred on the XZ-plane with a radius
    * of 0.5, a height of 1.0, 1 height segment and 20 cap segments.<br />
    * Note that the cylinder is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the cylinder's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} opts An object that specifies optional inputs for the function as follows:
    * @param {Number} opts.radius The radius of the tube forming the body of the cylinder (defaults to 0.5).
    * @param {Number} opts.height The length of the body of the cylinder (defaults to 1.0).
    * @param {Number} opts.heightSegments The number of divisions along the length of the cylinder (defaults to 5).
    * @param {Number} opts.capSegments The number of divisions around the tubular body of the cylinder (defaults to 20).
    * @returns {pc.Mesh} A new cylinder-shaped mesh.
    * @author Will Eastcott
    */
  def createCylinder(device: GraphicsDevice): Mesh = js.native
  def createCylinder(device: GraphicsDevice, opts: playcanvasLib.Anon_CapSegments): Mesh = js.native
  /**
    * @function
    * @name pc.createMesh
    * @description Creates a new mesh object from the supplied vertex information and topology.
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Number[]} positions An array of 3-dimensional vertex positions.
    * @param {Object} opts An object that specifies optional inputs for the function as follows:
    * @param {Number[]} opts.normals An array of 3-dimensional vertex normals.
    * @param {Number[]} opts.tangents An array of 3-dimensional vertex tangents.
    * @param {Number[]} opts.colors An array of 4-dimensional vertex colors.
    * @param {Number[]} opts.uvs An array of 2-dimensional vertex texture coordinates.
    * @param {Number[]} opts.uvs1 Same as opts.uvs, but for additional UV set
    * @param {Number[]} opts.indices An array of triangle indices.
    * @returns {pc.Mesh} A new Geometry constructed from the supplied vertex and triangle data.
    * @example
    * // Create a new mesh supplying optional parameters using object literal notation
    * var mesh = pc.createMesh(
    *     graphicsDevice,
    *     positions,
    *     {
    *         normals: treeNormals,
    *         uvs: treeUvs,
    *         indices: treeIndices
    *     });
    * @author Will Eastcott
    */
  def createMesh(device: GraphicsDevice, positions: js.Array[scala.Double]): Mesh = js.native
  def createMesh(device: GraphicsDevice, positions: js.Array[scala.Double], opts: playcanvasLib.Anon_Colors): Mesh = js.native
  /**
    * @function
    * @name pc.createPlane
    * @description Creates a procedural plane-shaped mesh.
    * The size and tesselation properties of the plane can be controlled via function parameters. By
    * default, the function will create a plane centred on the object space origin with a width and
    * length of 1.0 and 5 segments in either axis (50 triangles). The normal vector of the plane is aligned
    * along the positive Y axis.<br />
    * Note that the plane is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the plane's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} opts An object that specifies optional inputs for the function as follows:
    * @param {pc.Vec2} opts.halfExtents The half dimensions of the plane in the X and Z axes (defaults to [0.5, 0.5]).
    * @param {Number} opts.widthSegments The number of divisions along the X axis of the plane (defaults to 5).
    * @param {Number} opts.lengthSegments The number of divisions along the Z axis of the plane (defaults to 5).
    * @returns {pc.Mesh} A new plane-shaped mesh.
    * @author Will Eastcott
    */
  def createPlane(device: GraphicsDevice): Mesh = js.native
  def createPlane(device: GraphicsDevice, opts: playcanvasLib.Anon_HalfExtents): Mesh = js.native
  /**
    * @static
    * @function
    * @name pc.createScript
    * @description Method to create named {@link ScriptType}.
    * It returns new function (class) "Script Type", which is auto-registered to {@link pc.ScriptRegistry} using it's name.
    * This is the main interface to create Script Types, to define custom logic using JavaScript, that is used to create interaction for entities.
    * @param {String} name unique Name of a Script Type.
    * If a Script Type with the same name has already been registered and the new one has a `swap` method defined in its prototype,
    * then it will perform hot swapping of existing Script Instances on entities using this new Script Type.
    * Note: There is a reserved list of names that cannot be used, such as list below as well as some starting from `_` (underscore):
    * system, entity, create, destroy, swap, move, scripts, onEnable, onDisable, onPostStateChange, has, on, off, fire, once, hasEvent
    * @param {pc.Application} [app] Optional application handler, to choose which {@link pc.ScriptRegistry} to add a script to.
    * By default it will use `pc.Application.getApplication()` to get current {@link pc.Application}.
    * @returns {Function} The constructor of a {@link ScriptType}, which the developer is meant to extend by adding attributes and prototype methods.
    * @example
    * var Turning = pc.createScript('turn');
    *
    * // define `speed` attribute that is available in Editor UI
    * Turning.attributes.add('speed', {
    *     type: 'number',
    *     default: 180,
    *     placeholder: 'deg/s'
    * });
    *
    * // runs every tick
    * Turning.prototype.update = function(dt) {
    *     this.entity.rotate(0, this.speed * dt, 0);
    * };
    */
  def createScript[Instance /* <: ScriptType */, Class /* <: ScriptTypeConstructor[Instance] */](name: java.lang.String): Class = js.native
  def createScript[Instance /* <: ScriptType */, Class /* <: ScriptTypeConstructor[Instance] */](name: java.lang.String, app: Application): Class = js.native
  /**
    * @function
    * @name pc.createSphere
    * @description Creates a procedural sphere-shaped mesh.
    * The size and tesselation properties of the sphere can be controlled via function parameters. By
    * default, the function will create a sphere centred on the object space origin with a radius of 0.5
    * and 16 segments in both longitude and latitude.<br />
    * Note that the sphere is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the sphere's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} opts An object that specifies optional inputs for the function as follows:
    * @param {Number} opts.radius The radius of the sphere (defaults to 0.5).
    * @param {Number} opts.segments The number of divisions along the longitudinal and latitudinal axes of the sphere (defaults to 16).
    * @returns {pc.Mesh} A new sphere-shaped mesh.
    * @author Will Eastcott
    */
  def createSphere(device: GraphicsDevice): Mesh = js.native
  def createSphere(device: GraphicsDevice, opts: playcanvasLib.Anon_Radius): Mesh = js.native
  /**
    * @function
    * @name pc.createStyle
    * @description Creates a &lt;style&gt; DOM element from a string that contains CSS
    * @param {String} cssString A string that contains valid CSS
    * @example
    * var css = 'body {height: 100;}';
    * var style = pc.createStyle(css);
    * document.head.appendChild(style);
    * @return {Element} The style DOM element
    */
  def createStyle(cssString: java.lang.String): stdLib.Element = js.native
  /**
    * @function
    * @name pc.createTorus
    * @description Creates a procedural torus-shaped mesh.
    * The size, shape and tesselation properties of the torus can be controlled via function parameters.
    * By default, the function will create a torus in the XZ-plane with a tube radius of 0.2, a ring radius
    * of 0.3, 20 segments and 30 sides.<br />
    * Note that the torus is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the torus's mesh.<br />
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Object} opts An object that specifies optional inputs for the function as follows:
    * @param {Number} opts.tubeRadius The radius of the tube forming the body of the torus (defaults to 0.2).
    * @param {Number} opts.ringRadius The radius from the centre of the torus to the centre of the tube (defaults to 0.3).
    * @param {Number} opts.segments The number of radial divisions forming cross-sections of the torus ring (defaults to 20).
    * @param {Number} opts.sides The number of divisions around the tubular body of the torus ring (defaults to 30).
    * @returns {pc.Mesh} A new torus-shaped mesh.
    * @author Will Eastcott
    */
  def createTorus(device: GraphicsDevice): Mesh = js.native
  def createTorus(device: GraphicsDevice, opts: playcanvasLib.Anon_RingRadius): Mesh = js.native
  /**
    * @private
    * @function
    * @name pc.createURI
    * @description Create a URI object from constituent parts
    * @param {Object} options Parts of the URI to build
    * @param {String} [options.scheme] The URI scheme (e.g. http)
    * @param {String} [options.authority] The URI authority (e.g. www.example.com)
    * @param {String} [options.host] Combination of scheme and authority (e.g. http://www.example.com)
    * @param {String} [options.path] The URI path (e.g. /users/example)
    * @param {String} [options.hostpath] Combination of scheme, authority and path (e.g. http://www.example.com/users/example)
    * @param {String} [options.query] The query section, after the ?(e.g. http://example.com?<b>key=value&another=123</b>)
    * @param {String} [options.fragment] The fragment section, after the # (e.g. http://example.com#<b>fragment/data</b>)
    * @returns {String} A URI string
    */
  def createURI(options: playcanvasLib.Anon_Authority): java.lang.String = js.native
  /**
    * @private
    * @function
    * @name pc.extend
    * @description Merge the contents of two objects into a single object
    * @param {Object} target The target object of the merge
    * @param {Object} ex The object that is merged with target
    * @return {Object} The target object
    * @example
    * var A = {a: function() {console.log(this.a}};
    * var B = {b: function() {console.log(this.b}};
    *
    * pc.extend(A,B);
    * A.a();
    * // logs "a"
    * A.b();
    * // logs "b"
    */
  def extend[T, U](target: T, ex: U): T with U = js.native
  def getMaterialParamType(name: java.lang.String): java.lang.String = js.native
  /**
    * @private
    * @function
    * @name pc.inherits
    * @description Implementation of inheritance for JavaScript objects
    * e.g. Class can access all of Base's function prototypes
    * The super classes prototype is available on the derived class as _super
    * @param {Function} Self Constructor of derived class
    * @param {Function} Super Constructor of base class
    * @returns {Function} New instance of Self which inherits from Super
    * @example
    * Base = function () {};
    * Base.prototype.fn = function () {
    *   console.log('base');
    * };
    * Class = function () {}
    * Class = pc.inherits(Class, Base);
    * Class.prototype.fn = function () {
    *   // Call overridden method
    *   Class._super.fn();
    *   console.log('class');
    * };
    *
    * var c = new Class();
    * c.fn(); // prints 'base' then 'class'
    */
  def inherits[T /* <: js.Function */, U /* <: js.Function */](Self: T, Super: U): T with U = js.native
  /**
    * @private
    * @function
    * @name pc.isDefined
    * @description Return true if the Object is not undefined
    * @param {Object} o The Object to test
    * @returns {Boolean} True if the Object is not undefined
    */
  def isDefined(o: js.Any): scala.Boolean = js.native
  /**
    * @function
    * @private
    * @name pc.makeArray
    * @description Convert an array-like object into a normal array.
    * For example, this is useful for converting the arguments object into an array.
    * @param {Object} arr The array to convert
    * @return {Array} An array
    */
  def makeArray[T](arr: stdLib.ArrayLike[T]): js.Array[T] = js.native
  /**
    * @private
    * @function
    * @name pc.now
    * @description Get current time in milliseconds. Use it to measure time difference. Reference time may differ on different platforms.
    * @return {Number} The time in milliseconds
    */
  def now(): scala.Double = js.native
  /**
    * @private
    * @function
    * @name pc.toKeyCode
    * @description Convert a string or keycode to a keycode
    * @param {String | Number} s
    */
  def toKeyCode(s: java.lang.String): scala.Double = js.native
  def toKeyCode(s: scala.Double): scala.Double = js.native
  /**
    * @private
    * @function
    * @name pc.type
    * @description Extended typeof() function, returns the type of the object.
    * @param {Object} obj The object to get the type of
    * @return {String} The type string: "null", "undefined", "number", "string", "boolean", "array", "object", "function", "date", "regexp" or "float32array"
    */
  def `type`(obj: js.Any): java.lang.String = js.native
  /**
    * @private
    * @function
    * @name pc.unpack()
    * @description Copy a set of common PlayCanvas functions/classes/namespaces into the global namespace
    */
  def unpack(): scala.Unit = js.native
}

