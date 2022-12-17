package typings.playcanvas.global.pc

import org.scalablytyped.runtime.Instantiable1
import typings.playcanvas.anon.App
import typings.playcanvas.anon.Authority
import typings.playcanvas.anon.BaseRadius
import typings.playcanvas.anon.BlendIndices
import typings.playcanvas.anon.CalculateTangents
import typings.playcanvas.anon.Call
import typings.playcanvas.anon.CapSegments
import typings.playcanvas.anon.Distribution
import typings.playcanvas.anon.EagerWorkers
import typings.playcanvas.anon.HalfExtents
import typings.playcanvas.anon.Height
import typings.playcanvas.anon.IsGGGR
import typings.playcanvas.anon.LatitudeBands
import typings.playcanvas.anon.RingRadius
import typings.playcanvas.anon.TypeofScriptType
import typings.playcanvas.global.pc.^
import typings.playcanvas.playcanvasInts.`0`
import typings.playcanvas.playcanvasInts.`1024`
import typings.playcanvas.playcanvasInts.`10`
import typings.playcanvas.playcanvasInts.`11`
import typings.playcanvas.playcanvasInts.`128`
import typings.playcanvas.playcanvasInts.`12`
import typings.playcanvas.playcanvasInts.`13`
import typings.playcanvas.playcanvasInts.`14`
import typings.playcanvas.playcanvasInts.`15`
import typings.playcanvas.playcanvasInts.`16384`
import typings.playcanvas.playcanvasInts.`16`
import typings.playcanvas.playcanvasInts.`17`
import typings.playcanvas.playcanvasInts.`18`
import typings.playcanvas.playcanvasInts.`19`
import typings.playcanvas.playcanvasInts.`1`
import typings.playcanvas.playcanvasInts.`2048`
import typings.playcanvas.playcanvasInts.`20`
import typings.playcanvas.playcanvasInts.`21`
import typings.playcanvas.playcanvasInts.`22`
import typings.playcanvas.playcanvasInts.`23`
import typings.playcanvas.playcanvasInts.`256`
import typings.playcanvas.playcanvasInts.`2`
import typings.playcanvas.playcanvasInts.`32`
import typings.playcanvas.playcanvasInts.`3`
import typings.playcanvas.playcanvasInts.`4096`
import typings.playcanvas.playcanvasInts.`4`
import typings.playcanvas.playcanvasInts.`512`
import typings.playcanvas.playcanvasInts.`5`
import typings.playcanvas.playcanvasInts.`64`
import typings.playcanvas.playcanvasInts.`65535`
import typings.playcanvas.playcanvasInts.`6`
import typings.playcanvas.playcanvasInts.`7`
import typings.playcanvas.playcanvasInts.`8192`
import typings.playcanvas.playcanvasInts.`8`
import typings.playcanvas.playcanvasInts.`9`
import typings.playcanvas.playcanvasStrings.$_CURRENT_SDK_REVISION
import typings.playcanvas.playcanvasStrings.$_CURRENT_SDK_VERSION
import typings.playcanvas.playcanvasStrings.ATTR
import typings.playcanvas.playcanvasStrings.TEXCOORD
import typings.playcanvas.playcanvasStrings.`1Dot55`
import typings.playcanvas.playcanvasStrings.`1Dot56`
import typings.playcanvas.playcanvasStrings.`1Dot57`
import typings.playcanvas.playcanvasStrings.`1Dot58`
import typings.playcanvas.playcanvasStrings.`1d`
import typings.playcanvas.playcanvasStrings.`2d-array`
import typings.playcanvas.playcanvasStrings.`2d`
import typings.playcanvas.playcanvasStrings.`3d`
import typings.playcanvas.playcanvasStrings.`cube-array`
import typings.playcanvas.playcanvasStrings.`unfilterable-float`
import typings.playcanvas.playcanvasStrings.bitmap
import typings.playcanvas.playcanvasStrings.cube
import typings.playcanvas.playcanvasStrings.default
import typings.playcanvas.playcanvasStrings.depth
import typings.playcanvas.playcanvasStrings.float
import typings.playcanvas.playcanvasStrings.gamepad
import typings.playcanvas.playcanvasStrings.key
import typings.playcanvas.playcanvasStrings.keyboard
import typings.playcanvas.playcanvasStrings.mouse
import typings.playcanvas.playcanvasStrings.mousex
import typings.playcanvas.playcanvasStrings.mousey
import typings.playcanvas.playcanvasStrings.msdf
import typings.playcanvas.playcanvasStrings.padlx
import typings.playcanvas.playcanvasStrings.padly
import typings.playcanvas.playcanvasStrings.padrx
import typings.playcanvas.playcanvasStrings.padry
import typings.playcanvas.playcanvasStrings.screen
import typings.playcanvas.playcanvasStrings.webgl
import typings.playcanvas.playcanvasStrings.webgpu
import typings.std.Element
import typings.std.Float32ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ABSOLUTE_URL: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("ABSOLUTE_URL").asInstanceOf[js.RegExp]

inline def ACTION_GAMEPAD: gamepad = ^.asInstanceOf[js.Dynamic].selectDynamic("ACTION_GAMEPAD").asInstanceOf[gamepad]

inline def ACTION_KEYBOARD: keyboard = ^.asInstanceOf[js.Dynamic].selectDynamic("ACTION_KEYBOARD").asInstanceOf[keyboard]

inline def ACTION_MOUSE: mouse = ^.asInstanceOf[js.Dynamic].selectDynamic("ACTION_MOUSE").asInstanceOf[mouse]

/**
  * Clamps texture coordinate to the range 0 to 1.
  *
  * @type {number}
  */
inline def ADDRESS_CLAMP_TO_EDGE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ADDRESS_CLAMP_TO_EDGE").asInstanceOf[Double]

/**
  * Texture coordinate to be set to the fractional part if the integer part is even. If the integer
  * part is odd, then the texture coordinate is set to 1 minus the fractional part.
  *
  * @type {number}
  */
inline def ADDRESS_MIRRORED_REPEAT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ADDRESS_MIRRORED_REPEAT").asInstanceOf[Double]

/**
  * Ignores the integer part of texture coordinates, using only the fractional part.
  *
  * @type {number}
  */
inline def ADDRESS_REPEAT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ADDRESS_REPEAT").asInstanceOf[Double]

/**
  * @type {string}
  */
inline def ANIM_BLEND_1D: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_BLEND_1D").asInstanceOf[String]

/**
  * @type {string}
  */
inline def ANIM_BLEND_2D_CARTESIAN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_BLEND_2D_CARTESIAN").asInstanceOf[String]

/**
  * @type {string}
  */
inline def ANIM_BLEND_2D_DIRECTIONAL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_BLEND_2D_DIRECTIONAL").asInstanceOf[String]

/**
  * @type {string}
  */
inline def ANIM_BLEND_DIRECT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_BLEND_DIRECT").asInstanceOf[String]

inline def ANIM_CONTROL_STATES: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_CONTROL_STATES").asInstanceOf[js.Array[String]]

/**
  * Used to set an anim state graph transition condition predicate as '==='.
  *
  * @type {string}
  */
inline def ANIM_EQUAL_TO: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_EQUAL_TO").asInstanceOf[String]

/**
  * Used to set an anim state graph transition condition predicate as '>'.
  *
  * @type {string}
  */
inline def ANIM_GREATER_THAN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_GREATER_THAN").asInstanceOf[String]

/**
  * Used to set an anim state graph transition condition predicate as '>='.
  *
  * @type {string}
  */
inline def ANIM_GREATER_THAN_EQUAL_TO: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_GREATER_THAN_EQUAL_TO").asInstanceOf[String]

/**
  * Used to set the anim state graph transition interruption source as the next state only.
  *
  * @type {string}
  */
inline def ANIM_INTERRUPTION_NEXT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_INTERRUPTION_NEXT").asInstanceOf[String]

/**
  * Used to set the anim state graph transition interruption sources as the next state followed by
  * the previous state.
  *
  * @type {string}
  */
inline def ANIM_INTERRUPTION_NEXT_PREV: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_INTERRUPTION_NEXT_PREV").asInstanceOf[String]

/**
  * Used to set the anim state graph transition interruption source to no state.
  *
  * @type {string}
  */
inline def ANIM_INTERRUPTION_NONE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_INTERRUPTION_NONE").asInstanceOf[String]

/**
  * Used to set the anim state graph transition interruption source as the previous state only.
  *
  * @type {string}
  */
inline def ANIM_INTERRUPTION_PREV: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_INTERRUPTION_PREV").asInstanceOf[String]

/**
  * Used to set the anim state graph transition interruption sources as the previous state followed
  * by the next state.
  *
  * @type {string}
  */
inline def ANIM_INTERRUPTION_PREV_NEXT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_INTERRUPTION_PREV_NEXT").asInstanceOf[String]

/**
  * Used to indicate that a layers animations should blend additively with previous layers.
  *
  * @type {string}
  */
inline def ANIM_LAYER_ADDITIVE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_LAYER_ADDITIVE").asInstanceOf[String]

/**
  * Used to indicate that a layers animations should overwrite all previous layers.
  *
  * @type {string}
  */
inline def ANIM_LAYER_OVERWRITE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_LAYER_OVERWRITE").asInstanceOf[String]

/**
  * Used to set an anim state graph transition condition predicate as '<'.
  *
  * @type {string}
  */
inline def ANIM_LESS_THAN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_LESS_THAN").asInstanceOf[String]

/**
  * Used to set an anim state graph transition condition predicate as '<='.
  *
  * @type {string}
  */
inline def ANIM_LESS_THAN_EQUAL_TO: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_LESS_THAN_EQUAL_TO").asInstanceOf[String]

/**
  * Used to set an anim state graph transition condition predicate as '!=='.
  *
  * @type {string}
  */
inline def ANIM_NOT_EQUAL_TO: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_NOT_EQUAL_TO").asInstanceOf[String]

/**
  * Used to set an anim state graph parameter as type boolean.
  *
  * @type {string}
  */
inline def ANIM_PARAMETER_BOOLEAN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_PARAMETER_BOOLEAN").asInstanceOf[String]

/**
  * Used to set an anim state graph parameter as type float.
  *
  * @type {string}
  */
inline def ANIM_PARAMETER_FLOAT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_PARAMETER_FLOAT").asInstanceOf[String]

/**
  * Used to set an anim state graph parameter as type integer.
  *
  * @type {string}
  */
inline def ANIM_PARAMETER_INTEGER: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_PARAMETER_INTEGER").asInstanceOf[String]

/**
  * Used to set an anim state graph parameter as type trigger.
  *
  * @type {string}
  */
inline def ANIM_PARAMETER_TRIGGER: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_PARAMETER_TRIGGER").asInstanceOf[String]

/**
  * Used to indicate any state in an anim state graph layer.
  *
  * @type {string}
  */
inline def ANIM_STATE_ANY: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_STATE_ANY").asInstanceOf[String]

/**
  * The ending state in an anim state graph layer.
  *
  * @type {string}
  */
inline def ANIM_STATE_END: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_STATE_END").asInstanceOf[String]

/**
  * The starting state in an anim state graph layer.
  *
  * @type {string}
  */
inline def ANIM_STATE_START: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIM_STATE_START").asInstanceOf[String]

/**
  * Automatically set aspect ratio to current render target's width divided by height.
  *
  * @type {number}
  */
inline def ASPECT_AUTO: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ASPECT_AUTO").asInstanceOf[Double]

/**
  * Use the manual aspect ratio value.
  *
  * @type {number}
  */
inline def ASPECT_MANUAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ASPECT_MANUAL").asInstanceOf[Double]

/**
  * Asset type name for animation.
  *
  * @type {string}
  */
inline def ASSET_ANIMATION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_ANIMATION").asInstanceOf[String]

/**
  * Asset type name for audio.
  *
  * @type {string}
  */
inline def ASSET_AUDIO: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_AUDIO").asInstanceOf[String]

/**
  * Asset type name for a container.
  *
  * @type {string}
  */
inline def ASSET_CONTAINER: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_CONTAINER").asInstanceOf[String]

/**
  * Asset type name for CSS.
  *
  * @type {string}
  */
inline def ASSET_CSS: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_CSS").asInstanceOf[String]

/**
  * Asset type name for cubemap.
  *
  * @type {string}
  */
inline def ASSET_CUBEMAP: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_CUBEMAP").asInstanceOf[String]

/**
  * Asset type name for HTML.
  *
  * @type {string}
  */
inline def ASSET_HTML: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_HTML").asInstanceOf[String]

/**
  * Asset type name for image.
  *
  * @type {string}
  */
inline def ASSET_IMAGE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_IMAGE").asInstanceOf[String]

/**
  * Asset type name for json.
  *
  * @type {string}
  */
inline def ASSET_JSON: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_JSON").asInstanceOf[String]

/**
  * Asset type name for material.
  *
  * @type {string}
  */
inline def ASSET_MATERIAL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_MATERIAL").asInstanceOf[String]

/**
  * Asset type name for model.
  *
  * @type {string}
  */
inline def ASSET_MODEL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_MODEL").asInstanceOf[String]

/**
  * Asset type name for script.
  *
  * @type {string}
  */
inline def ASSET_SCRIPT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_SCRIPT").asInstanceOf[String]

/**
  * Asset type name for shader.
  *
  * @type {string}
  */
inline def ASSET_SHADER: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_SHADER").asInstanceOf[String]

/**
  * Asset type name for text.
  *
  * @type {string}
  */
inline def ASSET_TEXT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_TEXT").asInstanceOf[String]

/**
  * Asset type name for texture.
  *
  * @type {string}
  */
inline def ASSET_TEXTURE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ASSET_TEXTURE").asInstanceOf[String]

inline def AXIS_KEY: key = ^.asInstanceOf[js.Dynamic].selectDynamic("AXIS_KEY").asInstanceOf[key]

inline def AXIS_MOUSE_X: mousex = ^.asInstanceOf[js.Dynamic].selectDynamic("AXIS_MOUSE_X").asInstanceOf[mousex]

inline def AXIS_MOUSE_Y: mousey = ^.asInstanceOf[js.Dynamic].selectDynamic("AXIS_MOUSE_Y").asInstanceOf[mousey]

inline def AXIS_PAD_L_X: padlx = ^.asInstanceOf[js.Dynamic].selectDynamic("AXIS_PAD_L_X").asInstanceOf[padlx]

inline def AXIS_PAD_L_Y: padly = ^.asInstanceOf[js.Dynamic].selectDynamic("AXIS_PAD_L_Y").asInstanceOf[padly]

inline def AXIS_PAD_R_X: padrx = ^.asInstanceOf[js.Dynamic].selectDynamic("AXIS_PAD_R_X").asInstanceOf[padrx]

inline def AXIS_PAD_R_Y: padry = ^.asInstanceOf[js.Dynamic].selectDynamic("AXIS_PAD_R_Y").asInstanceOf[padry]

/**
  * Single color lightmap.
  *
  * @type {number}
  */
inline def BAKE_COLOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BAKE_COLOR").asInstanceOf[Double]

/**
  * Single color lightmap + dominant light direction (used for bump/specular).
  *
  * @type {number}
  */
inline def BAKE_COLORDIR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BAKE_COLORDIR").asInstanceOf[Double]

inline def BINDGROUP_MESH: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("BINDGROUP_MESH").asInstanceOf[`1`]

inline def BINDGROUP_VIEW: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("BINDGROUP_VIEW").asInstanceOf[`0`]

/**
  * Add the results of the source and destination fragment multiplies.
  *
  * @type {number}
  */
inline def BLENDEQUATION_ADD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDEQUATION_ADD").asInstanceOf[Double]

/**
  * Use the largest value. Check app.graphicsDevice.extBlendMinmax for support.
  *
  * @type {number}
  */
inline def BLENDEQUATION_MAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDEQUATION_MAX").asInstanceOf[Double]

/**
  * Use the smallest value. Check app.graphicsDevice.extBlendMinmax for support.
  *
  * @type {number}
  */
inline def BLENDEQUATION_MIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDEQUATION_MIN").asInstanceOf[Double]

/**
  * Reverse and subtract the results of the source and destination fragment multiplies.
  *
  * @type {number}
  */
inline def BLENDEQUATION_REVERSE_SUBTRACT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDEQUATION_REVERSE_SUBTRACT").asInstanceOf[Double]

/**
  * Subtract the results of the source and destination fragment multiplies.
  *
  * @type {number}
  */
inline def BLENDEQUATION_SUBTRACT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDEQUATION_SUBTRACT").asInstanceOf[Double]

/**
  * Multiplies all colors by a constant alpha value.
  *
  * @type {number}
  */
inline def BLENDMODE_CONSTANT_ALPHA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_CONSTANT_ALPHA").asInstanceOf[Double]

/**
  * Multiplies all colors by a constant color.
  *
  * @type {number}
  */
inline def BLENDMODE_CONSTANT_COLOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_CONSTANT_COLOR").asInstanceOf[Double]

/**
  * Multiply all fragment components by the alpha value of the destination fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_DST_ALPHA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_DST_ALPHA").asInstanceOf[Double]

/**
  * Multiply all fragment components by the components of the destination fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_DST_COLOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_DST_COLOR").asInstanceOf[Double]

/**
  * Multiply all fragment components by one.
  *
  * @type {number}
  */
inline def BLENDMODE_ONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_ONE").asInstanceOf[Double]

/**
  * Multiplies all colors by 1 minus a constant alpha value.
  *
  * @type {number}
  */
inline def BLENDMODE_ONE_MINUS_CONSTANT_ALPHA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_ONE_MINUS_CONSTANT_ALPHA").asInstanceOf[Double]

/**
  * Multiplies all colors by 1 minus a constant color.
  *
  * @type {number}
  */
inline def BLENDMODE_ONE_MINUS_CONSTANT_COLOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_ONE_MINUS_CONSTANT_COLOR").asInstanceOf[Double]

/**
  * Multiply all fragment components by one minus the alpha value of the destination fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_ONE_MINUS_DST_ALPHA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_ONE_MINUS_DST_ALPHA").asInstanceOf[Double]

/**
  * Multiply all fragment components by one minus the components of the destination fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_ONE_MINUS_DST_COLOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_ONE_MINUS_DST_COLOR").asInstanceOf[Double]

/**
  * Multiply all fragment components by one minus the alpha value of the source fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_ONE_MINUS_SRC_ALPHA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_ONE_MINUS_SRC_ALPHA").asInstanceOf[Double]

/**
  * Multiply all fragment components by one minus the components of the source fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_ONE_MINUS_SRC_COLOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_ONE_MINUS_SRC_COLOR").asInstanceOf[Double]

/**
  * Multiply all fragment components by the alpha value of the source fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_SRC_ALPHA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_SRC_ALPHA").asInstanceOf[Double]

/**
  * Multiply all fragment components by the alpha value of the source fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_SRC_ALPHA_SATURATE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_SRC_ALPHA_SATURATE").asInstanceOf[Double]

/**
  * Multiply all fragment components by the components of the source fragment.
  *
  * @type {number}
  */
inline def BLENDMODE_SRC_COLOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_SRC_COLOR").asInstanceOf[Double]

/**
  * Multiply all fragment components by zero.
  *
  * @type {number}
  */
inline def BLENDMODE_ZERO: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLENDMODE_ZERO").asInstanceOf[Double]

/**
  * Add the color of the source fragment to the destination fragment and write the result to the
  * frame buffer.
  *
  * @type {number}
  */
inline def BLEND_ADDITIVE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_ADDITIVE").asInstanceOf[Double]

/**
  * Same as {@link BLEND_ADDITIVE} except the source RGB is multiplied by the source alpha.
  *
  * @type {number}
  */
inline def BLEND_ADDITIVEALPHA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_ADDITIVEALPHA").asInstanceOf[Double]

/**
  * Maximum color. Check app.graphicsDevice.extBlendMinmax for support.
  *
  * @type {number}
  */
inline def BLEND_MAX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_MAX").asInstanceOf[Double]

/**
  * Minimum color. Check app.graphicsDevice.extBlendMinmax for support.
  *
  * @type {number}
  */
inline def BLEND_MIN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_MIN").asInstanceOf[Double]

/**
  * Multiply the color of the source fragment by the color of the destination fragment and write the
  * result to the frame buffer.
  *
  * @type {number}
  */
inline def BLEND_MULTIPLICATIVE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_MULTIPLICATIVE").asInstanceOf[Double]

/**
  * Multiplies colors and doubles the result.
  *
  * @type {number}
  */
inline def BLEND_MULTIPLICATIVE2X: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_MULTIPLICATIVE2X").asInstanceOf[Double]

/**
  * Disable blending.
  *
  * @type {number}
  */
inline def BLEND_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_NONE").asInstanceOf[Double]

/**
  * Enable simple translucency for materials such as glass. This is equivalent to enabling a source
  * blend mode of {@link BLENDMODE_SRC_ALPHA} and a destination blend mode of
  * {@link BLENDMODE_ONE_MINUS_SRC_ALPHA}.
  *
  * @type {number}
  */
inline def BLEND_NORMAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_NORMAL").asInstanceOf[Double]

/**
  * Similar to {@link BLEND_NORMAL} expect the source fragment is assumed to have already been
  * multiplied by the source alpha value.
  *
  * @type {number}
  */
inline def BLEND_PREMULTIPLIED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_PREMULTIPLIED").asInstanceOf[Double]

/**
  * Softer version of additive.
  *
  * @type {number}
  */
inline def BLEND_SCREEN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_SCREEN").asInstanceOf[Double]

/**
  * Subtract the color of the source fragment from the destination fragment and write the result to
  * the frame buffer.
  *
  * @type {number}
  */
inline def BLEND_SUBTRACTIVE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLEND_SUBTRACTIVE").asInstanceOf[Double]

/**
  * Box filter.
  *
  * @type {number}
  */
inline def BLUR_BOX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLUR_BOX").asInstanceOf[Double]

/**
  * Gaussian filter. May look smoother than box, but requires more samples.
  *
  * @type {number}
  */
inline def BLUR_GAUSSIAN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BLUR_GAUSSIAN").asInstanceOf[Double]

inline def BODYFLAG_KINEMATIC_OBJECT: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYFLAG_KINEMATIC_OBJECT").asInstanceOf[`2`]

inline def BODYFLAG_NORESPONSE_OBJECT: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYFLAG_NORESPONSE_OBJECT").asInstanceOf[`4`]

inline def BODYFLAG_STATIC_OBJECT: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYFLAG_STATIC_OBJECT").asInstanceOf[`1`]

inline def BODYGROUP_DEFAULT: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_DEFAULT").asInstanceOf[`1`]

inline def BODYGROUP_DYNAMIC: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_DYNAMIC").asInstanceOf[`1`]

inline def BODYGROUP_ENGINE_1: `8` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_ENGINE_1").asInstanceOf[`8`]

inline def BODYGROUP_ENGINE_2: `32` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_ENGINE_2").asInstanceOf[`32`]

inline def BODYGROUP_ENGINE_3: `64` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_ENGINE_3").asInstanceOf[`64`]

inline def BODYGROUP_KINEMATIC: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_KINEMATIC").asInstanceOf[`4`]

inline def BODYGROUP_NONE: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_NONE").asInstanceOf[`0`]

inline def BODYGROUP_STATIC: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_STATIC").asInstanceOf[`2`]

inline def BODYGROUP_TRIGGER: `16` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_TRIGGER").asInstanceOf[`16`]

inline def BODYGROUP_USER_1: `128` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_USER_1").asInstanceOf[`128`]

inline def BODYGROUP_USER_2: `256` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_USER_2").asInstanceOf[`256`]

inline def BODYGROUP_USER_3: `512` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_USER_3").asInstanceOf[`512`]

inline def BODYGROUP_USER_4: `1024` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_USER_4").asInstanceOf[`1024`]

inline def BODYGROUP_USER_5: `2048` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_USER_5").asInstanceOf[`2048`]

inline def BODYGROUP_USER_6: `4096` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_USER_6").asInstanceOf[`4096`]

inline def BODYGROUP_USER_7: `8192` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_USER_7").asInstanceOf[`8192`]

inline def BODYGROUP_USER_8: `16384` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYGROUP_USER_8").asInstanceOf[`16384`]

inline def BODYMASK_ALL: `65535` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYMASK_ALL").asInstanceOf[`65535`]

inline def BODYMASK_NONE: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYMASK_NONE").asInstanceOf[`0`]

inline def BODYMASK_NOT_STATIC: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYMASK_NOT_STATIC").asInstanceOf[Double]

inline def BODYMASK_NOT_STATIC_KINEMATIC: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYMASK_NOT_STATIC_KINEMATIC").asInstanceOf[Double]

inline def BODYMASK_STATIC: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYMASK_STATIC").asInstanceOf[`2`]

inline def BODYSTATE_ACTIVE_TAG: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYSTATE_ACTIVE_TAG").asInstanceOf[`1`]

inline def BODYSTATE_DISABLE_DEACTIVATION: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYSTATE_DISABLE_DEACTIVATION").asInstanceOf[`4`]

inline def BODYSTATE_DISABLE_SIMULATION: `5` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYSTATE_DISABLE_SIMULATION").asInstanceOf[`5`]

inline def BODYSTATE_ISLAND_SLEEPING: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYSTATE_ISLAND_SLEEPING").asInstanceOf[`2`]

inline def BODYSTATE_WANTS_DEACTIVATION: `3` = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYSTATE_WANTS_DEACTIVATION").asInstanceOf[`3`]

/**
  * Rigid body is simulated according to applied forces.
  *
  * @type {string}
  */
inline def BODYTYPE_DYNAMIC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYTYPE_DYNAMIC").asInstanceOf[String]

/**
  * Rigid body has infinite mass and does not respond to forces but can still be moved by setting
  * their velocity or position.
  *
  * @type {string}
  */
inline def BODYTYPE_KINEMATIC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYTYPE_KINEMATIC").asInstanceOf[String]

/**
  * Rigid body has infinite mass and cannot move.
  *
  * @type {string}
  */
inline def BODYTYPE_STATIC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BODYTYPE_STATIC").asInstanceOf[String]

/**
  * The data store contents will be modified repeatedly and used many times.
  *
  * @type {number}
  */
inline def BUFFER_DYNAMIC: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BUFFER_DYNAMIC").asInstanceOf[Double]

/**
  * The data store contents will be modified repeatedly on the GPU and used many times. Optimal for
  * transform feedback usage (WebGL2 only).
  *
  * @type {number}
  */
inline def BUFFER_GPUDYNAMIC: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BUFFER_GPUDYNAMIC").asInstanceOf[Double]

/**
  * The data store contents will be modified once and used many times.
  *
  * @type {number}
  */
inline def BUFFER_STATIC: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BUFFER_STATIC").asInstanceOf[Double]

/**
  * The data store contents will be modified once and used at most a few times.
  *
  * @type {number}
  */
inline def BUFFER_STREAM: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BUFFER_STREAM").asInstanceOf[Double]

/**
  * Specifies different sprites for the hover, pressed and inactive states.
  *
  * @type {number}
  */
inline def BUTTON_TRANSITION_MODE_SPRITE_CHANGE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BUTTON_TRANSITION_MODE_SPRITE_CHANGE").asInstanceOf[Double]

/**
  * Specifies different color tints for the hover, pressed and inactive states.
  *
  * @type {number}
  */
inline def BUTTON_TRANSITION_MODE_TINT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("BUTTON_TRANSITION_MODE_TINT").asInstanceOf[Double]

/**
  * Chunk API versions
  *
  * @type {string}
  */
inline def CHUNKAPI_1_51: String = ^.asInstanceOf[js.Dynamic].selectDynamic("CHUNKAPI_1_51").asInstanceOf[String]

inline def CHUNKAPI_1_55: `1Dot55` = ^.asInstanceOf[js.Dynamic].selectDynamic("CHUNKAPI_1_55").asInstanceOf[`1Dot55`]

inline def CHUNKAPI_1_56: `1Dot56` = ^.asInstanceOf[js.Dynamic].selectDynamic("CHUNKAPI_1_56").asInstanceOf[`1Dot56`]

inline def CHUNKAPI_1_57: `1Dot57` = ^.asInstanceOf[js.Dynamic].selectDynamic("CHUNKAPI_1_57").asInstanceOf[`1Dot57`]

inline def CHUNKAPI_1_58: `1Dot58` = ^.asInstanceOf[js.Dynamic].selectDynamic("CHUNKAPI_1_58").asInstanceOf[`1Dot58`]

/**
  * Clear the color buffer.
  *
  * @type {number}
  */
inline def CLEARFLAG_COLOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CLEARFLAG_COLOR").asInstanceOf[Double]

/**
  * Clear the depth buffer.
  *
  * @type {number}
  */
inline def CLEARFLAG_DEPTH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CLEARFLAG_DEPTH").asInstanceOf[Double]

/**
  * Clear the stencil buffer.
  *
  * @type {number}
  */
inline def CLEARFLAG_STENCIL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CLEARFLAG_STENCIL").asInstanceOf[Double]

inline def COMPUPDATED_BLEND: `8` = ^.asInstanceOf[js.Dynamic].selectDynamic("COMPUPDATED_BLEND").asInstanceOf[`8`]

inline def COMPUPDATED_CAMERAS: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("COMPUPDATED_CAMERAS").asInstanceOf[`4`]

inline def COMPUPDATED_INSTANCES: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("COMPUPDATED_INSTANCES").asInstanceOf[`1`]

inline def COMPUPDATED_LIGHTS: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("COMPUPDATED_LIGHTS").asInstanceOf[`2`]

/**
  * The negative X face of a cubemap.
  *
  * @type {number}
  */
inline def CUBEFACE_NEGX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CUBEFACE_NEGX").asInstanceOf[Double]

/**
  * The negative Y face of a cubemap.
  *
  * @type {number}
  */
inline def CUBEFACE_NEGY: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CUBEFACE_NEGY").asInstanceOf[Double]

/**
  * The negative Z face of a cubemap.
  *
  * @type {number}
  */
inline def CUBEFACE_NEGZ: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CUBEFACE_NEGZ").asInstanceOf[Double]

/**
  * The positive X face of a cubemap.
  *
  * @type {number}
  */
inline def CUBEFACE_POSX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CUBEFACE_POSX").asInstanceOf[Double]

/**
  * The positive Y face of a cubemap.
  *
  * @type {number}
  */
inline def CUBEFACE_POSY: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CUBEFACE_POSY").asInstanceOf[Double]

/**
  * The positive Z face of a cubemap.
  *
  * @type {number}
  */
inline def CUBEFACE_POSZ: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CUBEFACE_POSZ").asInstanceOf[Double]

/**
  * The cube map is box-projected based on a world space axis-aligned bounding box.
  *
  * @type {number}
  */
inline def CUBEPROJ_BOX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CUBEPROJ_BOX").asInstanceOf[Double]

/**
  * The cube map is treated as if it is infinitely far away.
  *
  * @type {number}
  */
inline def CUBEPROJ_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CUBEPROJ_NONE").asInstanceOf[Double]

/**
  * Triangles facing away from the view direction are culled.
  *
  * @type {number}
  */
inline def CULLFACE_BACK: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CULLFACE_BACK").asInstanceOf[Double]

/**
  * Triangles facing the view direction are culled.
  *
  * @type {number}
  */
inline def CULLFACE_FRONT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CULLFACE_FRONT").asInstanceOf[Double]

/**
  * Triangles are culled regardless of their orientation with respect to the view direction. Note
  * that point or line primitives are unaffected by this render state.
  *
  * @type {number}
  */
inline def CULLFACE_FRONTANDBACK: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CULLFACE_FRONTANDBACK").asInstanceOf[Double]

/**
  * No triangles are culled.
  *
  * @type {number}
  */
inline def CULLFACE_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CULLFACE_NONE").asInstanceOf[Double]

/**
  * A cardinal spline interpolation scheme. This interpolation scheme is deprecated. Use
  * CURVE_SPLINE instead.
  *
  * @type {number}
  * @deprecated
  * @ignore
  */
inline def CURVE_CARDINAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CURVE_CARDINAL").asInstanceOf[Double]

/**
  * A Catmull-Rom spline interpolation scheme. This interpolation scheme is deprecated. Use
  * CURVE_SPLINE instead.
  *
  * @type {number}
  * @deprecated
  * @ignore
  */
inline def CURVE_CATMULL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CURVE_CATMULL").asInstanceOf[Double]

/**
  * A linear interpolation scheme.
  *
  * @type {number}
  */
inline def CURVE_LINEAR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CURVE_LINEAR").asInstanceOf[Double]

/**
  * A smooth step interpolation scheme.
  *
  * @type {number}
  */
inline def CURVE_SMOOTHSTEP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CURVE_SMOOTHSTEP").asInstanceOf[Double]

/**
  * Cardinal spline interpolation scheme. For Catmull-Rom, specify curve tension 0.5.
  *
  * @type {number}
  */
inline def CURVE_SPLINE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CURVE_SPLINE").asInstanceOf[Double]

/**
  * A stepped interpolator, free from the shackles of blending.
  *
  * @type {number}
  */
inline def CURVE_STEP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("CURVE_STEP").asInstanceOf[Double]

/**
  * Add together the primary and secondary colors.
  *
  * @type {string}
  */
inline def DETAILMODE_ADD: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DETAILMODE_ADD").asInstanceOf[String]

/**
  * Select whichever of the primary and secondary colors is lighter, component-wise.
  *
  * @type {string}
  */
inline def DETAILMODE_MAX: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DETAILMODE_MAX").asInstanceOf[String]

/**
  * Select whichever of the primary and secondary colors is darker, component-wise.
  *
  * @type {string}
  */
inline def DETAILMODE_MIN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DETAILMODE_MIN").asInstanceOf[String]

/**
  * Multiply together the primary and secondary colors.
  *
  * @type {string}
  */
inline def DETAILMODE_MUL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DETAILMODE_MUL").asInstanceOf[String]

/**
  * Multiplies or screens the colors, depending on the primary color.
  *
  * @type {string}
  */
inline def DETAILMODE_OVERLAY: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DETAILMODE_OVERLAY").asInstanceOf[String]

/**
  * Softer version of {@link DETAILMODE_ADD}.
  *
  * @name DETAILMODE_SCREEN
  */
inline def DETAILMODE_SCREEN: screen = ^.asInstanceOf[js.Dynamic].selectDynamic("DETAILMODE_SCREEN").asInstanceOf[screen]

inline def DEVICETYPE_WEBGL: webgl = ^.asInstanceOf[js.Dynamic].selectDynamic("DEVICETYPE_WEBGL").asInstanceOf[webgl]

inline def DEVICETYPE_WEBGPU: webgpu = ^.asInstanceOf[js.Dynamic].selectDynamic("DEVICETYPE_WEBGPU").asInstanceOf[webgpu]

/**
  * Exponential distance model.
  *
  * @type {string}
  */
inline def DISTANCE_EXPONENTIAL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DISTANCE_EXPONENTIAL").asInstanceOf[String]

/**
  * Inverse distance model.
  *
  * @type {string}
  */
inline def DISTANCE_INVERSE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DISTANCE_INVERSE").asInstanceOf[String]

/**
  * Linear distance model.
  *
  * @type {string}
  */
inline def DISTANCE_LINEAR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DISTANCE_LINEAR").asInstanceOf[String]

inline def ELEMENTTYPE_FLOAT32: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_FLOAT32").asInstanceOf[Double]

/**
  * A {@link ElementComponent} that contains child {@link ElementComponent}s.
  *
  * @type {string}
  */
inline def ELEMENTTYPE_GROUP: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_GROUP").asInstanceOf[String]

/**
  * A {@link ElementComponent} that displays an image.
  *
  * @type {string}
  */
inline def ELEMENTTYPE_IMAGE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_IMAGE").asInstanceOf[String]

inline def ELEMENTTYPE_INT16: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_INT16").asInstanceOf[Double]

inline def ELEMENTTYPE_INT32: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_INT32").asInstanceOf[Double]

inline def ELEMENTTYPE_INT8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_INT8").asInstanceOf[Double]

/**
  * A {@link ElementComponent} that displays text.
  *
  * @type {string}
  */
inline def ELEMENTTYPE_TEXT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_TEXT").asInstanceOf[String]

inline def ELEMENTTYPE_UINT16: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_UINT16").asInstanceOf[Double]

inline def ELEMENTTYPE_UINT32: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_UINT32").asInstanceOf[Double]

inline def ELEMENTTYPE_UINT8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ELEMENTTYPE_UINT8").asInstanceOf[Double]

/**
  * Box shape parameterized by emitterExtents. Initial velocity is directed towards local Z axis.
  *
  * @type {number}
  */
inline def EMITTERSHAPE_BOX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("EMITTERSHAPE_BOX").asInstanceOf[Double]

/**
  * Sphere shape parameterized by emitterRadius. Initial velocity is directed outwards from the
  * center.
  *
  * @type {number}
  */
inline def EMITTERSHAPE_SPHERE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("EMITTERSHAPE_SPHERE").asInstanceOf[Double]

/**
  * Name of event fired when a key is pressed.
  *
  * @type {string}
  */
inline def EVENT_KEYDOWN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_KEYDOWN").asInstanceOf[String]

/**
  * Name of event fired when a key is released.
  *
  * @type {string}
  */
inline def EVENT_KEYUP: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_KEYUP").asInstanceOf[String]

/**
  * Name of event fired when a mouse button is pressed.
  *
  * @type {string}
  */
inline def EVENT_MOUSEDOWN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_MOUSEDOWN").asInstanceOf[String]

/**
  * Name of event fired when the mouse is moved.
  *
  * @type {string}
  */
inline def EVENT_MOUSEMOVE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_MOUSEMOVE").asInstanceOf[String]

/**
  * Name of event fired when a mouse button is released.
  *
  * @type {string}
  */
inline def EVENT_MOUSEUP: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_MOUSEUP").asInstanceOf[String]

/**
  * Name of event fired when the mouse wheel is rotated.
  *
  * @type {string}
  */
inline def EVENT_MOUSEWHEEL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_MOUSEWHEEL").asInstanceOf[String]

/**
  * Name of event fired when a new xr select occurs. For example, primary trigger was pressed.
  *
  * @type {string}
  */
inline def EVENT_SELECT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_SELECT").asInstanceOf[String]

/**
  * Name of event fired when xr select ends. For example, a primary trigger is now released.
  *
  * @type {string}
  */
inline def EVENT_SELECTEND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_SELECTEND").asInstanceOf[String]

/**
  * Name of event fired when a new xr select starts. For example, primary trigger is now pressed.
  *
  * @type {string}
  */
inline def EVENT_SELECTSTART: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_SELECTSTART").asInstanceOf[String]

/**
  * Name of event fired when a touch point is interrupted in some way. The exact reasons for
  * canceling a touch can vary from device to device. For example, a modal alert pops up during the
  * interaction; the touch point leaves the document area, or there are more touch points than the
  * device supports, in which case the earliest touch point is canceled.
  *
  * @type {string}
  */
inline def EVENT_TOUCHCANCEL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_TOUCHCANCEL").asInstanceOf[String]

/**
  * Name of event fired when touch ends. For example, a finger is lifted off the device.
  *
  * @type {string}
  */
inline def EVENT_TOUCHEND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_TOUCHEND").asInstanceOf[String]

/**
  * Name of event fired when a touch moves.
  *
  * @type {string}
  */
inline def EVENT_TOUCHMOVE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_TOUCHMOVE").asInstanceOf[String]

/**
  * Name of event fired when a new touch occurs. For example, a finger is placed on the device.
  *
  * @type {string}
  */
inline def EVENT_TOUCHSTART: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_TOUCHSTART").asInstanceOf[String]

/**
  * When resizing the window the size of the canvas will change to fill the window exactly.
  *
  * @type {string}
  */
inline def FILLMODE_FILL_WINDOW: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FILLMODE_FILL_WINDOW").asInstanceOf[String]

/**
  * When resizing the window the size of the canvas will change to fill the window as best it can,
  * while maintaining the same aspect ratio.
  *
  * @type {string}
  */
inline def FILLMODE_KEEP_ASPECT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FILLMODE_KEEP_ASPECT").asInstanceOf[String]

/**
  * When resizing the window the size of the canvas will not change.
  *
  * @type {string}
  */
inline def FILLMODE_NONE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FILLMODE_NONE").asInstanceOf[String]

/**
  * Bilinear filtering.
  *
  * @type {number}
  */
inline def FILTER_LINEAR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTER_LINEAR").asInstanceOf[Double]

/**
  * Linearly interpolate both the mipmap levels and between texels.
  *
  * @type {number}
  */
inline def FILTER_LINEAR_MIPMAP_LINEAR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTER_LINEAR_MIPMAP_LINEAR").asInstanceOf[Double]

/**
  * Use the nearest neighbor after linearly interpolating between mipmap levels.
  *
  * @type {number}
  */
inline def FILTER_LINEAR_MIPMAP_NEAREST: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTER_LINEAR_MIPMAP_NEAREST").asInstanceOf[Double]

/**
  * Point sample filtering.
  *
  * @type {number}
  */
inline def FILTER_NEAREST: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTER_NEAREST").asInstanceOf[Double]

/**
  * Linearly interpolate in the nearest mipmap level.
  *
  * @type {number}
  */
inline def FILTER_NEAREST_MIPMAP_LINEAR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTER_NEAREST_MIPMAP_LINEAR").asInstanceOf[Double]

/**
  * Use the nearest neighbor in the nearest mipmap level.
  *
  * @type {number}
  */
inline def FILTER_NEAREST_MIPMAP_NEAREST: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILTER_NEAREST_MIPMAP_NEAREST").asInstanceOf[Double]

/**
  * Fit the content within the Element's bounding box while preserving its Aspect Ratio.
  *
  * @type {string}
  */
inline def FITMODE_CONTAIN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FITMODE_CONTAIN").asInstanceOf[String]

/**
  * Fit the content to cover the entire Element's bounding box while preserving its Aspect Ratio.
  *
  * @type {string}
  */
inline def FITMODE_COVER: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FITMODE_COVER").asInstanceOf[String]

/**
  * Fit the content exactly to Element's bounding box.
  *
  * @type {string}
  */
inline def FITMODE_STRETCH: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FITMODE_STRETCH").asInstanceOf[String]

/**
  * Apply both STRETCH and SHRINK fitting logic where applicable.
  *
  * @type {number}
  */
inline def FITTING_BOTH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FITTING_BOTH").asInstanceOf[Double]

/**
  * Disable all fitting logic.
  *
  * @type {number}
  */
inline def FITTING_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FITTING_NONE").asInstanceOf[Double]

/**
  * Shrink child elements to fit the parent container.
  *
  * @type {number}
  */
inline def FITTING_SHRINK: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FITTING_SHRINK").asInstanceOf[Double]

/**
  * Stretch child elements to fit the parent container.
  *
  * @type {number}
  */
inline def FITTING_STRETCH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FITTING_STRETCH").asInstanceOf[Double]

/**
  * Fog rises according to an exponential curve controlled by a density value.
  *
  * @type {string}
  */
inline def FOG_EXP: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FOG_EXP").asInstanceOf[String]

/**
  * Fog rises according to an exponential curve controlled by a density value.
  *
  * @type {string}
  */
inline def FOG_EXP2: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FOG_EXP2").asInstanceOf[String]

/**
  * Fog rises linearly from zero to 1 between a start and end depth.
  *
  * @type {string}
  */
inline def FOG_LINEAR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FOG_LINEAR").asInstanceOf[String]

/**
  * No fog is applied to the scene.
  *
  * @type {string}
  */
inline def FOG_NONE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FOG_NONE").asInstanceOf[String]

inline def FONT_BITMAP: bitmap = ^.asInstanceOf[js.Dynamic].selectDynamic("FONT_BITMAP").asInstanceOf[bitmap]

inline def FONT_MSDF: msdf = ^.asInstanceOf[js.Dynamic].selectDynamic("FONT_MSDF").asInstanceOf[msdf]

/**
  * No Fresnel.
  *
  * @type {number}
  */
inline def FRESNEL_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FRESNEL_NONE").asInstanceOf[Double]

/**
  * Schlick's approximation of Fresnel.
  *
  * @type {number}
  */
inline def FRESNEL_SCHLICK: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FRESNEL_SCHLICK").asInstanceOf[Double]

/**
  * Always pass.
  *
  * @type {number}
  */
inline def FUNC_ALWAYS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNC_ALWAYS").asInstanceOf[Double]

/**
  * Pass if (ref & mask) == (stencil & mask).
  *
  * @type {number}
  */
inline def FUNC_EQUAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNC_EQUAL").asInstanceOf[Double]

/**
  * Pass if (ref & mask) > (stencil & mask).
  *
  * @type {number}
  */
inline def FUNC_GREATER: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNC_GREATER").asInstanceOf[Double]

/**
  * Pass if (ref & mask) >= (stencil & mask).
  *
  * @type {number}
  */
inline def FUNC_GREATEREQUAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNC_GREATEREQUAL").asInstanceOf[Double]

/**
  * Pass if (ref & mask) < (stencil & mask).
  *
  * @type {number}
  */
inline def FUNC_LESS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNC_LESS").asInstanceOf[Double]

/**
  * Pass if (ref & mask) <= (stencil & mask).
  *
  * @type {number}
  */
inline def FUNC_LESSEQUAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNC_LESSEQUAL").asInstanceOf[Double]

/**
  * Never pass.
  *
  * @type {number}
  */
inline def FUNC_NEVER: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNC_NEVER").asInstanceOf[Double]

/**
  * Pass if (ref & mask) != (stencil & mask).
  *
  * @type {number}
  */
inline def FUNC_NOTEQUAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FUNC_NOTEQUAL").asInstanceOf[Double]

/**
  * No gamma correction.
  *
  * @type {number}
  */
inline def GAMMA_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("GAMMA_NONE").asInstanceOf[Double]

/**
  * Apply sRGB gamma correction.
  *
  * @type {number}
  */
inline def GAMMA_SRGB: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("GAMMA_SRGB").asInstanceOf[Double]

/**
  * Apply sRGB (fast) gamma correction.
  *
  * @type {number}
  * @deprecated
  * @ignore
  */
inline def GAMMA_SRGBFAST: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("GAMMA_SRGBFAST").asInstanceOf[Double]

/**
  * Apply sRGB (HDR) gamma correction.
  *
  * @type {number}
  */
inline def GAMMA_SRGBHDR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("GAMMA_SRGBHDR").asInstanceOf[Double]

/**
  * 16-bit unsigned vertex indices (0 to 65,535).
  *
  * @type {number}
  */
inline def INDEXFORMAT_UINT16: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("INDEXFORMAT_UINT16").asInstanceOf[Double]

/**
  * 32-bit unsigned vertex indices (0 to 4,294,967,295).
  *
  * @type {number}
  */
inline def INDEXFORMAT_UINT32: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("INDEXFORMAT_UINT32").asInstanceOf[Double]

/**
  * 8-bit unsigned vertex indices (0 to 255).
  *
  * @type {number}
  */
inline def INDEXFORMAT_UINT8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("INDEXFORMAT_UINT8").asInstanceOf[Double]

/**
  * A cubic spline interpolation scheme.
  *
  * @type {number}
  * @ignore
  */
inline def INTERPOLATION_CUBIC: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("INTERPOLATION_CUBIC").asInstanceOf[Double]

/**
  * A linear interpolation scheme.
  *
  * @type {number}
  * @ignore
  */
inline def INTERPOLATION_LINEAR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("INTERPOLATION_LINEAR").asInstanceOf[Double]

/**
  * A stepped interpolation scheme.
  *
  * @type {number}
  * @ignore
  */
inline def INTERPOLATION_STEP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("INTERPOLATION_STEP").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_0: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_0").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_1").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_2").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_3: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_3").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_4: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_4").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_5: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_5").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_6: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_6").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_7: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_7").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_8").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_9: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_9").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_A: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_A").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_ADD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_ADD").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_ALT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_ALT").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_B: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_B").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_BACKSPACE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_BACKSPACE").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_BACK_SLASH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_BACK_SLASH").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_C: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_C").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_CAPS_LOCK: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_CAPS_LOCK").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_CLOSE_BRACKET: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_CLOSE_BRACKET").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_COMMA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_COMMA").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_CONTEXT_MENU: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_CONTEXT_MENU").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_CONTROL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_CONTROL").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_D: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_D").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_DECIMAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_DECIMAL").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_DELETE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_DELETE").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_DIVIDE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_DIVIDE").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_DOWN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_DOWN").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_E: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_E").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_END: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_END").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_ENTER: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_ENTER").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_EQUAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_EQUAL").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_ESCAPE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_ESCAPE").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F1").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F10: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F10").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F11: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F11").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F12: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F12").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F2").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F3: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F3").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F4: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F4").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F5: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F5").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F6: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F6").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F7: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F7").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F8").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_F9: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_F9").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_G: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_G").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_H: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_H").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_HOME: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_HOME").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_I: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_I").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_INSERT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_INSERT").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_J: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_J").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_K: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_K").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_L: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_L").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_LEFT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_LEFT").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_M: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_M").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_META: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_META").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_MULTIPLY: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_MULTIPLY").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_N: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_N").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_0: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_0").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_1").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_2").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_3: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_3").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_4: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_4").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_5: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_5").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_6: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_6").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_7: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_7").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_8").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_NUMPAD_9: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_NUMPAD_9").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_O: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_O").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_OPEN_BRACKET: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_OPEN_BRACKET").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_P: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_P").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_PAGE_DOWN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_PAGE_DOWN").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_PAGE_UP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_PAGE_UP").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_PAUSE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_PAUSE").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_PERIOD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_PERIOD").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_PRINT_SCREEN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_PRINT_SCREEN").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_Q: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_Q").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_R: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_R").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_RETURN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_RETURN").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_RIGHT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_RIGHT").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_S: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_S").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_SEMICOLON: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_SEMICOLON").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_SEPARATOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_SEPARATOR").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_SHIFT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_SHIFT").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_SLASH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_SLASH").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_SPACE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_SPACE").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_SUBTRACT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_SUBTRACT").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_T: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_T").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_TAB: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_TAB").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_U: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_U").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_UP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_UP").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_V: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_V").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_W: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_W").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_WINDOWS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_WINDOWS").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_X: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_X").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_Y: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_Y").asInstanceOf[Double]

/**
  * @type {number}
  */
inline def KEY_Z: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("KEY_Z").asInstanceOf[Double]

/**
  * The depth layer.
  *
  * @type {number}
  */
inline def LAYERID_DEPTH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYERID_DEPTH").asInstanceOf[Double]

/**
  * The immediate layer.
  *
  * @type {number}
  */
inline def LAYERID_IMMEDIATE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYERID_IMMEDIATE").asInstanceOf[Double]

/**
  * The skybox layer.
  *
  * @type {number}
  */
inline def LAYERID_SKYBOX: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYERID_SKYBOX").asInstanceOf[Double]

/**
  * The UI layer.
  *
  * @type {number}
  */
inline def LAYERID_UI: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYERID_UI").asInstanceOf[Double]

/**
  * The world layer.
  *
  * @type {number}
  */
inline def LAYERID_WORLD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYERID_WORLD").asInstanceOf[Double]

inline def LAYER_FX: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYER_FX").asInstanceOf[`2`]

inline def LAYER_GIZMO: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYER_GIZMO").asInstanceOf[`1`]

inline def LAYER_HUD: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYER_HUD").asInstanceOf[`0`]

inline def LAYER_WORLD: `15` = ^.asInstanceOf[js.Dynamic].selectDynamic("LAYER_WORLD").asInstanceOf[`15`]

/**
  * Inverse squared distance falloff model for light attenuation.
  *
  * @type {number}
  */
inline def LIGHTFALLOFF_INVERSESQUARED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTFALLOFF_INVERSESQUARED").asInstanceOf[Double]

/**
  * Linear distance falloff model for light attenuation.
  *
  * @type {number}
  */
inline def LIGHTFALLOFF_LINEAR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTFALLOFF_LINEAR").asInstanceOf[Double]

/**
  * Disk shape of light source.
  *
  * @type {number}
  */
inline def LIGHTSHAPE_DISK: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTSHAPE_DISK").asInstanceOf[Double]

/**
  * Infinitesimally small point light source shape.
  *
  * @type {number}
  */
inline def LIGHTSHAPE_PUNCTUAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTSHAPE_PUNCTUAL").asInstanceOf[Double]

/**
  * Rectangle shape of light source.
  *
  * @type {number}
  */
inline def LIGHTSHAPE_RECT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTSHAPE_RECT").asInstanceOf[Double]

/**
  * Sphere shape of light source.
  *
  * @type {number}
  */
inline def LIGHTSHAPE_SPHERE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTSHAPE_SPHERE").asInstanceOf[Double]

inline def LIGHTTYPE_COUNT: `3` = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTTYPE_COUNT").asInstanceOf[`3`]

/**
  * Directional (global) light source.
  *
  * @type {number}
  */
inline def LIGHTTYPE_DIRECTIONAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTTYPE_DIRECTIONAL").asInstanceOf[Double]

/**
  * Omni-directional (local) light source.
  *
  * @type {number}
  */
inline def LIGHTTYPE_OMNI: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTTYPE_OMNI").asInstanceOf[Double]

/**
  * Point (local) light source.
  *
  * @type {number}
  * @ignore
  */
inline def LIGHTTYPE_POINT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTTYPE_POINT").asInstanceOf[Double]

/**
  * Spot (local) light source.
  *
  * @type {number}
  */
inline def LIGHTTYPE_SPOT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LIGHTTYPE_SPOT").asInstanceOf[Double]

inline def LINEBATCH_GIZMO: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("LINEBATCH_GIZMO").asInstanceOf[`2`]

inline def LINEBATCH_OVERLAY: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("LINEBATCH_OVERLAY").asInstanceOf[`1`]

inline def LINEBATCH_WORLD: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("LINEBATCH_WORLD").asInstanceOf[`0`]

inline def MASK_AFFECT_DYNAMIC: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("MASK_AFFECT_DYNAMIC").asInstanceOf[`1`]

inline def MASK_AFFECT_LIGHTMAPPED: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("MASK_AFFECT_LIGHTMAPPED").asInstanceOf[`2`]

inline def MASK_BAKE: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("MASK_BAKE").asInstanceOf[`4`]

/**
  * Specified degree of freedom has free movement.
  *
  * @type {string}
  * @ignore
  */
inline def MOTION_FREE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("MOTION_FREE").asInstanceOf[String]

/**
  * Specified degree of freedom has limited movement.
  *
  * @type {string}
  * @ignore
  */
inline def MOTION_LIMITED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("MOTION_LIMITED").asInstanceOf[String]

/**
  * Specified degree of freedom is locked and allows no movement.
  *
  * @type {string}
  * @ignore
  */
inline def MOTION_LOCKED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("MOTION_LOCKED").asInstanceOf[String]

/**
  * The left mouse button.
  *
  * @type {number}
  */
inline def MOUSEBUTTON_LEFT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MOUSEBUTTON_LEFT").asInstanceOf[Double]

/**
  * The middle mouse button.
  *
  * @type {number}
  */
inline def MOUSEBUTTON_MIDDLE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MOUSEBUTTON_MIDDLE").asInstanceOf[Double]

/**
  * No mouse buttons pressed.
  *
  * @type {number}
  */
inline def MOUSEBUTTON_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MOUSEBUTTON_NONE").asInstanceOf[Double]

/**
  * The right mouse button.
  *
  * @type {number}
  */
inline def MOUSEBUTTON_RIGHT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MOUSEBUTTON_RIGHT").asInstanceOf[Double]

/**
  * Horizontal orientation.
  *
  * @type {number}
  */
inline def ORIENTATION_HORIZONTAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ORIENTATION_HORIZONTAL").asInstanceOf[Double]

/**
  * Vertical orientation.
  *
  * @type {number}
  */
inline def ORIENTATION_VERTICAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ORIENTATION_VERTICAL").asInstanceOf[Double]

/**
  * Index for pad 1.
  *
  * @type {number}
  */
inline def PAD_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_1").asInstanceOf[Double]

/**
  * Index for pad 2.
  *
  * @type {number}
  */
inline def PAD_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_2").asInstanceOf[Double]

/**
  * Index for pad 3.
  *
  * @type {number}
  */
inline def PAD_3: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_3").asInstanceOf[Double]

/**
  * Index for pad 4.
  *
  * @type {number}
  */
inline def PAD_4: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_4").asInstanceOf[Double]

/**
  * Direction pad down.
  *
  * @type {number}
  */
inline def PAD_DOWN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_DOWN").asInstanceOf[Double]

/**
  * The first face button, from bottom going clockwise.
  *
  * @type {number}
  */
inline def PAD_FACE_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_FACE_1").asInstanceOf[Double]

/**
  * The second face button, from bottom going clockwise.
  *
  * @type {number}
  */
inline def PAD_FACE_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_FACE_2").asInstanceOf[Double]

/**
  * The third face button, from bottom going clockwise.
  *
  * @type {number}
  */
inline def PAD_FACE_3: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_FACE_3").asInstanceOf[Double]

/**
  * The fourth face button, from bottom going clockwise.
  *
  * @type {number}
  */
inline def PAD_FACE_4: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_FACE_4").asInstanceOf[Double]

/**
  * Direction pad left.
  *
  * @type {number}
  */
inline def PAD_LEFT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_LEFT").asInstanceOf[Double]

/**
  * The first shoulder button on the left.
  *
  * @type {number}
  */
inline def PAD_L_SHOULDER_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_L_SHOULDER_1").asInstanceOf[Double]

/**
  * The second shoulder button on the left.
  *
  * @type {number}
  */
inline def PAD_L_SHOULDER_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_L_SHOULDER_2").asInstanceOf[Double]

/**
  * The button when depressing the left analogue stick.
  *
  * @type {number}
  */
inline def PAD_L_STICK_BUTTON: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_L_STICK_BUTTON").asInstanceOf[Double]

/**
  * Horizontal axis on the left analogue stick.
  *
  * @type {number}
  */
inline def PAD_L_STICK_X: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_L_STICK_X").asInstanceOf[Double]

/**
  * Vertical axis on the left analogue stick.
  *
  * @type {number}
  */
inline def PAD_L_STICK_Y: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_L_STICK_Y").asInstanceOf[Double]

/**
  * Direction pad right.
  *
  * @type {number}
  */
inline def PAD_RIGHT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_RIGHT").asInstanceOf[Double]

/**
  * The first shoulder button on the right.
  *
  * @type {number}
  */
inline def PAD_R_SHOULDER_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_R_SHOULDER_1").asInstanceOf[Double]

/**
  * The second shoulder button on the right.
  *
  * @type {number}
  */
inline def PAD_R_SHOULDER_2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_R_SHOULDER_2").asInstanceOf[Double]

/**
  * The button when depressing the right analogue stick.
  *
  * @type {number}
  */
inline def PAD_R_STICK_BUTTON: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_R_STICK_BUTTON").asInstanceOf[Double]

/**
  * Horizontal axis on the right analogue stick.
  *
  * @type {number}
  */
inline def PAD_R_STICK_X: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_R_STICK_X").asInstanceOf[Double]

/**
  * Vertical axis on the right analogue stick.
  *
  * @type {number}
  */
inline def PAD_R_STICK_Y: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_R_STICK_Y").asInstanceOf[Double]

/**
  * The select button.
  *
  * @type {number}
  */
inline def PAD_SELECT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_SELECT").asInstanceOf[Double]

/**
  * The start button.
  *
  * @type {number}
  */
inline def PAD_START: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_START").asInstanceOf[Double]

/**
  * Direction pad up.
  *
  * @type {number}
  */
inline def PAD_UP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_UP").asInstanceOf[Double]

/**
  * Vendor specific button.
  *
  * @type {number}
  */
inline def PAD_VENDOR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PAD_VENDOR").asInstanceOf[Double]

inline def PARTICLEMODE_CPU: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLEMODE_CPU").asInstanceOf[`1`]

inline def PARTICLEMODE_GPU: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLEMODE_GPU").asInstanceOf[`0`]

/**
  * Similar to previous, but the normal is affected by emitter(entity) transformation.
  *
  * @type {number}
  */
inline def PARTICLEORIENTATION_EMITTER: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLEORIENTATION_EMITTER").asInstanceOf[Double]

/**
  * Particles are facing camera.
  *
  * @type {number}
  */
inline def PARTICLEORIENTATION_SCREEN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLEORIENTATION_SCREEN").asInstanceOf[Double]

/**
  * User defines world space normal (particleNormal) to set planes orientation.
  *
  * @type {number}
  */
inline def PARTICLEORIENTATION_WORLD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLEORIENTATION_WORLD").asInstanceOf[Double]

/**
  * Sorting based on distance to the camera. CPU only.
  *
  * @type {number}
  */
inline def PARTICLESORT_DISTANCE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLESORT_DISTANCE").asInstanceOf[Double]

/**
  * Newer particles are drawn first. CPU only.
  *
  * @type {number}
  */
inline def PARTICLESORT_NEWER_FIRST: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLESORT_NEWER_FIRST").asInstanceOf[Double]

/**
  * No sorting, particles are drawn in arbitrary order. Can be simulated on GPU.
  *
  * @type {number}
  */
inline def PARTICLESORT_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLESORT_NONE").asInstanceOf[Double]

/**
  * Older particles are drawn first. CPU only.
  *
  * @type {number}
  */
inline def PARTICLESORT_OLDER_FIRST: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PARTICLESORT_OLDER_FIRST").asInstanceOf[Double]

/**
  * ATC compressed format with alpha channel in blocks of 4x4.
  *
  * @type {number}
  */
inline def PIXELFORMATASTC4x4: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_ASTC_4x4").asInstanceOf[Double]

/**
  * A floating-point color-only format with 11 bits for red and green channels and 10 bits for the
  * blue channel (WebGL2 only).
  *
  * @type {number}
  */
inline def PIXELFORMAT_111110F: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_111110F").asInstanceOf[Double]

/**
  * 8-bit alpha.
  *
  * @type {number}
  */
inline def PIXELFORMAT_A8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_A8").asInstanceOf[Double]

/**
  * ATC compressed format with no alpha channel.
  *
  * @type {number}
  */
inline def PIXELFORMAT_ATC_RGB: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_ATC_RGB").asInstanceOf[Double]

/**
  * ATC compressed format with alpha channel.
  *
  * @type {number}
  */
inline def PIXELFORMAT_ATC_RGBA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_ATC_RGBA").asInstanceOf[Double]

/**
  * A readable depth buffer format.
  *
  * @type {number}
  */
inline def PIXELFORMAT_DEPTH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_DEPTH").asInstanceOf[Double]

/**
  * A readable depth/stencil buffer format (WebGL2 only).
  *
  * @type {number}
  */
inline def PIXELFORMAT_DEPTHSTENCIL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_DEPTHSTENCIL").asInstanceOf[Double]

/**
  * Block compressed format storing 16 input pixels in 64 bits of output, consisting of two 16-bit
  * RGB 5:6:5 color values and a 4x4 two bit lookup table.
  *
  * @type {number}
  */
inline def PIXELFORMAT_DXT1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_DXT1").asInstanceOf[Double]

/**
  * Block compressed format storing 16 input pixels (corresponding to a 4x4 pixel block) into 128
  * bits of output, consisting of 64 bits of alpha channel data (4 bits for each pixel) followed by
  * 64 bits of color data; encoded the same way as DXT1.
  *
  * @type {number}
  */
inline def PIXELFORMAT_DXT3: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_DXT3").asInstanceOf[Double]

/**
  * Block compressed format storing 16 input pixels into 128 bits of output, consisting of 64 bits
  * of alpha channel data (two 8 bit alpha values and a 4x4 3 bit lookup table) followed by 64 bits
  * of color data (encoded the same way as DXT1).
  *
  * @type {number}
  */
inline def PIXELFORMAT_DXT5: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_DXT5").asInstanceOf[Double]

/**
  * ETC1 compressed format.
  *
  * @type {number}
  */
inline def PIXELFORMAT_ETC1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_ETC1").asInstanceOf[Double]

/**
  * ETC2 (RGB) compressed format.
  *
  * @type {number}
  */
inline def PIXELFORMAT_ETC2_RGB: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_ETC2_RGB").asInstanceOf[Double]

/**
  * ETC2 (RGBA) compressed format.
  *
  * @type {number}
  */
inline def PIXELFORMAT_ETC2_RGBA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_ETC2_RGBA").asInstanceOf[Double]

/**
  * 8-bit luminance.
  *
  * @type {number}
  */
inline def PIXELFORMAT_L8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_L8").asInstanceOf[Double]

/**
  * 8-bit luminance with 8-bit alpha.
  *
  * @type {number}
  */
inline def PIXELFORMAT_L8_A8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_L8_A8").asInstanceOf[Double]

/**
  * PVRTC (2BPP RGBA) compressed format.
  *
  * @type {number}
  */
inline def PIXELFORMAT_PVRTC_2BPP_RGBA_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_PVRTC_2BPP_RGBA_1").asInstanceOf[Double]

/**
  * PVRTC (2BPP RGB) compressed format.
  *
  * @type {number}
  */
inline def PIXELFORMAT_PVRTC_2BPP_RGB_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_PVRTC_2BPP_RGB_1").asInstanceOf[Double]

/**
  * PVRTC (4BPP RGBA) compressed format.
  *
  * @type {number}
  */
inline def PIXELFORMAT_PVRTC_4BPP_RGBA_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_PVRTC_4BPP_RGBA_1").asInstanceOf[Double]

/**
  * PVRTC (4BPP RGB) compressed format.
  *
  * @type {number}
  */
inline def PIXELFORMAT_PVRTC_4BPP_RGB_1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_PVRTC_4BPP_RGB_1").asInstanceOf[Double]

/**
  * 32-bit floating point single channel format (WebGL2 only).
  *
  * @type {number}
  */
inline def PIXELFORMAT_R32F: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_R32F").asInstanceOf[Double]

/**
  * 16-bit RGBA (4-bits for red channel, 4 for green, 4 for blue with 4-bit alpha).
  *
  * @type {number}
  */
inline def PIXELFORMAT_R4_G4_B4_A4: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_R4_G4_B4_A4").asInstanceOf[Double]

/**
  * 16-bit RGBA (5-bits for red channel, 5 for green, 5 for blue with 1-bit alpha).
  *
  * @type {number}
  */
inline def PIXELFORMAT_R5_G5_B5_A1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_R5_G5_B5_A1").asInstanceOf[Double]

/**
  * 16-bit RGB (5-bits for red channel, 6 for green and 5 for blue).
  *
  * @type {number}
  */
inline def PIXELFORMAT_R5_G6_B5: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_R5_G6_B5").asInstanceOf[Double]

/**
  * 24-bit RGB (8-bits for red channel, 8 for green and 8 for blue).
  *
  * @type {number}
  */
inline def PIXELFORMAT_R8_G8_B8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_R8_G8_B8").asInstanceOf[Double]

/**
  * 32-bit RGBA (8-bits for red channel, 8 for green, 8 for blue with 8-bit alpha).
  *
  * @type {number}
  */
inline def PIXELFORMAT_R8_G8_B8_A8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_R8_G8_B8_A8").asInstanceOf[Double]

/**
  * 16-bit floating point RGB (16-bit float for each red, green and blue channels).
  *
  * @type {number}
  */
inline def PIXELFORMAT_RGB16F: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_RGB16F").asInstanceOf[Double]

/**
  * 32-bit floating point RGB (32-bit float for each red, green and blue channels).
  *
  * @type {number}
  */
inline def PIXELFORMAT_RGB32F: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_RGB32F").asInstanceOf[Double]

/**
  * 16-bit floating point RGBA (16-bit float for each red, green, blue and alpha channels).
  *
  * @type {number}
  */
inline def PIXELFORMAT_RGBA16F: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_RGBA16F").asInstanceOf[Double]

/**
  * 32-bit floating point RGBA (32-bit float for each red, green, blue and alpha channels).
  *
  * @type {number}
  */
inline def PIXELFORMAT_RGBA32F: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_RGBA32F").asInstanceOf[Double]

/**
  * Color-only sRGB format (WebGL2 only).
  *
  * @type {number}
  */
inline def PIXELFORMAT_SRGB: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_SRGB").asInstanceOf[Double]

/**
  * Color sRGB format with additional alpha channel (WebGL2 only).
  *
  * @type {number}
  */
inline def PIXELFORMAT_SRGBA: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PIXELFORMAT_SRGBA").asInstanceOf[Double]

/**
  * List of points that are linked sequentially by line segments, with a closing line segment
  * between the last and first points.
  *
  * @type {number}
  */
inline def PRIMITIVE_LINELOOP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_LINELOOP").asInstanceOf[Double]

/**
  * Discrete list of line segments.
  *
  * @type {number}
  */
inline def PRIMITIVE_LINES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_LINES").asInstanceOf[Double]

/**
  * List of points that are linked sequentially by line segments.
  *
  * @type {number}
  */
inline def PRIMITIVE_LINESTRIP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_LINESTRIP").asInstanceOf[Double]

/**
  * List of distinct points.
  *
  * @type {number}
  */
inline def PRIMITIVE_POINTS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_POINTS").asInstanceOf[Double]

/**
  * Discrete list of triangles.
  *
  * @type {number}
  */
inline def PRIMITIVE_TRIANGLES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_TRIANGLES").asInstanceOf[Double]

/**
  * Connected fan of triangles where the first vertex forms triangles with the following pairs of vertices.
  *
  * @type {number}
  */
inline def PRIMITIVE_TRIFAN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_TRIFAN").asInstanceOf[Double]

/**
  * Connected strip of triangles where a specified vertex forms a triangle using the previous two.
  *
  * @type {number}
  */
inline def PRIMITIVE_TRISTRIP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_TRISTRIP").asInstanceOf[Double]

/**
  * An orthographic camera projection where the frustum shape is essentially a cuboid.
  *
  * @type {number}
  */
inline def PROJECTION_ORTHOGRAPHIC: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PROJECTION_ORTHOGRAPHIC").asInstanceOf[Double]

/**
  * A perspective camera projection where the frustum shape is essentially pyramidal.
  *
  * @type {number}
  */
inline def PROJECTION_PERSPECTIVE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PROJECTION_PERSPECTIVE").asInstanceOf[Double]

/**
  * Render mesh instance as points.
  *
  * @type {number}
  */
inline def RENDERSTYLE_POINTS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RENDERSTYLE_POINTS").asInstanceOf[Double]

/**
  * Render mesh instance as solid geometry.
  *
  * @type {number}
  */
inline def RENDERSTYLE_SOLID: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RENDERSTYLE_SOLID").asInstanceOf[Double]

/**
  * Render mesh instance as wireframe.
  *
  * @type {number}
  */
inline def RENDERSTYLE_WIREFRAME: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RENDERSTYLE_WIREFRAME").asInstanceOf[Double]

/**
  * When the canvas is resized the resolution of the canvas will change to match the size of the
  * canvas.
  *
  * @type {string}
  */
inline def RESOLUTION_AUTO: String = ^.asInstanceOf[js.Dynamic].selectDynamic("RESOLUTION_AUTO").asInstanceOf[String]

/**
  * When the canvas is resized the resolution of the canvas will remain at the same value and the
  * output will just be scaled to fit the canvas.
  *
  * @type {string}
  */
inline def RESOLUTION_FIXED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("RESOLUTION_FIXED").asInstanceOf[String]

inline def RIGIDBODY_ACTIVE_TAG: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_ACTIVE_TAG").asInstanceOf[`1`]

inline def RIGIDBODY_CF_KINEMATIC_OBJECT: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_CF_KINEMATIC_OBJECT").asInstanceOf[`2`]

inline def RIGIDBODY_CF_NORESPONSE_OBJECT: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_CF_NORESPONSE_OBJECT").asInstanceOf[`4`]

inline def RIGIDBODY_CF_STATIC_OBJECT: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_CF_STATIC_OBJECT").asInstanceOf[`1`]

inline def RIGIDBODY_DISABLE_DEACTIVATION: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_DISABLE_DEACTIVATION").asInstanceOf[`4`]

inline def RIGIDBODY_DISABLE_SIMULATION: `5` = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_DISABLE_SIMULATION").asInstanceOf[`5`]

inline def RIGIDBODY_ISLAND_SLEEPING: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_ISLAND_SLEEPING").asInstanceOf[`2`]

inline def RIGIDBODY_TYPE_DYNAMIC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_TYPE_DYNAMIC").asInstanceOf[String]

inline def RIGIDBODY_TYPE_KINEMATIC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_TYPE_KINEMATIC").asInstanceOf[String]

inline def RIGIDBODY_TYPE_STATIC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_TYPE_STATIC").asInstanceOf[String]

inline def RIGIDBODY_WANTS_DEACTIVATION: `3` = ^.asInstanceOf[js.Dynamic].selectDynamic("RIGIDBODY_WANTS_DEACTIVATION").asInstanceOf[`3`]

inline def SAMPLETYPE_DEPTH: depth = ^.asInstanceOf[js.Dynamic].selectDynamic("SAMPLETYPE_DEPTH").asInstanceOf[depth]

inline def SAMPLETYPE_FLOAT: float = ^.asInstanceOf[js.Dynamic].selectDynamic("SAMPLETYPE_FLOAT").asInstanceOf[float]

inline def SAMPLETYPE_UNFILTERABLE_FLOAT: `unfilterable-float` = ^.asInstanceOf[js.Dynamic].selectDynamic("SAMPLETYPE_UNFILTERABLE_FLOAT").asInstanceOf[`unfilterable-float`]

/**
  * Scale the {@link ScreenComponent} when the application's resolution is different than the
  * ScreenComponent's referenceResolution.
  *
  * @type {string}
  */
inline def SCALEMODE_BLEND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SCALEMODE_BLEND").asInstanceOf[String]

/**
  * Always use the application's resolution as the resolution for the {@link ScreenComponent}.
  *
  * @type {string}
  */
inline def SCALEMODE_NONE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SCALEMODE_NONE").asInstanceOf[String]

/**
  * The scrollbar will be visible all the time.
  *
  * @type {number}
  */
inline def SCROLLBAR_VISIBILITY_SHOW_ALWAYS: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SCROLLBAR_VISIBILITY_SHOW_ALWAYS").asInstanceOf[Double]

/**
  * The scrollbar will be visible only when content exceeds the size of the viewport.
  *
  * @type {number}
  */
inline def SCROLLBAR_VISIBILITY_SHOW_WHEN_REQUIRED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SCROLLBAR_VISIBILITY_SHOW_WHEN_REQUIRED").asInstanceOf[Double]

/**
  * Content scrolls past its bounds and then gently bounces back.
  *
  * @type {number}
  */
inline def SCROLL_MODE_BOUNCE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SCROLL_MODE_BOUNCE").asInstanceOf[Double]

/**
  * Content does not scroll any further than its bounds.
  *
  * @type {number}
  */
inline def SCROLL_MODE_CLAMP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SCROLL_MODE_CLAMP").asInstanceOf[Double]

/**
  * Content can scroll forever.
  *
  * @type {number}
  */
inline def SCROLL_MODE_INFINITE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SCROLL_MODE_INFINITE").asInstanceOf[Double]

inline def SEMANTIC_ATTR: ATTR = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR").asInstanceOf[ATTR]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR0: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR0").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR1: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR1").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR10: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR10").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR11: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR11").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR12: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR12").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR13: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR13").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR14: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR14").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR15: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR15").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR2: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR2").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR3: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR3").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR4: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR4").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR5: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR5").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR6: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR6").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR7: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR7").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR8: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR8").asInstanceOf[String]

/**
  * Vertex attribute with a user defined semantic.
  *
  * @type {string}
  */
inline def SEMANTIC_ATTR9: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_ATTR9").asInstanceOf[String]

/**
  * Vertex attribute to be treated as skin blend indices.
  *
  * @type {string}
  */
inline def SEMANTIC_BLENDINDICES: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_BLENDINDICES").asInstanceOf[String]

/**
  * Vertex attribute to be treated as skin blend weights.
  *
  * @type {string}
  */
inline def SEMANTIC_BLENDWEIGHT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_BLENDWEIGHT").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a color.
  *
  * @type {string}
  */
inline def SEMANTIC_COLOR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_COLOR").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a normal.
  *
  * @type {string}
  */
inline def SEMANTIC_NORMAL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_NORMAL").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a position.
  *
  * @type {string}
  */
inline def SEMANTIC_POSITION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_POSITION").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a tangent.
  *
  * @type {string}
  */
inline def SEMANTIC_TANGENT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TANGENT").asInstanceOf[String]

inline def SEMANTIC_TEXCOORD: TEXCOORD = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD").asInstanceOf[TEXCOORD]

/**
  * Vertex attribute to be treated as a texture coordinate (set 0).
  *
  * @type {string}
  */
inline def SEMANTIC_TEXCOORD0: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD0").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a texture coordinate (set 1).
  *
  * @type {string}
  */
inline def SEMANTIC_TEXCOORD1: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD1").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a texture coordinate (set 2).
  *
  * @type {string}
  */
inline def SEMANTIC_TEXCOORD2: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD2").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a texture coordinate (set 3).
  *
  * @type {string}
  */
inline def SEMANTIC_TEXCOORD3: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD3").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a texture coordinate (set 4).
  *
  * @type {string}
  */
inline def SEMANTIC_TEXCOORD4: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD4").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a texture coordinate (set 5).
  *
  * @type {string}
  */
inline def SEMANTIC_TEXCOORD5: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD5").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a texture coordinate (set 6).
  *
  * @type {string}
  */
inline def SEMANTIC_TEXCOORD6: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD6").asInstanceOf[String]

/**
  * Vertex attribute to be treated as a texture coordinate (set 7).
  *
  * @type {string}
  */
inline def SEMANTIC_TEXCOORD7: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SEMANTIC_TEXCOORD7").asInstanceOf[String]

inline def SHADERDEF_DIRLM: `128` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_DIRLM").asInstanceOf[`128`]

inline def SHADERDEF_INSTANCING: `32` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_INSTANCING").asInstanceOf[`32`]

inline def SHADERDEF_LM: `64` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_LM").asInstanceOf[`64`]

inline def SHADERDEF_LMAMBIENT: `8192` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_LMAMBIENT").asInstanceOf[`8192`]

inline def SHADERDEF_MORPH_NORMAL: `2048` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_MORPH_NORMAL").asInstanceOf[`2048`]

inline def SHADERDEF_MORPH_POSITION: `1024` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_MORPH_POSITION").asInstanceOf[`1024`]

inline def SHADERDEF_MORPH_TEXTURE_BASED: `4096` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_MORPH_TEXTURE_BASED").asInstanceOf[`4096`]

inline def SHADERDEF_NOSHADOW: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_NOSHADOW").asInstanceOf[`1`]

inline def SHADERDEF_SCREENSPACE: `256` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_SCREENSPACE").asInstanceOf[`256`]

inline def SHADERDEF_SKIN: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_SKIN").asInstanceOf[`2`]

inline def SHADERDEF_TANGENTS: `512` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_TANGENTS").asInstanceOf[`512`]

inline def SHADERDEF_UV0: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_UV0").asInstanceOf[`4`]

inline def SHADERDEF_UV1: `8` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_UV1").asInstanceOf[`8`]

inline def SHADERDEF_VCOLOR: `16` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERDEF_VCOLOR").asInstanceOf[`16`]

inline def SHADERSTAGE_COMPUTE: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERSTAGE_COMPUTE").asInstanceOf[`4`]

inline def SHADERSTAGE_FRAGMENT: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERSTAGE_FRAGMENT").asInstanceOf[`2`]

inline def SHADERSTAGE_VERTEX: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERSTAGE_VERTEX").asInstanceOf[`1`]

inline def SHADERTAG_MATERIAL: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERTAG_MATERIAL").asInstanceOf[`1`]

/**
  * Shader that performs depth rendering.
  *
  * @type {string}
  */
inline def SHADERTYPE_DEPTH: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERTYPE_DEPTH").asInstanceOf[String]

/**
  * Shader that performs forward rendering.
  *
  * @type {string}
  */
inline def SHADERTYPE_FORWARD: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERTYPE_FORWARD").asInstanceOf[String]

/**
  * Shader used for picking.
  *
  * @type {string}
  */
inline def SHADERTYPE_PICK: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERTYPE_PICK").asInstanceOf[String]

/**
  * Shader used for rendering shadow textures.
  *
  * @type {string}
  */
inline def SHADERTYPE_SHADOW: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADERTYPE_SHADOW").asInstanceOf[String]

/**
  * Render RGBA-encoded depth value.
  *
  * @type {number}
  */
inline def SHADER_DEPTH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADER_DEPTH").asInstanceOf[Double]

/**
  * Render shaded materials with gamma correction and tonemapping.
  *
  * @type {number}
  */
inline def SHADER_FORWARD: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADER_FORWARD").asInstanceOf[Double]

/**
  * Render shaded materials without gamma correction and tonemapping.
  *
  * @type {number}
  */
inline def SHADER_FORWARDHDR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADER_FORWARDHDR").asInstanceOf[Double]

inline def SHADER_PICK: `3` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADER_PICK").asInstanceOf[`3`]

inline def SHADER_SHADOW: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADER_SHADOW").asInstanceOf[`4`]

/**
  * The shadow map is not to be updated.
  *
  * @type {number}
  */
inline def SHADOWUPDATE_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOWUPDATE_NONE").asInstanceOf[Double]

/**
  * The shadow map is regenerated every frame.
  *
  * @type {number}
  */
inline def SHADOWUPDATE_REALTIME: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOWUPDATE_REALTIME").asInstanceOf[Double]

/**
  * The shadow map is regenerated this frame and not on subsequent frames.
  *
  * @type {number}
  */
inline def SHADOWUPDATE_THISFRAME: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOWUPDATE_THISFRAME").asInstanceOf[Double]

inline def SHADOW_COUNT: `6` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOW_COUNT").asInstanceOf[`6`]

inline def SHADOW_DEPTH: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOW_DEPTH").asInstanceOf[`0`]

/**
  * Render depth (color-packed on WebGL 1.0), can be used for PCF 1x1 sampling.
  *
  * @type {number}
  */
inline def SHADOW_PCF1: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOW_PCF1").asInstanceOf[Double]

/**
  * Render depth (color-packed on WebGL 1.0), can be used for PCF 3x3 sampling.
  *
  * @type {number}
  */
inline def SHADOW_PCF3: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOW_PCF3").asInstanceOf[Double]

/**
  * Render depth buffer only, can be used for hardware-accelerated PCF 5x5 sampling. Requires
  * WebGL 2. Falls back to {@link SHADOW_PCF3} on WebGL 1.
  *
  * @type {number}
  */
inline def SHADOW_PCF5: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOW_PCF5").asInstanceOf[Double]

/**
  * Render 16-bit exponential variance shadow map. Requires OES_texture_half_float extension. Falls
  * back to {@link SHADOW_VSM8}, if not supported.
  *
  * @type {number}
  */
inline def SHADOW_VSM16: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOW_VSM16").asInstanceOf[Double]

/**
  * Render 32-bit exponential variance shadow map. Requires OES_texture_float extension. Falls back
  * to {@link SHADOW_VSM16}, if not supported.
  *
  * @type {number}
  */
inline def SHADOW_VSM32: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOW_VSM32").asInstanceOf[Double]

/**
  * Render packed variance shadow map. All shadow receivers must also cast shadows for this mode to
  * work correctly.
  *
  * @type {number}
  */
inline def SHADOW_VSM8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SHADOW_VSM8").asInstanceOf[Double]

inline def SORTKEY_DEPTH: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("SORTKEY_DEPTH").asInstanceOf[`1`]

inline def SORTKEY_FORWARD: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("SORTKEY_FORWARD").asInstanceOf[`0`]

/**
  * Mesh instances are sorted back to front. This is the way to properly render many
  * semi-transparent objects on different depth, one is blended on top of another.
  *
  * @type {number}
  */
inline def SORTMODE_BACK2FRONT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SORTMODE_BACK2FRONT").asInstanceOf[Double]

/**
  * Provide custom functions for sorting drawcalls and calculating distance.
  *
  * @type {number}
  * @ignore
  */
inline def SORTMODE_CUSTOM: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SORTMODE_CUSTOM").asInstanceOf[Double]

/**
  * Mesh instances are sorted front to back. Depending on GPU and the scene, this option may give
  * better performance than {@link SORTMODE_MATERIALMESH} due to reduced overdraw.
  *
  * @type {number}
  */
inline def SORTMODE_FRONT2BACK: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SORTMODE_FRONT2BACK").asInstanceOf[Double]

/**
  * Mesh instances are sorted based on {@link MeshInstance#drawOrder}.
  *
  * @type {number}
  */
inline def SORTMODE_MANUAL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SORTMODE_MANUAL").asInstanceOf[Double]

/**
  * Mesh instances are sorted to minimize switching between materials and meshes to improve
  * rendering performance.
  *
  * @type {number}
  */
inline def SORTMODE_MATERIALMESH: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SORTMODE_MATERIALMESH").asInstanceOf[Double]

/**
  * No sorting is applied. Mesh instances are rendered in the same order they were added to a layer.
  *
  * @type {number}
  */
inline def SORTMODE_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SORTMODE_NONE").asInstanceOf[Double]

/**
  * Use AO directly to occlude specular.
  *
  * @type {number}
  */
inline def SPECOCC_AO: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SPECOCC_AO").asInstanceOf[Double]

/**
  * Modify AO based on material glossiness/view angle to occlude specular.
  *
  * @type {number}
  */
inline def SPECOCC_GLOSSDEPENDENT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SPECOCC_GLOSSDEPENDENT").asInstanceOf[Double]

/**
  * No specular occlusion.
  *
  * @type {number}
  */
inline def SPECOCC_NONE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SPECOCC_NONE").asInstanceOf[Double]

/**
  * Energy-conserving Blinn-Phong.
  *
  * @type {number}
  */
inline def SPECULAR_BLINN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SPECULAR_BLINN").asInstanceOf[Double]

/**
  * Phong without energy conservation. You should only use it as a backwards compatibility with
  * older projects.
  *
  * @type {number}
  */
inline def SPECULAR_PHONG: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SPECULAR_PHONG").asInstanceOf[Double]

/**
  * A {@link SpriteComponent} that renders sprite animations.
  *
  * @type {string}
  */
inline def SPRITETYPE_ANIMATED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SPRITETYPE_ANIMATED").asInstanceOf[String]

/**
  * A {@link SpriteComponent} that displays a single frame from a sprite asset.
  *
  * @type {string}
  */
inline def SPRITETYPE_SIMPLE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SPRITETYPE_SIMPLE").asInstanceOf[String]

/**
  * This mode renders a sprite as a simple quad.
  *
  * @type {number}
  */
inline def SPRITE_RENDERMODE_SIMPLE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SPRITE_RENDERMODE_SIMPLE").asInstanceOf[Double]

/**
  * This mode renders a sprite using 9-slicing in 'sliced' mode. Sliced mode stretches the top and
  * bottom regions of the sprite horizontally, the left and right regions vertically and the middle
  * region both horizontally and vertically.
  *
  * @type {number}
  */
inline def SPRITE_RENDERMODE_SLICED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SPRITE_RENDERMODE_SLICED").asInstanceOf[Double]

/**
  * This mode renders a sprite using 9-slicing in 'tiled' mode. Tiled mode tiles the top and bottom
  * regions of the sprite horizontally, the left and right regions vertically and the middle region
  * both horizontally and vertically.
  *
  * @type {number}
  */
inline def SPRITE_RENDERMODE_TILED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SPRITE_RENDERMODE_TILED").asInstanceOf[Double]

/**
  * Decrement the value.
  *
  * @type {number}
  */
inline def STENCILOP_DECREMENT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STENCILOP_DECREMENT").asInstanceOf[Double]

/**
  * Decrement the value but wrap it to a maximum representable value if the current value is 0.
  *
  * @type {number}
  */
inline def STENCILOP_DECREMENTWRAP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STENCILOP_DECREMENTWRAP").asInstanceOf[Double]

/**
  * Increment the value.
  *
  * @type {number}
  */
inline def STENCILOP_INCREMENT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STENCILOP_INCREMENT").asInstanceOf[Double]

/**
  * Increment the value but wrap it to zero when it's larger than a maximum representable value.
  *
  * @type {number}
  */
inline def STENCILOP_INCREMENTWRAP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STENCILOP_INCREMENTWRAP").asInstanceOf[Double]

/**
  * Invert the value bitwise.
  *
  * @type {number}
  */
inline def STENCILOP_INVERT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STENCILOP_INVERT").asInstanceOf[Double]

/**
  * Don't change the stencil buffer value.
  *
  * @type {number}
  */
inline def STENCILOP_KEEP: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STENCILOP_KEEP").asInstanceOf[Double]

/**
  * Replace value with the reference value (see {@link GraphicsDevice#setStencilFunc}).
  *
  * @type {number}
  */
inline def STENCILOP_REPLACE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STENCILOP_REPLACE").asInstanceOf[Double]

/**
  * Set value to zero.
  *
  * @type {number}
  */
inline def STENCILOP_ZERO: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("STENCILOP_ZERO").asInstanceOf[Double]

inline def TEXHINT_ASSET: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXHINT_ASSET").asInstanceOf[`2`]

inline def TEXHINT_LIGHTMAP: `3` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXHINT_LIGHTMAP").asInstanceOf[`3`]

inline def TEXHINT_NONE: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXHINT_NONE").asInstanceOf[`0`]

inline def TEXHINT_SHADOWMAP: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXHINT_SHADOWMAP").asInstanceOf[`1`]

inline def TEXTUREDIMENSION_1D: `1d` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREDIMENSION_1D").asInstanceOf[`1d`]

inline def TEXTUREDIMENSION_2D: `2d` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREDIMENSION_2D").asInstanceOf[`2d`]

inline def TEXTUREDIMENSION_2D_ARRAY: `2d-array` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREDIMENSION_2D_ARRAY").asInstanceOf[`2d-array`]

inline def TEXTUREDIMENSION_3D: `3d` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREDIMENSION_3D").asInstanceOf[`3d`]

inline def TEXTUREDIMENSION_CUBE: cube = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREDIMENSION_CUBE").asInstanceOf[cube]

inline def TEXTUREDIMENSION_CUBE_ARRAY: `cube-array` = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREDIMENSION_CUBE_ARRAY").asInstanceOf[`cube-array`]

/**
  * Read only. Any changes to the locked mip level's pixels will not update the texture.
  *
  * @type {number}
  */
inline def TEXTURELOCK_READ: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTURELOCK_READ").asInstanceOf[Double]

/**
  * Write only. The contents of the specified mip level will be entirely replaced.
  *
  * @type {number}
  */
inline def TEXTURELOCK_WRITE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTURELOCK_WRITE").asInstanceOf[Double]

/**
  * Texture data is stored in cubemap projection format.
  *
  * @type {string}
  */
inline def TEXTUREPROJECTION_CUBE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREPROJECTION_CUBE").asInstanceOf[String]

/**
  * Texture data is stored in equirectangular projection format.
  *
  * @type {string}
  */
inline def TEXTUREPROJECTION_EQUIRECT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREPROJECTION_EQUIRECT").asInstanceOf[String]

/**
  * Texture data is not stored a specific projection format.
  *
  * @type {string}
  */
inline def TEXTUREPROJECTION_NONE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREPROJECTION_NONE").asInstanceOf[String]

/**
  * Texture data is stored in octahedral projection format.
  *
  * @type {string}
  */
inline def TEXTUREPROJECTION_OCTAHEDRAL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTUREPROJECTION_OCTAHEDRAL").asInstanceOf[String]

/**
  * Texture is a default type.
  *
  * @type {string}
  */
inline def TEXTURETYPE_DEFAULT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTURETYPE_DEFAULT").asInstanceOf[String]

/**
  * Texture stores high dynamic range data in RGBE format.
  *
  * @type {string}
  */
inline def TEXTURETYPE_RGBE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTURETYPE_RGBE").asInstanceOf[String]

/**
  * Texture stores high dynamic range data in RGBM format.
  *
  * @type {string}
  */
inline def TEXTURETYPE_RGBM: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTURETYPE_RGBM").asInstanceOf[String]

/**
  * Texture stores high dynamic range data in RGBP encoding.
  *
  * @type {string}
  */
inline def TEXTURETYPE_RGBP: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTURETYPE_RGBP").asInstanceOf[String]

/**
  * Texture stores normalmap data swizzled in GGGR format. This is used for tangent space normal
  * maps. The R component is stored in alpha and G is stored in RGB. This packing can result in
  * higher quality when the texture data is compressed.
  *
  * @type {string}
  */
inline def TEXTURETYPE_SWIZZLEGGGR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TEXTURETYPE_SWIZZLEGGGR").asInstanceOf[String]

/**
  * ACES filmic tonemapping curve.
  *
  * @type {number}
  */
inline def TONEMAP_ACES: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TONEMAP_ACES").asInstanceOf[Double]

/**
  * ACES v2 filmic tonemapping curve.
  *
  * @type {number}
  */
inline def TONEMAP_ACES2: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TONEMAP_ACES2").asInstanceOf[Double]

/**
  * Filmic tonemapping curve.
  *
  * @type {number}
  */
inline def TONEMAP_FILMIC: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TONEMAP_FILMIC").asInstanceOf[Double]

/**
  * Hejl filmic tonemapping curve.
  *
  * @type {number}
  */
inline def TONEMAP_HEJL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TONEMAP_HEJL").asInstanceOf[Double]

/**
  * Linear tonemapping.
  *
  * @type {number}
  */
inline def TONEMAP_LINEAR: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TONEMAP_LINEAR").asInstanceOf[Double]

/**
  * Logs render actions created by the layer composition. Only executes when the
  * layer composition changes.
  *
  * @type {string}
  */
inline def TRACEID_RENDER_ACTION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_RENDER_ACTION").asInstanceOf[String]

inline def TRACEID_RENDER_FRAME: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_RENDER_FRAME").asInstanceOf[String]

/**
  * Logs basic information about generated render passes.
  *
  * @type {string}
  */
inline def TRACEID_RENDER_PASS: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_RENDER_PASS").asInstanceOf[String]

/**
  * Logs additional detail for render passes.
  *
  * @type {string}
  */
inline def TRACEID_RENDER_PASS_DETAIL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_RENDER_PASS_DETAIL").asInstanceOf[String]

/**
  * Logs the allocation of render targets.
  *
  * @type {string}
  */
inline def TRACEID_RENDER_TARGET_ALLOC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_RENDER_TARGET_ALLOC").asInstanceOf[String]

/**
  * Logs the creation of shaders.
  *
  * @type {string}
  */
inline def TRACEID_SHADER_ALLOC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_SHADER_ALLOC").asInstanceOf[String]

/**
  * Logs the compilation time of shaders.
  *
  * @type {string}
  */
inline def TRACEID_SHADER_COMPILE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_SHADER_COMPILE").asInstanceOf[String]

/**
  * Logs the allocation of textures.
  *
  * @type {string}
  */
inline def TRACEID_TEXTURE_ALLOC: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_TEXTURE_ALLOC").asInstanceOf[String]

/**
  * Logs the vram use by the index buffers.
  *
  * @type {string}
  */
inline def TRACEID_VRAM_IB: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_VRAM_IB").asInstanceOf[String]

/**
  * Logs the vram use by the textures.
  *
  * @type {string}
  */
inline def TRACEID_VRAM_TEXTURE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_VRAM_TEXTURE").asInstanceOf[String]

/**
  * Logs the vram use by the vertex buffers.
  *
  * @type {string}
  */
inline def TRACEID_VRAM_VB: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TRACEID_VRAM_VB").asInstanceOf[String]

/**
  * Floating point vertex element type.
  *
  * @type {number}
  */
inline def TYPE_FLOAT32: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_FLOAT32").asInstanceOf[Double]

/**
  * Signed short vertex element type.
  *
  * @type {number}
  */
inline def TYPE_INT16: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_INT16").asInstanceOf[Double]

/**
  * Signed integer vertex element type.
  *
  * @type {number}
  */
inline def TYPE_INT32: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_INT32").asInstanceOf[Double]

/**
  * Signed byte vertex element type.
  *
  * @type {number}
  */
inline def TYPE_INT8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_INT8").asInstanceOf[Double]

/**
  * Unsigned short vertex element type.
  *
  * @type {number}
  */
inline def TYPE_UINT16: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_UINT16").asInstanceOf[Double]

/**
  * Unsigned integer vertex element type.
  *
  * @type {number}
  */
inline def TYPE_UINT32: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_UINT32").asInstanceOf[Double]

/**
  * Unsigned byte vertex element type.
  *
  * @type {number}
  */
inline def TYPE_UINT8: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TYPE_UINT8").asInstanceOf[Double]

inline def UNIFORMTYPE_BOOL: `0` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_BOOL").asInstanceOf[`0`]

inline def UNIFORMTYPE_BVEC2: `9` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_BVEC2").asInstanceOf[`9`]

inline def UNIFORMTYPE_BVEC3: `10` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_BVEC3").asInstanceOf[`10`]

inline def UNIFORMTYPE_BVEC4: `11` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_BVEC4").asInstanceOf[`11`]

inline def UNIFORMTYPE_FLOAT: `2` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_FLOAT").asInstanceOf[`2`]

inline def UNIFORMTYPE_FLOATARRAY: `17` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_FLOATARRAY").asInstanceOf[`17`]

inline def UNIFORMTYPE_INT: `1` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_INT").asInstanceOf[`1`]

inline def UNIFORMTYPE_IVEC2: `6` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_IVEC2").asInstanceOf[`6`]

inline def UNIFORMTYPE_IVEC3: `7` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_IVEC3").asInstanceOf[`7`]

inline def UNIFORMTYPE_IVEC4: `8` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_IVEC4").asInstanceOf[`8`]

inline def UNIFORMTYPE_MAT2: `12` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_MAT2").asInstanceOf[`12`]

inline def UNIFORMTYPE_MAT3: `13` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_MAT3").asInstanceOf[`13`]

inline def UNIFORMTYPE_MAT4: `14` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_MAT4").asInstanceOf[`14`]

inline def UNIFORMTYPE_TEXTURE2D: `15` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_TEXTURE2D").asInstanceOf[`15`]

inline def UNIFORMTYPE_TEXTURE2D_SHADOW: `18` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_TEXTURE2D_SHADOW").asInstanceOf[`18`]

inline def UNIFORMTYPE_TEXTURE3D: `20` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_TEXTURE3D").asInstanceOf[`20`]

inline def UNIFORMTYPE_TEXTURECUBE: `16` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_TEXTURECUBE").asInstanceOf[`16`]

inline def UNIFORMTYPE_TEXTURECUBE_SHADOW: `19` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_TEXTURECUBE_SHADOW").asInstanceOf[`19`]

inline def UNIFORMTYPE_VEC2: `3` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_VEC2").asInstanceOf[`3`]

inline def UNIFORMTYPE_VEC2ARRAY: `21` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_VEC2ARRAY").asInstanceOf[`21`]

inline def UNIFORMTYPE_VEC3: `4` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_VEC3").asInstanceOf[`4`]

inline def UNIFORMTYPE_VEC3ARRAY: `22` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_VEC3ARRAY").asInstanceOf[`22`]

inline def UNIFORMTYPE_VEC4: `5` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_VEC4").asInstanceOf[`5`]

inline def UNIFORMTYPE_VEC4ARRAY: `23` = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORMTYPE_VEC4ARRAY").asInstanceOf[`23`]

inline def UNIFORM_BUFFER_DEFAULT_SLOT_NAME: default = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIFORM_BUFFER_DEFAULT_SLOT_NAME").asInstanceOf[default]

/**
  * Center of view.
  *
  * @type {number}
  */
inline def VIEW_CENTER: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("VIEW_CENTER").asInstanceOf[Double]

/**
  * Left of view. Only used in stereo rendering.
  *
  * @type {number}
  */
inline def VIEW_LEFT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("VIEW_LEFT").asInstanceOf[Double]

/**
  * Right of view. Only used in stereo rendering.
  *
  * @type {number}
  */
inline def VIEW_RIGHT: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("VIEW_RIGHT").asInstanceOf[Double]

/**
  * Float 32 - indicates that depth sensing preferred raw data format is Float 32.
  *
  * @type {string}
  */
inline def XRDEPTHSENSINGFORMAT_F32: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRDEPTHSENSINGFORMAT_F32").asInstanceOf[String]

/**
  * Luminance Alpha - indicates that depth sensing preferred raw data format is Luminance Alpha.
  * This format is guaranteed to be supported.
  *
  * @type {string}
  */
inline def XRDEPTHSENSINGFORMAT_L8A8: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRDEPTHSENSINGFORMAT_L8A8").asInstanceOf[String]

/**
  * CPU - indicates that depth sensing preferred usage is CPU. This usage path is guaranteed to be
  * supported.
  *
  * @type {string}
  */
inline def XRDEPTHSENSINGUSAGE_CPU: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRDEPTHSENSINGUSAGE_CPU").asInstanceOf[String]

/**
  * GPU - indicates that depth sensing preferred usage is GPU.
  *
  * @type {string}
  */
inline def XRDEPTHSENSINGUSAGE_GPU: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRDEPTHSENSINGUSAGE_GPU").asInstanceOf[String]

/**
  * Left - indicates that input source is meant to be held in left hand.
  *
  * @type {string}
  */
inline def XRHAND_LEFT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRHAND_LEFT").asInstanceOf[String]

/**
  * None - input source is not meant to be held in hands.
  *
  * @type {string}
  */
inline def XRHAND_NONE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRHAND_NONE").asInstanceOf[String]

/**
  * Right - indicates that input source is meant to be held in right hand.
  *
  * @type {string}
  */
inline def XRHAND_RIGHT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRHAND_RIGHT").asInstanceOf[String]

/**
  * Bounded Floor - represents a tracking space with its native origin at the floor, where the user
  * is expected to move within a pre-established boundary. Tracking in a bounded-floor reference
  * space is optimized for keeping the native origin and bounds geometry stable relative to the
  * user's environment.
  *
  * @type {string}
  */
inline def XRSPACE_BOUNDEDFLOOR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRSPACE_BOUNDEDFLOOR").asInstanceOf[String]

/**
  * Local - represents a tracking space with a native origin near the viewer at the time of
  * creation. The exact position and orientation will be initialized based on the conventions of the
  * underlying platform. When using this reference space the user is not expected to move beyond
  * their initial position much, if at all, and tracking is optimized for that purpose. For devices
  * with 6DoF tracking, local reference spaces should emphasize keeping the origin stable relative
  * to the user's environment.
  *
  * @type {string}
  */
inline def XRSPACE_LOCAL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRSPACE_LOCAL").asInstanceOf[String]

/**
  * Local Floor - represents a tracking space with a native origin at the floor in a safe position
  * for the user to stand. The y axis equals 0 at floor level, with the x and z position and
  * orientation initialized based on the conventions of the underlying platform. Floor level value
  * might be estimated by the underlying platform. When using this reference space, the user is not
  * expected to move beyond their initial position much, if at all, and tracking is optimized for
  * that purpose. For devices with 6DoF tracking, local-floor reference spaces should emphasize
  * keeping the origin stable relative to the user's environment.
  *
  * @type {string}
  */
inline def XRSPACE_LOCALFLOOR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRSPACE_LOCALFLOOR").asInstanceOf[String]

/**
  * Unbounded - represents a tracking space where the user is expected to move freely around their
  * environment, potentially even long distances from their starting point. Tracking in an unbounded
  * reference space is optimized for stability around the user's current position, and as such the
  * native origin may drift over time.
  *
  * @type {string}
  */
inline def XRSPACE_UNBOUNDED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRSPACE_UNBOUNDED").asInstanceOf[String]

/**
  * Viewer - always supported space with some basic tracking capabilities.
  *
  * @type {string}
  */
inline def XRSPACE_VIEWER: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRSPACE_VIEWER").asInstanceOf[String]

/**
  * Gaze - indicates the target ray will originate at the viewer and follow the direction it is
  * facing. This is commonly referred to as a "gaze input" device in the context of head-mounted
  * displays.
  *
  * @type {string}
  */
inline def XRTARGETRAY_GAZE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTARGETRAY_GAZE").asInstanceOf[String]

/**
  * Tracked Pointer - indicates that the target ray originates from either a handheld device or
  * other hand-tracking mechanism and represents that the user is using their hands or the held
  * device for pointing.
  *
  * @type {string}
  */
inline def XRTARGETRAY_POINTER: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTARGETRAY_POINTER").asInstanceOf[String]

/**
  * Screen - indicates that the input source was an interaction with the canvas element associated
  * with an inline session's output context, such as a mouse click or touch event.
  *
  * @type {string}
  */
inline def XRTARGETRAY_SCREEN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTARGETRAY_SCREEN").asInstanceOf[String]

/**
  * Mesh - indicates that the hit test results will be computed based on the meshes detected by the
  * underlying Augmented Reality system.
  *
  * @type {string}
  */
inline def XRTRACKABLE_MESH: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTRACKABLE_MESH").asInstanceOf[String]

/**
  * Plane - indicates that the hit test results will be computed based on the planes detected by the
  * underlying Augmented Reality system.
  *
  * @type {string}
  */
inline def XRTRACKABLE_PLANE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTRACKABLE_PLANE").asInstanceOf[String]

/**
  * Point - indicates that the hit test results will be computed based on the feature points
  * detected by the underlying Augmented Reality system.
  *
  * @type {string}
  */
inline def XRTRACKABLE_POINT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTRACKABLE_POINT").asInstanceOf[String]

/**
  * Immersive AR - session that provides exclusive access to VR/AR device that is intended to be
  * blended with real-world environment.
  *
  * @type {string}
  */
inline def XRTYPE_AR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTYPE_AR").asInstanceOf[String]

/**
  * Inline - always available type of session. It has limited features availability and is rendered
  * into HTML element.
  *
  * @type {string}
  */
inline def XRTYPE_INLINE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTYPE_INLINE").asInstanceOf[String]

/**
  * Immersive VR - session that provides exclusive access to VR device with best available tracking
  * features.
  *
  * @type {string}
  */
inline def XRTYPE_VR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("XRTYPE_VR").asInstanceOf[String]

/**
  * Callback used by {@link AppBase#configure} when configuration file is loaded and parsed (or
  * an error occurs).
  *
  * @callback ConfigureAppCallback
  * @param {string|null} err - The error message in the case where the loading or parsing fails.
  */
/**
  * Callback used by {@link AppBase#preload} when all assets (marked as 'preload') are loaded.
  *
  * @callback PreloadAppCallback
  */
inline def app: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("app").asInstanceOf[Any]
inline def app_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("app")(x.asInstanceOf[js.Any])

/**
  * Initialize the Basis transcode worker.
  *
  * @param {object} [config] - The Basis configuration.
  * @param {string} [config.glueUrl] - URL of glue script.
  * @param {string} [config.wasmUrl] - URL of the wasm module.
  * @param {string} [config.fallbackUrl] - URL of the fallback script to use when wasm modules
  * aren't supported.
  * @param {boolean} [config.lazyInit] - Wait for first transcode request before initializing Basis
  * (default is false). Otherwise initialize Basis immediately.
  * @param {number} [config.numWorkers] - Number of workers to use for transcoding (default is 1).
  * While it is possible to improve transcode performance using multiple workers, this will likely
  * depend on the runtime platform. For example, desktop will likely benefit from more workers
  * compared to mobile. Also keep in mind that it takes time to initialize workers and increasing
  * this value could impact application startup time. Make sure to test your application performance
  * on all target platforms when changing this parameter.
  * @param {boolean} [config.eagerWorkers] - Use eager workers (default is true). When enabled, jobs
  * are assigned to workers immediately, independent of their work load. This can result in
  * unbalanced workloads, however there is no delay between jobs. If disabled, new jobs are assigned
  * to workers only when their previous job has completed. This will result in balanced workloads
  * across workers, however workers can be idle for a short time between jobs.
  * @param {string[]} [config.rgbPriority] - Array of texture compression formats in priority order
  * for textures without alpha. The supported compressed formats are: 'astc', 'atc', 'dxt', 'etc1',
  * 'etc2', 'pvr'.
  * @param {string[]} [config.rgbaPriority] - Array of texture compression formats in priority order
  * for textures with alpha. The supported compressed formats are: 'astc', 'atc', 'dxt', 'etc1',
  * 'etc2', 'pvr'.
  * @param {number} [config.maxRetries] - Number of http load retry attempts. Defaults to 5.
  */
inline def basisInitialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("basisInitialize")().asInstanceOf[Unit]
inline def basisInitialize(config: EagerWorkers): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("basisInitialize")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def basisSetDownloadConfig(glueUrl: Any, wasmUrl: Any, fallbackUrl: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("basisSetDownloadConfig")(glueUrl.asInstanceOf[js.Any], wasmUrl.asInstanceOf[js.Any], fallbackUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Enqueue a blob of basis data for transcoding.
  *
  * @param {GraphicsDevice} device - The graphics device.
  * @param {string} url - URL of the basis file.
  * @param {object} data - The file data to transcode.
  * @param {Function} callback - Callback function to receive transcode result.
  * @param {object} [options] - Options structure
  * @param {boolean} [options.isGGGR] - Indicates this is a GGGR swizzled texture. Under some
  * circumstances the texture will be unswizzled during transcoding.
  * @param {boolean} [options.isKTX2] - Indicates the image is KTX2 format. Otherwise
  * basis format is assumed.
  * @returns {boolean} True if the basis worker was initialized and false otherwise.
  * @ignore
  */
inline def basisTranscode(device: typings.playcanvas.mod.GraphicsDevice, url: String, data: js.Object, callback: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("basisTranscode")(device.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def basisTranscode(
  device: typings.playcanvas.mod.GraphicsDevice,
  url: String,
  data: js.Object,
  callback: js.Function,
  options: IsGGGR
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("basisTranscode")(device.asInstanceOf[js.Any], url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def bindGroupNames: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("bindGroupNames").asInstanceOf[js.Array[String]]

/**
  * Generates normal information from the specified positions and triangle indices. See
  * {@link createMesh}.
  *
  * @param {number[]} positions - An array of 3-dimensional vertex positions.
  * @param {number[]} indices - An array of triangle indices.
  * @returns {number[]} An array of 3-dimensional vertex normals.
  * @example
  * var normals = pc.calculateNormals(positions, indices);
  * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
  * var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
  */
inline def calculateNormals(positions: js.Array[Double], indices: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateNormals")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

/**
  * Generates tangent information from the specified positions, normals, texture coordinates and
  * triangle indices. See {@link createMesh}.
  *
  * @param {number[]} positions - An array of 3-dimensional vertex positions.
  * @param {number[]} normals - An array of 3-dimensional vertex normals.
  * @param {number[]} uvs - An array of 2-dimensional vertex texture coordinates.
  * @param {number[]} indices - An array of triangle indices.
  * @returns {number[]} An array of 3-dimensional vertex tangents.
  * @example
  * var tangents = pc.calculateTangents(positions, normals, uvs, indices);
  * var mesh = pc.createMesh(positions, normals, tangents, uvs, indices);
  */
inline def calculateTangents(
  positions: js.Array[Double],
  normals: js.Array[Double],
  uvs: js.Array[Double],
  indices: js.Array[Double]
): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateTangents")(positions.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], uvs.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

/**
  * Creates a procedural box-shaped mesh.
  *
  * The size, shape and tesselation properties of the box can be controlled via function parameters.
  * By default, the function will create a box centered on the object space origin with a width,
  * length and height of 1.0 unit and 10 segments in either axis (50 triangles per face).
  *
  * Note that the box is created with UVs in the range of 0 to 1 on each face. Additionally, tangent
  * information is generated into the vertex buffer of the box's mesh.
  *
  * @param {GraphicsDevice} device - The graphics device used to manage the mesh.
  * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
  * @param {Vec3} [opts.halfExtents] - The half dimensions of the box in each axis (defaults to
  * [0.5, 0.5, 0.5]).
  * @param {number} [opts.widthSegments] - The number of divisions along the X axis of the box
  * (defaults to 1).
  * @param {number} [opts.lengthSegments] - The number of divisions along the Z axis of the box
  * (defaults to 1).
  * @param {number} [opts.heightSegments] - The number of divisions along the Y axis of the box
  * (defaults to 1).
  * @param {boolean} [opts.calculateTangents] - Generate tangent information (defaults to false).
  * @returns {Mesh} A new box-shaped mesh.
  */
inline def createBox(device: typings.playcanvas.mod.GraphicsDevice): typings.playcanvas.mod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(device.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Mesh]
inline def createBox(device: typings.playcanvas.mod.GraphicsDevice, opts: CalculateTangents): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(device.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]

/**
  * Creates a procedural capsule-shaped mesh.
  *
  * The size, shape and tesselation properties of the capsule can be controlled via function
  * parameters. By default, the function will create a capsule standing vertically centered on the
  * XZ-plane with a radius of 0.25, a height of 1.0, 1 height segment and 10 cap segments.
  *
  * Note that the capsule is created with UVs in the range of 0 to 1. Additionally, tangent
  * information is generated into the vertex buffer of the capsule's mesh.
  *
  * @param {GraphicsDevice} device - The graphics device used to manage the mesh.
  * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
  * @param {number} [opts.radius] - The radius of the tube forming the body of the capsule (defaults
  * to 0.3).
  * @param {number} [opts.height] - The length of the body of the capsule from tip to tip (defaults
  * to 1.0).
  * @param {number} [opts.heightSegments] - The number of divisions along the tubular length of the
  * capsule (defaults to 1).
  * @param {number} [opts.sides] - The number of divisions around the tubular body of the capsule
  * (defaults to 20).
  * @param {boolean} [opts.calculateTangents] - Generate tangent information (defaults to false).
  * @returns {Mesh} A new cylinder-shaped mesh.
  */
inline def createCapsule(device: typings.playcanvas.mod.GraphicsDevice): typings.playcanvas.mod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createCapsule")(device.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Mesh]
inline def createCapsule(device: typings.playcanvas.mod.GraphicsDevice, opts: Height): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createCapsule")(device.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]

/**
  * Creates a procedural cone-shaped mesh.
  *
  * The size, shape and tesselation properties of the cone can be controlled via function
  * parameters. By default, the function will create a cone standing vertically centered on the
  * XZ-plane with a base radius of 0.5, a height of 1.0, 5 height segments and 20 cap segments.
  *
  * Note that the cone is created with UVs in the range of 0 to 1. Additionally, tangent information
  * is generated into the vertex buffer of the cone's mesh.
  *
  * @param {GraphicsDevice} device - The graphics device used to manage the mesh.
  * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
  * @param {number} [opts.baseRadius] - The base radius of the cone (defaults to 0.5).
  * @param {number} [opts.peakRadius] - The peak radius of the cone (defaults to 0.0).
  * @param {number} [opts.height] - The length of the body of the cone (defaults to 1.0).
  * @param {number} [opts.heightSegments] - The number of divisions along the length of the cone
  * (defaults to 5).
  * @param {number} [opts.capSegments] - The number of divisions around the tubular body of the cone
  * (defaults to 18).
  * @param {boolean} [opts.calculateTangents] - Generate tangent information (defaults to false).
  * @returns {Mesh} A new cone-shaped mesh.
  */
inline def createCone(device: typings.playcanvas.mod.GraphicsDevice): typings.playcanvas.mod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createCone")(device.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Mesh]
inline def createCone(device: typings.playcanvas.mod.GraphicsDevice, opts: BaseRadius): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createCone")(device.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]

/**
  * Creates a procedural cylinder-shaped mesh.
  *
  * The size, shape and tesselation properties of the cylinder can be controlled via function
  * parameters. By default, the function will create a cylinder standing vertically centered on the
  * XZ-plane with a radius of 0.5, a height of 1.0, 1 height segment and 20 cap segments.
  *
  * Note that the cylinder is created with UVs in the range of 0 to 1. Additionally, tangent
  * information is generated into the vertex buffer of the cylinder's mesh.
  *
  * @param {GraphicsDevice} device - The graphics device used to manage the mesh.
  * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
  * @param {number} [opts.radius] - The radius of the tube forming the body of the cylinder (defaults to 0.5).
  * @param {number} [opts.height] - The length of the body of the cylinder (defaults to 1.0).
  * @param {number} [opts.heightSegments] - The number of divisions along the length of the cylinder (defaults to 5).
  * @param {number} [opts.capSegments] - The number of divisions around the tubular body of the cylinder (defaults to 20).
  * @param {boolean} [opts.calculateTangents] - Generate tangent information (defaults to false).
  * @returns {Mesh} A new cylinder-shaped mesh.
  */
inline def createCylinder(device: typings.playcanvas.mod.GraphicsDevice): typings.playcanvas.mod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createCylinder")(device.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Mesh]
inline def createCylinder(device: typings.playcanvas.mod.GraphicsDevice, opts: CapSegments): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createCylinder")(device.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]

/**
  * Creates a new mesh object from the supplied vertex information and topology.
  *
  * @param {GraphicsDevice} device - The graphics device used to manage the mesh.
  * @param {number[]} positions - An array of 3-dimensional vertex positions.
  * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
  * @param {number[]} [opts.normals] - An array of 3-dimensional vertex normals.
  * @param {number[]} [opts.tangents] - An array of 3-dimensional vertex tangents.
  * @param {number[]} [opts.colors] - An array of 4-dimensional vertex colors where each component
  * is an integer in the range 0 to 255.
  * @param {number[]} [opts.uvs] - An array of 2-dimensional vertex texture coordinates.
  * @param {number[]} [opts.uvs1] - Same as opts.uvs, but for additional UV set
  * @param {number[]} [opts.blendIndices] - An array of 4-dimensional bone indices where each
  * component is an integer in the range 0 to 255.
  * @param {number[]} [opts.blendWeights] - An array of 4-dimensional bone weights where each
  * component is in the range 0 to 1 and the sum of the weights should equal 1.
  * @param {number[]} [opts.indices] - An array of triangle indices.
  * @returns {Mesh} A new Mesh constructed from the supplied vertex and triangle data.
  * @example
  * // Create a simple, indexed triangle (with texture coordinates and vertex normals)
  * var mesh = pc.createMesh(graphicsDevice, [0, 0, 0, 1, 0, 0, 0, 1, 0], {
  *     normals: [0, 0, 1, 0, 0, 1, 0, 0, 1],
  *     uvs: [0, 0, 1, 0, 0, 1],
  *     indices: [0, 1, 2]
  * });
  */
inline def createMesh(device: typings.playcanvas.mod.GraphicsDevice, positions: js.Array[Double]): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createMesh")(device.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]
inline def createMesh(device: typings.playcanvas.mod.GraphicsDevice, positions: js.Array[Double], opts: BlendIndices): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createMesh")(device.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]

/**
  * Creates a procedural plane-shaped mesh.
  *
  * The size and tesselation properties of the plane can be controlled via function parameters. By
  * default, the function will create a plane centered on the object space origin with a width and
  * length of 1.0 and 5 segments in either axis (50 triangles). The normal vector of the plane is
  * aligned along the positive Y axis.
  *
  * Note that the plane is created with UVs in the range of 0 to 1. Additionally, tangent
  * information is generated into the vertex buffer of the plane's mesh.
  *
  * @param {GraphicsDevice} device - The graphics device used to manage the mesh.
  * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
  * @param {Vec2} [opts.halfExtents] - The half dimensions of the plane in the X and Z axes
  * (defaults to [0.5, 0.5]).
  * @param {number} [opts.widthSegments] - The number of divisions along the X axis of the plane
  * (defaults to 5).
  * @param {number} [opts.lengthSegments] - The number of divisions along the Z axis of the plane
  * (defaults to 5).
  * @param {boolean} [opts.calculateTangents] - Generate tangent information (defaults to false).
  * @returns {Mesh} A new plane-shaped mesh.
  */
inline def createPlane(device: typings.playcanvas.mod.GraphicsDevice): typings.playcanvas.mod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlane")(device.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Mesh]
inline def createPlane(device: typings.playcanvas.mod.GraphicsDevice, opts: HalfExtents): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlane")(device.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]

/**
  * Create and register a new {@link ScriptType}. It returns new class type (constructor function),
  * which is auto-registered to {@link ScriptRegistry} using its name. This is the main interface to
  * create Script Types, to define custom logic using JavaScript, that is used to create interaction
  * for entities.
  *
  * @param {string} name - Unique Name of a Script Type. If a Script Type with the same name has
  * already been registered and the new one has a `swap` method defined in its prototype, then it
  * will perform hot swapping of existing Script Instances on entities using this new Script Type.
  * Note: There is a reserved list of names that cannot be used, such as list below as well as some
  * starting from `_` (underscore): system, entity, create, destroy, swap, move, scripts, onEnable,
  * onDisable, onPostStateChange, has, on, off, fire, once, hasEvent.
  * @param {AppBase} [app] - Optional application handler, to choose which {@link ScriptRegistry}
  * to add a script to. By default it will use `Application.getApplication()` to get current
  * {@link AppBase}.
  * @returns {typeof ScriptType|null} A class type (constructor function) that inherits {@link ScriptType},
  * which the developer is meant to further extend by adding attributes and prototype methods.
  * Returns null if there was an error.
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
  * Turning.prototype.update = function (dt) {
  *     this.entity.rotate(0, this.speed * dt, 0);
  * };
  */
inline def createScript(name: String): (TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType])) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createScript")(name.asInstanceOf[js.Any]).asInstanceOf[(TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType])) | Null]
inline def createScript(name: String, app: typings.playcanvas.mod.AppBase): (TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType])) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createScript")(name.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[(TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType])) | Null]

/** @typedef {import('../../platform/graphics/graphics-device.js').GraphicsDevice} GraphicsDevice */
/**
  * Create a shader from named shader chunks.
  *
  * @param {GraphicsDevice} device - The graphics device.
  * @param {string} vsName - The vertex shader chunk name.
  * @param {string} fsName - The fragment shader chunk name.
  * @param {boolean} [useTransformFeedback] - Whether to use transform feedback. Defaults to false.
  * @returns {Shader} The newly created shader.
  */
inline def createShader(device: typings.playcanvas.mod.GraphicsDevice, vsName: String, fsName: String): typings.playcanvas.mod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("createShader")(device.asInstanceOf[js.Any], vsName.asInstanceOf[js.Any], fsName.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Shader]
inline def createShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  vsName: String,
  fsName: String,
  useTransformFeedback: Boolean
): typings.playcanvas.mod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("createShader")(device.asInstanceOf[js.Any], vsName.asInstanceOf[js.Any], fsName.asInstanceOf[js.Any], useTransformFeedback.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Shader]

/**
  * Create a shader from the supplied source code.
  *
  * @param {GraphicsDevice} device - The graphics device.
  * @param {string} vsCode - The vertex shader code.
  * @param {string} fsCode - The fragment shader code.
  * @param {string} uniqueName - Unique name for the shader.
  * @param {boolean} [useTransformFeedback] - Whether to use transform feedback. Defaults to false.
  * @param {string} [fragmentPreamble] - An optional 'preamble' string for the fragment shader. Defaults
  * to ''.
  * @returns {Shader} The newly created shader.
  */
inline def createShaderFromCode(device: typings.playcanvas.mod.GraphicsDevice, vsCode: String, fsCode: String, uniqueName: String): typings.playcanvas.mod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("createShaderFromCode")(device.asInstanceOf[js.Any], vsCode.asInstanceOf[js.Any], fsCode.asInstanceOf[js.Any], uniqueName.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Shader]
inline def createShaderFromCode(
  device: typings.playcanvas.mod.GraphicsDevice,
  vsCode: String,
  fsCode: String,
  uniqueName: String,
  useTransformFeedback: Boolean
): typings.playcanvas.mod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("createShaderFromCode")(device.asInstanceOf[js.Any], vsCode.asInstanceOf[js.Any], fsCode.asInstanceOf[js.Any], uniqueName.asInstanceOf[js.Any], useTransformFeedback.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Shader]
inline def createShaderFromCode(
  device: typings.playcanvas.mod.GraphicsDevice,
  vsCode: String,
  fsCode: String,
  uniqueName: String,
  useTransformFeedback: Boolean,
  fragmentPreamble: String
): typings.playcanvas.mod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("createShaderFromCode")(device.asInstanceOf[js.Any], vsCode.asInstanceOf[js.Any], fsCode.asInstanceOf[js.Any], uniqueName.asInstanceOf[js.Any], useTransformFeedback.asInstanceOf[js.Any], fragmentPreamble.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Shader]
inline def createShaderFromCode(
  device: typings.playcanvas.mod.GraphicsDevice,
  vsCode: String,
  fsCode: String,
  uniqueName: String,
  useTransformFeedback: Unit,
  fragmentPreamble: String
): typings.playcanvas.mod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("createShaderFromCode")(device.asInstanceOf[js.Any], vsCode.asInstanceOf[js.Any], fsCode.asInstanceOf[js.Any], uniqueName.asInstanceOf[js.Any], useTransformFeedback.asInstanceOf[js.Any], fragmentPreamble.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Shader]

/**
  * Creates a procedural sphere-shaped mesh.
  *
  * The size and tesselation properties of the sphere can be controlled via function parameters. By
  * default, the function will create a sphere centered on the object space origin with a radius of
  * 0.5 and 16 segments in both longitude and latitude.
  *
  * Note that the sphere is created with UVs in the range of 0 to 1. Additionally, tangent
  * information is generated into the vertex buffer of the sphere's mesh.
  *
  * @param {GraphicsDevice} device - The graphics device used to manage the mesh.
  * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
  * @param {number} [opts.radius] - The radius of the sphere (defaults to 0.5).
  * @param {number} [opts.latitudeBands] - The number of divisions along the latitudinal axis of the
  * sphere (defaults to 16).
  * @param {number} [opts.longitudeBands] - The number of divisions along the longitudinal axis of
  * the sphere (defaults to 16).
  * @param {boolean} [opts.calculateTangents] - Generate tangent information (defaults to false).
  * @returns {Mesh} A new sphere-shaped mesh.
  */
inline def createSphere(device: typings.playcanvas.mod.GraphicsDevice): typings.playcanvas.mod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createSphere")(device.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Mesh]
inline def createSphere(device: typings.playcanvas.mod.GraphicsDevice, opts: LatitudeBands): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createSphere")(device.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]

/**
  * Creates a &lt;style&gt; DOM element from a string that contains CSS.
  *
  * @param {string} cssString - A string that contains valid CSS.
  * @returns {Element} The style DOM element.
  * @example
  * var css = 'body {height: 100;}';
  * var style = pc.createStyle(css);
  * document.head.appendChild(style);
  */
inline def createStyle(cssString: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyle")(cssString.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Creates a procedural torus-shaped mesh.
  *
  * The size, shape and tesselation properties of the torus can be controlled via function
  * parameters. By default, the function will create a torus in the XZ-plane with a tube radius of
  * 0.2, a ring radius of 0.3, 20 segments and 30 sides.
  *
  * Note that the torus is created with UVs in the range of 0 to 1. Additionally, tangent
  * information is generated into the vertex buffer of the torus's mesh.
  *
  * @param {GraphicsDevice} device - The graphics device used to manage the mesh.
  * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
  * @param {number} [opts.tubeRadius] - The radius of the tube forming the body of the torus
  * (defaults to 0.2).
  * @param {number} [opts.ringRadius] - The radius from the centre of the torus to the centre of the
  * tube (defaults to 0.3).
  * @param {number} [opts.segments] - The number of radial divisions forming cross-sections of the
  * torus ring (defaults to 20).
  * @param {number} [opts.sides] - The number of divisions around the tubular body of the torus ring
  * (defaults to 30).
  * @param {boolean} [opts.calculateTangents] - Generate tangent information (defaults to false).
  * @returns {Mesh} A new torus-shaped mesh.
  */
inline def createTorus(device: typings.playcanvas.mod.GraphicsDevice): typings.playcanvas.mod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createTorus")(device.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Mesh]
inline def createTorus(device: typings.playcanvas.mod.GraphicsDevice, opts: RingRadius): typings.playcanvas.mod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createTorus")(device.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Mesh]

/**
  * Create a URI object from constituent parts.
  *
  * @param {object} options - Parts of the URI to build.
  * @param {string} [options.scheme] - The URI scheme (e.g. http).
  * @param {string} [options.authority] - The URI authority (e.g. `www.example.com`).
  * @param {string} [options.host] - Combination of scheme and authority (e.g. `http://www.example.com`).
  * @param {string} [options.path] - The URI path (e.g. /users/example).
  * @param {string} [options.hostpath] - Combination of scheme, authority and path (e.g. `http://www.example.com/users/example`).
  * @param {string} [options.query] - The query section, after the ?(e.g. `http://example.com?**key=value&another=123**`).
  * @param {string} [options.fragment] - The fragment section, after the # (e.g. `http://example.com#**fragment/data**`).
  * @returns {string} A URI string.
  * @ignore
  */
inline def createURI(options: Authority): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createURI")(options.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Draw a screen-space rectangle in a render target. Primarily meant to be used in custom post
  * effects based on {@link PostEffect}.
  *
  * @param {GraphicsDevice} device - The graphics device of the application.
  * @param {RenderTarget} target - The output render target.
  * @param {VertexBuffer} vertexBuffer - The vertex buffer for the rectangle mesh. When calling from
  * a custom post effect, pass the field {@link PostEffect#vertexBuffer}.
  * @param {Shader} shader - The shader to be used for drawing the rectangle. When calling from a
  * custom post effect, pass the field {@link PostEffect#shader}.
  * @param {Vec4} [rect] - The normalized screen-space position (rect.x, rect.y) and size (rect.z,
  * rect.w) of the rectangle. Default is [0, 0, 1, 1].
  */
inline def drawFullscreenQuad(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  vertexBuffer: typings.playcanvas.mod.VertexBuffer,
  shader: typings.playcanvas.mod.Shader
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawFullscreenQuad")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], vertexBuffer.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawFullscreenQuad(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  vertexBuffer: typings.playcanvas.mod.VertexBuffer,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawFullscreenQuad")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], vertexBuffer.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def drawQuadWithShader(device: typings.playcanvas.mod.GraphicsDevice, target: Unit, shader: typings.playcanvas.mod.Shader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Draws a screen-space quad using a specific shader. Mostly used by post-effects.
  *
  * @param {GraphicsDevice} device - The graphics device used to draw the quad.
  * @param {RenderTarget|undefined} target - The destination render target. If undefined, target is
  * the frame buffer.
  * @param {Shader} shader - The shader used for rendering the quad. Vertex shader should contain
  * `attribute vec2 vertex_position`.
  * @param {Vec4} [rect] - The viewport rectangle of the quad, in pixels. Defaults to fullscreen
  * (`0, 0, target.width, target.height`).
  * @param {Vec4} [scissorRect] - The scissor rectangle of the quad, in pixels. Defaults to
  * fullscreen (`0, 0, target.width, target.height`).
  * @param {boolean} [useBlend] - True to enable blending. Defaults to false, disabling blending.
  */
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawQuadWithShader(
  device: typings.playcanvas.mod.GraphicsDevice,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawQuadWithShader")(device.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Draws a texture in screen-space. Mostly used by post-effects.
  *
  * @param {GraphicsDevice} device - The graphics device used to draw the texture.
  * @param {Texture} texture - The source texture to be drawn. Accessible as `uniform sampler2D
  * source` in shader.
  * @param {RenderTarget} [target] - The destination render target. Defaults to the frame buffer.
  * @param {Shader} [shader] - The shader used for rendering the texture. Defaults to {@link GraphicsDevice#getCopyShader}.
  * @param {Vec4} [rect] - The viewport rectangle to use for the texture, in pixels. Defaults to
  * fullscreen (`0, 0, target.width, target.height`).
  * @param {Vec4} [scissorRect] - The scissor rectangle to use for the texture, in pixels. Defaults
  * to fullscreen (`0, 0, target.width, target.height`).
  * @param {boolean} [useBlend] - True to enable blending. Defaults to false, disabling blending.
  */
inline def drawTexture(device: typings.playcanvas.mod.GraphicsDevice, texture: typings.playcanvas.mod.Texture): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: Unit,
  rect: Unit,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: Unit,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: Unit,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: Unit,
  rect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: Unit,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: Unit,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: Unit,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: typings.playcanvas.mod.Shader
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: Unit,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: Unit,
  rect: Unit,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: Unit,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: Unit,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: Unit,
  rect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: Unit,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: Unit,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: Unit,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: Unit,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: Unit,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def drawTexture(
  device: typings.playcanvas.mod.GraphicsDevice,
  texture: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.RenderTarget,
  shader: typings.playcanvas.mod.Shader,
  rect: typings.playcanvas.mod.Vec4,
  scissorRect: typings.playcanvas.mod.Vec4,
  useBlend: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTexture")(device.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], target.asInstanceOf[js.Any], shader.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], scissorRect.asInstanceOf[js.Any], useBlend.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Merge the contents of two objects into a single object.
  *
  * @param {object} target - The target object of the merge.
  * @param {object} ex - The object that is merged with target.
  * @returns {object} The target object.
  * @example
  * var A = {
  *     a: function () {
  *         console.log(this.a);
  *     }
  * };
  * var B = {
  *     b: function () {
  *         console.log(this.b);
  *     }
  * };
  *
  * pc.extend(A, B);
  * A.a();
  * // logs "a"
  * A.b();
  * // logs "b"
  * @ignore
  */
inline def extend(target: js.Object, ex: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], ex.asInstanceOf[js.Any])).asInstanceOf[js.Object]

/** @typedef {import('./touch-device.js').TouchDevice} TouchDevice */
/**
  * Similar to {@link getTargetCoords} for the MouseEvents. This function takes a browser Touch
  * object and returns the coordinates of the touch relative to the target element.
  *
  * @param {globalThis.Touch} touch - The browser Touch object.
  * @returns {object} The coordinates of the touch relative to the touch.target element. In the
  * format {x, y}.
  */
inline def getTouchTargetCoords(
  touch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Touch */ Any
): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchTargetCoords")(touch.asInstanceOf[js.Any]).asInstanceOf[js.Object]

inline def http: typings.playcanvas.mod.Http_ = ^.asInstanceOf[js.Dynamic].selectDynamic("http").asInstanceOf[typings.playcanvas.mod.Http_]

inline def inherits(Self: Any, Super: Any): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(Self.asInstanceOf[js.Any], Super.asInstanceOf[js.Any])).asInstanceOf[Call]

/**
  * Return true if the Object is not undefined.
  *
  * @param {object} o - The Object to test.
  * @returns {boolean} True if the Object is not undefined.
  * @ignore
  */
inline def isDefined(o: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def makeArray(arr: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]

/**
  * Get current time in milliseconds. Use it to measure time difference. Reference time may differ
  * on different platforms.
  *
  * @returns {number} The time in milliseconds.
  * @ignore
  */
inline def now: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("now").asInstanceOf[Any]

inline def prefilterCubemap(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prefilterCubemap")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Register a existing class type as a Script Type to {@link ScriptRegistry}. Useful when defining
  * a ES6 script class that extends {@link ScriptType} (see example).
  *
  * @param {typeof ScriptType} script - The existing class type (constructor function) to be
  * registered as a Script Type. Class must extend {@link ScriptType} (see example). Please note: A
  * class created using {@link createScript} is auto-registered, and should therefore not be pass
  * into {@link registerScript} (which would result in swapping out all related script instances).
  * @param {string} [name] - Optional unique name of the Script Type. By default it will use the
  * same name as the existing class. If a Script Type with the same name has already been registered
  * and the new one has a `swap` method defined in its prototype, then it will perform hot swapping
  * of existing Script Instances on entities using this new Script Type. Note: There is a reserved
  * list of names that cannot be used, such as list below as well as some starting from `_`
  * (underscore): system, entity, create, destroy, swap, move, scripts, onEnable, onDisable,
  * onPostStateChange, has, on, off, fire, once, hasEvent.
  * @param {AppBase} [app] - Optional application handler, to choose which {@link ScriptRegistry}
  * to register the script type to. By default it will use `Application.getApplication()` to get
  * current {@link AppBase}.
  * @example
  * // define a ES6 script class
  * class PlayerController extends pc.ScriptType {
  *
  *     initialize() {
  *         // called once on initialize
  *     }
  *
  *     update(dt) {
  *         // called each tick
  *     }
  * }
  *
  * // register the class as a script
  * pc.registerScript(PlayerController);
  *
  * // declare script attributes (Must be after pc.registerScript())
  * PlayerController.attributes.add('attribute1', {type: 'number'});
  */
inline def registerScript(script: TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType])): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerScript")(script.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def registerScript(
  script: TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType]),
  name: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerScript")(script.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerScript(
  script: TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType]),
  name: String,
  app: typings.playcanvas.mod.AppBase
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerScript")(script.asInstanceOf[js.Any], name.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerScript(
  script: TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType]),
  name: Unit,
  app: typings.playcanvas.mod.AppBase
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerScript")(script.asInstanceOf[js.Any], name.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def reprojectTexture(
  source: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.Texture,
  options: Unit,
  args: Any*
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reprojectTexture")((scala.List(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
/**
  * This function reprojects textures between cubemap, equirectangular and octahedral formats. The
  * function can read and write textures with pixel data in RGBE, RGBM, linear and sRGB formats.
  * When specularPower is specified it will perform a phong-weighted convolution of the source (for
  * generating a gloss maps).
  *
  * @param {Texture} source - The source texture.
  * @param {Texture} target - The target texture.
  * @param {object} [options] - The options object.
  * @param {number} [options.specularPower] - Optional specular power. When specular power is
  * specified, the source is convolved by a phong-weighted kernel raised to the specified power.
  * Otherwise the function performs a standard resample.
  * @param {number} [options.numSamples] - Optional number of samples (default is 1024).
  * @param {number} [options.face] - Optional cubemap face to update (default is update all faces).
  * @param {string} [options.distribution] - Specify convolution distribution - 'none', 'lambert',
  * 'phong', 'ggx'. Default depends on specularPower.
  * @param {Vec4} [options.rect] - Optional viewport rectangle.
  * @param {number} [options.seamPixels] - Optional number of seam pixels to render
  */
inline def reprojectTexture(
  source: typings.playcanvas.mod.Texture,
  target: typings.playcanvas.mod.Texture,
  options: Distribution,
  args: Any*
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reprojectTexture")((scala.List(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]

inline def revision: $_CURRENT_SDK_REVISION = ^.asInstanceOf[js.Dynamic].selectDynamic("revision").asInstanceOf[$_CURRENT_SDK_REVISION]

/**
  * Map of engine semantics into location on device in range 0..15 (note - semantics mapping to the
  * same location cannot be used at the same time) organized in a way that ATTR0-ATTR7 do not
  * overlap with common important semantics.
  *
  * @type {object}
  * @ignore
  */
inline def semanticToLocation: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("semanticToLocation").asInstanceOf[js.Object]

inline def shFromCubemap(device: Any, source: Any, dontFlipX: Any): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shFromCubemap")(device.asInstanceOf[js.Any], source.asInstanceOf[js.Any], dontFlipX.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]

/**
  * @static
  * @readonly
  * @type {object}
  * @name shaderChunks
  * @description Object containing all default shader chunks used by shader generators.
  */
inline def shaderChunks: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("shaderChunks").asInstanceOf[js.Object]

/**
  * map of engine SHADOW__*** to a string representation
  *
  * @type {object}
  * @ignore
  */
inline def shadowTypeToString: js.Object = ^.asInstanceOf[js.Dynamic].selectDynamic("shadowTypeToString").asInstanceOf[js.Object]

/**
  * Extended typeof() function, returns the type of the object.
  *
  * @param {object} obj - The object to get the type of.
  * @returns {string} The type string: "null", "undefined", "number", "string", "boolean", "array", "object", "function", "date", "regexp" or "float32array".
  * @ignore
  */
inline def `type`(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(obj.asInstanceOf[js.Any]).asInstanceOf[String]

inline def typedArrayIndexFormats: js.Array[Uint8ArrayConstructor | Uint16ArrayConstructor | Uint32ArrayConstructor] = ^.asInstanceOf[js.Dynamic].selectDynamic("typedArrayIndexFormats").asInstanceOf[js.Array[Uint8ArrayConstructor | Uint16ArrayConstructor | Uint32ArrayConstructor]]

inline def typedArrayIndexFormatsByteSize: js.Array[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("typedArrayIndexFormatsByteSize").asInstanceOf[js.Array[Double]]

inline def typedArrayTypes: js.Array[
Int8ArrayConstructor | Uint8ArrayConstructor | Int16ArrayConstructor | Uint16ArrayConstructor | Int32ArrayConstructor | Uint32ArrayConstructor | Float32ArrayConstructor] = ^.asInstanceOf[js.Dynamic].selectDynamic("typedArrayTypes").asInstanceOf[js.Array[
Int8ArrayConstructor | Uint8ArrayConstructor | Int16ArrayConstructor | Uint16ArrayConstructor | Int32ArrayConstructor | Uint32ArrayConstructor | Float32ArrayConstructor]]

inline def typedArrayTypesByteSize: js.Array[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("typedArrayTypesByteSize").asInstanceOf[js.Array[Double]]

inline def uniformTypeToName: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("uniformTypeToName").asInstanceOf[js.Array[String]]

/**
  * @name pc
  * @namespace
  * @description Root namespace for the PlayCanvas Engine.
  */
inline def version: $_CURRENT_SDK_VERSION = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[$_CURRENT_SDK_VERSION]
