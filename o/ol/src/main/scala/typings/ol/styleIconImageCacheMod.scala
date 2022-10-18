package typings.ol

import typings.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconImageCacheMod {
  
  @JSImport("ol/style/IconImageCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/style/IconImageCache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IconImageCache {
    
    /* CompleteClass */
    override def canExpireCache(): Boolean = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def expire(): Unit = js.native
    
    /* CompleteClass */
    override def get(src: String, crossOrigin: String, color: Color): typings.ol.styleIconImageMod.default = js.native
    
    /* CompleteClass */
    override def set(src: String, crossOrigin: String, color: Color, iconImage: typings.ol.styleIconImageMod.default): Unit = js.native
    
    /**
      * Set the cache size of the icon cache. Default is 32. Change this value when
      * your map uses more than 32 different icon images and you are not caching icon
      * styles on the application level.
      */
    /* CompleteClass */
    override def setSize(maxCacheSize: Double): Unit = js.native
  }
  
  inline def shared(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shared")().asInstanceOf[Unit]
  
  trait IconImageCache extends StObject {
    
    def canExpireCache(): Boolean
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit
    
    /**
      * FIXME empty description for jsdoc
      */
    def expire(): Unit
    
    def get(src: String, crossOrigin: String, color: Color): typings.ol.styleIconImageMod.default
    
    def set(src: String, crossOrigin: String, color: Color, iconImage: typings.ol.styleIconImageMod.default): Unit
    
    /**
      * Set the cache size of the icon cache. Default is 32. Change this value when
      * your map uses more than 32 different icon images and you are not caching icon
      * styles on the application level.
      */
    def setSize(maxCacheSize: Double): Unit
  }
  object IconImageCache {
    
    inline def apply(
      canExpireCache: () => Boolean,
      clear: () => Unit,
      expire: () => Unit,
      get: (String, String, Color) => typings.ol.styleIconImageMod.default,
      set: (String, String, Color, typings.ol.styleIconImageMod.default) => Unit,
      setSize: Double => Unit
    ): IconImageCache = {
      val __obj = js.Dynamic.literal(canExpireCache = js.Any.fromFunction0(canExpireCache), clear = js.Any.fromFunction0(clear), expire = js.Any.fromFunction0(expire), get = js.Any.fromFunction3(get), set = js.Any.fromFunction4(set), setSize = js.Any.fromFunction1(setSize))
      __obj.asInstanceOf[IconImageCache]
    }
    
    extension [Self <: IconImageCache](x: Self) {
      
      inline def setCanExpireCache(value: () => Boolean): Self = StObject.set(x, "canExpireCache", js.Any.fromFunction0(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setExpire(value: () => Unit): Self = StObject.set(x, "expire", js.Any.fromFunction0(value))
      
      inline def setGet(value: (String, String, Color) => typings.ol.styleIconImageMod.default): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
      
      inline def setSet(value: (String, String, Color, typings.ol.styleIconImageMod.default) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
      
      inline def setSetSize(value: Double => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
    }
  }
}
