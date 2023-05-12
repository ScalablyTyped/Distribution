package typings.ol

import typings.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconImageCacheMod {
  
  /**
    * @classdesc
    * Singleton class. Available through {@link module:ol/style/IconImageCache.shared}.
    */
  @JSImport("ol/style/IconImageCache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IconImageCache
  
  @JSImport("ol/style/IconImageCache", "shared")
  @js.native
  val shared: IconImageCache = js.native
  
  /**
    * @classdesc
    * Singleton class. Available through {@link module:ol/style/IconImageCache.shared}.
    */
  @js.native
  trait IconImageCache extends StObject {
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var cacheSize_ : Any = js.native
    
    /**
      * @type {!Object<string, import("./IconImage.js").default>}
      * @private
      */
    /* private */ var cache_ : Any = js.native
    
    /**
      * @return {boolean} Can expire cache.
      */
    def canExpireCache(): Boolean = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    def expire(): Unit = js.native
    
    /**
      * @param {string} src Src.
      * @param {?string} crossOrigin Cross origin.
      * @param {import("../color.js").Color} color Color.
      * @return {import("./IconImage.js").default} Icon image.
      */
    def get(src: String, crossOrigin: String, color: Color): typings.ol.styleIconImageMod.default = js.native
    def get(src: String, crossOrigin: Null, color: Color): typings.ol.styleIconImageMod.default = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var maxCacheSize_ : Any = js.native
    
    /**
      * @param {string} src Src.
      * @param {?string} crossOrigin Cross origin.
      * @param {import("../color.js").Color} color Color.
      * @param {import("./IconImage.js").default} iconImage Icon image.
      */
    def set(src: String, crossOrigin: String, color: Color, iconImage: typings.ol.styleIconImageMod.default): Unit = js.native
    def set(src: String, crossOrigin: Null, color: Color, iconImage: typings.ol.styleIconImageMod.default): Unit = js.native
    
    /**
      * Set the cache size of the icon cache. Default is `32`. Change this value when
      * your map uses more than 32 different icon images and you are not caching icon
      * styles on the application level.
      * @param {number} maxCacheSize Cache max size.
      * @api
      */
    def setSize(maxCacheSize: Double): Unit = js.native
  }
}
