package typings.playcanvas.global.pc

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
@JSGlobal("pc.XrDepthSensing")
@js.native
open class XrDepthSensing protected ()
  extends typings.playcanvas.mod.XrDepthSensing {
  /**
    * Create a new XrDepthSensing instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: typings.playcanvas.mod.XrManager) = this()
}
