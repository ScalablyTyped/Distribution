package typings.pixiAssets

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiAssets.libLoaderTypesMod.LoadAsset
import typings.pixiAssets.libLoaderTypesMod.PromiseAndParser
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderLoaderMod {
  
  @JSImport("@pixi/assets/lib/loader/Loader", "Loader")
  @js.native
  open class Loader () extends StObject {
    
    /**
      * Used internally to generate a promise for the asset to be loaded.
      * @param url - The URL to be loaded
      * @param data - any custom additional information relevant to the asset being loaded
      * @returns - a promise that will resolve to an Asset for example a Texture of a JSON object
      */
    /* private */ var _getLoadPromiseAndParser: Any = js.native
    
    /* private */ var _parserHash: Any = js.native
    
    /* private */ var _parsers: Any = js.native
    
    /* private */ var _parsersValidated: Any = js.native
    
    /** validates our parsers, right now it only checks for name conflicts but we can add more here as required! */
    /* private */ var _validateParsers: Any = js.native
    
    /**
      * Loads one or more assets using the parsers added to the Loader.
      * @example
      * // Single asset:
      * const asset = await Loader.load('cool.png');
      * console.log(asset);
      *
      * // Multiple assets:
      * const assets = await Loader.load(['cool.png', 'cooler.png']);
      * console.log(assets);
      * @param assetsToLoadIn - urls that you want to load, or a single one!
      * @param onProgress - For multiple asset loading only, an optional function that is called
      * when progress on asset loading is made. The function is passed a single parameter, `progress`,
      * which represents the percentage (0.0 - 1.0) of the assets loaded. Do not use this function
      * to detect when assets are complete and available, instead use the Promise returned by this function.
      */
    def load[T](assetsToLoadIn: String): js.Promise[T] = js.native
    def load[T](assetsToLoadIn: String, onProgress: js.Function1[/* progress */ Double, Unit]): js.Promise[T] = js.native
    def load[T](assetsToLoadIn: js.Array[LoadAsset[Any] | String]): js.Promise[Record[String, T]] = js.native
    def load[T](
      assetsToLoadIn: js.Array[LoadAsset[Any] | String],
      onProgress: js.Function1[/* progress */ Double, Unit]
    ): js.Promise[Record[String, T]] = js.native
    def load[T](assetsToLoadIn: LoadAsset[Any]): js.Promise[T] = js.native
    def load[T](assetsToLoadIn: LoadAsset[Any], onProgress: js.Function1[/* progress */ Double, Unit]): js.Promise[T] = js.native
    
    /** All loader parsers registered */
    var parsers: js.Array[LoaderParser[Any, Any, Record[String, Any]]] = js.native
    
    /** Cache loading promises that ae currently active */
    var promiseCache: Record[String, PromiseAndParser] = js.native
    
    /** function used for testing */
    def reset(): Unit = js.native
    
    /**
      * Unloads one or more assets. Any unloaded assets will be destroyed, freeing up memory for your app.
      * The parser that created the asset, will be the one that unloads it.
      * @example
      * // Single asset:
      * const asset = await Loader.load('cool.png');
      *
      * await Loader.unload('cool.png');
      *
      * console.log(asset.destroyed); // true
      * @param assetsToUnloadIn - urls that you want to unload, or a single one!
      */
    def unload(assetsToUnloadIn: String): js.Promise[Unit] = js.native
    def unload(assetsToUnloadIn: js.Array[LoadAsset[Any] | String]): js.Promise[Unit] = js.native
    def unload(assetsToUnloadIn: LoadAsset[Any]): js.Promise[Unit] = js.native
  }
}
