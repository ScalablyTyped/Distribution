package typings.playcanvas.pcNs

import typings.playcanvas.Anon_BaseRadius
import typings.playcanvas.Anon_CapSegments
import typings.playcanvas.Anon_Colors
import typings.playcanvas.Anon_HalfExtents
import typings.playcanvas.Anon_HalfExtentsHeightSegments
import typings.playcanvas.Anon_Height
import typings.playcanvas.Anon_Radius
import typings.playcanvas.Anon_RingRadius
import typings.std.Element
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc")
@js.native
object ^ extends js.Object {
  /**
    * @constant
    * @type Number
    * @name pc.ADDRESS_CLAMP_TO_EDGE
    * @description Clamps texture coordinate to the range 0 to 1.
    */
  val ADDRESS_CLAMP_TO_EDGE: Double = js.native
  /**
    * @constant
    * @type Number
    * @name pc.ADDRESS_MIRRORED_REPEAT
    * @description Texture coordinate to be set to the fractional part if the integer part is even; if the integer part is odd,
    * then the texture coordinate is set to 1 minus the fractional part.
    */
  val ADDRESS_MIRRORED_REPEAT: Double = js.native
  /**
    * @constant
    * @type Number
    * @name pc.ADDRESS_REPEAT
    * @description Ignores the integer part of texture coordinates, using only the fractional part.
    */
  val ADDRESS_REPEAT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.ASPECT_AUTO
    * @description Automatically set aspect ratio to current render target's width divided by height.
    */
  val ASPECT_AUTO: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.ASPECT_MANUAL
    * @description Use the manual aspect ratio value.
    */
  val ASPECT_MANUAL: Double = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_ANIMATION
    * @description Asset type name for animation.
    */
  val ASSET_ANIMATION: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_AUDIO
    * @description Asset type name for audio.
    */
  val ASSET_AUDIO: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_CSS
    * @description Asset type name for CSS.
    */
  val ASSET_CSS: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_CUBEMAP
    * @description Asset type name for cubemap.
    */
  val ASSET_CUBEMAP: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_HTML
    * @description Asset type name for HTML.
    */
  val ASSET_HTML: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_IMAGE
    * @description Asset type name for image.
    */
  val ASSET_IMAGE: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_JSON
    * @description Asset type name for json.
    */
  val ASSET_JSON: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_MATERIAL
    * @description Asset type name for material.
    */
  val ASSET_MATERIAL: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_MODEL
    * @description Asset type name for model.
    */
  val ASSET_MODEL: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_SCRIPT
    * @description Asset type name for script.
    */
  val ASSET_SCRIPT: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_SHADER
    * @description Asset type name for shader.
    */
  val ASSET_SHADER: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_TEXT
    * @description Asset type name for text.
    */
  val ASSET_TEXT: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ASSET_TEXTURE
    * @description Asset type name for texture.
    */
  val ASSET_TEXTURE: String = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BAKE_COLOR
    * @description Single color lightmap.
    */
  val BAKE_COLOR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BAKE_COLORDIR
    * @description Single color lightmap + dominant light direction (used for bump/specular).
    */
  val BAKE_COLORDIR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDEQUATION_ADD
    * @description Add the results of the source and destination fragment multiplies.
    */
  val BLENDEQUATION_ADD: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDEQUATION_MAX
    * @description Use the largest value. Check app.graphicsDevice.extBlendMinmax for support.
    */
  val BLENDEQUATION_MAX: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDEQUATION_MIN
    * @description Use the smallest value. Check app.graphicsDevice.extBlendMinmax for support.
    */
  val BLENDEQUATION_MIN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDEQUATION_REVERSE_SUBTRACT
    * @description Reverse and subtract the results of the source and destination fragment multiplies.
    */
  val BLENDEQUATION_REVERSE_SUBTRACT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDEQUATION_SUBTRACT
    * @description Subtract the results of the source and destination fragment multiplies.
    */
  val BLENDEQUATION_SUBTRACT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_DST_ALPHA
    * @description Multiply all fragment components by the alpha value of the destination fragment.
    */
  val BLENDMODE_DST_ALPHA: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_DST_COLOR
    * @description Multiply all fragment components by the components of the destination fragment.
    */
  val BLENDMODE_DST_COLOR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_ONE
    * @description Multiply all fragment components by one.
    */
  val BLENDMODE_ONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_ONE_MINUS_DST_ALPHA
    * @description Multiply all fragment components by one minus the alpha value of the destination fragment.
    */
  val BLENDMODE_ONE_MINUS_DST_ALPHA: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_ONE_MINUS_DST_COLOR
    * @description Multiply all fragment components by one minus the components of the destination fragment.
    */
  val BLENDMODE_ONE_MINUS_DST_COLOR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_ONE_MINUS_SRC_ALPHA
    * @description Multiply all fragment components by one minus the alpha value of the source fragment.
    */
  val BLENDMODE_ONE_MINUS_SRC_ALPHA: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_ONE_MINUS_SRC_COLOR
    * @description Multiply all fragment components by one minus the components of the source fragment.
    */
  val BLENDMODE_ONE_MINUS_SRC_COLOR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_SRC_ALPHA
    * @description Multiply all fragment components by the alpha value of the source fragment.
    */
  val BLENDMODE_SRC_ALPHA: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_SRC_ALPHA_SATURATE
    * @description Multiply all fragment components by the alpha value of the source fragment.
    */
  val BLENDMODE_SRC_ALPHA_SATURATE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_SRC_COLOR
    * @description Multiply all fragment components by the components of the source fragment.
    */
  val BLENDMODE_SRC_COLOR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLENDMODE_ZERO
    * @description Multiply all fragment components by zero.
    */
  val BLENDMODE_ZERO: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_ADDITIVE
    * @description Add the color of the source fragment to the destination fragment
    * and write the result to the frame buffer.
    */
  val BLEND_ADDITIVE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_ADDITIVEALPHA
    * @description Same as pc.BLEND_ADDITIVE except the source RGB is multiplied by the source alpha.
    */
  val BLEND_ADDITIVEALPHA: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_MAX
    * @description Maximum color. Check app.graphicsDevice.extBlendMinmax for support.
    */
  val BLEND_MAX: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_MIN
    * @description Minimum color. Check app.graphicsDevice.extBlendMinmax for support.
    */
  val BLEND_MIN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_MULTIPLICATIVE
    * @description Multiply the color of the source fragment by the color of the destination
    * fragment and write the result to the frame buffer.
    */
  val BLEND_MULTIPLICATIVE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_MULTIPLICATIVE2X
    * @description Multiplies colors and doubles the result
    */
  val BLEND_MULTIPLICATIVE2X: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_NONE
    * @description Disable blending.
    */
  val BLEND_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_NORMAL
    * @description Enable simple translucency for materials such as glass. This is
    * equivalent to enabling a source blend mode of pc.BLENDMODE_SRC_ALPHA and a destination
    * blend mode of pc.BLENDMODE_ONE_MINUS_SRC_ALPHA.
    */
  val BLEND_NORMAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_PREMULTIPLIED
    * @description Similar to pc.BLEND_NORMAL expect the source fragment is assumed to have
    * already been multiplied by the source alpha value.
    */
  val BLEND_PREMULTIPLIED: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_SCREEN
    * @description Softer version of additive
    */
  val BLEND_SCREEN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLEND_SUBTRACTIVE
    * @description Subtract the color of the source fragment from the destination fragment
    * and write the result to the frame buffer.
    */
  val BLEND_SUBTRACTIVE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLUR_BOX
    * @description Box filter.
    */
  val BLUR_BOX: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BLUR_GAUSSIAN
    * @description Gaussian filter. May look smoother than box, but requires more samples.
    */
  val BLUR_GAUSSIAN: Double = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.BODYTYPE_DYNAMIC
    * @description Rigid body is simulated according to applied forces.
    */
  val BODYTYPE_DYNAMIC: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.BODYTYPE_KINEMATIC
    * @description Rigid body has infinite mass and does not respond to forces but can still be moved by setting their velocity or position.
    */
  val BODYTYPE_KINEMATIC: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.BODYTYPE_STATIC
    * @description Rigid body has infinite mass and cannot move.
    */
  val BODYTYPE_STATIC: String = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BUFFER_DYNAMIC
    * @description The data store contents will be modified repeatedly and used many times.
    */
  val BUFFER_DYNAMIC: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BUFFER_GPUDYNAMIC
    * @description The data store contents will be modified repeatedly on the GPU and used many times. Optimal for transform feedback usage (WebGL2 only).
    */
  val BUFFER_GPUDYNAMIC: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BUFFER_STATIC
    * @description The data store contents will be modified once and used many times.
    */
  val BUFFER_STATIC: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BUFFER_STREAM
    * @description The data store contents will be modified once and used at most a few times.
    */
  val BUFFER_STREAM: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BUTTON_TRANSITION_MODE_SPRITE_CHANGE
    * @description Specifies different sprites for the hover, pressed and inactive states.
    */
  val BUTTON_TRANSITION_MODE_SPRITE_CHANGE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.BUTTON_TRANSITION_MODE_TINT
    * @description Specifies different color tints for the hover, pressed and inactive states.
    */
  val BUTTON_TRANSITION_MODE_TINT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CLEARFLAG_COLOR
    * @description Clear the color buffer.
    */
  val CLEARFLAG_COLOR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CLEARFLAG_DEPTH
    * @description Clear the depth buffer.
    */
  val CLEARFLAG_DEPTH: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CLEARFLAG_STENCIL
    * @description Clear the stencil buffer.
    */
  val CLEARFLAG_STENCIL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CUBEFACE_NEGX
    * @description The negative X face of a cubemap.
    */
  val CUBEFACE_NEGX: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CUBEFACE_NEGY
    * @description The negative Y face of a cubemap.
    */
  val CUBEFACE_NEGY: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CUBEFACE_NEGZ
    * @description The negative Z face of a cubemap.
    */
  val CUBEFACE_NEGZ: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CUBEFACE_POSX
    * @description The positive X face of a cubemap.
    */
  val CUBEFACE_POSX: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CUBEFACE_POSY
    * @description The positive Y face of a cubemap.
    */
  val CUBEFACE_POSY: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CUBEFACE_POSZ
    * @description The positive Z face of a cubemap.
    */
  val CUBEFACE_POSZ: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CUBEPROJ_BOX
    * @description The cube map is box-projected based on a world space axis-aligned bounding box.
    */
  val CUBEPROJ_BOX: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CUBEPROJ_NONE
    * @description The cube map is treated as if it is infinitely far away.
    */
  val CUBEPROJ_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CULLFACE_BACK
    * @description Triangles facing away from the view direction are culled.
    */
  val CULLFACE_BACK: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CULLFACE_FRONT
    * @description Triangles facing the view direction are culled.
    */
  val CULLFACE_FRONT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CULLFACE_FRONTANDBACK
    * @description Triangles are culled regardless of their orientation with respect to the view
    * direction. Note that point or line primitives are unaffected by this render state.
    */
  val CULLFACE_FRONTANDBACK: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CULLFACE_NONE
    * @description No triangles are culled.
    */
  val CULLFACE_NONE: Double = js.native
  /**
    * @deprecated
    * @constant
    * @type {Number}
    * @name pc.CURVE_CARDINAL
    * @description A cardinal spline interpolation scheme. This interpolation scheme is deprecated. Use CURVE_SPLINE instead.
    */
  val CURVE_CARDINAL: Double = js.native
  /**
    * @deprecated
    * @constant
    * @type {Number}
    * @name pc.CURVE_CATMULL
    * @description A Catmull-Rom spline interpolation scheme. This interpolation scheme is deprecated. Use CURVE_SPLINE instead.
    */
  val CURVE_CATMULL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CURVE_LINEAR
    * @description A linear interpolation scheme.
    */
  val CURVE_LINEAR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CURVE_SMOOTHSTEP
    * @description A smooth step interpolation scheme.
    */
  val CURVE_SMOOTHSTEP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CURVE_SPLINE
    * @description Cardinal spline interpolation scheme. For Catmull-Rom, specify curve tension 0.5.
    */
  val CURVE_SPLINE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.CURVE_STEP
    * @description A stepped interpolater, free from the shackles of blending.
    */
  val CURVE_STEP: Double = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.DISTANCE_EXPONENTIAL
    * @description Exponential distance model
    */
  val DISTANCE_EXPONENTIAL: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.DISTANCE_INVERSE
    * @description Inverse distance model
    */
  val DISTANCE_INVERSE: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.DISTANCE_LINEAR
    * @description Linear distance model
    */
  val DISTANCE_LINEAR: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ELEMENTTYPE_GROUP
    * @description A {@link pc.ElementComponent} that contains child {@link pc.ElementComponent}s.
    */
  val ELEMENTTYPE_GROUP: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ELEMENTTYPE_IMAGE
    * @description A {@link pc.ElementComponent} that displays an image.
    */
  val ELEMENTTYPE_IMAGE: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.ELEMENTTYPE_TEXT
    * @description A {@link pc.ElementComponent} that displays text.
    */
  val ELEMENTTYPE_TEXT: String = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.EMITTERSHAPE_BOX
    * @description Box shape parameterized by emitterExtents. Initial velocity is directed towards local Z axis.
    */
  val EMITTERSHAPE_BOX: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.EMITTERSHAPE_SPHERE
    * @description Sphere shape parameterized by emitterRadius. Initial velocity is directed outwards from the center.
    */
  val EMITTERSHAPE_SPHERE: Double = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_KEYDOWN
    * @description Name of event fired when a key is pressed
    */
  val EVENT_KEYDOWN: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_KEYUP
    * @description Name of event fired when a key is released
    */
  val EVENT_KEYUP: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_MOUSEDOWN
    * @description Name of event fired when a mouse button is pressed
    */
  val EVENT_MOUSEDOWN: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_MOUSEMOVE
    * @description Name of event fired when the mouse is moved
    */
  val EVENT_MOUSEMOVE: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_MOUSEUP
    * @description Name of event fired when a mouse button is released
    */
  val EVENT_MOUSEUP: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_MOUSEWHEEL
    * @description Name of event fired when the mouse wheel is rotated
    */
  val EVENT_MOUSEWHEEL: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_TOUCHCANCEL
    * @description Name of event fired when a touch point is interrupted in some way.
    * The exact reasons for cancelling a touch can vary from device to device.
    * For example, a modal alert pops up during the interaction; the touch point leaves the document area;
    * or there are more touch points than the device supports, in which case the earliest touch point is canceled.
    */
  val EVENT_TOUCHCANCEL: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_TOUCHEND
    * @description Name of event fired when touch ends. For example, a finger is lifted off the device.
    */
  val EVENT_TOUCHEND: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_TOUCHMOVE
    * @description Name of event fired when a touch moves.
    */
  val EVENT_TOUCHMOVE: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.EVENT_TOUCHSTART
    * @description Name of event fired when a new touch occurs. For example, a finger is placed on the device.
    */
  val EVENT_TOUCHSTART: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.FILLMODE_FILL_WINDOW
    * @description When resizing the window the size of the canvas will change to fill the window exactly.
    */
  val FILLMODE_FILL_WINDOW: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.FILLMODE_KEEP_ASPECT
    * @description When resizing the window the size of the canvas will change to fill the window as best it can, while maintaining the same aspect ratio.
    */
  val FILLMODE_KEEP_ASPECT: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.FILLMODE_NONE
    * @description When resizing the window the size of the canvas will not change.
    */
  val FILLMODE_NONE: String = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FILTER_LINEAR
    * @description Bilinear filtering.
    */
  val FILTER_LINEAR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FILTER_LINEAR_MIPMAP_LINEAR
    * @description Linearly interpolate both the mipmap levels and between texels.
    */
  val FILTER_LINEAR_MIPMAP_LINEAR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FILTER_LINEAR_MIPMAP_NEAREST
    * @description Use the nearest neighbor after linearly interpolating between mipmap levels.
    */
  val FILTER_LINEAR_MIPMAP_NEAREST: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FILTER_NEAREST
    * @description Point sample filtering.
    */
  val FILTER_NEAREST: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FILTER_NEAREST_MIPMAP_LINEAR
    * @description Linearly interpolate in the nearest mipmap level.
    */
  val FILTER_NEAREST_MIPMAP_LINEAR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FILTER_NEAREST_MIPMAP_NEAREST
    * @description Use the nearest neighbor in the nearest mipmap level.
    */
  val FILTER_NEAREST_MIPMAP_NEAREST: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FITTING_BOTH
    * @description Apply both STRETCH and SHRINK fitting logic where applicable.
    */
  val FITTING_BOTH: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FITTING_NONE
    * @description Disable all fitting logic.
    */
  val FITTING_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FITTING_SHRINK
    * @description Shrink child elements to fit the parent container
    */
  val FITTING_SHRINK: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FITTING_STRETCH
    * @description Stretch child elements to fit the parent container
    */
  val FITTING_STRETCH: Double = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.FOG_EXP
    * @description Fog rises according to an exponential curve controlled by a density value.
    */
  val FOG_EXP: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.FOG_EXP2
    * @description Fog rises according to an exponential curve controlled by a density value.
    */
  val FOG_EXP2: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.FOG_LINEAR
    * @description Fog rises linearly from zero to 1 between a start and end depth.
    */
  val FOG_LINEAR: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.FOG_NONE
    * @description No fog is applied to the scene.
    */
  val FOG_NONE: String = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FRESNEL_NONE
    * @description No Fresnel.
    */
  val FRESNEL_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FRESNEL_SCHLICK
    * @description Schlick's approximation of Fresnel.
    */
  val FRESNEL_SCHLICK: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FUNC_ALWAYS
    * @description Always pass.
    */
  val FUNC_ALWAYS: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FUNC_EQUAL
    * @description Pass if (ref & mask) == (stencil & mask).
    */
  val FUNC_EQUAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FUNC_GREATER
    * @description Pass if (ref & mask) > (stencil & mask).
    */
  val FUNC_GREATER: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FUNC_GREATEREQUAL
    * @description Pass if (ref & mask) >= (stencil & mask).
    */
  val FUNC_GREATEREQUAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FUNC_LESS
    * @description Pass if (ref & mask) < (stencil & mask).
    */
  val FUNC_LESS: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FUNC_LESSEQUAL
    * @description Pass if (ref & mask) <= (stencil & mask).
    */
  val FUNC_LESSEQUAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FUNC_NEVER
    * @description Never pass.
    */
  val FUNC_NEVER: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.FUNC_NOTEQUAL
    * @description Pass if (ref & mask) != (stencil & mask).
    */
  val FUNC_NOTEQUAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.GAMMA_NONE
    * @description No gamma correction.
    */
  val GAMMA_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.GAMMA_SRGB
    * @description Apply sRGB gamma correction.
    */
  val GAMMA_SRGB: Double = js.native
  /**
    * @deprecated
    * @constant
    * @type {Number}
    * @name pc.GAMMA_SRGBFAST
    * @description Apply sRGB (fast) gamma correction.
    */
  val GAMMA_SRGBFAST: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.GAMMA_SRGBHDR
    * @description Apply sRGB (HDR) gamma correction.
    */
  val GAMMA_SRGBHDR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.INDEXFORMAT_UINT16
    * @description 16-bit unsigned vertex indices.
    */
  val INDEXFORMAT_UINT16: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.INDEXFORMAT_UINT32
    * @description 32-bit unsigned vertex indices.
    */
  val INDEXFORMAT_UINT32: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.INDEXFORMAT_UINT8
    * @description 8-bit unsigned vertex indices.
    */
  val INDEXFORMAT_UINT8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_0
    */
  val KEY_0: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_1
    */
  val KEY_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_2
    */
  val KEY_2: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_3
    */
  val KEY_3: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_4
    */
  val KEY_4: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_5
    */
  val KEY_5: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_6
    */
  val KEY_6: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_7
    */
  val KEY_7: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_8
    */
  val KEY_8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_9
    */
  val KEY_9: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_A
    */
  val KEY_A: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_ADD
    */
  val KEY_ADD: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_ALT
    */
  val KEY_ALT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_B
    */
  val KEY_B: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_BACKSPACE
    */
  val KEY_BACKSPACE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_BACK_SLASH
    */
  val KEY_BACK_SLASH: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_C
    */
  val KEY_C: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_CAPS_LOCK
    */
  val KEY_CAPS_LOCK: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_CLOSE_BRACKET
    */
  val KEY_CLOSE_BRACKET: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_COMMA
    */
  val KEY_COMMA: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_CONTEXT_MENU
    */
  val KEY_CONTEXT_MENU: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_CONTROL
    */
  val KEY_CONTROL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_D
    */
  val KEY_D: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_DECIMAL
    */
  val KEY_DECIMAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_DELETE
    */
  val KEY_DELETE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_DIVIDE
    */
  val KEY_DIVIDE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_DOWN
    */
  val KEY_DOWN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_E
    */
  val KEY_E: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_END
    */
  val KEY_END: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_ENTER
    */
  val KEY_ENTER: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_EQUAL
    */
  val KEY_EQUAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_ESCAPE
    */
  val KEY_ESCAPE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F
    */
  val KEY_F: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F1
    */
  val KEY_F1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F10
    */
  val KEY_F10: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F11
    */
  val KEY_F11: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F12
    */
  val KEY_F12: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F2
    */
  val KEY_F2: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F3
    */
  val KEY_F3: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F4
    */
  val KEY_F4: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F5
    */
  val KEY_F5: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F6
    */
  val KEY_F6: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F7
    */
  val KEY_F7: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F8
    */
  val KEY_F8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_F9
    */
  val KEY_F9: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_G
    */
  val KEY_G: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_H
    */
  val KEY_H: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_HOME
    */
  val KEY_HOME: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_I
    */
  val KEY_I: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_INSERT
    */
  val KEY_INSERT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_J
    */
  val KEY_J: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_K
    */
  val KEY_K: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_L
    */
  val KEY_L: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_LEFT
    */
  val KEY_LEFT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_M
    */
  val KEY_M: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_META
    */
  val KEY_META: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_MULTIPLY
    */
  val KEY_MULTIPLY: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_N
    */
  val KEY_N: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_0
    */
  val KEY_NUMPAD_0: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_1
    */
  val KEY_NUMPAD_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_2
    */
  val KEY_NUMPAD_2: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_3
    */
  val KEY_NUMPAD_3: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_4
    */
  val KEY_NUMPAD_4: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_5
    */
  val KEY_NUMPAD_5: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_6
    */
  val KEY_NUMPAD_6: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_7
    */
  val KEY_NUMPAD_7: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_8
    */
  val KEY_NUMPAD_8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_NUMPAD_9
    */
  val KEY_NUMPAD_9: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_O
    */
  val KEY_O: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_OPEN_BRACKET
    */
  val KEY_OPEN_BRACKET: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_P
    */
  val KEY_P: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_PAGE_DOWN
    */
  val KEY_PAGE_DOWN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_PAGE_UP
    */
  val KEY_PAGE_UP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_PAUSE
    */
  val KEY_PAUSE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_PERIOD
    */
  val KEY_PERIOD: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_PRINT_SCREEN
    */
  val KEY_PRINT_SCREEN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_Q
    */
  val KEY_Q: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_R
    */
  val KEY_R: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_RETURN
    */
  val KEY_RETURN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_RIGHT
    */
  val KEY_RIGHT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_S
    */
  val KEY_S: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_SEMICOLON
    */
  val KEY_SEMICOLON: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_SEPARATOR
    */
  val KEY_SEPARATOR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_SHIFT
    */
  val KEY_SHIFT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_SLASH
    */
  val KEY_SLASH: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_SPACE
    */
  val KEY_SPACE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_SUBTRACT
    */
  val KEY_SUBTRACT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_T
    */
  val KEY_T: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_TAB
    */
  val KEY_TAB: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_U
    */
  val KEY_U: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_UP
    */
  val KEY_UP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_V
    */
  val KEY_V: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_W
    */
  val KEY_W: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_WINDOWS
    */
  val KEY_WINDOWS: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_X
    */
  val KEY_X: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_Y
    */
  val KEY_Y: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.KEY_Z
    */
  val KEY_Z: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LAYERID_DEPTH
    * @description The depth layer.
    */
  val LAYERID_DEPTH: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LAYERID_IMMEDIATE
    * @description The immediate layer.
    */
  val LAYERID_IMMEDIATE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LAYERID_SKYBOX
    * @description The skybox layer.
    */
  val LAYERID_SKYBOX: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LAYERID_UI
    * @description The UI layer.
    */
  val LAYERID_UI: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LAYERID_WORLD
    * @description The world layer.
    */
  val LAYERID_WORLD: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LIGHTFALLOFF_INVERSESQUARED
    * @description Inverse squared distance falloff model for light attenuation.
    */
  val LIGHTFALLOFF_INVERSESQUARED: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LIGHTFALLOFF_LINEAR
    * @description Linear distance falloff model for light attenuation.
    */
  val LIGHTFALLOFF_LINEAR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LIGHTTYPE_DIRECTIONAL
    * @description Directional (global) light source.
    */
  val LIGHTTYPE_DIRECTIONAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LIGHTTYPE_POINT
    * @description Point (local) light source.
    */
  val LIGHTTYPE_POINT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.LIGHTTYPE_SPOT
    * @description Spot (local) light source.
    */
  val LIGHTTYPE_SPOT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.MOUSEBUTTON_LEFT
    * @description The left mouse button
    */
  val MOUSEBUTTON_LEFT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.MOUSEBUTTON_MIDDLE
    * @description The middle mouse button
    */
  val MOUSEBUTTON_MIDDLE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.MOUSEBUTTON_NONE
    * @description No mouse buttons pressed
    */
  val MOUSEBUTTON_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.MOUSEBUTTON_RIGHT
    * @description The right mouse button
    */
  val MOUSEBUTTON_RIGHT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.ORIENTATION_HORIZONTAL
    * @description Horizontal orientation.
    */
  val ORIENTATION_HORIZONTAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.ORIENTATION_VERTICAL
    * @description Vertical orientation.
    */
  val ORIENTATION_VERTICAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_1
    * @description Index for pad 1
    */
  val PAD_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_2
    * @description Index for pad 2
    */
  val PAD_2: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_3
    * @description Index for pad 3
    */
  val PAD_3: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_4
    * @description Index for pad 4
    */
  val PAD_4: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_DOWN
    * @description Direction pad down
    */
  val PAD_DOWN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_FACE_1
    * @description The first face button, from bottom going clockwise
    */
  val PAD_FACE_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_FACE_2
    * @description The second face button, from bottom going clockwise
    */
  val PAD_FACE_2: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_FACE_3
    * @description The third face button, from bottom going clockwise
    */
  val PAD_FACE_3: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_FACE_4
    * @description The fourth face button, from bottom going clockwise
    */
  val PAD_FACE_4: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_LEFT
    * @description Direction pad left
    */
  val PAD_LEFT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_L_SHOULDER_1
    * @description The first shoulder button on the left
    */
  val PAD_L_SHOULDER_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_L_SHOULDER_2
    * @description The second shoulder button on the left
    */
  val PAD_L_SHOULDER_2: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_L_STICK_BUTTON
    * @description The button when depressing the left analogue stick
    */
  val PAD_L_STICK_BUTTON: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_L_STICK_X
    * @description Horizontal axis on the left analogue stick
    */
  val PAD_L_STICK_X: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_L_STICK_Y
    * @description Vertical axis on the left analogue stick
    */
  val PAD_L_STICK_Y: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_RIGHT
    * @description Direction pad right
    */
  val PAD_RIGHT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_R_SHOULDER_1
    * @description The first shoulder button on the right
    */
  val PAD_R_SHOULDER_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_R_SHOULDER_2
    * @description The second shoulder button on the right
    */
  val PAD_R_SHOULDER_2: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_R_STICK_BUTTON
    * @description The button when depressing the right analogue stick
    */
  val PAD_R_STICK_BUTTON: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_R_STICK_X
    * @description Horizontal axis on the right analogue stick
    */
  val PAD_R_STICK_X: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_R_STICK_Y
    * @description Vertical axis on the right analogue stick
    */
  val PAD_R_STICK_Y: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_SELECT
    * @description The select button
    */
  val PAD_SELECT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_START
    * @description The start button
    */
  val PAD_START: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_UP
    * @description Direction pad up
    */
  val PAD_UP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PAD_VENDOR
    * @description Vendor specific button
    */
  val PAD_VENDOR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PARTICLEORIENTATION_EMITTER
    * @description Similar to previous, but the normal is affected by emitter(entity) transformation.
    */
  val PARTICLEORIENTATION_EMITTER: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PARTICLEORIENTATION_SCREEN
    * @description Particles are facing camera.
    */
  val PARTICLEORIENTATION_SCREEN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PARTICLEORIENTATION_WORLD
    * @description User defines world space normal (particleNormal) to set planes orientation.
    */
  val PARTICLEORIENTATION_WORLD: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PARTICLESORT_DISTANCE
    * @description Sorting based on distance to the camera. CPU only.
    */
  val PARTICLESORT_DISTANCE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PARTICLESORT_NEWER_FIRST
    * @description Newer particles are drawn first. CPU only.
    */
  val PARTICLESORT_NEWER_FIRST: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PARTICLESORT_NONE
    * @description No sorting, particles are drawn in arbitary order. Can be simulated on GPU.
    */
  val PARTICLESORT_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PARTICLESORT_OLDER_FIRST
    * @description Older particles are drawn first. CPU only.
    */
  val PARTICLESORT_OLDER_FIRST: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_111110F
    * @description A floating-point color-only format with 11 bits for red and green channels, and 10 bits for the blue channel (WebGL2 only).
    */
  val PIXELFORMAT_111110F: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_A8
    * @description 8-bit alpha.
    */
  val PIXELFORMAT_A8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_DEPTH
    * @description A readable depth buffer format
    */
  val PIXELFORMAT_DEPTH: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_DEPTHSTENCIL
    * @description A readable depth/stencil buffer format (WebGL2 only).
    */
  val PIXELFORMAT_DEPTHSTENCIL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_DXT1
    * @description Block compressed format, storing 16 input pixels in 64 bits of output, consisting of two 16-bit RGB 5:6:5 color values and a 4x4 two bit lookup table.
    */
  val PIXELFORMAT_DXT1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_DXT3
    * @description Block compressed format, storing 16 input pixels (corresponding to a 4x4 pixel block) into 128 bits of output, consisting of 64 bits of alpha channel data (4 bits for each pixel) followed by 64 bits of color data, encoded the same way as DXT1.
    */
  val PIXELFORMAT_DXT3: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_DXT5
    * @description Block compressed format, storing 16 input pixels into 128 bits of output, consisting of 64 bits of alpha channel data (two 8 bit alpha values and a 4x4 3 bit lookup table) followed by 64 bits of color data (encoded the same way as DXT1).
    */
  val PIXELFORMAT_DXT5: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_ETC1
    * @description ETC1 compressed format.
    */
  val PIXELFORMAT_ETC1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_ETC2_RGB
    * @description ETC2 (RGB) compressed format.
    */
  val PIXELFORMAT_ETC2_RGB: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_ETC2_RGBA
    * @description ETC2 (RGBA) compressed format.
    */
  val PIXELFORMAT_ETC2_RGBA: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_L8
    * @description 8-bit luminance.
    */
  val PIXELFORMAT_L8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_L8_A8
    * @description 8-bit luminance with 8-bit alpha.
    */
  val PIXELFORMAT_L8_A8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_PVRTC_2BPP_RGBA_1
    * @description PVRTC (2BPP RGBA) compressed format.
    */
  val PIXELFORMAT_PVRTC_2BPP_RGBA_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_PVRTC_2BPP_RGB_1
    * @description PVRTC (2BPP RGB) compressed format.
    */
  val PIXELFORMAT_PVRTC_2BPP_RGB_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_PVRTC_4BPP_RGBA_1
    * @description PVRTC (4BPP RGBA) compressed format.
    */
  val PIXELFORMAT_PVRTC_4BPP_RGBA_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_PVRTC_4BPP_RGB_1
    * @description PVRTC (4BPP RGB) compressed format.
    */
  val PIXELFORMAT_PVRTC_4BPP_RGB_1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_R32F
    * @description 32-bit floating point single channel format (WebGL2 only).
    */
  val PIXELFORMAT_R32F: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_R4_G4_B4_A4
    * @description 16-bit RGBA (4-bits for red channel, 4 for green, 4 for blue with 4-bit alpha).
    */
  val PIXELFORMAT_R4_G4_B4_A4: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_R5_G5_B5_A1
    * @description 16-bit RGBA (5-bits for red channel, 5 for green, 5 for blue with 1-bit alpha).
    */
  val PIXELFORMAT_R5_G5_B5_A1: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_R5_G6_B5
    * @description 16-bit RGB (5-bits for red channel, 6 for green and 5 for blue).
    */
  val PIXELFORMAT_R5_G6_B5: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_R8_G8_B8
    * @description 24-bit RGB (8-bits for red channel, 8 for green and 8 for blue).
    */
  val PIXELFORMAT_R8_G8_B8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_R8_G8_B8_A8
    * @description 32-bit RGBA (8-bits for red channel, 8 for green, 8 for blue with 8-bit alpha).
    */
  val PIXELFORMAT_R8_G8_B8_A8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_RGB16F
    * @description 16-bit floating point RGB (16-bit float for each red, green and blue channels).
    */
  val PIXELFORMAT_RGB16F: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_RGB32F
    * @description 32-bit floating point RGB (32-bit float for each red, green and blue channels).
    */
  val PIXELFORMAT_RGB32F: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_RGBA16F
    * @description 16-bit floating point RGBA (16-bit float for each red, green, blue and alpha channels).
    */
  val PIXELFORMAT_RGBA16F: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_RGBA32F
    * @description 32-bit floating point RGBA (32-bit float for each red, green, blue and alpha channels).
    */
  val PIXELFORMAT_RGBA32F: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_SRGB
    * @description Color-only sRGB format (WebGL2 only).
    */
  val PIXELFORMAT_SRGB: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PIXELFORMAT_SRGBA
    * @description Color sRGB format with additional alpha channel (WebGL2 only).
    */
  val PIXELFORMAT_SRGBA: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PRIMITIVE_LINELOOP
    * @description List of points that are linked sequentially by line segments, with a closing line segment between the last and first points.
    */
  val PRIMITIVE_LINELOOP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PRIMITIVE_LINES
    * @description Discrete list of line segments.
    */
  val PRIMITIVE_LINES: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PRIMITIVE_LINESTRIP
    * @description List of points that are linked sequentially by line segments.
    */
  val PRIMITIVE_LINESTRIP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PRIMITIVE_POINTS
    * @description List of distinct points.
    */
  val PRIMITIVE_POINTS: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PRIMITIVE_TRIANGLES
    * @description Discrete list of triangles.
    */
  val PRIMITIVE_TRIANGLES: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PRIMITIVE_TRIFAN
    * @description Connected fan of triangles where the first vertex forms triangles with the following pairs of vertices.
    */
  val PRIMITIVE_TRIFAN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PRIMITIVE_TRISTRIP
    * @description Connected strip of triangles where a specified vertex forms a triangle using the previous two.
    */
  val PRIMITIVE_TRISTRIP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PROJECTION_ORTHOGRAPHIC
    * @description An orthographic camera projection where the frustum shape is essentially a cuboid.
    */
  val PROJECTION_ORTHOGRAPHIC: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.PROJECTION_PERSPECTIVE
    * @description A perspective camera projection where the frustum shape is essentially pyramidal.
    */
  val PROJECTION_PERSPECTIVE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.RENDERSTYLE_POINTS
    * @description Render mesh instance as points.
    */
  val RENDERSTYLE_POINTS: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.RENDERSTYLE_SOLID
    * @description Render mesh instance as solid geometry.
    */
  val RENDERSTYLE_SOLID: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.RENDERSTYLE_WIREFRAME
    * @description Render mesh instance as wireframe.
    */
  val RENDERSTYLE_WIREFRAME: Double = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.RESOLUTION_AUTO
    * @description When the canvas is resized the resolution of the canvas will change to match the size of the canvas.
    */
  val RESOLUTION_AUTO: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.RESOLUTION_FIXED
    * @description When the canvas is resized the resolution of the canvas will remain at the same value and the output will just be scaled to fit the canvas.
    */
  val RESOLUTION_FIXED: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SCALEMODE_BLEND
    * @description Scale the {@link pc.ScreenComponent} when the application's resolution is different than the ScreenComponent's referenceResolution.
    */
  val SCALEMODE_BLEND: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SCALEMODE_NONE
    * @description Always use the application's resolution as the resolution for the {@link pc.ScreenComponent}.
    */
  val SCALEMODE_NONE: String = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SCROLLBAR_VISIBILITY_SHOW_ALWAYS
    * @description The scrollbar will be visible all the time.
    */
  val SCROLLBAR_VISIBILITY_SHOW_ALWAYS: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SCROLLBAR_VISIBILITY_SHOW_WHEN_REQUIRED
    * @description The scrollbar will be visible only when content exceeds the size of the viewport.
    */
  val SCROLLBAR_VISIBILITY_SHOW_WHEN_REQUIRED: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SCROLL_MODE_BOUNCE
    * @description Content scrolls past its bounds and then gently bounces back.
    */
  val SCROLL_MODE_BOUNCE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SCROLL_MODE_CLAMP
    * @description Content does not scroll any further than its bounds.
    */
  val SCROLL_MODE_CLAMP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SCROLL_MODE_INFINITE
    * @description Content can scroll forever.
    */
  val SCROLL_MODE_INFINITE: Double = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR0
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR0: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR1
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR1: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR10
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR10: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR11
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR11: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR12
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR12: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR13
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR13: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR14
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR14: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR15
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR15: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR2
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR2: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR3
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR3: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR4
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR4: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR5
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR5: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR6
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR6: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR7
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR7: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR8
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR8: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_ATTR9
    * @description Vertex attribute with a user defined semantic.
    */
  val SEMANTIC_ATTR9: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_BLENDINDICES
    * @description Vertex attribute to be treated as skin blend indices.
    */
  val SEMANTIC_BLENDINDICES: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_BLENDWEIGHT
    * @description Vertex attribute to be treated as skin blend weights.
    */
  val SEMANTIC_BLENDWEIGHT: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_COLOR
    * @description Vertex attribute to be treated as a color.
    */
  val SEMANTIC_COLOR: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_NORMAL
    * @description Vertex attribute to be treated as a normal.
    */
  val SEMANTIC_NORMAL: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_POSITION
    * @description Vertex attribute to be treated as a position.
    */
  val SEMANTIC_POSITION: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TANGENT
    * @description Vertex attribute to be treated as a tangent.
    */
  val SEMANTIC_TANGENT: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TEXCOORD0
    * @description Vertex attribute to be treated as a texture coordinate (set 0).
    */
  val SEMANTIC_TEXCOORD0: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TEXCOORD1
    * @description Vertex attribute to be treated as a texture coordinate (set 1).
    */
  val SEMANTIC_TEXCOORD1: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TEXCOORD2
    * @description Vertex attribute to be treated as a texture coordinate (set 2).
    */
  val SEMANTIC_TEXCOORD2: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TEXCOORD3
    * @description Vertex attribute to be treated as a texture coordinate (set 3).
    */
  val SEMANTIC_TEXCOORD3: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TEXCOORD4
    * @description Vertex attribute to be treated as a texture coordinate (set 4).
    */
  val SEMANTIC_TEXCOORD4: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TEXCOORD5
    * @description Vertex attribute to be treated as a texture coordinate (set 5).
    */
  val SEMANTIC_TEXCOORD5: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TEXCOORD6
    * @description Vertex attribute to be treated as a texture coordinate (set 6).
    */
  val SEMANTIC_TEXCOORD6: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SEMANTIC_TEXCOORD7
    * @description Vertex attribute to be treated as a texture coordinate (set 7).
    */
  val SEMANTIC_TEXCOORD7: String = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SHADER_DEPTH
    * @description Render RGBA-encoded depth value.
    */
  val SHADER_DEPTH: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SHADER_FORWARD
    * @description Render shaded materials with gamma correction and tonemapping.
    */
  val SHADER_FORWARD: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SHADER_FORWARDHDR
    * @description Render shaded materials without gamma correction and tonemapping.
    */
  val SHADER_FORWARDHDR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SHADOW_PCF3
    * @description Render depth (color-packed on WebGL 1.0), can be used for PCF 3x3 sampling.
    */
  val SHADOW_PCF3: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SHADOW_PCF5
    * @description Render depth buffer only, can be used for hardware-accelerated PCF 5x5 sampling. Requires WebGL2. Falls back to pc.SHADOW_PCF3 on WebGL 1.0.
    */
  val SHADOW_PCF5: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SHADOW_VSM16
    * @description Render 16-bit exponential variance shadow map. Requires OES_texture_half_float extension. Falls back to pc.SHADOW_VSM8, if not supported.
    */
  val SHADOW_VSM16: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SHADOW_VSM32
    * @description Render 32-bit exponential variance shadow map. Requires OES_texture_float extension. Falls back to pc.SHADOW_VSM16, if not supported.
    */
  val SHADOW_VSM32: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SHADOW_VSM8
    * @description Render packed variance shadow map. All shadow receivers must also cast shadows for this mode to work correctly.
    */
  val SHADOW_VSM8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SORTMODE_BACK2FRONT
    * @description Mesh instances are sorted back to front. This is the way to properly render many semi-transparent objects on different depth, one is blended on top of another.
    */
  val SORTMODE_BACK2FRONT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SORTMODE_FRONT2BACK
    * @description Mesh instances are sorted front to back. Depending on GPU and the scene, this option may give better performance than pc.SORTMODE_MATERIALMESH due to reduced overdraw.
    */
  val SORTMODE_FRONT2BACK: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SORTMODE_MANUAL
    * @description Mesh instances are sorted based on {@link pc.MeshInstance#drawOrder}.
    */
  val SORTMODE_MANUAL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SORTMODE_MATERIALMESH
    * @description Mesh instances are sorted to minimize switching between materials and meshes to improve rendering performance.
    */
  val SORTMODE_MATERIALMESH: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SORTMODE_NONE
    * @description No sorting is applied. Mesh instances are rendered in the same order they were added to a layer.
    */
  val SORTMODE_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SPECOCC_AO
    * @description Use AO directly to occlude specular.
    */
  val SPECOCC_AO: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SPECOCC_GLOSSDEPENDENT
    * @description Modify AO based on material glossiness/view angle to occlude specular.
    */
  val SPECOCC_GLOSSDEPENDENT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SPECOCC_NONE
    * @description No specular occlusion.
    */
  val SPECOCC_NONE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SPECULAR_BLINN
    * @description Energy-conserving Blinn-Phong.
    */
  val SPECULAR_BLINN: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SPECULAR_PHONG
    * @description Phong without energy conservation. You should only use it as a backwards compatibility with older projects.
    */
  val SPECULAR_PHONG: Double = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SPRITETYPE_ANIMATED
    * @description A {@link pc.SpriteComponent} that renders sprite animations.
    */
  val SPRITETYPE_ANIMATED: String = js.native
  /**
    * @constant
    * @type {String}
    * @name pc.SPRITETYPE_SIMPLE
    * @description A {@link pc.SpriteComponent} that displays a single frame from a sprite asset.
    */
  val SPRITETYPE_SIMPLE: String = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SPRITE_RENDERMODE_SIMPLE
    * @description This mode renders a sprite as a simple quad.
    */
  val SPRITE_RENDERMODE_SIMPLE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SPRITE_RENDERMODE_SLICED
    * @description This mode renders a sprite using 9-slicing in 'sliced' mode. Sliced mode stretches the
    * top and bottom regions of the sprite horizontally, the left and right regions vertically and the middle region
    * both horizontally and vertically.
    */
  val SPRITE_RENDERMODE_SLICED: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.SPRITE_RENDERMODE_TILED
    * @description This mode renders a sprite using 9-slicing in 'tiled' mode. Tiled mode tiles the
    * top and bottom regions of the sprite horizontally, the left and right regions vertically and the middle region
    * both horizontally and vertically.
    */
  val SPRITE_RENDERMODE_TILED: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.STENCILOP_DECREMENT
    * @description Decrement the value.
    */
  val STENCILOP_DECREMENT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.STENCILOP_DECREMENTWRAP
    * @description Decrement the value, but wrap it to a maximum representable value, if the current value is 0.
    */
  val STENCILOP_DECREMENTWRAP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.STENCILOP_INCREMENT
    * @description Increment the value.
    */
  val STENCILOP_INCREMENT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.STENCILOP_INCREMENTWRAP
    * @description Increment the value, but wrap it to zero when it's larger than a maximum representable value.
    */
  val STENCILOP_INCREMENTWRAP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.STENCILOP_INVERT
    * @description Invert the value bitwise.
    */
  val STENCILOP_INVERT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.STENCILOP_KEEP
    * @description Don't change the stencil buffer value.
    */
  val STENCILOP_KEEP: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.STENCILOP_REPLACE
    * @description Replace value with the reference value (see {@link pc.GraphicsDevice#setStencilFunc}).
    */
  val STENCILOP_REPLACE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.STENCILOP_ZERO
    * @description Set value to zero.
    */
  val STENCILOP_ZERO: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TEXTURELOCK_READ
    * @description Read only. Any changes to the locked mip level's pixels will not update the texture.
    */
  val TEXTURELOCK_READ: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TEXTURELOCK_WRITE
    * @description Write only. The contents of the specified mip level will be entirely replaced.
    */
  val TEXTURELOCK_WRITE: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TONEMAP_ACES
    * @description ACES filmic tonemapping curve.
    */
  val TONEMAP_ACES: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TONEMAP_ACES2
    * @description ACES v2 filmic tonemapping curve.
    */
  val TONEMAP_ACES2: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TONEMAP_FILMIC
    * @description Filmic tonemapping curve.
    */
  val TONEMAP_FILMIC: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TONEMAP_HEJL
    * @description Hejl filmic tonemapping curve.
    */
  val TONEMAP_HEJL: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TONEMAP_LINEAR
    * @description Linear tonemapping.
    */
  val TONEMAP_LINEAR: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TYPE_FLOAT32
    * @description Floating point vertex element type.
    */
  val TYPE_FLOAT32: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TYPE_INT16
    * @description Signed short vertex element type.
    */
  val TYPE_INT16: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TYPE_INT32
    * @description Signed integer vertex element type.
    */
  val TYPE_INT32: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TYPE_INT8
    * @description Signed byte vertex element type.
    */
  val TYPE_INT8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TYPE_UINT16
    * @description Unsigned short vertex element type.
    */
  val TYPE_UINT16: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TYPE_UINT32
    * @description Unsigned integer vertex element type.
    */
  val TYPE_UINT32: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.TYPE_UINT8
    * @description Unsigned byte vertex element type.
    */
  val TYPE_UINT8: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.VIEW_CENTER
    * @description Center of view.
    */
  val VIEW_CENTER: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.VIEW_LEFT
    * @description Left of view. Only used in stereo rendering.
    */
  val VIEW_LEFT: Double = js.native
  /**
    * @constant
    * @type {Number}
    * @name pc.VIEW_RIGHT
    * @description Right of view. Only used in stereo rendering.
    */
  val VIEW_RIGHT: Double = js.native
  /**
    * @static
    * @readonly
    * @type {pc.Http}
    * @name pc.http
    * @description Default instance of {@link pc.Http}.
    */
  val http: Http = js.native
  /**
    * @static
    * @readonly
    * @type {Object}
    * @name pc.shaderChunks
    * @description Object containing all default shader chunks used by shader generators.
    */
  val shaderChunks: js.Any = js.native
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
    */
  def calculateNormals(positions: js.Array[Number], indices: js.Array[Number]): js.Array[Number] = js.native
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
    */
  def calculateTangents(
    positions: js.Array[Number],
    normals: js.Array[Number],
    uvs: js.Array[Number],
    indices: js.Array[Number]
  ): js.Array[Number] = js.native
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
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {pc.Vec3} [opts.halfExtents] The half dimensions of the box in each axis (defaults to [0.5, 0.5, 0.5]).
    * @param {Number} [opts.widthSegments] The number of divisions along the X axis of the box (defaults to 1).
    * @param {Number} [opts.lengthSegments] The number of divisions along the Z axis of the box (defaults to 1).
    * @param {Number} [opts.heightSegments] The number of divisions along the Y axis of the box (defaults to 1).
    * @returns {pc.Mesh} A new box-shaped mesh.
    */
  def createBox(device: GraphicsDevice): Mesh = js.native
  def createBox(device: GraphicsDevice, opts: Anon_HalfExtentsHeightSegments): Mesh = js.native
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
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number} [opts.radius] The radius of the tube forming the body of the capsule (defaults to 0.3).
    * @param {Number} [opts.height] The length of the body of the capsule from tip to tip (defaults to 1.0).
    * @param {Number} [opts.heightSegments] The number of divisions along the tubular length of the capsule (defaults to 1).
    * @param {Number} [opts.sides] The number of divisions around the tubular body of the capsule (defaults to 20).
    * @returns {pc.Mesh} A new cylinder-shaped mesh.
    */
  def createCapsule(device: GraphicsDevice): Mesh = js.native
  def createCapsule(device: GraphicsDevice, opts: Anon_Height): Mesh = js.native
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
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number} [opts.baseRadius] The base radius of the cone (defaults to 0.5).
    * @param {Number} [opts.peakRadius] The peak radius of the cone (defaults to 0.0).
    * @param {Number} [opts.height] The length of the body of the cone (defaults to 1.0).
    * @param {Number} [opts.heightSegments] The number of divisions along the length of the cone (defaults to 5).
    * @param {Number} [opts.capSegments] The number of divisions around the tubular body of the cone (defaults to 18).
    * @returns {pc.Mesh} A new cone-shaped mesh.
    */
  def createCone(device: GraphicsDevice): Mesh = js.native
  def createCone(device: GraphicsDevice, opts: Anon_BaseRadius): Mesh = js.native
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
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number} [opts.radius] The radius of the tube forming the body of the cylinder (defaults to 0.5).
    * @param {Number} [opts.height] The length of the body of the cylinder (defaults to 1.0).
    * @param {Number} [opts.heightSegments] The number of divisions along the length of the cylinder (defaults to 5).
    * @param {Number} [opts.capSegments] The number of divisions around the tubular body of the cylinder (defaults to 20).
    * @returns {pc.Mesh} A new cylinder-shaped mesh.
    */
  def createCylinder(device: GraphicsDevice): Mesh = js.native
  def createCylinder(device: GraphicsDevice, opts: Anon_CapSegments): Mesh = js.native
  /**
    * @function
    * @name pc.createMesh
    * @description Creates a new mesh object from the supplied vertex information and topology.
    * @param {pc.GraphicsDevice} device The graphics device used to manage the mesh.
    * @param {Number[]} positions An array of 3-dimensional vertex positions.
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number[]} [opts.normals] An array of 3-dimensional vertex normals.
    * @param {Number[]} [opts.tangents] An array of 3-dimensional vertex tangents.
    * @param {Number[]} [opts.colors] An array of 4-dimensional vertex colors.
    * @param {Number[]} [opts.uvs] An array of 2-dimensional vertex texture coordinates.
    * @param {Number[]} [opts.uvs1] Same as opts.uvs, but for additional UV set
    * @param {Number[]} [opts.indices] An array of triangle indices.
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
    */
  def createMesh(device: GraphicsDevice, positions: js.Array[Number]): Mesh = js.native
  def createMesh(device: GraphicsDevice, positions: js.Array[Number], opts: Anon_Colors): Mesh = js.native
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
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {pc.Vec2} [opts.halfExtents] The half dimensions of the plane in the X and Z axes (defaults to [0.5, 0.5]).
    * @param {Number} [opts.widthSegments] The number of divisions along the X axis of the plane (defaults to 5).
    * @param {Number} [opts.lengthSegments] The number of divisions along the Z axis of the plane (defaults to 5).
    * @returns {pc.Mesh} A new plane-shaped mesh.
    */
  def createPlane(device: GraphicsDevice): Mesh = js.native
  def createPlane(device: GraphicsDevice, opts: Anon_HalfExtents): Mesh = js.native
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
  def createScript(name: String): js.Function1[/* repeated */ js.Any, _] = js.native
  def createScript(name: String, app: Application): js.Function1[/* repeated */ js.Any, _] = js.native
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
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number} [opts.radius] The radius of the sphere (defaults to 0.5).
    * @param {Number} [opts.segments] The number of divisions along the longitudinal and latitudinal axes of the sphere (defaults to 16).
    * @returns {pc.Mesh} A new sphere-shaped mesh.
    */
  def createSphere(device: GraphicsDevice): Mesh = js.native
  def createSphere(device: GraphicsDevice, opts: Anon_Radius): Mesh = js.native
  /**
    * @function
    * @name pc.createStyle
    * @description Creates a &lt;style&gt; DOM element from a string that contains CSS
    * @param {String} cssString A string that contains valid CSS
    * @example
    * var css = 'body {height: 100;}';
    * var style = pc.createStyle(css);
    * document.head.appendChild(style);
    * @returns {Element} The style DOM element
    */
  def createStyle(cssString: String): Element = js.native
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
    * @param {Object} [opts] An object that specifies optional inputs for the function as follows:
    * @param {Number} [opts.tubeRadius] The radius of the tube forming the body of the torus (defaults to 0.2).
    * @param {Number} [opts.ringRadius] The radius from the centre of the torus to the centre of the tube (defaults to 0.3).
    * @param {Number} [opts.segments] The number of radial divisions forming cross-sections of the torus ring (defaults to 20).
    * @param {Number} [opts.sides] The number of divisions around the tubular body of the torus ring (defaults to 30).
    * @returns {pc.Mesh} A new torus-shaped mesh.
    */
  def createTorus(device: GraphicsDevice): Mesh = js.native
  def createTorus(device: GraphicsDevice, opts: Anon_RingRadius): Mesh = js.native
  /**
    * @static
    * @function
    * @name pc.drawFullscreenQuad
    * @description Draw a screen-space rectangle in a render target. Primarily meant to be used in custom post effects based on {@link pc.PostEffect}.
    * @param {pc.GraphicsDevice} device The graphics device of the application.
    * @param {pc.RenderTarget} target The output render target.
    * @param {pc.VertexBuffer} vertexBuffer The vertex buffer for the rectangle mesh. When calling from a custom post effect, pass the field {@link pc.PostEffect#vertexBuffer}.
    * @param {pc.Shader} shader The shader to be used for drawing the rectangle. When calling from a custom post effect, pass the field {@link pc.PostEffect#shader}.
    * @param {pc.Vec4} [rect] The normalized screen-space position (rect.x, rect.y) and size (rect.z, rect.w) of the rectangle. Default is (0, 0, 1, 1);
    */
  def drawFullscreenQuad(device: GraphicsDevice, target: RenderTarget, vertexBuffer: VertexBuffer, shader: Shader): Unit = js.native
  def drawFullscreenQuad(
    device: GraphicsDevice,
    target: RenderTarget,
    vertexBuffer: VertexBuffer,
    shader: Shader,
    rect: Vec4
  ): Unit = js.native
  /**
    * @function
    * @name pc.getTouchTargetCoords
    * @description Similiar to {@link pc.getTargetCoords} for the MouseEvents.
    * This function takes a browser Touch object and returns the co-ordinates of the
    * touch relative to the target element.
    * @param {Touch} touch The browser Touch object
    * @returns {Object} The co-ordinates of the touch relative to the touch.target element. In the format {x, y}
    */
  def getTouchTargetCoords(touch: Touch): js.Any = js.native
  /**
    * @static
    * @function
    * @name pc.prefilterCubemap
    * @description Prefilter a cubemap for use by a {@link pc.StandardMaterial} as an environment map. Should only be used for cubemaps that can't be prefiltered ahead of time (in the editor).
    * @param {Object} options The options for how the cubemap is prefiltered.
    */
  def prefilterCubemap(options: js.Any): Unit = js.native
}

