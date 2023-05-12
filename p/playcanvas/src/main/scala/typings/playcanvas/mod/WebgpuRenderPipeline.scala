package typings.playcanvas.mod

import typings.playcanvas.anon.AlphaColor
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
trait WebgpuRenderPipeline extends StObject {
  
  /**
    * The cache of render pipelines
    *
    * @type {Map<string, object>}
    */
  var cache: Map[String, js.Object]
  
  def create(
    primitiveTopology: Any,
    shader: Any,
    renderTarget: Any,
    pipelineLayout: Any,
    blendState: Any,
    depthState: Any,
    vertexBufferLayout: Any,
    cullMode: Any,
    stencilEnabled: Any,
    stencilFront: Any,
    stencilBack: Any
  ): Any
  
  /** @type {import('./webgpu-graphics-device.js').WebgpuGraphicsDevice} */
  var device: WebgpuGraphicsDevice
  
  def get(
    primitive: Any,
    vertexFormat0: Any,
    vertexFormat1: Any,
    shader: Any,
    renderTarget: Any,
    bindGroupFormats: Any,
    blendState: Any,
    depthState: Any,
    cullMode: Any,
    stencilEnabled: Any,
    stencilFront: Any,
    stencilBack: Any
  ): Any
  
  def getBlend(blendState: Any): AlphaColor
  
  /** @private */
  /* private */ var getDepthStencil: Any
  
  /**
    * Generate a unique key for the render pipeline. Keep this function as lean as possible,
    * as it executes for each draw call.
    */
  def getKey(
    primitive: Any,
    vertexFormat0: Any,
    vertexFormat1: Any,
    shader: Any,
    renderTarget: Any,
    bindGroupFormats: Any,
    blendState: Any,
    depthState: Any,
    cullMode: Any,
    stencilEnabled: Any,
    stencilFront: Any,
    stencilBack: Any
  ): String
  
  /**
    * @param {import('../bind-group-format.js').BindGroupFormat[]} bindGroupFormats - An array
    * of bind group formats.
    * @returns {any} Returns the pipeline layout.
    */
  def getPipelineLayout(bindGroupFormats: js.Array[BindGroupFormat]): Any
  
  /**
    * The cache of vertex buffer layouts
    *
    * @type {WebgpuVertexBufferLayout}
    */
  var vertexBufferLayout: WebgpuVertexBufferLayout
}
object WebgpuRenderPipeline {
  
  inline def apply(
    cache: Map[String, js.Object],
    create: (Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any) => Any,
    device: WebgpuGraphicsDevice,
    get: (Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any) => Any,
    getBlend: Any => AlphaColor,
    getDepthStencil: Any,
    getKey: (Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any) => String,
    getPipelineLayout: js.Array[BindGroupFormat] => Any,
    vertexBufferLayout: WebgpuVertexBufferLayout
  ): WebgpuRenderPipeline = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], create = js.Any.fromFunction11(create), device = device.asInstanceOf[js.Any], get = js.Any.fromFunction12(get), getBlend = js.Any.fromFunction1(getBlend), getDepthStencil = getDepthStencil.asInstanceOf[js.Any], getKey = js.Any.fromFunction12(getKey), getPipelineLayout = js.Any.fromFunction1(getPipelineLayout), vertexBufferLayout = vertexBufferLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebgpuRenderPipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebgpuRenderPipeline] (val x: Self) extends AnyVal {
    
    inline def setCache(value: Map[String, js.Object]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: (Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "create", js.Any.fromFunction11(value))
    
    inline def setDevice(value: WebgpuGraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setGet(value: (Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction12(value))
    
    inline def setGetBlend(value: Any => AlphaColor): Self = StObject.set(x, "getBlend", js.Any.fromFunction1(value))
    
    inline def setGetDepthStencil(value: Any): Self = StObject.set(x, "getDepthStencil", value.asInstanceOf[js.Any])
    
    inline def setGetKey(value: (Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any) => String): Self = StObject.set(x, "getKey", js.Any.fromFunction12(value))
    
    inline def setGetPipelineLayout(value: js.Array[BindGroupFormat] => Any): Self = StObject.set(x, "getPipelineLayout", js.Any.fromFunction1(value))
    
    inline def setVertexBufferLayout(value: WebgpuVertexBufferLayout): Self = StObject.set(x, "vertexBufferLayout", value.asInstanceOf[js.Any])
  }
}
