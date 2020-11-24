package typings.pixiJs.PIXI.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource type for HTMLVideoElement.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  * @param {HTMLVideoElement|object|string|Array<string|object>} source - Video element to use.
  * @param {object} [options] - Options to use
  * @param {boolean} [options.autoLoad=true] - Start loading the video immediately
  * @param {boolean} [options.autoPlay=true] - Start playing video immediately
  * @param {number} [options.updateFPS=0] - How many times a second to update the texture from the video.
  * Leave at 0 to update at every render.
  * @param {boolean} [options.crossorigin=true] - Load image using cross origin
  */
@js.native
trait VideoResource extends BaseImageResource {
  
  /**
    * When set to true will automatically play videos used by this texture once
    * they are loaded. If false, it will not modify the playing state.
    *
    * @member {boolean} PIXI.resources.VideoResource#autoPlay
    * @default true
    */
  var autoPlay: Boolean = js.native
  
  /**
    * Should the base texture automatically update itself, set to true by default
    *
    * @member {boolean}
    */
  var autoUpdate: Boolean = js.native
  
  def update(deltaTime: Double): Unit = js.native
  
  /**
    * How many times a second to update the texture from the video. Leave at 0 to update at every render.
    * A lower fps can help performance, as updating the texture at 60fps on a 30ps video may not be efficient.
    *
    * @member {number}
    */
  var updateFPS: Double = js.native
}
