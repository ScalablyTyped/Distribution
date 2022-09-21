package typings.pixiSpritesheet

import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiLoaders.mod.LoaderResource
import typings.pixiMath.mod.IPointData
import typings.pixiSpritesheet.anon.H
import typings.pixiSpritesheet.anon.Relatedmultipacks
import typings.pixiSpritesheet.anon.W
import typings.pixiSpritesheet.anon.X
import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/spritesheet", "Spritesheet")
  @js.native
  open class Spritesheet protected () extends StObject {
    /**
      * @param texture - Reference to the source BaseTexture object.
      * @param {object} data - Spritesheet image data.
      * @param resolutionFilename - The filename to consider when determining
      *        the resolution of the spritesheet. If not provided, the imageUrl will
      *        be used on the BaseTexture.
      */
    def this(texture: BaseTexture[Resource, IAutoDetectOptions], data: ISpritesheetData) = this()
    def this(texture: Texture[Resource], data: ISpritesheetData) = this()
    def this(
      texture: BaseTexture[Resource, IAutoDetectOptions],
      data: ISpritesheetData,
      resolutionFilename: String
    ) = this()
    def this(texture: Texture[Resource], data: ISpritesheetData, resolutionFilename: String) = this()
    
    /** Current batch index being processed. */
    /* private */ var _batchIndex: Any = js.native
    
    /**
      * Callback when parse is completed.
      * @type {Function}
      */
    /* private */ var _callback: Any = js.native
    
    /** Collection of frame names. */
    /* private */ var _frameKeys: Any = js.native
    
    /**
      * Map of spritesheet frames.
      * @type {object}
      */
    /* private */ var _frames: Any = js.native
    
    /** Begin the next batch of textures. */
    /* private */ var _nextBatch: Any = js.native
    
    /** The parse has completed. */
    /* private */ var _parseComplete: Any = js.native
    
    /** Parse animations config. */
    /* private */ var _processAnimations: Any = js.native
    
    /**
      * Process a batch of frames
      * @param initialFrameIndex - The index of frame to start.
      */
    /* private */ var _processFrames: Any = js.native
    
    /**
      * Reference to original source image from the Loader. This reference is retained so we
      * can destroy the Texture later on. It is never used internally.
      */
    /* private */ var _texture: Any = js.native
    
    /**
      * Generate the resolution from the filename or fallback
      * to the meta.scale field of the JSON data.
      * @param resolutionFilename - The filename to use for resolving
      *        the default resolution.
      * @returns Resolution to use for spritesheet.
      */
    /* private */ var _updateResolution: Any = js.native
    
    /**
      * A map containing the textures for each animation.
      * Can be used to create an {@link PIXI.AnimatedSprite|AnimatedSprite}:
      * ```js
      * new PIXI.AnimatedSprite(sheet.animations["anim_name"])
      * ```
      */
    var animations: Dict[js.Array[Texture[Resource]]] = js.native
    
    /** Reference to ths source texture. */
    var baseTexture: BaseTexture[Resource, IAutoDetectOptions] = js.native
    
    /**
      * Reference to the original JSON data.
      * @type {object}
      */
    var data: ISpritesheetData = js.native
    
    /**
      * Destroy Spritesheet and don't use after this.
      * @param {boolean} [destroyBase=false] - Whether to destroy the base texture as well
      */
    def destroy(): Unit = js.native
    def destroy(destroyBase: Boolean): Unit = js.native
    
    /** For multi-packed spritesheets, this contains a reference to all the other spritesheets it depends on. */
    var linkedSheets: js.Array[Spritesheet] = js.native
    
    /**
      * Please use the Promise-based version of this function.
      * @method PIXI.Spritesheet#parse
      * @deprecated since version 6.5.0
      * @param {Function} callback - Callback when complete returns
      *        a map of the Textures for this spritesheet.
      */
    def parse(): Unit = js.native
    def parse(callback: js.Function1[/* textures */ js.UndefOr[Dict[Texture[Resource]]], Unit]): Unit = js.native
    /**
      * Parser spritesheet from loaded data. This is done asynchronously
      * to prevent creating too many Texture within a single process.
      * @method PIXI.Spritesheet#parse
      */
    @JSName("parse")
    def parse_Promise(): js.Promise[Dict[Texture[Resource]]] = js.native
    
    /** The resolution of the spritesheet. */
    var resolution: Double = js.native
    
    /**
      * A map containing all textures of the sprite sheet.
      * Can be used to create a {@link PIXI.Sprite|Sprite}:
      * ```js
      * new PIXI.Sprite(sheet.textures["image.png"]);
      * ```
      */
    var textures: Dict[Texture[Resource]] = js.native
  }
  /* static members */
  object Spritesheet {
    
    /** The maximum number of Textures to build per process. */
    @JSImport("@pixi/spritesheet", "Spritesheet.BATCH_SIZE")
    @js.native
    val BATCH_SIZE: /* 1000 */ Double = js.native
  }
  
  @JSImport("@pixi/spritesheet", "SpritesheetLoader")
  @js.native
  open class SpritesheetLoader () extends StObject
  /* static members */
  object SpritesheetLoader {
    
    @JSImport("@pixi/spritesheet", "SpritesheetLoader")
    @js.native
    val ^ : js.Any = js.native
    
    /** @ignore */
    @JSImport("@pixi/spritesheet", "SpritesheetLoader.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
    
    /**
      * Get the spritesheets root path
      * @param resource - Resource to check path
      * @param baseUrl - Base root url
      */
    inline def getResourcePath(resource: LoaderResource, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourcePath")(resource.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Called after a resource is loaded.
      * @see PIXI.Loader.loaderMiddleware
      * @param resource
      * @param next
      */
    inline def use(resource: LoaderResource, next: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait ISpritesheetData extends StObject {
    
    var animations: js.UndefOr[Dict[js.Array[String]]] = js.undefined
    
    var frames: Dict[ISpritesheetFrameData]
    
    var meta: Relatedmultipacks
  }
  object ISpritesheetData {
    
    inline def apply(frames: Dict[ISpritesheetFrameData], meta: Relatedmultipacks): ISpritesheetData = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpritesheetData]
    }
    
    extension [Self <: ISpritesheetData](x: Self) {
      
      inline def setAnimations(value: Dict[js.Array[String]]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
      
      inline def setFrames(value: Dict[ISpritesheetFrameData]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Relatedmultipacks): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISpritesheetFrameData extends StObject {
    
    var anchor: js.UndefOr[IPointData] = js.undefined
    
    var frame: H
    
    var rotated: js.UndefOr[Boolean] = js.undefined
    
    var sourceSize: js.UndefOr[W] = js.undefined
    
    var spriteSourceSize: js.UndefOr[X] = js.undefined
    
    var trimmed: js.UndefOr[Boolean] = js.undefined
  }
  object ISpritesheetFrameData {
    
    inline def apply(frame: H): ISpritesheetFrameData = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpritesheetFrameData]
    }
    
    extension [Self <: ISpritesheetFrameData](x: Self) {
      
      inline def setAnchor(value: IPointData): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setFrame(value: H): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
      
      inline def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
      
      inline def setSourceSize(value: W): Self = StObject.set(x, "sourceSize", value.asInstanceOf[js.Any])
      
      inline def setSourceSizeUndefined: Self = StObject.set(x, "sourceSize", js.undefined)
      
      inline def setSpriteSourceSize(value: X): Self = StObject.set(x, "spriteSourceSize", value.asInstanceOf[js.Any])
      
      inline def setSpriteSourceSizeUndefined: Self = StObject.set(x, "spriteSourceSize", js.undefined)
      
      inline def setTrimmed(value: Boolean): Self = StObject.set(x, "trimmed", value.asInstanceOf[js.Any])
      
      inline def setTrimmedUndefined: Self = StObject.set(x, "trimmed", js.undefined)
    }
  }
}
