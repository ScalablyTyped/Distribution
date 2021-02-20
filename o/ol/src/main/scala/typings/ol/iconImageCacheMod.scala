package typings.ol

import typings.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconImageCacheMod {
  
  @JSImport("ol/style/IconImageCache", JSImport.Default)
  @js.native
  class default () extends IconImageCache
  
  @JSImport("ol/style/IconImageCache", "shared")
  @js.native
  def shared(): Unit = js.native
  
  @js.native
  trait IconImageCache extends StObject {
    
    def canExpireCache(): Boolean = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    def expire(): Unit = js.native
    
    def get(src: String, crossOrigin: String, color: Color): typings.ol.iconImageMod.default = js.native
    
    def set(src: String, crossOrigin: String, color: Color, iconImage: typings.ol.iconImageMod.default): Unit = js.native
    
    /**
      * Set the cache size of the icon cache. Default is 32. Change this value when
      * your map uses more than 32 different icon images and you are not caching icon
      * styles on the application level.
      */
    def setSize(maxCacheSize: Double): Unit = js.native
  }
  object IconImageCache {
    
    @scala.inline
    def apply(
      canExpireCache: () => Boolean,
      clear: () => Unit,
      expire: () => Unit,
      get: (String, String, Color) => typings.ol.iconImageMod.default,
      set: (String, String, Color, typings.ol.iconImageMod.default) => Unit,
      setSize: Double => Unit
    ): IconImageCache = {
      val __obj = js.Dynamic.literal(canExpireCache = js.Any.fromFunction0(canExpireCache), clear = js.Any.fromFunction0(clear), expire = js.Any.fromFunction0(expire), get = js.Any.fromFunction3(get), set = js.Any.fromFunction4(set), setSize = js.Any.fromFunction1(setSize))
      __obj.asInstanceOf[IconImageCache]
    }
    
    @scala.inline
    implicit class IconImageCacheMutableBuilder[Self <: IconImageCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanExpireCache(value: () => Boolean): Self = StObject.set(x, "canExpireCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpire(value: () => Unit): Self = StObject.set(x, "expire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: (String, String, Color) => typings.ol.iconImageMod.default): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSet(value: (String, String, Color, typings.ol.iconImageMod.default) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSetSize(value: Double => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
    }
  }
}
