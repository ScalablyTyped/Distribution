package typings.pixiAssets

import typings.pixiAssets.libLoaderLoaderMod.Loader
import typings.pixiAssets.libLoaderTypesMod.LoadAsset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBackgroundLoaderMod {
  
  @JSImport("@pixi/assets/lib/BackgroundLoader", "BackgroundLoader")
  @js.native
  open class BackgroundLoader protected () extends StObject {
    /**
      * @param loader
      * @param verbose - should the loader log to the console
      */
    def this(loader: Loader) = this()
    def this(loader: Loader, verbose: Boolean) = this()
    
    /** Assets to load. */
    /* private */ val _assetList: Any = js.native
    
    /** Whether or not the loader should continue loading. */
    /* private */ var _isActive: Any = js.native
    
    /** Whether or not the loader is loading. */
    /* private */ var _isLoading: Any = js.native
    
    /* private */ val _loader: Any = js.native
    
    /** Number of assets to load at a time. */
    /* private */ val _maxConcurrent: Any = js.native
    
    /**
      * Loads the next set of assets. Will try to load as many assets as it can at the same time.
      *
      * The max assets it will try to load at one time will be 4.
      */
    /* private */ var _next: Any = js.native
    
    /**
      * Activate/Deactivate the loading. If set to true then it will immediately continue to load the next asset.
      * @returns whether the class is active
      */
    def active: Boolean = js.native
    def active_=(value: Boolean): Unit = js.native
    
    /**
      * Adds an array of assets to load.
      * @param assetUrls - assets to load
      */
    def add(assetUrls: js.Array[LoadAsset[Any]]): Unit = js.native
    
    /** Should the loader log to the console. */
    var verbose: Boolean = js.native
  }
}
