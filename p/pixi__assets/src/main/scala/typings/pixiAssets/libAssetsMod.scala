package typings.pixiAssets

import typings.pixiAssets.anon.Format
import typings.pixiAssets.libCacheCacheMod.CacheClass
import typings.pixiAssets.libDetectionsMod.FormatDetectionParser
import typings.pixiAssets.libLoaderLoaderMod.Loader
import typings.pixiAssets.libLoaderParsersTexturesLoadTexturesMod.LoadTextureConfig
import typings.pixiAssets.libLoaderTypesMod.LoadAsset
import typings.pixiAssets.libResolverResolverMod.BundleIdentifierOptions
import typings.pixiAssets.libResolverResolverMod.Resolver
import typings.pixiAssets.libResolverTypesMod.ResolveAsset
import typings.pixiAssets.libResolverTypesMod.ResolverAssetsArray
import typings.pixiAssets.libResolverTypesMod.ResolverAssetsObject
import typings.pixiAssets.libResolverTypesMod.ResolverManifest
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAssetsMod {
  
  @JSImport("@pixi/assets/lib/Assets", "Assets")
  @js.native
  val Assets: AssetsClass = js.native
  
  @JSImport("@pixi/assets/lib/Assets", "AssetsClass")
  @js.native
  open class AssetsClass () extends StObject {
    
    /** takes care of loading assets in the background */
    /* private */ val _backgroundLoader: Any = js.native
    
    /* private */ var _detections: Any = js.native
    
    /* private */ var _initialized: Any = js.native
    
    /**
      * helper function to map resolved assets back to loaded assets
      * @param resolveResults - the resolve results from the resolver
      * @param onProgress - the progress callback
      */
    /* private */ var _mapLoadToResolve: Any = js.native
    
    /* private */ var _unloadFromResolved: Any = js.native
    
    /**
      * Allows you to specify how to resolve any assets load requests.
      * There are a few ways to add things here as shown below:
      * @example
      * import { Assets } from 'pixi.js';
      *
      * // Simple
      * Assets.add('bunnyBooBoo', 'bunny.png');
      * const bunny = await Assets.load('bunnyBooBoo');
      *
      * // Multiple keys:
      * Assets.add(['burger', 'chicken'], 'bunny.png');
      *
      * const bunny = await Assets.load('burger');
      * const bunny2 = await Assets.load('chicken');
      *
      * // passing options to to the object
      * Assets.add(
      *     'bunnyBooBooSmooth',
      *     'bunny{png,webp}',
      *     { scaleMode: SCALE_MODES.NEAREST }, // Base texture options
      * );
      *
      * // Multiple assets
      *
      * // The following all do the same thing:
      *
      * Assets.add('bunnyBooBoo', 'bunny{png,webp}');
      *
      * Assets.add('bunnyBooBoo', [
      *     'bunny.png',
      *     'bunny.webp',
      * ]);
      *
      * Assets.add('bunnyBooBoo', [
      *     {
      *         format: 'png',
      *         src: 'bunny.png',
      *     },
      *     {
      *         format: 'webp',
      *         src: 'bunny.webp',
      *     },
      * ]);
      *
      * const bunny = await Assets.load('bunnyBooBoo'); // Will try to load WebP if available
      * @param keysIn - the key or keys that you will reference when loading this asset
      * @param assetsIn - the asset or assets that will be chosen from when loading via the specified key
      * @param data - asset-specific data that will be passed to the loaders
      * - Useful if you want to initiate loaded objects with specific data
      */
    def add(keysIn: String, assetsIn: String): Unit = js.native
    def add(keysIn: String, assetsIn: String, data: Any): Unit = js.native
    def add(keysIn: String, assetsIn: js.Array[ResolveAsset | String]): Unit = js.native
    def add(keysIn: String, assetsIn: js.Array[ResolveAsset | String], data: Any): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: String): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: String, data: Any): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: js.Array[ResolveAsset | String]): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: js.Array[ResolveAsset | String], data: Any): Unit = js.native
    
    /**
      * This adds a bundle of assets in one go so that you can load them as a group.
      * For example you could add a bundle for each screen in you pixi app
      * @example
      * import { Assets } from 'pixi.js';
      *
      * Assets.addBundle('animals', {
      *     bunny: 'bunny.png',
      *     chicken: 'chicken.png',
      *     thumper: 'thumper.png',
      * });
      *
      * const assets = await Assets.loadBundle('animals');
      * @param bundleId - the id of the bundle to add
      * @param assets - a record of the asset or assets that will be chosen from when loading via the specified key
      */
    def addBundle(bundleId: String, assets: ResolverAssetsArray): Unit = js.native
    def addBundle(bundleId: String, assets: ResolverAssetsObject): Unit = js.native
    
    /**
      * Initiate a background load of some assets. It will passively begin to load these assets in the background.
      * So when you actually come to loading them you will get a promise that resolves to the loaded assets immediately
      *
      * An example of this might be that you would background load game assets after your inital load.
      * then when you got to actually load your game screen assets when a player goes to the game - the loading
      * would already have stared or may even be complete, saving you having to show an interim load bar.
      * @example
      * import { Assets } from 'pixi.js';
      *
      * Assets.backgroundLoad('bunny.png');
      *
      * // later on in your app...
      * await Assets.loadBundle('bunny.png'); // Will resolve quicker as loading may have completed!
      * @param urls - the url / urls you want to background load
      */
    def backgroundLoad(urls: String): js.Promise[Unit] = js.native
    def backgroundLoad(urls: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Initiate a background of a bundle, works exactly like backgroundLoad but for bundles.
      * this can only be used if the loader has been initiated with a manifest
      * @example
      * import { Assets } from 'pixi.js';
      *
      * await Assets.init({
      *     manifest: {
      *         bundles: [
      *             {
      *                 name: 'load-screen',
      *                 assets: [...],
      *             },
      *             ...
      *         ],
      *     },
      * });
      *
      * Assets.backgroundLoadBundle('load-screen');
      *
      * // Later on in your app...
      * await Assets.loadBundle('load-screen'); // Will resolve quicker as loading may have completed!
      * @param bundleIds - the bundleId / bundleIds you want to background load
      */
    def backgroundLoadBundle(bundleIds: String): js.Promise[Unit] = js.native
    def backgroundLoadBundle(bundleIds: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * The global cache of all assets within PixiJS
      * @type {PIXI.Cache}
      */
    var cache: CacheClass = js.native
    
    /** All the detection parsers currently added to the Assets class. */
    def detections: js.Array[FormatDetectionParser] = js.native
    
    /**
      * Instantly gets an asset already loaded from the cache. If the asset has not yet been loaded,
      * it will return undefined. So it's on you! When in doubt just use `Assets.load` instead.
      * (Remember, the loader will never load things more than once!)
      * @param keys - The key or keys for the assets that you want to access
      * @returns - The assets or hash of assets requested
      */
    def get[T](keys: String): T = js.native
    def get[T](keys: js.Array[String]): Record[String, T] = js.native
    
    /**
      * Best practice is to call this function before any loading commences
      * Initiating is the best time to add any customization to the way things are loaded.
      *
      * you do not need to call this for the Asset class to work, only if you want to set any initial properties
      * @param options - options to initialize the Asset manager with
      */
    def init(): js.Promise[Unit] = js.native
    def init(options: AssetInitOptions): js.Promise[Unit] = js.native
    
    /**
      * Loads your assets! You pass in a key or URL and it will return a promise that
      * resolves to the loaded asset. If multiple assets a requested, it will return a hash of assets.
      *
      * Don't worry about loading things multiple times, behind the scenes assets are only ever loaded
      * once and the same promise reused behind the scenes so you can safely call this function multiple
      * times with the same key and it will always return the same asset.
      * @example
      * import { Assets } from 'pixi.js';
      *
      * // Load a URL:
      * const myImageTexture = await Assets.load('http://some.url.com/image.png'); // => returns a texture
      *
      * Assets.add('thumper', 'bunny.png');
      * Assets.add('chicko', 'chicken.png');
      *
      * // Load multiple assets:
      * const textures = await Assets.load(['thumper', 'chicko']); // => {thumper: Texture, chicko: Texture}
      * @param urls - the urls to load
      * @param onProgress - optional function that is called when progress on asset loading is made.
      * The function is passed a single parameter, `progress`, which represents the percentage
      * (0.0 - 1.0) of the assets loaded.
      * @returns - the assets that were loaded, either a single asset or a hash of assets
      */
    def load[T](urls: String): js.Promise[T] = js.native
    def load[T](urls: String, onProgress: ProgressCallback): js.Promise[T] = js.native
    def load[T](urls: js.Array[LoadAsset[Any] | String]): js.Promise[Record[String, T]] = js.native
    def load[T](urls: js.Array[LoadAsset[Any] | String], onProgress: ProgressCallback): js.Promise[Record[String, T]] = js.native
    def load[T](urls: LoadAsset[Any]): js.Promise[T] = js.native
    def load[T](urls: LoadAsset[Any], onProgress: ProgressCallback): js.Promise[T] = js.native
    
    /**
      * Bundles are a way to load multiple assets at once.
      * If a manifest has been provided to the init function then you can load a bundle, or bundles.
      * you can also add bundles via `addBundle`
      * @example
      * import { Assets } from 'pixi.js';
      *
      * // Manifest Example
      * const manifest = {
      *     bundles: [
      *         {
      *             name: 'load-screen',
      *             assets: [
      *                 {
      *                     name: 'background',
      *                     srcs: 'sunset.png',
      *                 },
      *                 {
      *                     name: 'bar',
      *                     srcs: 'load-bar.{png,webp}',
      *                 },
      *             ],
      *         },
      *         {
      *             name: 'game-screen',
      *             assets: [
      *                 {
      *                     name: 'character',
      *                     srcs: 'robot.png',
      *                 },
      *                 {
      *                     name: 'enemy',
      *                     srcs: 'bad-guy.png',
      *                 },
      *             ],
      *         },
      *     ]
      * };
      *
      * await Asset.init({ manifest });
      *
      * // Load a bundle...
      * loadScreenAssets = await Assets.loadBundle('load-screen');
      * // Load another bundle...
      * gameScreenAssets = await Assets.loadBundle('game-screen');
      * @param bundleIds - the bundle id or ids to load
      * @param onProgress - Optional function that is called when progress on asset loading is made.
      * The function is passed a single parameter, `progress`, which represents the percentage (0.0 - 1.0)
      * of the assets loaded. Do not use this function to detect when assets are complete and available,
      * instead use the Promise returned by this function.
      * @returns all the bundles assets or a hash of assets for each bundle specified
      */
    def loadBundle(bundleIds: String): js.Promise[Any] = js.native
    def loadBundle(bundleIds: String, onProgress: ProgressCallback): js.Promise[Any] = js.native
    def loadBundle(bundleIds: js.Array[String]): js.Promise[Any] = js.native
    def loadBundle(bundleIds: js.Array[String], onProgress: ProgressCallback): js.Promise[Any] = js.native
    
    /**
      * The loader, loads stuff!
      * @type {PIXI.AssetLoader}
      */
    var loader: Loader = js.native
    
    /**
      * @deprecated since 7.2.0
      * @see {@link Assets.setPreferences}
      */
    def preferWorkers: Boolean = js.native
    def preferWorkers_=(value: Boolean): Unit = js.native
    
    /**
      * Only intended for development purposes.
      * This will wipe the resolver and caches.
      * You will need to reinitialize the Asset
      */
    def reset(): Unit = js.native
    
    /** the resolver to map various urls */
    var resolver: Resolver = js.native
    
    /**
      * General setter for preferences. This is a helper function to set preferences on all parsers.
      * @param preferences - the preferences to set
      */
    def setPreferences(preferences: Partial[AssetsPreferences]): Unit = js.native
    
    /**
      * Unload an asset or assets. As the Assets class is responsible for creating the assets via the `load` function
      * this will make sure to destroy any assets and release them from memory.
      * Once unloaded, you will need to load the asset again.
      *
      * Use this to help manage assets if you find that you have a large app and you want to free up memory.
      *
      * - it's up to you as the developer to make sure that textures are not actively being used when you unload them,
      * Pixi won't break but you will end up with missing assets. Not a good look for the user!
      * @example
      * import { Assets } from 'pixi.js';
      *
      * // Load a URL:
      * const myImageTexture = await Assets.load('http://some.url.com/image.png'); // => returns a texture
      *
      * await Assets.unload('http://some.url.com/image.png')
      *
      * // myImageTexture will be destroyed now.
      *
      * // Unload multiple assets:
      * const textures = await Assets.unload(['thumper', 'chicko']);
      * @param urls - the urls to unload
      */
    def unload(urls: String): js.Promise[Unit] = js.native
    def unload(urls: js.Array[LoadAsset[Any] | String]): js.Promise[Unit] = js.native
    def unload(urls: LoadAsset[Any]): js.Promise[Unit] = js.native
    
    /**
      * Bundles are a way to manage multiple assets at once.
      * this will unload all files in a bundle.
      *
      * once a bundle has been unloaded, you need to load it again to have access to the assets.
      * @example
      * import { Assets } from 'pixi.js';
      *
      * Assets.addBundle({
      *     'thumper': 'http://some.url.com/thumper.png',
      * })
      *
      * const assets = await Assets.loadBundle('thumper');
      *
      * // Now to unload...
      *
      * await Assets.unloadBundle('thumper');
      *
      * // All assets in the assets object will now have been destroyed and purged from the cache
      * @param bundleIds - the bundle id or ids to unload
      */
    def unloadBundle(bundleIds: String): js.Promise[Unit] = js.native
    def unloadBundle(bundleIds: js.Array[String]): js.Promise[Unit] = js.native
  }
  
  trait AssetInitOptions extends StObject {
    
    /** a base path for any assets loaded */
    var basePath: js.UndefOr[String] = js.undefined
    
    /** advanced - override how bundlesIds are generated */
    var bundleIdentifier: js.UndefOr[BundleIdentifierOptions] = js.undefined
    
    /** a default URL parameter string to append to all assets loaded */
    var defaultSearchParams: js.UndefOr[String | (Record[String, Any])] = js.undefined
    
    /**
      * a manifest to tell the asset loader upfront what all your assets are
      * this can be the manifest object itself, or a URL to the manifest.
      */
    var manifest: js.UndefOr[String | ResolverManifest] = js.undefined
    
    /** Optional loader preferences */
    var preferences: js.UndefOr[Partial[AssetsPreferences]] = js.undefined
    
    /**
      * optional preferences for which textures preferences you have when resolving assets
      * for example you might set the resolution to 0.5 if the user is on a rubbish old phone
      * or you might set the resolution to 2 if the user is on a retina display
      */
    var texturePreference: js.UndefOr[Format] = js.undefined
  }
  object AssetInitOptions {
    
    inline def apply(): AssetInitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssetInitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssetInitOptions] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setBundleIdentifier(value: BundleIdentifierOptions): Self = StObject.set(x, "bundleIdentifier", value.asInstanceOf[js.Any])
      
      inline def setBundleIdentifierUndefined: Self = StObject.set(x, "bundleIdentifier", js.undefined)
      
      inline def setDefaultSearchParams(value: String | (Record[String, Any])): Self = StObject.set(x, "defaultSearchParams", value.asInstanceOf[js.Any])
      
      inline def setDefaultSearchParamsUndefined: Self = StObject.set(x, "defaultSearchParams", js.undefined)
      
      inline def setManifest(value: String | ResolverManifest): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setPreferences(value: Partial[AssetsPreferences]): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
      
      inline def setPreferencesUndefined: Self = StObject.set(x, "preferences", js.undefined)
      
      inline def setTexturePreference(value: Format): Self = StObject.set(x, "texturePreference", value.asInstanceOf[js.Any])
      
      inline def setTexturePreferenceUndefined: Self = StObject.set(x, "texturePreference", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.AssetsPreferences * / any */ trait AssetsPreferences
    extends StObject
       with LoadTextureConfig
  object AssetsPreferences {
    
    inline def apply(preferCreateImageBitmap: Boolean, preferWorkers: Boolean): AssetsPreferences = {
      val __obj = js.Dynamic.literal(preferCreateImageBitmap = preferCreateImageBitmap.asInstanceOf[js.Any], preferWorkers = preferWorkers.asInstanceOf[js.Any], crossOrigin = null)
      __obj.asInstanceOf[AssetsPreferences]
    }
  }
  
  type ProgressCallback = js.Function1[/* progress */ Double, Unit]
}
