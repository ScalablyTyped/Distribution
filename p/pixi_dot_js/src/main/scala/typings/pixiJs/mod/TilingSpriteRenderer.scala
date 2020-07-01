package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebGL renderer plugin for tiling sprites
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.ObjectRenderer
  */
@JSImport("pixi.js", "TilingSpriteRenderer")
@js.native
class TilingSpriteRenderer protected ()
  extends typings.pixiJs.PIXI.TilingSpriteRenderer {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
  /**
    * The renderer this manager works for.
    *
    * @member {PIXI.Renderer} PIXI.System#renderer
    */
  /* CompleteClass */
  override var renderer: typings.pixiJs.PIXI.Renderer = js.native
  /**
    * The WebGL state in which this renderer will work.
    *
    * @member {PIXI.State} PIXI.TilingSpriteRenderer#state
    * @readonly
    */
  /* CompleteClass */
  override val state: typings.pixiJs.PIXI.State = js.native
  /**
    * Generic destroy methods to be overridden by the subclass
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Stub method that should be used to empty the current
    * batch by rendering objects now.
    */
  /* CompleteClass */
  override def flush(): Unit = js.native
  /**
    * Keeps the object to render. It doesn't have to be
    * rendered immediately.
    *
    * @param {PIXI.DisplayObject} object - The object to render.
    */
  /* CompleteClass */
  override def render(`object`: typings.pixiJs.PIXI.DisplayObject): Unit = js.native
  /**
    *
    * @param {PIXI.TilingSprite} ts - tilingSprite to be rendered
    */
  /* CompleteClass */
  override def render(ts: typings.pixiJs.PIXI.TilingSprite): Unit = js.native
  /**
    * Stub method that initializes any state required before
    * rendering starts. It is different from the `prerender`
    * signal, which occurs every frame, in that it is called
    * whenever an object requests _this_ renderer specifically.
    */
  /* CompleteClass */
  override def start(): Unit = js.native
  /**
    * Stops the renderer. It should free up any state and
    * become dormant.
    */
  /* CompleteClass */
  override def stop(): Unit = js.native
}

