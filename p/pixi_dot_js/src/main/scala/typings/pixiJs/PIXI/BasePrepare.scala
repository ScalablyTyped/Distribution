package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The prepare manager provides functionality to upload content to the GPU.
  *
  * BasePrepare handles basic queuing functionality and is extended by
  * {@link PIXI.Prepare} and {@link PIXI.CanvasPrepare}
  * to provide preparation capabilities specific to their respective renderers.
  *
  * @example
  * // Create a sprite
  * const sprite = PIXI.Sprite.from('something.png');
  *
  * // Load object into GPU
  * app.renderer.plugins.prepare.upload(sprite, () => {
  *
  *     //Texture(s) has been uploaded to GPU
  *     app.stage.addChild(sprite);
  *
  * })
  *
  * @abstract
  * @class
  * @memberof PIXI
  */
@js.native
trait BasePrepare extends StObject {
  
  def add(item: js.Any): this.type = js.native
  def add(item: BaseTexture): this.type = js.native
  def add(item: Container): this.type = js.native
  /**
    * Manually add an item to the uploading queue.
    *
    * @param {PIXI.DisplayObject|PIXI.Container|PIXI.BaseTexture|PIXI.Texture|PIXI.Graphics|PIXI.Text|*} item - Object to
    *        add to the queue
    * @return {this} Instance of plugin for chaining.
    */
  def add(item: DisplayObject): this.type = js.native
  def add(item: Graphics): this.type = js.native
  def add(item: Text): this.type = js.native
  def add(item: Texture): this.type = js.native
  
  /**
    * Destroys the plugin, don't use after this.
    *
    */
  def destroy(): Unit = js.native
  
  /**
    * The limiter to be used to control how quickly items are prepared.
    * @type {PIXI.CountLimiter|PIXI.TimeLimiter}
    */
  var limiter: CountLimiter | TimeLimiter = js.native
  
  /**
    * Adds hooks for finding items.
    *
    * @param {Function} addHook - Function call that takes two parameters: `item:*, queue:Array`
    *          function must return `true` if it was able to add item to the queue.
    * @return {this} Instance of plugin for chaining.
    */
  def registerFindHook(addHook: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  
  /**
    * Adds hooks for uploading items.
    *
    * @param {Function} uploadHook - Function call that takes two parameters: `prepare:CanvasPrepare, item:*` and
    *          function must return `true` if it was able to handle upload of item.
    * @return {this} Instance of plugin for chaining.
    */
  def registerUploadHook(uploadHook: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  
  /**
    * Reference to the renderer.
    * @type {PIXI.AbstractRenderer}
    * @protected
    */
  var renderer: AbstractRenderer = js.native
  
  /**
    * Upload all the textures and graphics to the GPU.
    *
    * @param {Function|PIXI.DisplayObject|PIXI.Container|PIXI.BaseTexture|PIXI.Texture|PIXI.Graphics|PIXI.Text} item -
    *        Either the container or display object to search for items to upload, the items to upload themselves,
    *        or the callback function, if items have been added using `prepare.add`.
    * @param {Function} [done] - Optional callback when all queued uploads have completed
    */
  def upload(item: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def upload(item: js.Function1[/* repeated */ js.Any, _], done: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def upload(item: BaseTexture): Unit = js.native
  def upload(item: BaseTexture, done: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def upload(item: Container): Unit = js.native
  def upload(item: Container, done: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def upload(item: DisplayObject): Unit = js.native
  def upload(item: DisplayObject, done: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def upload(item: Graphics): Unit = js.native
  def upload(item: Graphics, done: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def upload(item: Text): Unit = js.native
  def upload(item: Text, done: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def upload(item: Texture): Unit = js.native
  def upload(item: Texture, done: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /**
    * The only real difference between CanvasPrepare and Prepare is what they pass
    * to upload hooks. That different parameter is stored here.
    * @type {object}
    * @protected
    */
  var uploadHookHelper: js.Any = js.native
}
