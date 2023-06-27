package typings.playcanvas.mod

import typings.std.RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "WebgpuGraphicsDevice")
@js.native
open class WebgpuGraphicsDevice protected () extends GraphicsDevice {
  def this(canvas: Any) = this()
  def this(canvas: Any, options: js.Object) = this()
  
  var _deviceType: String = js.native
  
  var areaLightLutFormat: Double = js.native
  
  /**
    * An array of bind group formats, based on currently assigned bind groups
    *
    * @type {WebgpuBindGroupFormat[]}
    */
  var bindGroupFormats: js.Array[WebgpuBindGroupFormat] = js.native
  
  /**
    * Configuration of the main colorframebuffer we obtain using getCurrentTexture
    *
    * @type {GPUCanvasConfiguration}
    * @private
    */
  /* private */ var canvasConfig: Any = js.native
  
  def clear(options: Any): Unit = js.native
  
  /**
    * Object responsible for clearing the rendering surface by rendering a quad.
    *
    * @type { WebgpuClearRenderer }
    */
  var clearRenderer: WebgpuClearRenderer = js.native
  
  /**
    * Current command buffer encoder.
    *
    * @type {GPUCommandEncoder}
    * @private
    */
  /* private */ var commandEncoder: Any = js.native
  
  /**
    * Copies source render target into destination render target. Mostly used by post-effects.
    *
    * @param {RenderTarget} [source] - The source render target. Defaults to frame buffer.
    * @param {RenderTarget} [dest] - The destination render target. Defaults to frame buffer.
    * @param {boolean} [color] - If true will copy the color buffer. Defaults to false.
    * @param {boolean} [depth] - If true will copy the depth buffer. Defaults to false.
    * @returns {boolean} True if the copy was successful, false otherwise.
    */
  def copyRenderTarget(): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: Unit, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: Unit, color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: Unit, color: Unit, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: RenderTarget): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: RenderTarget, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: RenderTarget, color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: Unit, dest: RenderTarget, color: Unit, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: Unit, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: Unit, color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: Unit, color: Unit, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: Boolean, depth: Boolean): Boolean = js.native
  def copyRenderTarget(source: RenderTarget, dest: RenderTarget, color: Unit, depth: Boolean): Boolean = js.native
  
  def createBindGroupFormatImpl(bindGroupFormat: Any): WebgpuBindGroupFormat = js.native
  
  def createBindGroupImpl(bindGroup: Any): WebgpuBindGroup = js.native
  
  def createFramebuffer(): Unit = js.native
  
  def createIndexBufferImpl(indexBuffer: Any): WebgpuIndexBuffer = js.native
  
  def createRenderTargetImpl(renderTarget: Any): WebgpuRenderTarget = js.native
  
  def createShaderImpl(shader: Any): WebgpuShader = js.native
  
  def createTextureImpl(texture: Any): WebgpuTexture = js.native
  
  def createUniformBufferImpl(uniformBuffer: Any): WebgpuUniformBuffer = js.native
  
  def createVertexBufferImpl(vertexBuffer: Any, format: Any): WebgpuVertexBuffer = js.native
  
  var disableParticleSystem: Boolean = js.native
  
  def draw(primitive: Any, numInstances: Double, keepBuffers: Any): Unit = js.native
  
  /**
    * End a render pass.
    *
    * @param {import('../render-pass.js').RenderPass} renderPass - The render pass to end.
    * @ignore
    */
  def endPass(renderPass: RenderPass): Unit = js.native
  
  var extBlendMinmax: Boolean = js.native
  
  var extCompressedTextureASTC: Boolean = js.native
  
  var extCompressedTextureETC: Boolean = js.native
  
  var extCompressedTextureS3TC: Boolean = js.native
  
  var extStandardDerivatives: Boolean = js.native
  
  var extTextureFloat: Boolean = js.native
  
  var extTextureHalfFloat: Boolean = js.native
  
  var extUintElement: Boolean = js.native
  
  var floatFilterable: Boolean = js.native
  
  /**
    * The render target representing the main framebuffer.
    *
    * @type {RenderTarget}
    */
  var frameBuffer: RenderTarget = js.native
  
  var frameBufferDimensions: Vec2 = js.native
  
  var framebufferFormat: Double = js.native
  
  var glslang: Any = js.native
  
  /**
    * @type {GPUAdapter}
    * @private
    */
  /* private */ var gpuAdapter: Any = js.native
  
  var gpuContext: RenderingContext = js.native
  
  def initDeviceCaps(): Unit = js.native
  
  def initWebGpu(glslangUrl: Any, twgslUrl: Any): js.Promise[WebgpuGraphicsDevice] = js.native
  
  var maxPrecision: String = js.native
  
  var maxSamples: Double = js.native
  
  var maxTextures: Double = js.native
  
  /**
    * Object responsible for mipmap generation.
    *
    * @type { WebgpuMipmapRenderer }
    */
  var mipmapRenderer: WebgpuMipmapRenderer = js.native
  
  var passEncoder: Any = js.native
  
  /**
    * Render pipeline currently set on the device.
    *
    * @type {GPURenderPipeline}
    * @private
    */
  /* private */ var pipeline: Any = js.native
  
  def popMarker(): Unit = js.native
  
  def pushMarker(name: Any): Unit = js.native
  
  /**
    * Object responsible for caching and creation of render pipelines.
    */
  var renderPipeline: WebgpuRenderPipeline = js.native
  
  def resizeCanvas(width: Any, height: Any): Unit = js.native
  
  def setAlphaToCoverage(state: Any): Unit = js.native
  
  /**
    * @param {number} index - Index of the bind group slot
    * @param {import('../bind-group.js').BindGroup} bindGroup - Bind group to attach
    */
  def setBindGroup(index: Double, bindGroup: BindGroup): Unit = js.native
  
  def setBlendColor(r: Any, g: Any, b: Any, a: Any): Unit = js.native
  
  def setBlendState(blendState: Any): Unit = js.native
  
  def setCullMode(cullMode: Any): Unit = js.native
  
  def setDepthBias(on: Any): Unit = js.native
  
  def setDepthBiasValues(constBias: Any, slopeBias: Any): Unit = js.native
  
  def setDepthState(depthState: Any): Unit = js.native
  
  def setScissor(x: Any, y: Any, w: Any, h: Any): Unit = js.native
  
  def setShader(shader: Any): Boolean = js.native
  
  def setStencilState(stencilFront: Any, stencilBack: Any): Unit = js.native
  
  def setViewport(x: Any, y: Any, w: Any, h: Any): Unit = js.native
  
  /**
    * Set up default values for the render pass encoder.
    */
  def setupPassEncoderDefaults(): Unit = js.native
  
  /**
    * Start a render pass.
    *
    * @param {import('../render-pass.js').RenderPass} renderPass - The render pass to start.
    * @ignore
    */
  def startPass(renderPass: RenderPass): Unit = js.native
  
  var stencilRef: Any = js.native
  
  def submitVertexBuffer(vertexBuffer: Any, slot: Any): Any = js.native
  
  var supportsAreaLights: Boolean = js.native
  
  var supportsBoneTextures: Boolean = js.native
  
  var supportsDepthShadow: Boolean = js.native
  
  var supportsGpuParticles: Boolean = js.native
  
  var supportsImageBitmap: Boolean = js.native
  
  var supportsMorphTargetTexturesCore: Boolean = js.native
  
  var supportsTextureFetch: Boolean = js.native
  
  var textureHalfFloatUpdatable: Boolean = js.native
  
  var twgsl: Any = js.native
  
  /**
    * @type {GPUDevice}
    * @private
    */
  /* private */ var wgpu: Any = js.native
}
