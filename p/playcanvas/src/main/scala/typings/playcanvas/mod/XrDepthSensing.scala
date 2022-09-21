package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/**
  * Depth Sensing provides depth information which is reconstructed using the underlying AR system.
  * It provides the ability to query depth values (CPU path) or access a depth texture (GPU path).
  * Depth information can be used (not limited to) for reconstructing real world geometry, virtual
  * object placement, occlusion of virtual objects by real world geometry and more.
  *
  * ```javascript
  * // CPU path
  * var depthSensing = app.xr.depthSensing;
  * if (depthSensing.available) {
  *     // get depth in the middle of the screen, value is in meters
  *     var depth = depthSensing.getDepth(depthSensing.width / 2, depthSensing.height / 2);
  * }
  * ```
  *
  * ```javascript
  * // GPU path, attaching texture to material
  * material.diffuseMap = depthSensing.texture;
  * material.setParameter('matrix_depth_uv', depthSensing.uvMatrix.data);
  * material.setParameter('depth_raw_to_meters', depthSensing.rawValueToMeters);
  * material.update();
  *
  * // update UV transformation matrix on depth texture resize
  * depthSensing.on('resize', function () {
  *     material.setParameter('matrix_depth_uv', depthSensing.uvMatrix.data);
  *     material.setParameter('depth_raw_to_meters', depthSensing.rawValueToMeters);
  * });
  * ```
  *
  * ```javascript
  * // GLSL shader to unpack depth texture
  * varying vec2 vUv0;
  *
  * uniform sampler2D texture_depthSensingMap;
  * uniform mat4 matrix_depth_uv;
  * uniform float depth_raw_to_meters;
  *
  * void main(void) {
  *     // transform UVs using depth matrix
  *     vec2 texCoord = (matrix_depth_uv * vec4(vUv0.xy, 0.0, 1.0)).xy;
  *
  *     // get luminance alpha components from depth texture
  *     vec2 packedDepth = texture2D(texture_depthSensingMap, texCoord).ra;
  *
  *     // unpack into single value in millimeters
  *     float depth = dot(packedDepth, vec2(255.0, 256.0 * 255.0)) * depth_raw_to_meters; // m
  *
  *     // normalize: 0m to 8m distance
  *     depth = min(depth / 8.0, 1.0); // 0..1 = 0..8
  *
  *     // paint scene from black to white based on distance
  *     gl_FragColor = vec4(depth, depth, depth, 1.0);
  * }
  * ```
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrDepthSensing")
@js.native
open class XrDepthSensing protected () extends EventHandler {
  /**
    * Create a new XrDepthSensing instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: XrManager) = this()
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _available: Any = js.native
  
  /**
    * @type {string|null}
    * @private
    */
  /* private */ var _dataFormat: Any = js.native
  
  /**
    * @type {Uint8Array|null}
    * @private
    */
  /* private */ var _depthBuffer: Any = js.native
  
  /**
    * @type {XRCPUDepthInformation|null}
    * @private
    */
  /* private */ var _depthInfoCpu: Any = js.native
  
  /**
    * @type {XRCPUDepthInformation|null}
    * @private
    */
  /* private */ var _depthInfoGpu: Any = js.native
  
  /**
    * @type {Uint8Array}
    * @private
    */
  /* private */ var _emptyBuffer: Any = js.native
  
  /**
    * @type {XrManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /**
    * @type {Mat4}
    * @private
    */
  /* private */ var _matrix: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _matrixDirty: Any = js.native
  
  /** @private */
  /* private */ var _onSessionEnd: Any = js.native
  
  /** @private */
  /* private */ var _onSessionStart: Any = js.native
  
  /**
    * @type {Texture}
    * @private
    */
  /* private */ var _texture: Any = js.native
  
  /** @private */
  /* private */ var _updateTexture: Any = js.native
  
  /**
    * @type {string|null}
    * @private
    */
  /* private */ var _usage: Any = js.native
  
  /**
    * True if depth sensing information is available.
    *
    * @type {boolean}
    * @example
    * if (app.xr.depthSensing.available) {
    *     var depth = app.xr.depthSensing.getDepth(x, y);
    * }
    */
  def available: Boolean = js.native
  
  /**
    * The depth sensing data format.
    *
    * @type {string}
    * @ignore
    */
  def dataFormat: String = js.native
  
  /**
    * Fired when depth sensing data becomes available.
    *
    * @event XrDepthSensing#available
    */
  /**
    * Fired when depth sensing data becomes unavailable.
    *
    * @event XrDepthSensing#unavailable
    */
  /**
    * Fired when the depth sensing texture been resized. The {@link XrDepthSensing#uvMatrix} needs
    * to be updated for relevant shaders.
    *
    * @event XrDepthSensing#resize
    * @param {number} width - The new width of the depth texture in pixels.
    * @param {number} height - The new height of the depth texture in pixels.
    * @example
    * depthSensing.on('resize', function () {
    *     material.setParameter('matrix_depth_uv', depthSensing.uvMatrix);
    * });
    */
  /** @ignore */
  def destroy(): Unit = js.native
  
  /**
    * Get depth value from depth information in meters. UV is in range of 0..1, with origin in
    * top-left corner of a texture.
    *
    * @param {number} u - U coordinate of pixel in depth texture, which is in range from 0.0 to
    * 1.0 (left to right).
    * @param {number} v - V coordinate of pixel in depth texture, which is in range from 0.0 to
    * 1.0 (top to bottom).
    * @returns {number|null} Depth in meters or null if depth information is currently not
    * available.
    * @example
    * var depth = app.xr.depthSensing.getDepth(u, v);
    * if (depth !== null) {
    *     // depth in meters
    * }
    */
  def getDepth(u: Double, v: Double): Double | Null = js.native
  
  /**
    * Height of depth texture or 0 if not available.
    *
    * @type {number}
    */
  def height: Double = js.native
  
  /**
    * Multiply this coefficient number by raw depth value to get depth in meters.
    *
    * @type {number}
    * @example
    * material.setParameter('depth_raw_to_meters', depthSensing.rawValueToMeters);
    */
  def rawValueToMeters: Double = js.native
  
  /**
    * True if Depth Sensing is supported.
    *
    * @type {boolean}
    */
  def supported: Boolean = js.native
  
  /**
    * Texture that contains packed depth information. The format of this texture is
    * {@link PIXELFORMAT_L8_A8}. It is UV transformed based on the underlying AR system which can
    * be normalized using {@link XrDepthSensing#uvMatrix}.
    *
    * @type {Texture}
    * @example
    * material.diffuseMap = depthSensing.texture;
    * @example
    * // GLSL shader to unpack depth texture
    * varying vec2 vUv0;
    *
    * uniform sampler2D texture_depthSensingMap;
    * uniform mat4 matrix_depth_uv;
    * uniform float depth_raw_to_meters;
    *
    * void main(void) {
    *     // transform UVs using depth matrix
    *     vec2 texCoord = (matrix_depth_uv * vec4(vUv0.xy, 0.0, 1.0)).xy;
    *
    *     // get luminance alpha components from depth texture
    *     vec2 packedDepth = texture2D(texture_depthSensingMap, texCoord).ra;
    *
    *     // unpack into single value in millimeters
    *     float depth = dot(packedDepth, vec2(255.0, 256.0 * 255.0)) * depth_raw_to_meters; // m
    *
    *     // normalize: 0m to 8m distance
    *     depth = min(depth / 8.0, 1.0); // 0..1 = 0m..8m
    *
    *     // paint scene from black to white based on distance
    *     gl_FragColor = vec4(depth, depth, depth, 1.0);
    * }
    */
  def texture: Texture = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @param {*} view - First XRView of viewer XRPose.
    * @ignore
    */
  def update(frame: Any, view: Any): Unit = js.native
  
  /**
    * Whether the usage is CPU or GPU.
    *
    * @type {string}
    * @ignore
    */
  def usage: String = js.native
  
  /**
    * 4x4 matrix that should be used to transform depth texture UVs to normalized UVs in a shader.
    * It is updated when the depth texture is resized. Refer to {@link XrDepthSensing#resize}.
    *
    * @type {Mat4}
    * @example
    * material.setParameter('matrix_depth_uv', depthSensing.uvMatrix.data);
    */
  def uvMatrix: Mat4 = js.native
  
  /**
    * Width of depth texture or 0 if not available.
    *
    * @type {number}
    */
  def width: Double = js.native
}
