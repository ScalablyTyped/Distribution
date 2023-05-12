package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to manage multiple post effects for a camera.
  */
@JSImport("playcanvas", "PostEffectQueue")
@js.native
open class PostEffectQueue protected () extends StObject {
  /**
    * Create a new PostEffectQueue instance.
    *
    * @param {import('../../app-base.js').AppBase} app - The application.
    * @param {import('./component.js').CameraComponent} camera - The camera component.
    */
  def this(app: AppBase, camera: CameraComponent) = this()
  
  /**
    * Allocate a color buffer texture.
    *
    * @param {number} format - The format of the color buffer.
    * @param {string} name - The name of the color buffer.
    * @returns {Texture} The color buffer texture.
    * @private
    */
  /* private */ var _allocateColorBuffer: Any = js.native
  
  /**
    * Creates a render target with the dimensions of the canvas, with an optional depth buffer.
    *
    * @param {boolean} useDepth - Set to true to create a render target with a depth buffer.
    * @param {boolean} hdr - Use HDR render target format.
    * @returns {RenderTarget} The render target.
    * @private
    */
  /* private */ var _createOffscreenTarget: Any = js.native
  
  def _destroyOffscreenTarget(rt: Any): Unit = js.native
  
  var _newPostEffect: PostEffect_ = js.native
  
  /**
    * Handler called when the application's canvas element is resized.
    *
    * @param {number} width - The new width of the canvas.
    * @param {number} height - The new height of the canvas.
    * @private
    */
  /* private */ var _onCanvasResized: Any = js.native
  
  def _releaseDepthMap(): Unit = js.native
  
  def _releaseDepthMaps(): Unit = js.native
  
  def _requestDepthMap(): Unit = js.native
  
  def _requestDepthMaps(): Unit = js.native
  
  def _resizeOffscreenTarget(rt: Any): Unit = js.native
  
  var _sourceTarget: Any = js.native
  
  /**
    * Adds a post effect to the queue. If the queue is disabled adding a post effect will
    * automatically enable the queue.
    *
    * @param {PostEffect} effect - The post effect to add to the queue.
    */
  def addEffect(effect: PostEffect_): Unit = js.native
  
  var app: AppBase = js.native
  
  var camera: CameraComponent = js.native
  
  var depthTarget: Any = js.native
  
  /**
    * Render target where the postprocessed image needs to be rendered to. Defaults to null
    * which is main framebuffer.
    *
    * @type {RenderTarget}
    * @ignore
    */
  var destinationRenderTarget: RenderTarget = js.native
  
  /**
    * Removes all the effects from the queue and disables it.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disables the queue and all of its effects.
    */
  def disable(): Unit = js.native
  
  /**
    * All of the post effects in the queue.
    *
    * @type {PostEffect[]}
    * @ignore
    */
  var effects: js.Array[PostEffect_] = js.native
  
  /**
    * Enables the queue and all of its effects. If there are no effects then the queue will not be
    * enabled.
    */
  def enable(): Unit = js.native
  
  /**
    * If the queue is enabled it will render all of its effects, otherwise it will not render
    * anything.
    *
    * @type {boolean}
    * @ignore
    */
  var enabled: Boolean = js.native
  
  def onCameraRectChanged(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  /**
    * Removes a post effect from the queue. If the queue becomes empty it will be disabled
    * automatically.
    *
    * @param {PostEffect} effect - The post effect to remove.
    */
  def removeEffect(effect: PostEffect_): Unit = js.native
  
  def resizeRenderTargets(): Unit = js.native
}
