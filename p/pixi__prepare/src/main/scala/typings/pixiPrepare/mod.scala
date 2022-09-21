package typings.pixiPrepare

import typings.pixiCore.mod.AbstractRenderer
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiDisplay.anon.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiPrepare.anon.PartialTextStyle
import typings.pixiText.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/prepare", "BasePrepare")
  @js.native
  open class BasePrepare protected () extends StObject {
    /**
      * @param {PIXI.AbstractRenderer} renderer - A reference to the current renderer
      */
    def this(renderer: AbstractRenderer) = this()
    
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
    /* protected */ var renderer: AbstractRenderer = js.native
    
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
      * Use the Promise-based API instead.
      * @method PIXI.BasePrepare#upload
      * @deprecated since version 6.5.0
      * @param {PIXI.DisplayObject|PIXI.Container|PIXI.BaseTexture|PIXI.Texture|PIXI.Graphics|PIXI.Text} item -
      *        Item to upload.
      * @param {Function} [done] - Callback when completed.
      */
    def upload(): Unit = js.native
    def upload(done: js.Function0[Unit]): Unit = js.native
    def upload(item: Unit, done: js.Function0[Unit]): Unit = js.native
    def upload(item: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
    def upload(item: BaseTexture[Resource, IAutoDetectOptions], done: js.Function0[Unit]): Unit = js.native
    def upload(item: Texture[Resource]): Unit = js.native
    def upload(item: Texture[Resource], done: js.Function0[Unit]): Unit = js.native
    def upload(item: Container[DisplayObject]): Unit = js.native
    def upload(item: Container[DisplayObject], done: js.Function0[Unit]): Unit = js.native
    def upload(item: IDisplayObjectExtended): Unit = js.native
    def upload(item: IDisplayObjectExtended, done: js.Function0[Unit]): Unit = js.native
    
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
    
    /**
      * Upload all the textures and graphics to the GPU.
      * @method PIXI.BasePrepare#upload
      * @param {PIXI.DisplayObject|PIXI.Container|PIXI.BaseTexture|PIXI.Texture|PIXI.Graphics|PIXI.Text} [item] -
      *        Container or display object to search for items to upload or the items to upload themselves,
      *        or optionally ommitted, if items have been added using {@link PIXI.BasePrepare#add `prepare.add`}.
      */
    @JSName("upload")
    def upload_Promise(): js.Promise[Unit] = js.native
    @JSName("upload")
    def upload_Promise(item: BaseTexture[Resource, IAutoDetectOptions]): js.Promise[Unit] = js.native
    @JSName("upload")
    def upload_Promise(item: Texture[Resource]): js.Promise[Unit] = js.native
    @JSName("upload")
    def upload_Promise(item: Container[DisplayObject]): js.Promise[Unit] = js.native
    @JSName("upload")
    def upload_Promise(item: IDisplayObjectExtended): js.Promise[Unit] = js.native
  }
  
  @JSImport("@pixi/prepare", "CountLimiter")
  @js.native
  open class CountLimiter protected () extends StObject {
    /**
      * @param maxItemsPerFrame - The maximum number of items that can be prepared each frame.
      */
    def this(maxItemsPerFrame: Double) = this()
    
    /**
      * Checks to see if another item can be uploaded. This should only be called once per item.
      * @returns If the item is allowed to be uploaded.
      */
    def allowedToUpload(): Boolean = js.native
    
    /** Resets any counting properties to start fresh on a new frame. */
    def beginFrame(): Unit = js.native
    
    /** The number of items that can be prepared in the current frame. */
    var itemsLeft: Double = js.native
    
    /** The maximum number of items that can be prepared each frame. */
    var maxItemsPerFrame: Double = js.native
  }
  
  @JSImport("@pixi/prepare", "Prepare")
  @js.native
  open class Prepare protected () extends BasePrepare {
    /**
      * @param {PIXI.Renderer} renderer - A reference to the current renderer
      */
    def this(renderer: Renderer) = this()
  }
  /* static members */
  object Prepare {
    
    /** @ignore */
    @JSImport("@pixi/prepare", "Prepare.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  @JSImport("@pixi/prepare", "TimeLimiter")
  @js.native
  open class TimeLimiter protected () extends StObject {
    /** @param maxMilliseconds - The maximum milliseconds that can be spent preparing items each frame. */
    def this(maxMilliseconds: Double) = this()
    
    /**
      * Checks to see if another item can be uploaded. This should only be called once per item.
      * @returns - If the item is allowed to be uploaded.
      */
    def allowedToUpload(): Boolean = js.native
    
    /** Resets any counting properties to start fresh on a new frame. */
    def beginFrame(): Unit = js.native
    
    /**
      * The start time of the current frame.
      * @readonly
      */
    var frameStart: Double = js.native
    
    /** The maximum milliseconds that can be spent preparing items each frame. */
    var maxMilliseconds: Double = js.native
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
    /* helper */ AbstractRenderer | BasePrepare, 
    /* item */ IDisplayObjectExtended, 
    Boolean
  ]
}
