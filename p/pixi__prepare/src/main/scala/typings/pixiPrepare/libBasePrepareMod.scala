package typings.pixiPrepare

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.Texture
import typings.pixiDisplay.libDisplayObjectMod.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiPrepare.anon.PartialTextStyle
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiText.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBasePrepareMod {
  
  @JSImport("@pixi/prepare/lib/BasePrepare", "BasePrepare")
  @js.native
  open class BasePrepare protected () extends StObject {
    /**
      * @param {PIXI.IRenderer} renderer - A reference to the current renderer
      */
    def this(renderer: IRenderer[ICanvas]) = this()
    
    def add(item: BaseTexture[Resource, IAutoDetectOptions]): this.type = js.native
    def add(item: Texture[Resource]): this.type = js.native
    def add(item: Container[DisplayObject]): this.type = js.native
    /**
      * Manually add an item to the uploading queue.
      * @param {PIXI.DisplayObject|PIXI.Container|PIXI.BaseTexture|PIXI.Texture|PIXI.Graphics|PIXI.Text|*} item - Object to
      *        add to the queue
      * @returns Instance of plugin for chaining.
      */
    def add(item: IDisplayObjectExtended): this.type = js.native
    
    /**
      * Collection of additional hooks for finding assets.
      * @type {Array<Function>}
      */
    var addHooks: js.Array[Any] = js.native
    
    /**
      * Callback to call after completed.
      * @type {Array<Function>}
      */
    var completes: js.Array[Any] = js.native
    
    /**
      * 'bound' call for prepareItems().
      * @type {Function}
      */
    /* private */ var delayedTick: Any = js.native
    
    /** Destroys the plugin, don't use after this. */
    def destroy(): Unit = js.native
    
    /**
      * The limiter to be used to control how quickly items are prepared.
      * @type {PIXI.CountLimiter|PIXI.TimeLimiter}
      */
    /* private */ var limiter: Any = js.native
    
    /**
      * Actually prepare items. This is handled outside of the tick because it will take a while
      * and we do NOT want to block the current animation frame from rendering.
      * @private
      */
    def prepareItems(): Unit = js.native
    
    /** Collection of items to uploads at once. */
    /* protected */ var queue: js.Array[Any] = js.native
    
    /**
      * Adds hooks for finding items.
      * @param {Function} addHook - Function call that takes two parameters: `item:*, queue:Array`
      *          function must return `true` if it was able to add item to the queue.
      * @returns Instance of plugin for chaining.
      */
    def registerFindHook(addHook: IFindHook): this.type = js.native
    
    /**
      * Adds hooks for uploading items.
      * @param {Function} uploadHook - Function call that takes two parameters: `prepare:CanvasPrepare, item:*` and
      *          function must return `true` if it was able to handle upload of item.
      * @returns Instance of plugin for chaining.
      */
    def registerUploadHook(uploadHook: IUploadHook): this.type = js.native
    
    /** Reference to the renderer. */
    /* protected */ var renderer: IRenderer[ICanvas] = js.native
    
    /**
      * Handle tick update
      * @private
      */
    def tick(): Unit = js.native
    
    /**
      * If prepare is ticking (running).
      * @type {boolean}
      */
    var ticking: Boolean = js.native
    
    /**
      * Upload all the textures and graphics to the GPU.
      * @method PIXI.BasePrepare#upload
      * @param {PIXI.DisplayObject|PIXI.Container|PIXI.BaseTexture|PIXI.Texture|PIXI.Graphics|PIXI.Text} [item] -
      *        Container or display object to search for items to upload or the items to upload themselves,
      *        or optionally ommitted, if items have been added using {@link PIXI.BasePrepare#add `prepare.add`}.
      */
    def upload(): js.Promise[Unit] = js.native
    def upload(item: BaseTexture[Resource, IAutoDetectOptions]): js.Promise[Unit] = js.native
    def upload(item: Texture[Resource]): js.Promise[Unit] = js.native
    def upload(item: Container[DisplayObject]): js.Promise[Unit] = js.native
    def upload(item: IDisplayObjectExtended): js.Promise[Unit] = js.native
    
    /**
      * The only real difference between CanvasPrepare and Prepare is what they pass
      * to upload hooks. That different parameter is stored here.
      */
    /* protected */ var uploadHookHelper: Any = js.native
    
    /**
      * Collection of additional hooks for processing assets.
      * @type {Array<Function>}
      */
    var uploadHooks: js.Array[Any] = js.native
  }
  /* static members */
  object BasePrepare {
    
    @JSImport("@pixi/prepare/lib/BasePrepare", "BasePrepare")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default maximum uploads per frame.
      * @static
      */
    @JSImport("@pixi/prepare/lib/BasePrepare", "BasePrepare.uploadsPerFrame")
    @js.native
    def uploadsPerFrame: Double = js.native
    inline def uploadsPerFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uploadsPerFrame")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDisplayObjectExtended
    extends typings.pixiDisplay.mod.DisplayObject {
    
    var _texture: js.UndefOr[Texture[Resource]] = js.native
    
    var _textures: js.UndefOr[js.Array[Texture[Resource]]] = js.native
    
    var style: js.UndefOr[TextStyle | PartialTextStyle] = js.native
  }
  
  type IFindHook = js.Function2[/* item */ Any, /* queue */ js.Array[Any], Boolean]
  
  type IUploadHook = js.Function2[
    /* helper */ IRenderer[ICanvas] | BasePrepare, 
    /* item */ IDisplayObjectExtended, 
    Boolean
  ]
}
