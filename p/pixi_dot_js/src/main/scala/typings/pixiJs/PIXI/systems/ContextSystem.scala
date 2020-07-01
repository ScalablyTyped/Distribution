package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import typings.pixiJs.anon.AnisotropicFiltering
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextEvent
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage the context.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
trait ContextSystem extends System {
  /**
    * Extensions being used
    * @member {object} PIXI.systems.ContextSystem#extensions
    * @readonly
    * @property {WEBGL_draw_buffers} drawBuffers - WebGL v1 extension
    * @property {WEBGL_depth_texture} depthTexture - WebGL v1 extension
    * @property {OES_texture_float} floatTexture - WebGL v1 extension
    * @property {WEBGL_lose_context} loseContext - WebGL v1 extension
    * @property {OES_vertex_array_object} vertexArrayObject - WebGL v1 extension
    * @property {EXT_texture_filter_anisotropic} anisotropicFiltering - WebGL v1 and v2 extension
    */
  val extensions: AnisotropicFiltering
  /**
    * `true` if the context is lost
    * @member {boolean}
    * @readonly
    */
  val isLost: Boolean
  /**
    * Either 1 or 2 to reflect the WebGL version being used
    * @member {number} PIXI.systems.ContextSystem#webGLVersion
    * @readonly
    */
  val webGLVersion: Double
  /**
    * Handle the context change event
    * @param {WebGLRenderingContext} gl - new webgl context
    */
  def contextChange(gl: WebGLRenderingContext): Unit
  /**
    * Helper class to create a WebGL Context
    *
    * @param canvas {HTMLCanvasElement} the canvas element that we will get the context from
    * @param options {object} An options object that gets passed in to the canvas element containing the context attributes
    * @see https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement/getContext
    * @return {WebGLRenderingContext} the WebGL context
    */
  def createContext(canvas: HTMLCanvasElement, options: js.Any): WebGLRenderingContext
  /**
    * Auto-populate the extensions
    *
    * @protected
    */
  /* protected */ def getExtensions(): Unit
  /**
    * Handles a lost webgl context
    *
    * @protected
    * @param {WebGLContextEvent} event - The context lost event.
    */
  /* protected */ def handleContextLost(event: WebGLContextEvent): Unit
  /**
    * Handles a restored webgl context
    *
    * @protected
    */
  /* protected */ def handleContextRestored(): Unit
  /**
    * Initialize the context
    *
    * @protected
    * @param {WebGLRenderingContext} gl - WebGL context
    */
  /* protected */ def initFromContext(gl: WebGLRenderingContext): Unit
  /**
    * Initialize from context options
    *
    * @protected
    * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext
    * @param {object} options - context attributes
    */
  /* protected */ def initFromOptions(options: js.Any): Unit
  /**
    * Handle the post-render runner event
    *
    * @protected
    */
  /* protected */ def postrender(): Unit
  /**
    * Validate context
    *
    * @protected
    * @param {WebGLRenderingContext} gl - Render context
    */
  /* protected */ def validateContext(gl: WebGLRenderingContext): Unit
}

object ContextSystem {
  @scala.inline
  def apply(
    contextChange: WebGLRenderingContext => Unit,
    createContext: (HTMLCanvasElement, js.Any) => WebGLRenderingContext,
    destroy: () => Unit,
    extensions: AnisotropicFiltering,
    getExtensions: () => Unit,
    handleContextLost: WebGLContextEvent => Unit,
    handleContextRestored: () => Unit,
    initFromContext: WebGLRenderingContext => Unit,
    initFromOptions: js.Any => Unit,
    isLost: Boolean,
    postrender: () => Unit,
    renderer: Renderer,
    validateContext: WebGLRenderingContext => Unit,
    webGLVersion: Double
  ): ContextSystem = {
    val __obj = js.Dynamic.literal(contextChange = js.Any.fromFunction1(contextChange), createContext = js.Any.fromFunction2(createContext), destroy = js.Any.fromFunction0(destroy), extensions = extensions.asInstanceOf[js.Any], getExtensions = js.Any.fromFunction0(getExtensions), handleContextLost = js.Any.fromFunction1(handleContextLost), handleContextRestored = js.Any.fromFunction0(handleContextRestored), initFromContext = js.Any.fromFunction1(initFromContext), initFromOptions = js.Any.fromFunction1(initFromOptions), isLost = isLost.asInstanceOf[js.Any], postrender = js.Any.fromFunction0(postrender), renderer = renderer.asInstanceOf[js.Any], validateContext = js.Any.fromFunction1(validateContext), webGLVersion = webGLVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSystem]
  }
}

