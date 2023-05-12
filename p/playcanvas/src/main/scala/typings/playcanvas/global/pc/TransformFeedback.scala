package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object allows you to configure and use the transform feedback feature (WebGL2 only). How to
  * use:
  *
  * 1. First, check that you're on WebGL2, by looking at the `app.graphicsDevice.webgl2`` value.
  * 2. Define the outputs in your vertex shader. The syntax is `out vec3 out_vertex_position`,
  * note that there must be out_ in the name. You can then simply assign values to these outputs in
  * VS. The order and size of shader outputs must match the output buffer layout.
  * 3. Create the shader using `TransformFeedback.createShader(device, vsCode, yourShaderName)`.
  * 4. Create/acquire the input vertex buffer. Can be any VertexBuffer, either manually created, or
  * from a Mesh.
  * 5. Create the TransformFeedback object: `const tf = new TransformFeedback(inputBuffer)`. This
  * object will internally create an output buffer.
  * 6. Run the shader: `tf.process(shader)`. Shader will take the input buffer, process it and write
  * to the output buffer, then the input/output buffers will be automatically swapped, so you'll
  * immediately see the result.
  *
  * ```javascript
  * // *** shader asset ***
  * attribute vec3 vertex_position;
  * attribute vec3 vertex_normal;
  * attribute vec2 vertex_texCoord0;
  * out vec3 out_vertex_position;
  * out vec3 out_vertex_normal;
  * out vec2 out_vertex_texCoord0;
  * void main(void) {
  *     // read position and normal, write new position (push away)
  *     out_vertex_position = vertex_position + vertex_normal * 0.01;
  *     // pass other attributes unchanged
  *     out_vertex_normal = vertex_normal;
  *     out_vertex_texCoord0 = vertex_texCoord0;
  * }
  * ```
  *
  * ```javascript
  * // *** script asset ***
  * var TransformExample = pc.createScript('transformExample');
  *
  * // attribute that references shader asset and material
  * TransformExample.attributes.add('shaderCode', { type: 'asset', assetType: 'shader' });
  * TransformExample.attributes.add('material', { type: 'asset', assetType: 'material' });
  *
  * TransformExample.prototype.initialize = function() {
  *     const device = this.app.graphicsDevice;
  *     const mesh = pc.createTorus(device, { tubeRadius: 0.01, ringRadius: 3 });
  *     const meshInstance = new pc.MeshInstance(mesh, this.material.resource);
  *     const entity = new pc.Entity();
  *     entity.addComponent('render', {
  *         type: 'asset',
  *         meshInstances: [meshInstance]
  *     });
  *     app.root.addChild(entity);
  *
  *     // if webgl2 is not supported, transform-feedback is not available
  *     if (!device.webgl2) return;
  *     const inputBuffer = mesh.vertexBuffer;
  *     this.tf = new pc.TransformFeedback(inputBuffer);
  *     this.shader = pc.TransformFeedback.createShader(device, this.shaderCode.resource, "tfMoveUp");
  * };
  *
  * TransformExample.prototype.update = function(dt) {
  *     if (!this.app.graphicsDevice.webgl2) return;
  *     this.tf.process(this.shader);
  * };
  * ```
  */
@JSGlobal("pc.TransformFeedback")
@js.native
open class TransformFeedback protected ()
  extends typings.playcanvas.mod.TransformFeedback {
  /**
    * Create a new TransformFeedback instance.
    *
    * @param {VertexBuffer} inputBuffer - The input vertex buffer.
    * @param {number} [usage] - The optional usage type of the output vertex buffer. Can be:
    *
    * - {@link BUFFER_STATIC}
    * - {@link BUFFER_DYNAMIC}
    * - {@link BUFFER_STREAM}
    * - {@link BUFFER_GPUDYNAMIC}
    *
    * Defaults to {@link BUFFER_GPUDYNAMIC} (which is recommended for continuous update).
    */
  def this(inputBuffer: typings.playcanvas.mod.VertexBuffer) = this()
  def this(inputBuffer: typings.playcanvas.mod.VertexBuffer, usage: Double) = this()
}
object TransformFeedback {
  
  @JSGlobal("pc.TransformFeedback")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a transform feedback ready vertex shader from code.
    *
    * @param {import('./graphics-device.js').GraphicsDevice} graphicsDevice - The graphics device
    * used by the renderer.
    * @param {string} vertexCode - Vertex shader code. Should contain output variables starting with "out_".
    * @param {string} name - Unique name for caching the shader.
    * @returns {Shader} A shader to use in the process() function.
    */
  /* static member */
  inline def createShader(graphicsDevice: typings.playcanvas.mod.GraphicsDevice, vertexCode: String, name: String): typings.playcanvas.mod.Shader = (^.asInstanceOf[js.Dynamic].applyDynamic("createShader")(graphicsDevice.asInstanceOf[js.Any], vertexCode.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Shader]
}
