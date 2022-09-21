package typings.pixiCore.mod

import typings.std.HTMLCanvasElement
import typings.std.WebGLContextAttributes
import typings.std.WebGLContextEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ContextSystem")
@js.native
open class ContextSystem protected ()
  extends StObject
     with ISystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
  
  /* protected */ var CONTEXT_UID: Double = js.native
  
  /**
    * Handles the context change event.
    * @param {WebGLRenderingContext} gl - New WebGL context.
    */
  /* protected */ def contextChange(gl: IRenderingContext): Unit = js.native
  
  /**
    * Helper class to create a WebGL Context
    * @param canvas - the canvas element that we will get the context from
    * @param options - An options object that gets passed in to the canvas element containing the
    *    context attributes
    * @see https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement/getContext
    * @returns {WebGLRenderingContext} the WebGL context
    */
  def createContext(canvas: HTMLCanvasElement, options: WebGLContextAttributes): IRenderingContext = js.native
  
  /** Generic destroy methods to be overridden by the subclass */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Extensions available.
    * @type {object}
    * @readonly
    * @property {WEBGL_draw_buffers} drawBuffers - WebGL v1 extension
    * @property {WEBGL_depth_texture} depthTexture - WebGL v1 extension
    * @property {OES_texture_float} floatTexture - WebGL v1 extension
    * @property {WEBGL_lose_context} loseContext - WebGL v1 extension
    * @property {OES_vertex_array_object} vertexArrayObject - WebGL v1 extension
    * @property {EXT_texture_filter_anisotropic} anisotropicFiltering - WebGL v1 and v2 extension
    */
  var extensions: WebGLExtensions = js.native
  
  /** Auto-populate the {@link PIXI.ContextSystem.extensions extensions}. */
  /* protected */ def getExtensions(): Unit = js.native
  
  /* protected */ var gl: IRenderingContext = js.native
  
  /**
    * Handles a lost webgl context
    * @param {WebGLContextEvent} event - The context lost event.
    */
  /* protected */ def handleContextLost(event: WebGLContextEvent): Unit = js.native
  
  /** Handles a restored webgl context. */
  /* protected */ def handleContextRestored(): Unit = js.native
  
  /**
    * Initializes the context.
    * @protected
    * @param {WebGLRenderingContext} gl - WebGL context
    */
  def initFromContext(gl: IRenderingContext): Unit = js.native
  
  /**
    * Initialize from context options
    * @protected
    * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext
    * @param {object} options - context attributes
    */
  def initFromOptions(options: WebGLContextAttributes): Unit = js.native
  
  /**
    * `true` if the context is lost
    * @readonly
    */
  def isLost: Boolean = js.native
  
  /** Handle the post-render runner event. */
  /* protected */ def postrender(): Unit = js.native
  
  /* private */ var renderer: Any = js.native
  
  /**
    * Features supported by current context.
    * @type {object}
    * @readonly
    * @property {boolean} uint32Indices - Support for 32-bit indices buffer.
    */
  val supports: ISupportDict = js.native
  
  /**
    * Validate context.
    * @param {WebGLRenderingContext} gl - Render context.
    */
  /* protected */ def validateContext(gl: IRenderingContext): Unit = js.native
  
  /**
    * Either 1 or 2 to reflect the WebGL version being used.
    * @readonly
    */
  var webGLVersion: Double = js.native
}
