package typings.pixiAssets

import typings.pixiAssets.libResolverTypesMod.PreferOrder
import typings.pixiAssets.libResolverTypesMod.ResolveAsset
import typings.pixiAssets.libResolverTypesMod.ResolveURLParser
import typings.pixiAssets.libResolverTypesMod.ResolverAssetsArray
import typings.pixiAssets.libResolverTypesMod.ResolverAssetsObject
import typings.pixiAssets.libResolverTypesMod.ResolverManifest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolverResolverMod {
  
  @JSImport("@pixi/assets/lib/resolver/Resolver", "Resolver")
  @js.native
  open class Resolver () extends StObject {
    
    /**
      * Appends the default url parameters to the url
      * @param url - The url to append the default parameters to
      * @returns - The url with the default parameters appended
      */
    /* private */ var _appendDefaultSearchParams: Any = js.native
    
    /* private */ var _assetMap: Any = js.native
    
    /* private */ var _basePath: Any = js.native
    
    /** The character that is used to connect the bundleId and the assetId when generating a bundle asset id key */
    /* private */ var _bundleIdConnector: Any = js.native
    
    /* private */ var _bundles: Any = js.native
    
    /**
      * A function that generates a bundle asset id key from a bundleId and an assetId
      * @param bundleId - the bundleId
      * @param assetId  - the assetId
      * @returns the bundle asset id key
      */
    /* private */ var _createBundleAssetId: Any = js.native
    
    /* private */ var _defaultBundleIdentifierOptions: Any = js.native
    
    /* private */ var _defaultSearchParams: Any = js.native
    
    /**
      * A function that generates an assetId from a bundle asset id key. This is the reverse of generateBundleAssetId
      * @param bundleId - the bundleId
      * @param assetBundleId - the bundle asset id key
      * @returns the assetId
      */
    /* private */ var _extractAssetIdFromBundle: Any = js.native
    
    /**
      * Internal function for figuring out what prefer criteria an asset should use.
      * @param assets
      */
    /* private */ var _getPreferredOrder: Any = js.native
    
    /* private */ var _manifest: Any = js.native
    
    /* private */ var _parsers: Any = js.native
    
    /* private */ var _preferredOrder: Any = js.native
    
    /* private */ var _resolverHash: Any = js.native
    
    /* private */ var _rootPath: Any = js.native
    
    /**
      * Tells the resolver what keys are associated with witch asset.
      * The most important thing the resolver does
      * @example
      * // Single key, single asset:
      * resolver.add('foo', 'bar.png');
      * resolver.resolveUrl('foo') // => 'bar.png'
      *
      * // Multiple keys, single asset:
      * resolver.add(['foo', 'boo'], 'bar.png');
      * resolver.resolveUrl('foo') // => 'bar.png'
      * resolver.resolveUrl('boo') // => 'bar.png'
      *
      * // Multiple keys, multiple assets:
      * resolver.add(['foo', 'boo'], ['bar.png', 'bar.webp']);
      * resolver.resolveUrl('foo') // => 'bar.png'
      *
      * // Add custom data attached to the resolver
      * Resolver.add(
      *     'bunnyBooBooSmooth',
      *     'bunny{png,webp}',
      *     { scaleMode:SCALE_MODES.NEAREST }, // Base texture options
      * );
      *
      * resolver.resolve('bunnyBooBooSmooth') // => { src: 'bunny.png', data: { scaleMode: SCALE_MODES.NEAREST } }
      * @param keysIn - The keys to map, can be an array or a single key
      * @param assetsIn - The assets to associate with the key(s)
      * @param data - The data that will be attached to the object that resolved object.
      */
    def add(keysIn: String, assetsIn: String): Unit = js.native
    def add(keysIn: String, assetsIn: String, data: Any): Unit = js.native
    def add(keysIn: String, assetsIn: js.Array[String | ResolveAsset]): Unit = js.native
    def add(keysIn: String, assetsIn: js.Array[String | ResolveAsset], data: Any): Unit = js.native
    def add(keysIn: String, assetsIn: ResolveAsset): Unit = js.native
    def add(keysIn: String, assetsIn: ResolveAsset, data: Any): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: String): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: String, data: Any): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: js.Array[String | ResolveAsset]): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: js.Array[String | ResolveAsset], data: Any): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: ResolveAsset): Unit = js.native
    def add(keysIn: js.Array[String], assetsIn: ResolveAsset, data: Any): Unit = js.native
    
    /**
      * This adds a bundle of assets in one go so that you can resolve them as a group.
      * For example you could add a bundle for each screen in you pixi app
      * @example
      * resolver.addBundle('animals', {
      *     bunny: 'bunny.png',
      *     chicken: 'chicken.png',
      *     thumper: 'thumper.png',
      * });
      *
      * const resolvedAssets = await resolver.resolveBundle('animals');
      * @param bundleId - The id of the bundle to add
      * @param assets - A record of the asset or assets that will be chosen from when loading via the specified key
      */
    def addBundle(bundleId: String, assets: ResolverAssetsArray): Unit = js.native
    def addBundle(bundleId: String, assets: ResolverAssetsObject): Unit = js.native
    
    /**
      * Add a manifest to the asset resolver. This is a nice way to add all the asset information in one go.
      * generally a manifest would be built using a tool.
      * @param manifest - the manifest to add to the resolver
      */
    def addManifest(manifest: ResolverManifest): Unit = js.native
    
    def basePath: String = js.native
    /**
      * Set the base path to prepend to all urls when resolving
      * @example
      * resolver.basePath = 'https://home.com/';
      * resolver.add('foo', 'bar.ong');
      * resolver.resolveUrl('foo', 'bar.png'); // => 'https://home.com/bar.png'
      * @param basePath - the base path to use
      */
    def basePath_=(basePath: String): Unit = js.native
    
    /**
      * Checks if a bundle with the given key exists in the resolver
      * @param key - The key of the bundle
      */
    def hasBundle(key: String): Boolean = js.native
    
    /**
      * Checks if an asset with a given key exists in the resolver
      * @param key - The key of the asset
      */
    def hasKey(key: String): Boolean = js.native
    
    /**
      * All the active URL parsers that help the parser to extract information and create
      * an asset object-based on parsing the URL itself.
      *
      * Can be added using the extensions API
      * @example
      * resolver.add('foo', [
      *     {
      *         resolution: 2,
      *         format: 'png',
      *         src: 'image@2x.png',
      *     },
      *     {
      *         resolution:1,
      *         format:'png',
      *         src: 'image.png',
      *     },
      * ]);
      *
      * // With a url parser the information such as resolution and file format could extracted from the url itself:
      * extensions.add({
      *     extension: ExtensionType.ResolveParser,
      *     test: loadTextures.test, // test if url ends in an image
      *     parse: (value: string) =>
      *     ({
      *         resolution: parseFloat(settings.RETINA_PREFIX.exec(value)?.[1] ?? '1'),
      *         format: value.split('.').pop(),
      *         src: value,
      *     }),
      * });
      *
      * // Now resolution and format can be extracted from the url
      * resolver.add('foo', [
      *     'image@2x.png',
      *     'image.png',
      * ]);
      */
    def parsers: js.Array[ResolveURLParser] = js.native
    
    /**
      * Let the resolver know which assets you prefer to use when resolving assets.
      * Multiple prefer user defined rules can be added.
      * @example
      * resolver.prefer({
      *     // first look for something with the correct format, and then then correct resolution
      *     priority: ['format', 'resolution'],
      *     params:{
      *         format:'webp', // prefer webp images
      *         resolution: 2, // prefer a resolution of 2
      *     }
      * })
      * resolver.add('foo', ['bar@2x.webp', 'bar@2x.png', 'bar.webp', 'bar.png']);
      * resolver.resolveUrl('foo') // => 'bar@2x.webp'
      * @param preferOrders - the prefer options
      */
    def prefer(preferOrders: PreferOrder*): Unit = js.native
    
    /** Used for testing, this resets the resolver to its initial state */
    def reset(): Unit = js.native
    
    /**
      * Resolves each key in the list to an asset object.
      * Another key function of the resolver! After adding all the various key/asset pairs. this will run the logic
      * of finding which asset to return based on any preferences set using the `prefer` function
      * by default the same key passed in will be returned if nothing is matched by the resolver.
      * @example
      * resolver.add('boo', 'bunny.png');
      *
      * resolver.resolve('boo') // => { src: 'bunny.png' }
      *
      * // Will return the same string as no key was added for this value..
      * resolver.resolve('another-thing.png') // => { src: 'another-thing.png' }
      * @param keys - key or keys to resolve
      * @returns - the resolve asset or a hash of resolve assets for each key specified
      */
    def resolve(keys: String): ResolveAsset | (Record[String, ResolveAsset]) = js.native
    def resolve(keys: js.Array[String]): ResolveAsset | (Record[String, ResolveAsset]) = js.native
    
    /**
      * If the resolver has had a manifest set via setManifest, this will return the assets urls for
      * a given bundleId or bundleIds.
      * @example
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
      * resolver.setManifest(manifest);
      * const resolved = resolver.resolveBundle('load-screen');
      * @param bundleIds - The bundle ids to resolve
      * @returns All the bundles assets or a hash of assets for each bundle specified
      */
    def resolveBundle(bundleIds: String): Record[String, (Record[String, ResolveAsset]) | ResolveAsset] = js.native
    def resolveBundle(bundleIds: js.Array[String]): Record[String, (Record[String, ResolveAsset]) | ResolveAsset] = js.native
    
    /**
      * Does exactly what resolve does, but returns just the URL rather than the whole asset object
      * @param key - The key or keys to resolve
      * @returns - The URLs associated with the key(s)
      */
    def resolveUrl(key: String): String | (Record[String, String]) = js.native
    def resolveUrl(key: js.Array[String]): String | (Record[String, String]) = js.native
    
    def rootPath: String = js.native
    /**
      * Set the root path for root-relative URLs. By default the `basePath`'s root is used. If no `basePath` is set, then the
      * default value for browsers is `window.location.origin`
      * @example
      * // Application hosted on https://home.com/some-path/index.html
      * resolver.basePath = 'https://home.com/some-path/';
      * resolver.rootPath = 'https://home.com/';
      * resolver.add('foo', '/bar.png');
      * resolver.resolveUrl('foo', '/bar.png'); // => 'https://home.com/bar.png'
      * @param rootPath - the root path to use
      */
    def rootPath_=(rootPath: String): Unit = js.native
    
    /**
      * Override how the resolver deals with generating bundle ids.
      * must be called before any bundles are added
      * @param bundleIdentifier - the bundle identifier options
      */
    def setBundleIdentifier(bundleIdentifier: BundleIdentifierOptions): Unit = js.native
    
    /**
      * Sets the default URL search parameters for the URL resolver. The urls can be specified as a string or an object.
      * @param searchParams - the default url parameters to append when resolving urls
      */
    def setDefaultSearchParams(searchParams: String): Unit = js.native
    def setDefaultSearchParams(searchParams: Record[String, Any]): Unit = js.native
  }
  
  trait BundleIdentifierOptions extends StObject {
    
    /** The character that is used to connect the bundleId and the assetId when generating a bundle asset id key */
    var connector: js.UndefOr[String] = js.undefined
    
    /**
      * A function that generates a bundle asset id key from a bundleId and an assetId
      * @param bundleId - the bundleId
      * @param assetId  - the assetId
      * @returns the bundle asset id key
      */
    var createBundleAssetId: js.UndefOr[js.Function2[/* bundleId */ String, /* assetId */ String, String]] = js.undefined
    
    /**
      * A function that generates an assetId from a bundle asset id key. This is the reverse of generateBundleAssetId
      * @param bundleId - the bundleId
      * @param assetBundleId - the bundle asset id key
      * @returns the assetId
      */
    var extractAssetIdFromBundle: js.UndefOr[js.Function2[/* bundleId */ String, /* assetBundleId */ String, String]] = js.undefined
  }
  object BundleIdentifierOptions {
    
    inline def apply(): BundleIdentifierOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BundleIdentifierOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleIdentifierOptions] (val x: Self) extends AnyVal {
      
      inline def setConnector(value: String): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      inline def setCreateBundleAssetId(value: (/* bundleId */ String, /* assetId */ String) => String): Self = StObject.set(x, "createBundleAssetId", js.Any.fromFunction2(value))
      
      inline def setCreateBundleAssetIdUndefined: Self = StObject.set(x, "createBundleAssetId", js.undefined)
      
      inline def setExtractAssetIdFromBundle(value: (/* bundleId */ String, /* assetBundleId */ String) => String): Self = StObject.set(x, "extractAssetIdFromBundle", js.Any.fromFunction2(value))
      
      inline def setExtractAssetIdFromBundleUndefined: Self = StObject.set(x, "extractAssetIdFromBundle", js.undefined)
    }
  }
}
